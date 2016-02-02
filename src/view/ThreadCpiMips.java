package view;

import javax.swing.JTextField;

public class ThreadCpiMips extends Thread {
	
	private float[] qtdInstr, cpi;
	private JTextField tfResCpi, tfResMips, tfResMips2, tfResT;
	private float freq;
	private int ic;
	
	public ThreadCpiMips(final float[] qtdInstr,final float[] cpi, final JTextField tfResCpi, final JTextField tfResT, final JTextField tfResMips,
			final JTextField tfResMips2, float freq, int ic){
		this.qtdInstr = qtdInstr;
		this.cpi = cpi;
		this.tfResCpi = tfResCpi;
		this.tfResMips = tfResMips;
		this.tfResMips2 = tfResMips2;
		this.tfResT = tfResT;
		this.freq = freq;
		this.ic = ic;
	}
	
	public void run(){
		for (int i = 0 ; i <= 4 ; i++){
			qtdInstr[i] = qtdInstr[i]/100;
		}
		
		float valorCpi = 0;
		float valorMips = 0;
		float valorMips2 = 0;
		float valorT = 0;
		
		for (int i = 0 ; i <= 4 ; i++){
			if (cpi[i] != 0){
				valorCpi = valorCpi + (cpi[i] * qtdInstr[i]);
			}
		}
		tfResCpi.setText(String.valueOf(valorCpi));
		
		valorMips = (int) (freq*Math.pow(10, 6) / (valorCpi * Math.pow(10,6)));
		tfResMips.setText(String.valueOf(valorMips));
		
		valorT = (float) (ic * valorCpi / (freq * Math.pow(10, 6)));
		tfResT.setText(String.valueOf(valorT));
		
		valorMips2 = (int) (ic / (valorT * Math.pow(10, 6)));
		tfResMips2.setText(String.valueOf(valorMips2));
	}
}
