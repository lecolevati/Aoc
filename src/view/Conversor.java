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
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Conversor extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfNumEntrada = new JTextField();
	private JTextField tfNumSaida = new JTextField();
	int baseEnt = 0;
	int baseSai = 0;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Conversor frame = new Conversor();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Conversor() {
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.setBounds(685, 528, 89, 23);
		contentPane.add(btnFechar);
		
		tfNumEntrada.setBounds(114, 82, 406, 20);
		contentPane.add(tfNumEntrada);
		tfNumEntrada.setColumns(10);
		
		JLabel lblNmero = new JLabel("N\u00FAmero");
		lblNmero.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNmero.setBounds(10, 79, 94, 23);
		contentPane.add(lblNmero);
		
		JLabel lblBase = new JLabel("Base");
		lblBase.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblBase.setBounds(10, 138, 56, 14);
		contentPane.add(lblBase);
		
		final JRadioButton rdbtnBinrioEnt = new JRadioButton("Bin\u00E1rio");
		rdbtnBinrioEnt.setBounds(114, 136, 73, 23);
		contentPane.add(rdbtnBinrioEnt);
		
		final JRadioButton rdbtnDecimalEnt = new JRadioButton("Decimal");
		rdbtnDecimalEnt.setBounds(186, 136, 79, 23);
		contentPane.add(rdbtnDecimalEnt);
		
		final JRadioButton rdbtnOctalEnt = new JRadioButton("Octal");
		rdbtnOctalEnt.setBounds(262, 136, 73, 23);
		contentPane.add(rdbtnOctalEnt);
		
		final JRadioButton rdbtnHexadecimalEnt = new JRadioButton("Hexadecimal");
		rdbtnHexadecimalEnt.setBounds(331, 136, 109, 23);
		contentPane.add(rdbtnHexadecimalEnt);
		
		JLabel lblEntrada = new JLabel("Entrada");
		lblEntrada.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblEntrada.setBounds(10, 24, 121, 23);
		contentPane.add(lblEntrada);
		
		JLabel lblSada = new JLabel("Sa\u00EDda");
		lblSada.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblSada.setBounds(10, 242, 121, 23);
		contentPane.add(lblSada);
		
		JLabel lblBase_1 = new JLabel("Base");
		lblBase_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblBase_1.setBounds(10, 306, 46, 14);
		contentPane.add(lblBase_1);
		
		final JRadioButton rdbtnBinrioSai = new JRadioButton("Bin\u00E1rio");
		rdbtnBinrioSai.setBounds(114, 306, 73, 23);
		contentPane.add(rdbtnBinrioSai);
		
		final JRadioButton rdbtnDecimalSai = new JRadioButton("Decimal");
		rdbtnDecimalSai.setBounds(186, 306, 79, 23);
		contentPane.add(rdbtnDecimalSai);
		
		final JRadioButton rdbtnOctalSai = new JRadioButton("Octal");
		rdbtnOctalSai.setBounds(262, 306, 73, 23);
		contentPane.add(rdbtnOctalSai);
		
		final JRadioButton rdbtnHexadecimalSai = new JRadioButton("Hexadecimal");
		rdbtnHexadecimalSai.setBounds(331, 306, 109, 23);
		contentPane.add(rdbtnHexadecimalSai);
		
		JLabel label = new JLabel("N\u00FAmero");
		label.setFont(new Font("Tahoma", Font.BOLD, 15));
		label.setBounds(10, 363, 94, 23);
		contentPane.add(label);
		
		tfNumSaida.setColumns(10);
		tfNumSaida.setBounds(114, 366, 406, 20);
		contentPane.add(tfNumSaida);
		
		JButton btnConverte = new JButton("Converte");
		btnConverte.setBounds(10, 433, 89, 23);
		contentPane.add(btnConverte);
		
		JLabel lblApenasNmerosInteiros = new JLabel("Apenas N\u00FAmeros Inteiros");
		lblApenasNmerosInteiros.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblApenasNmerosInteiros.setBounds(530, 11, 244, 23);
		contentPane.add(lblApenasNmerosInteiros);
		
		
		rdbtnBinrioEnt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				rdbtnDecimalEnt.setSelected(false);
				rdbtnHexadecimalEnt.setSelected(false);
				rdbtnOctalEnt.setSelected(false);
				baseEnt = 1;
			}
		});
		
		rdbtnDecimalEnt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				rdbtnBinrioEnt.setSelected(false);
				rdbtnHexadecimalEnt.setSelected(false);
				rdbtnOctalEnt.setSelected(false);
				baseEnt = 2;
			}
		});
		
		rdbtnHexadecimalEnt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				rdbtnBinrioEnt.setSelected(false);
				rdbtnDecimalEnt.setSelected(false);
				rdbtnOctalEnt.setSelected(false);
				baseEnt = 4;
			}
		});
		
		rdbtnOctalEnt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				rdbtnBinrioEnt.setSelected(false);
				rdbtnHexadecimalEnt.setSelected(false);
				rdbtnDecimalEnt.setSelected(false);
				baseEnt = 3;
			}
		});
		
		rdbtnBinrioSai.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				rdbtnDecimalSai.setSelected(false);
				rdbtnHexadecimalSai.setSelected(false);
				rdbtnOctalSai.setSelected(false);
				baseSai = 1;
			}
		});
		
		rdbtnDecimalSai.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				rdbtnBinrioSai.setSelected(false);
				rdbtnHexadecimalSai.setSelected(false);
				rdbtnOctalSai.setSelected(false);
				baseSai = 2;
			}
		});
		
		rdbtnHexadecimalSai.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				rdbtnDecimalSai.setSelected(false);
				rdbtnBinrioSai.setSelected(false);
				rdbtnOctalSai.setSelected(false);
				baseSai = 4;
			}
		});
		
		rdbtnOctalSai.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				rdbtnDecimalSai.setSelected(false);
				rdbtnHexadecimalSai.setSelected(false);
				rdbtnBinrioSai.setSelected(false);
				baseSai = 3;
			}
		});
		
		
		btnFechar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		
		btnConverte.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					String numEnt = tfNumEntrada.getText();
					int entrada = entDec(numEnt, baseEnt);
					tfNumSaida.setText(conversao(entrada, baseSai).toUpperCase());
						
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, ex.getMessage(), "ERRO !!!", JOptionPane.ERROR_MESSAGE);
					tfNumEntrada.setText("");
					tfNumSaida.setText("");
				}
			}
		});
		
	}
	
	public int entDec (String numEnt, int baseEnt){
		int dec = 0;
		switch (baseEnt) {
		case 1:
			dec = Integer.parseInt(numEnt, 2);
			break;
		case 2:
			dec = Integer.parseInt(numEnt);
			break;
		case 3:
			dec = Integer.parseInt(numEnt, 8);
			break;
		case 4:
			dec = Integer.parseInt(numEnt, 16);
			break;
		}
		 
		return dec;
	}
	
	public String conversao(int numEnt, int baseSai){
		String numSai = "";
		switch (baseSai){
		case 1:
			numSai = Integer.toBinaryString(numEnt);
			break;
		case 2:
			numSai = String.valueOf(numEnt);
			break;
		case 3:
			numSai = Integer.toOctalString(numEnt);
			break;
		case 4:
			numSai = Integer.toHexString(numEnt);
			break;
		
		}
		return numSai;
	}
	
	public String binario(int numero) {  
	    int d = numero;  
	    StringBuffer binario = new StringBuffer(); 
	    while (d > 0) {  
	        int b = d % 2;  
	        binario.append(b);  
	        d = d / 2; 
	    }  
	   return binario.reverse().toString();
	}  
	
}
