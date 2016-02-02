package view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class CpiMips extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfTipoInstr1 = new JTextField();
	private JTextField tfTipoInstr2 = new JTextField();
	private JTextField tfTipoInstr3 = new JTextField();
	private JTextField tfTipoInstr4 = new JTextField();
	private JTextField tfTipoInstr5 = new JTextField();
	private JTextField tfCpi1 = new JTextField();
	private JTextField tfCpi2 = new JTextField();
	private JTextField tfCpi3 = new JTextField();
	private JTextField tfCpi4 = new JTextField();
	private JTextField tfCpi5 = new JTextField();
	private JTextField tfInstr1 = new JTextField();
	private JTextField tfInstr2 = new JTextField();
	private JTextField tfInstr3 = new JTextField();
	private JTextField tfInstr4 = new JTextField();
	private JTextField tfInstr5 = new JTextField();
	private JTextField tfIc = new JTextField();
	private JTextField tfFreq = new JTextField();
	private JTextField tfCalcCpi1 = new JTextField();
	private JTextField tfCalcCpi2 = new JTextField();
	private final JLabel lblCpiMdia = new JLabel("CPI - M\u00E9dia de Ciclos por Instru\u00E7\u00E3o");
	private final JTextField tfResCpi = new JTextField();
	private final JLabel lblMipsMilhes = new JLabel("MIPS - Milh\u00F5es de Instru\u00E7\u00F5es por Segundo");
	private final JTextField tfResMips = new JTextField();
	private final JLabel lblTTempo = new JLabel("T - Tempo de Processador (s)");
	private final JTextField tfResT = new JTextField();
	private JTextField tfCalcMips1;
	private JTextField tfCalcMips2;
	private JTextField tfCalcT;
	private JTextField tfResMips2;
	private final JButton btnFechar = new JButton("Fechar");

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CpiMips frame = new CpiMips();
					frame.setVisible(true);
					frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);  
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CpiMips() {
		tfResT.setEditable(false);
		tfResT.setBounds(276, 444, 86, 20);
		tfResT.setColumns(10);
		tfResMips.setEditable(false);
		tfResMips.setBounds(276, 403, 86, 20);
		tfResMips.setColumns(10);
		tfResCpi.setEditable(false);
		tfResCpi.setBounds(276, 367, 86, 20);
		tfResCpi.setColumns(10);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTipoDeInstruo = new JLabel("Tipo de Instru\u00E7\u00E3o");
		lblTipoDeInstruo.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTipoDeInstruo.setBounds(10, 25, 164, 22);
		contentPane.add(lblTipoDeInstruo);
		
		JLabel lblCpi = new JLabel("CPI");
		lblCpi.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCpi.setBounds(168, 25, 164, 22);
		contentPane.add(lblCpi);
		
		JLabel lblNmeroDeInstrues = new JLabel("N\u00FAmero de Instru\u00E7\u00F5es (%)");
		lblNmeroDeInstrues.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNmeroDeInstrues.setBounds(227, 25, 207, 22);
		contentPane.add(lblNmeroDeInstrues);
		
		tfTipoInstr1.setBounds(10, 58, 133, 20);
		contentPane.add(tfTipoInstr1);
		tfTipoInstr1.setColumns(10);
		
		tfTipoInstr2.setColumns(10);
		tfTipoInstr2.setBounds(10, 80, 133, 20);
		contentPane.add(tfTipoInstr2);
		
		tfTipoInstr3.setColumns(10);
		tfTipoInstr3.setBounds(10, 103, 133, 20);
		contentPane.add(tfTipoInstr3);
		
		tfTipoInstr4.setColumns(10);
		tfTipoInstr4.setBounds(10, 127, 133, 20);
		contentPane.add(tfTipoInstr4);
		
		tfTipoInstr5.setColumns(10);
		tfTipoInstr5.setBounds(10, 151, 133, 20);
		contentPane.add(tfTipoInstr5);
		
		tfCpi1.setBounds(157, 58, 51, 20);
		contentPane.add(tfCpi1);
		tfCpi1.setColumns(10);
		
		tfCpi2.setColumns(10);
		tfCpi2.setBounds(157, 80, 51, 20);
		contentPane.add(tfCpi2);
		
		tfCpi3.setColumns(10);
		tfCpi3.setBounds(157, 103, 51, 20);
		contentPane.add(tfCpi3);
		
		tfCpi4.setColumns(10);
		tfCpi4.setBounds(157, 127, 51, 20);
		contentPane.add(tfCpi4);
		
		tfCpi5.setColumns(10);
		tfCpi5.setBounds(157, 151, 51, 20);
		contentPane.add(tfCpi5);
		
		tfInstr1.setBounds(227, 58, 207, 20);
		contentPane.add(tfInstr1);
		tfInstr1.setColumns(10);
		
		tfInstr2.setColumns(10);
		tfInstr2.setBounds(227, 80, 207, 20);
		contentPane.add(tfInstr2);
		
		tfInstr3.setColumns(10);
		tfInstr3.setBounds(227, 103, 207, 20);
		contentPane.add(tfInstr3);
		
		tfInstr4.setColumns(10);
		tfInstr4.setBounds(227, 127, 207, 20);
		contentPane.add(tfInstr4);
		
		tfInstr5.setColumns(10);
		tfInstr5.setBounds(227, 151, 207, 20);
		contentPane.add(tfInstr5);
		
		JLabel lblIcTotalInstr = new JLabel("Ic - Total de Instru\u00E7\u00F5es");
		lblIcTotalInstr.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblIcTotalInstr.setBounds(475, 25, 207, 22);
		contentPane.add(lblIcTotalInstr);
		
		tfIc.setBounds(665, 28, 109, 20);
		contentPane.add(tfIc);
		tfIc.setColumns(10);
		
		JLabel lblFrequnciaProc = new JLabel("Frequ\u00EAncia Proc. (MHz)");
		lblFrequnciaProc.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblFrequnciaProc.setBounds(475, 61, 207, 22);
		contentPane.add(lblFrequnciaProc);
		
		tfFreq.setColumns(10);
		tfFreq.setBounds(665, 64, 109, 20);
		contentPane.add(tfFreq);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(10, 511, 89, 23);
		contentPane.add(btnCalcular);
		tfCalcCpi1.setEditable(false);
		
		tfCalcCpi1.setBounds(10, 196, 733, 20);
		contentPane.add(tfCalcCpi1);
		tfCalcCpi1.setColumns(10);
		tfCalcCpi2.setEditable(false);
		
		tfCalcCpi2.setColumns(10);
		tfCalcCpi2.setBounds(10, 227, 733, 20);
		contentPane.add(tfCalcCpi2);
		lblCpiMdia.setBounds(10, 370, 207, 14);
		
		contentPane.add(lblCpiMdia);
		
		contentPane.add(tfResCpi);
		lblMipsMilhes.setBounds(10, 406, 245, 14);
		
		contentPane.add(lblMipsMilhes);
		
		contentPane.add(tfResMips);
		lblTTempo.setBounds(10, 447, 198, 14);
		
		contentPane.add(lblTTempo);
		
		contentPane.add(tfResT);
		
		tfCalcMips1 = new JTextField();
		tfCalcMips1.setEditable(false);
		tfCalcMips1.setBounds(10, 258, 322, 20);
		contentPane.add(tfCalcMips1);
		tfCalcMips1.setColumns(10);
		
		tfCalcMips2 = new JTextField();
		tfCalcMips2.setEditable(false);
		tfCalcMips2.setBounds(360, 258, 383, 20);
		contentPane.add(tfCalcMips2);
		tfCalcMips2.setColumns(10);
		
		tfCalcT = new JTextField();
		tfCalcT.setEditable(false);
		tfCalcT.setBounds(10, 295, 322, 20);
		contentPane.add(tfCalcT);
		tfCalcT.setColumns(10);
		
		tfResMips2 = new JTextField();
		tfResMips2.setEditable(false);
		tfResMips2.setBounds(397, 403, 86, 20);
		contentPane.add(tfResMips2);
		tfResMips2.setColumns(10);
		btnFechar.setBounds(685, 528, 89, 23);
		
		contentPane.add(btnFechar);
		
		btnCalcular.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try{
					int ic = Integer.parseInt(tfIc.getText());
					int freq = Integer.parseInt(tfFreq.getText());
					
					float cpi[] = new float[5];
					if (!tfCpi1.getText().equals("")){
						cpi[0] = Float.parseFloat(tfCpi1.getText());
					} else {
						cpi[0] = 0;
					}
					if (!tfCpi2.getText().equals("")){
						cpi[1] = Float.parseFloat(tfCpi2.getText());
					} else {
						cpi[1] = 0;
					}
					if (!tfCpi3.getText().equals("")){
						cpi[2] = Float.parseFloat(tfCpi3.getText());
					} else {
						cpi[2] = 0;
					}
					if (!tfCpi4.getText().equals("")){
						cpi[3] = Float.parseFloat(tfCpi4.getText());
					} else {
						cpi[3] = 0;
					}
					if (!tfCpi5.getText().equals("")){
						cpi[4] = Float.parseFloat(tfCpi5.getText());
					} else {
						cpi[4] = 0;
					}
					
					float qtdInstr[] = new float[5];
					if (!tfInstr1.getText().equals("")){
						qtdInstr[0] = Float.parseFloat(tfInstr1.getText());
					} else {
						qtdInstr[0] = 0;
					}
					if (!tfInstr2.getText().equals("")){
						qtdInstr[1] = Float.parseFloat(tfInstr2.getText());
					} else {
						qtdInstr[1] = 0;
					}
					if (!tfInstr3.getText().equals("")){
						qtdInstr[2] = Float.parseFloat(tfInstr3.getText());
					} else {
						qtdInstr[2] = 0;
					}
					if (!tfInstr4.getText().equals("")){
						qtdInstr[3] = Float.parseFloat(tfInstr4.getText());
					} else {
						qtdInstr[3] = 0;
					}
					if (!tfInstr5.getText().equals("")){
						qtdInstr[4] = Float.parseFloat(tfInstr5.getText());
					} else {
						qtdInstr[4] = 0;
					}
					
					String calcCpi1 = "CPI = ";
					for (int i = 0 ; i <= 4 ; i++){
						if (cpi[i] != 0){
							calcCpi1 = calcCpi1 + "(" + String.valueOf(cpi[i]) + " * " + String.valueOf(qtdInstr[i]/100) + ")";
							calcCpi1 = calcCpi1 + " + ";
						}
						if (cpi[i] == 0 || i == 4){
							for (int j = calcCpi1.length() ; j >= 0 ; j--){
								String letra = calcCpi1.substring(j-1,j);
								if (letra.equals("+")){
									 calcCpi1 = calcCpi1.substring(0,j-1);
									 i = 4;
									 break;
								}
							}
						}
					
						tfCalcCpi1.setText(calcCpi1);
					}
					
					String calcCpi2 = "CPI = (";
					for (int i = 0 ; i <= 4 ; i++){
						if (cpi[i] != 0){
							calcCpi2 = calcCpi2 + "(" + String.valueOf(cpi[i]) + " * " + String.valueOf(ic * qtdInstr[i]/100) + ")";
							calcCpi2 = calcCpi2 + " + ";
						}
						if (cpi[i] == 0 || i == 4){
							for (int j = calcCpi2.length() ; j >= 0 ; j--){
								String letra = calcCpi2.substring(j-1,j);
								if (letra.equals("+")){
									 calcCpi2 = calcCpi2.substring(0,j-2);
									 i = 4;
									 break;
								}
							}
						}
					}
					calcCpi2 = calcCpi2 + ") / " + String.valueOf(ic);
					tfCalcCpi2.setText(calcCpi2);
					
					ThreadCpiMips threadCpiMips = new ThreadCpiMips(qtdInstr, cpi, tfResCpi, tfResT, tfResMips, tfResMips2, freq, ic);
					threadCpiMips.start();
					
					ThreadCpiMipsRes threadCpiMipsRes = new ThreadCpiMipsRes(tfResCpi, tfResT, tfResMips, tfResMips2, freq, ic, tfCalcMips1, tfCalcMips2, tfIc, tfCalcT);
					threadCpiMipsRes.start();
				} catch (Exception e){
					JOptionPane.showMessageDialog(null, e.getMessage(), "ERRO !!!", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		
		btnFechar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
	}
}
