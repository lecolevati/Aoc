package view;

import javax.swing.JTextField;

public class OpCalculos {
	public int[] insereNumero (int[] dados, int dado, JTextField tfAlg){
		for (int i = 0; i < 100; i++){
			if (dados[i] == 0){
				dados[i] = dado;
				tfAlg.setText(tfAlg.getText()+" "+String.valueOf(dado));
				break;
			}
		}
		return dados;
	}
	
	public String[] insereOperacao (String[] operacoes, String operacao, JTextField tfAlg){
		for (int i = 0; i < 100; i++){
			if (operacoes[i].isEmpty()){
				operacoes[i] = operacao;
				tfAlg.setText(tfAlg.getText()+" "+String.valueOf(operacao));
				break;
			}
		}
		return operacoes;
	}
	
	public String calcula(String[] operacoes, int[] numeros){
		Conversor conversor = new Conversor();
		int numConvertidos[] = new int[100];
		numConvertidos = converteVetDec(numeros);
		String res = "";
		String msg = "";
		int err = 0;
		for (int i = 1; i < 100; i++){
			if (operacoes[i].equals("+")){
				numConvertidos[i] = numConvertidos[i] + numConvertidos[i - 1];
			}
			if (operacoes[i].equals("-")){
				if (numConvertidos[i-1] > numConvertidos[i]) {
					numConvertidos[i] = numConvertidos[i - 1] - numConvertidos[i];
				} else {
					msg = "ERRO - Estouro";
					err = 1;
				}
			}
			if (operacoes[i].equals("*")){
				numConvertidos[i] = numConvertidos[i] * numConvertidos[i - 1];			
			}
			if (operacoes[i].equals("/")){
				if (numConvertidos[i] != 0) {
					numConvertidos[i] = numConvertidos[i - 1] / numConvertidos[i];
				} else {
					msg = "ERRO - Divisão por Zero";
					err = 1;
				}
			}
			if (err != 1){
				res = conversor.conversao(numConvertidos[i], 1);
			} else {
				res = msg;
			}
			
			if (numConvertidos[i+1] == 0 && numConvertidos[i+2] == 0){
				break;
			}
		}
		return res;
	}
	
	public int[] converteVetDec (int[] numeros){
		Conversor conversor = new Conversor();
		int numConvertidos[] = new int[100];
		for (int i = 0 ; i < 100 ; i++){
			numConvertidos[i] = conversor.entDec(String.valueOf(numeros[i]), 1);
		}
		return numConvertidos;
	}
	
	public void zeraPilha (int[] numeros, String[] operacoes){
		for (int i = 0; i < 100; i++){
			numeros[i] = 0;
			operacoes[i] = "";
			if (i == 0){
				operacoes[i] = "0";
			}
		}
	}
}
