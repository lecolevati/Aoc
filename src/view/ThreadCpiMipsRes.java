package view;

import javax.swing.JTextField;

@SuppressWarnings("unused")
public class ThreadCpiMipsRes extends Thread{

	private JTextField tfResCpi, tfResMips, tfResMips2, tfResT, tfCalcMips1, tfCalcMips2, tfIc, tfCalcT;
	private float freq;
	private int ic;
	
	public ThreadCpiMipsRes(JTextField tfResCpi, JTextField tfResT, JTextField tfResMips,
			JTextField tfResMips2, float freq, int ic, JTextField tfCalcMips1, 
			JTextField tfCalcMips2, JTextField tfIc, 
			JTextField tfCalcT){
		this.tfResCpi = tfResCpi;
		this.tfResMips = tfResMips;
		this.tfResMips2 = tfResMips2;
		this.tfResT = tfResT;
		this.freq = freq;
		this.ic = ic;
		this.tfCalcMips1 = tfCalcMips1;
		this.tfCalcMips2 = tfCalcMips2;
		this.tfIc = tfIc;
		this.tfCalcT = tfCalcT;
	}
	
	public void run(){
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		tfCalcMips1.setText("MIPS = " + String.valueOf(freq) + " * 10^6 / (" + tfResCpi.getText() + " * 10^6)");
		tfCalcMips2.setText("MIPS = " + String.valueOf(tfIc.getText()) + " / (" + tfResT.getText() + " * 10^6)");
		tfCalcT.setText("T = " + String.valueOf(tfIc.getText()) + " * " + tfResCpi.getText() + " / (" + String.valueOf(freq) + " * 10^6)");

	}
		
}
