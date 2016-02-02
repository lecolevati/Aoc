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

public class Amdahl extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfSpeedup = new JTextField();
	private JTextField tfF = new JTextField();
	private JTextField tfUmMenosF = new JTextField();
	private JTextField tfSuf = new JTextField();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Amdahl frame = new Amdahl();
					frame.setVisible(true);
					frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Amdahl() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSpeedup = new JLabel("SPEEDUP = ");
		lblSpeedup.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSpeedup.setBounds(21, 65, 100, 19);
		contentPane.add(lblSpeedup);
		
		JLabel label = new JLabel("1");
		label.setFont(new Font("Tahoma", Font.BOLD, 15));
		label.setBounds(157, 53, 46, 14);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("____________");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_1.setBounds(109, 65, 480, 19);
		contentPane.add(label_1);
		
		JLabel lblF = new JLabel("(1 - f) +");
		lblF.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblF.setBounds(119, 107, 71, 19);
		contentPane.add(lblF);
		
		JLabel lblF_1 = new JLabel("f");
		lblF_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblF_1.setBounds(194, 91, 21, 14);
		contentPane.add(lblF_1);
		
		JLabel label_2 = new JLabel("___");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_2.setBounds(181, 95, 57, 19);
		contentPane.add(label_2);
		
		JLabel lblSuf = new JLabel("SUf");
		lblSuf.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSuf.setBounds(181, 116, 46, 14);
		contentPane.add(lblSuf);
		
		JLabel lblSpeedup_1 = new JLabel("SPEEDUP");
		lblSpeedup_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSpeedup_1.setBounds(459, 53, 90, 14);
		contentPane.add(lblSpeedup_1);
		
		tfSpeedup.setBounds(560, 52, 86, 20);
		contentPane.add(tfSpeedup);
		tfSpeedup.setColumns(10);
		
		JLabel lblF_2 = new JLabel("f");
		lblF_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblF_2.setBounds(459, 95, 46, 14);
		contentPane.add(lblF_2);
		
		tfF.setBounds(560, 90, 86, 20);
		contentPane.add(tfF);
		tfF.setColumns(10);
		
		JLabel lblF_3 = new JLabel("(1 - f)");
		lblF_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblF_3.setBounds(459, 130, 46, 19);
		contentPane.add(lblF_3);
		
		tfUmMenosF.setEditable(false);
		tfUmMenosF.setBounds(560, 131, 86, 20);
		contentPane.add(tfUmMenosF);
		tfUmMenosF.setColumns(10);
		
		JLabel lblSuf_1 = new JLabel("SUf");
		lblSuf_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSuf_1.setBounds(459, 183, 46, 14);
		contentPane.add(lblSuf_1);
		
		tfSuf.setBounds(560, 177, 86, 20);
		contentPane.add(tfSuf);
		tfSuf.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(459, 259, 89, 23);
		contentPane.add(btnCalcular);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.setBounds(685, 507, 89, 23);
		contentPane.add(btnFechar);
		
		btnCalcular.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try{
					Filtro filtro = new Filtro();
					float f = 0;
					float speedup = 0;
					float umMenosF = 0;
					float suf = 0;
					int verificador = 0;
					float resultado = 0;
					if (!tfF.getText().equals("")){
						String textoF = filtro.subVirgula(tfF.getText());
						tfF.setText(textoF);
						f = Float.parseFloat(textoF);
						umMenosF = 1 - f;
						tfUmMenosF.setText(String.valueOf(umMenosF));
						verificador++;
					}
					if (!tfSpeedup.getText().equals("")){
						String textoSp = filtro.subVirgula(tfSpeedup.getText());
						tfSpeedup.setText(textoSp);
						speedup = Float.parseFloat(textoSp);
						verificador++;
					}
					if (!tfSuf.getText().equals("")){
						String textoSuf = filtro.subVirgula(tfSuf.getText());
						tfSuf.setText(textoSuf);
						suf = Float.parseFloat(textoSuf);
						verificador++;
					}
					switch (verificador){
					case 0:
						JOptionPane.showMessageDialog(null, "Digite os valores !", "ERRO",
								JOptionPane.ERROR_MESSAGE);
						break;
					case 1:
						JOptionPane.showMessageDialog(null, "Digite os valores !", "ERRO",
								JOptionPane.ERROR_MESSAGE);
						break;
	
					case 2:	
						resultado = calculoAmdahl(f, suf, speedup);
						if (speedup == 0){
							tfSpeedup.setText(String.valueOf(resultado));
						} else {
							if (f == 0){
								tfF.setText(String.valueOf(resultado));
								tfUmMenosF.setText(String.valueOf(1 - resultado));
							} else {
								if (suf == 0){
									tfSuf.setText(String.valueOf(resultado));
								}
							}
						}
						
						break;
					case 3:
						speedup = 0;
						speedup = calculoAmdahl(f, suf, speedup);
						tfSpeedup.setText(String.valueOf(speedup));
					}
					
				} catch (Exception e) {
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
	
	public Float calculoAmdahl (float f, float suf, float speedup){
		float resultado = 0;
		if (speedup == 0 && suf != 0 && f != 0) {
			speedup = 1 / ((1-f)+(f/suf));
			resultado = speedup;
		}
		if (speedup != 0 && suf == 0 && f != 0) {
			suf = (f * speedup) / (1 - speedup + (speedup * f));
			resultado = suf;
		}
		if (speedup != 0 && suf != 0 && f == 0) {
			f = ((suf/speedup)-suf) / (1 - suf);
			resultado = f;
		}
		return resultado;
	
	}
	

}
