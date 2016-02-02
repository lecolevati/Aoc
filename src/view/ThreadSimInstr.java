package view;

import javax.swing.JTextField;

public class ThreadSimInstr extends Thread {
	
	   private final JTextField tfPc, tfAc, tfIr, tfOp;
	   private final JTextField tf940,tf941,tf942,tf943,tf944,tf945,tf946,tf947,tf948,tf949;
	   private int[] dado, instrucoes, posMemoria;
	   private int tempo;
	    
		public ThreadSimInstr(final JTextField tfPc,final JTextField tfAc,final JTextField tfIr,
				final JTextField tfOp, final int[] instrucoes, final int[] posMemoria,
				final int[] dado, final JTextField tf940, final JTextField tf941,
				final JTextField tf942, final JTextField tf943, final JTextField tf944,
				final JTextField tf945,final JTextField tf946,final JTextField tf947,
				final JTextField tf948,final JTextField tf949,
				final int tempo){  
			   this.tfPc = tfPc;
			   this.tfAc = tfAc;
			   this.tfIr = tfIr;
			   this.tfOp = tfOp;
			   this.instrucoes = instrucoes;
			   this.posMemoria = posMemoria;
			   this.dado = dado;
			   this.tf940 = tf940;
			   this.tf941 = tf941;
			   this.tf942 = tf942;
			   this.tf943 = tf943;
			   this.tf944 = tf944;
			   this.tf945 = tf945;
			   this.tf946 = tf946;
			   this.tf947 = tf947;
			   this.tf948 = tf948;
			   this.tf949 = tf949;
			   this.tempo = tempo;
		} 
	
	public void run(){
		@SuppressWarnings("unused")
		int inst;
		int op;
		String operacao = "";
			
		for (int i = 0 ; i <= 11 ; i++){
			tfPc.setText(String.valueOf(300+i));
			try {
				Thread.sleep(tempo);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (instrucoes[i] != 0){
				String instrucao = String.valueOf(instrucoes[i]) + "94" + String.valueOf(posMemoria[i]); 
				tfIr.setText(instrucao);
				try {
					Thread.sleep(tempo);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} else {
				break;
			}
			switch (instrucoes[i]){
			
			case 0:
				i = 11;
				break;
			
			case 1:
				tfAc.setText(String.valueOf(dado[posMemoria[i]]));
				operacao = "Ac recebe "+String.valueOf(dado[posMemoria[i]]);
				tfOp.setText(operacao);
				break;
				
			case 2:
				operacao = "Memória posição 94"+posMemoria[i]+" recebe "+tfAc.getText();
				dado[posMemoria[i]] = Integer.parseInt(tfAc.getText());
				tfOp.setText(operacao);
				switch (posMemoria[i]+940){
				case 940:
					tf940.setText(tfAc.getText());
					break;
				
				case 941:
					tf941.setText(tfAc.getText());
					break;
				
				case 942:
					tf942.setText(tfAc.getText());
					break;
				
				case 943:
					tf943.setText(tfAc.getText());
					break;
				
				case 944:
					tf944.setText(tfAc.getText());
					break;
					
				case 945:
					tf945.setText(tfAc.getText());
					break;
					
				case 946:
					tf946.setText(tfAc.getText());
					break;
					
				case 947:
					tf947.setText(tfAc.getText());
					break;
					
				case 948:
					tf948.setText(tfAc.getText());
					break;
					
				case 949:
					tf949.setText(tfAc.getText());
					break;
				}
				break;
			
			case 5:
				operacao = "Acumulador "+tfAc.getText()+" somado com o valor da posição 94"+String.valueOf(posMemoria[i])+" : "+String.valueOf(dado[posMemoria[i]]);
				tfOp.setText(operacao);
				op = dado[posMemoria[i]] + Integer.parseInt(tfAc.getText());
				tfAc.setText(String.valueOf(op));
				break;
				
			case 6:
				operacao = "Acumulador "+tfAc.getText()+" subtraído do valor da posição 94"+String.valueOf(posMemoria[i])+" : "+String.valueOf(dado[posMemoria[i]]);
				tfOp.setText(operacao);
				op = Integer.parseInt(tfAc.getText()) - dado[posMemoria[i]];
				tfAc.setText(String.valueOf(op));
				break;
				
			case 7:
				operacao = "Acumulador "+tfAc.getText()+" multiplicado ao valor da posição 94"+String.valueOf(posMemoria[i])+" : "+String.valueOf(dado[posMemoria[i]]);
				tfOp.setText(operacao);
				op = dado[posMemoria[i]] * Integer.parseInt(tfAc.getText());
				tfAc.setText(String.valueOf(op));
				break;
				
			case 8:
				
				if (dado[posMemoria[i]] == 0){
					operacao = "Interrupção !!! Divisão por ZERO !!!";
					tfOp.setText(operacao);
					i = 11;
					break;
				} else {
					operacao = "Acumulador "+tfAc.getText()+" dividido pelo valor da posição 94"+String.valueOf(posMemoria[i])+" : "+String.valueOf(dado[posMemoria[i]]);
					tfOp.setText(operacao);
					op = Integer.parseInt(tfAc.getText()) / dado[posMemoria[i]];
					tfAc.setText(String.valueOf(op));
					break;
				}
			}
			
			try {
				Thread.sleep(tempo);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}

}
