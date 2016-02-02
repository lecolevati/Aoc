package view;

public class Filtro {

	public String subVirgula(String valor){
		String texto = "";
		for (int i = 0 ; i < valor.length(); i++){
			String letra = valor.substring(i, i+1);
			if (letra.equals(",")){
				letra = ".";
			}
			texto = texto + letra;
		}
		
		return texto;
		
	}
	
}
