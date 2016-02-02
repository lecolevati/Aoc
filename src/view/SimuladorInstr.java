package view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class SimuladorInstr extends JDialog {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tf300 = new JTextField();
	private JTextField tf301 = new JTextField();
	private JTextField tf302 = new JTextField();
	private JTextField tf303 = new JTextField();
	private JTextField tf304 = new JTextField();
	private JTextField tf305 = new JTextField();
	private JTextField tfPc = new JTextField();
	private JTextField tfAc = new JTextField();
	private JTextField tfIr = new JTextField();
	private JTextField tf940 = new JTextField();
	private JTextField tf941 = new JTextField();
	private JTextField tf942 = new JTextField();
	private JTextField tf943 = new JTextField();
	private JTextField tf944 = new JTextField();
	private JTextField tfOp = new JTextField();
	private JTextField tf306 = new JTextField();
	private JTextField tf307 = new JTextField();
	private JTextField tf308 = new JTextField();
	private JTextField tf309 = new JTextField();
	private JTextField tf310 = new JTextField();
	private JTextField tf311 = new JTextField();
	private JTextField tf945 = new JTextField();
	private JTextField tf946 = new JTextField();
	private JTextField tf947 = new JTextField();
	private JTextField tf948 = new JTextField();
	private JTextField tf949 = new JTextField();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SimuladorInstr frame = new SimuladorInstr();
					frame.setVisible(true);
					frame.setAlwaysOnTop(true);
					frame.setModal(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SimuladorInstr() {
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel lblMemria = new JLabel("Mem\u00F3ria");
		lblMemria.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblMemria.setBounds(10, 25, 94, 28);
		contentPane.add(lblMemria);
		
		JLabel label300 = new JLabel("300");
		label300.setBounds(10, 75, 46, 14);
		contentPane.add(label300);
		
		JLabel label301 = new JLabel("301");
		label301.setBounds(10, 100, 46, 14);
		contentPane.add(label301);
		
		JLabel label302 = new JLabel("302");
		label302.setBounds(10, 125, 46, 14);
		contentPane.add(label302);
		
		JLabel label303 = new JLabel("303");
		label303.setBounds(10, 150, 46, 14);
		contentPane.add(label303);
		
		JLabel label304 = new JLabel("304");
		label304.setBounds(10, 175, 46, 14);
		contentPane.add(label304);
		
		JLabel label305 = new JLabel("305");
		label305.setBounds(10, 200, 46, 14);
		contentPane.add(label305);
		

		tf300.setBounds(44, 72, 86, 20);
		contentPane.add(tf300);
		tf300.setColumns(10);
		
		tf301.setColumns(10);
		tf301.setBounds(44, 100, 86, 20);
		contentPane.add(tf301);
		
		tf302.setColumns(10);
		tf302.setBounds(44, 125, 86, 20);
		contentPane.add(tf302);
		
		tf303.setColumns(10);
		tf303.setBounds(44, 150, 86, 20);
		contentPane.add(tf303);
		
		tf304.setColumns(10);
		tf304.setBounds(44, 175, 86, 20);
		contentPane.add(tf304);
		
		tf305.setColumns(10);
		tf305.setBounds(44, 200, 86, 20);
		contentPane.add(tf305);
		
		JLabel lblCpu = new JLabel("CPU");
		lblCpu.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCpu.setBounds(507, 34, 46, 14);
		contentPane.add(lblCpu);
		
		tfPc.setEditable(false);
		tfPc.setBounds(501, 59, 86, 20);
		contentPane.add(tfPc);
		tfPc.setColumns(10);
		
		tfAc.setEditable(false);
		tfAc.setBounds(501, 97, 86, 20);
		contentPane.add(tfAc);
		tfAc.setColumns(10);
		
		tfIr.setEditable(false);
		tfIr.setBounds(501, 144, 86, 20);
		contentPane.add(tfIr);
		tfIr.setColumns(10);
		
		JLabel lblPc = new JLabel("PC");
		lblPc.setBounds(596, 62, 46, 14);
		contentPane.add(lblPc);
		
		JLabel lblAc = new JLabel("Acumulador");
		lblAc.setBounds(597, 100, 94, 14);
		contentPane.add(lblAc);
		
		JLabel lblIr = new JLabel("IR");
		lblIr.setBounds(596, 150, 46, 14);
		contentPane.add(lblIr);
		
		JLabel label940 = new JLabel("940");
		label940.setBounds(10, 255, 46, 14);
		contentPane.add(label940);
		
		JLabel label941 = new JLabel("941");
		label941.setBounds(10, 283, 46, 14);
		contentPane.add(label941);
		
		JLabel label942 = new JLabel("942");
		label942.setBounds(10, 308, 46, 14);
		contentPane.add(label942);
		
		JLabel label943 = new JLabel("943");
		label943.setBounds(10, 333, 46, 14);
		contentPane.add(label943);
		
		JLabel label944 = new JLabel("944");
		label944.setBounds(10, 358, 46, 14);
		contentPane.add(label944);
		
		tf940.setBounds(44, 252, 86, 20);
		contentPane.add(tf940);
		tf940.setColumns(10);
		
		tf941.setColumns(10);
		tf941.setBounds(44, 280, 86, 20);
		contentPane.add(tf941);
		
		tf942.setColumns(10);
		tf942.setBounds(44, 305, 86, 20);
		contentPane.add(tf942);
		
		tf943.setColumns(10);
		tf943.setBounds(44, 330, 86, 20);
		contentPane.add(tf943);
		
		tf944.setColumns(10);
		tf944.setBounds(44, 355, 86, 20);
		contentPane.add(tf944);
		
		JButton btnSimular = new JButton("Simular");
		btnSimular.setBounds(501, 200, 89, 23);
		contentPane.add(btnSimular);
		
		JLabel lblOperao = new JLabel("Opera\u00E7\u00E3o");
		lblOperao.setBounds(415, 297, 67, 14);
		contentPane.add(lblOperao);
		
		tfOp.setEditable(false);
		tfOp.setBounds(415, 316, 338, 20);
		contentPane.add(tfOp);
		tfOp.setColumns(10);
		
		final JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setModel(new DefaultComboBoxModel<String>(new String[] {"R\u00E1pida", "M\u00E9dia", "Lenta", "Demonstra\u00E7\u00E3o"}));
		comboBox.setBounds(415, 423, 116, 20);
		contentPane.add(comboBox);
		
		JLabel lblExecuo = new JLabel("Execu\u00E7\u00E3o");
		lblExecuo.setBounds(415, 394, 67, 14);
		contentPane.add(lblExecuo);
		
		JTextArea txtrEscrever = new JTextArea();
		txtrEscrever.setEditable(false);
		txtrEscrever.setText("1 - Escrever no Acumulador\r\n2 - Escrever na Mem\u00F3ria\r\n5 - Adi\u00E7\u00E3o\r\n6 - Subtra\u00E7\u00E3o\r\n7 - Multiplica\u00E7\u00E3o\r\n8 - Divis\u00E3o");
		txtrEscrever.setBounds(10, 442, 212, 109);
		contentPane.add(txtrEscrever);
		
		JLabel lblInstrues = new JLabel("Instru\u00E7\u00F5es");
		lblInstrues.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblInstrues.setBounds(10, 409, 94, 28);
		contentPane.add(lblInstrues);
		
		JLabel label306 = new JLabel("306");
		label306.setBounds(157, 75, 46, 14);
		contentPane.add(label306);
		
		tf306 = new JTextField();
		tf306.setColumns(10);
		tf306.setBounds(191, 72, 86, 20);
		contentPane.add(tf306);
		
		JLabel label307 = new JLabel("307");
		label307.setBounds(157, 103, 46, 14);
		contentPane.add(label307);
		
		tf307 = new JTextField();
		tf307.setColumns(10);
		tf307.setBounds(191, 100, 86, 20);
		contentPane.add(tf307);
		
		JLabel label308 = new JLabel("308");
		label308.setBounds(157, 128, 46, 14);
		contentPane.add(label308);
		
		tf308 = new JTextField();
		tf308.setColumns(10);
		tf308.setBounds(191, 125, 86, 20);
		contentPane.add(tf308);
		
		JLabel label309 = new JLabel("309");
		label309.setBounds(157, 153, 46, 14);
		contentPane.add(label309);
		
		tf309 = new JTextField();
		tf309.setColumns(10);
		tf309.setBounds(191, 150, 86, 20);
		contentPane.add(tf309);
		
		JLabel label310 = new JLabel("310");
		label310.setBounds(157, 178, 46, 14);
		contentPane.add(label310);
		
		tf310 = new JTextField();
		tf310.setColumns(10);
		tf310.setBounds(191, 175, 86, 20);
		contentPane.add(tf310);
		
		JLabel label311 = new JLabel("311");
		label311.setBounds(157, 203, 46, 14);
		contentPane.add(label311);
		
		tf311 = new JTextField();
		tf311.setColumns(10);
		tf311.setBounds(191, 200, 86, 20);
		contentPane.add(tf311);
		
		JLabel label945 = new JLabel("945");
		label945.setBounds(157, 255, 46, 14);
		contentPane.add(label945);
		
		tf945 = new JTextField();
		tf945.setColumns(10);
		tf945.setBounds(191, 252, 86, 20);
		contentPane.add(tf945);
		
		JLabel label946 = new JLabel("946");
		label946.setBounds(157, 283, 46, 14);
		contentPane.add(label946);
		
		tf946 = new JTextField();
		tf946.setColumns(10);
		tf946.setBounds(191, 280, 86, 20);
		contentPane.add(tf946);
		
		JLabel label947 = new JLabel("947");
		label947.setBounds(157, 308, 46, 14);
		contentPane.add(label947);
		
		tf947 = new JTextField();
		tf947.setColumns(10);
		tf947.setBounds(191, 305, 86, 20);
		contentPane.add(tf947);
		
		JLabel label948 = new JLabel("948");
		label948.setBounds(157, 333, 46, 14);
		contentPane.add(label948);
		
		tf948 = new JTextField();
		tf948.setColumns(10);
		tf948.setBounds(191, 330, 86, 20);
		contentPane.add(tf948);
		
		JLabel label949 = new JLabel("949");
		label949.setBounds(157, 358, 46, 14);
		contentPane.add(label949);
		
		tf949 = new JTextField();
		tf949.setColumns(10);
		tf949.setBounds(191, 355, 86, 20);
		contentPane.add(tf949);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.setBounds(685, 528, 89, 23);
		contentPane.add(btnFechar);
		
		btnSimular.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try{
					int execucao = 0;
					if (tf300.getText().length() != 4
							|| Integer.parseInt(tf300.getText().substring(0, 1)) <= 0
							|| Integer.parseInt(tf300.getText().substring(0, 1)) > 8
							|| Integer.parseInt(tf300.getText().substring(0, 1)) == 3
							|| Integer.parseInt(tf300.getText().substring(0, 1)) == 4
							|| Integer.parseInt(tf300.getText().substring(1, 4)) < 940
							|| Integer.parseInt(tf300.getText().substring(0, 1)) >= 945) {
						execucao = 1;
						if (tf300.getText().equals("")){
							execucao = 0;
						} else {
							tf300.setText("");
						}
					}
	
					if (tf301.getText().length() != 4
							|| Integer.parseInt(tf301.getText().substring(0, 1)) <= 0
							|| Integer.parseInt(tf301.getText().substring(0, 1)) > 8
							|| Integer.parseInt(tf301.getText().substring(0, 1)) == 3
							|| Integer.parseInt(tf301.getText().substring(0, 1)) == 4
							|| Integer.parseInt(tf301.getText().substring(1, 4)) < 940
							|| Integer.parseInt(tf301.getText().substring(0, 1)) >= 945) {
						execucao = 1;
						if (tf301.getText().equals("")){
							execucao = 0;
						} else {
							tf301.setText("");
						}
					}
	
					if (tf302.getText().length() != 4
							|| Integer.parseInt(tf302.getText().substring(0, 1)) <= 0
							|| Integer.parseInt(tf302.getText().substring(0, 1)) > 8
							|| Integer.parseInt(tf302.getText().substring(0, 1)) == 3
							|| Integer.parseInt(tf302.getText().substring(0, 1)) == 4
							|| Integer.parseInt(tf302.getText().substring(1, 4)) < 940
							|| Integer.parseInt(tf302.getText().substring(0, 1)) >= 945) {
						execucao = 1;
						if (tf302.getText().equals("")){
							execucao = 0;
						} else {
							tf302.setText("");
						}
					}
	
					if (tf303.getText().length() != 4
							|| Integer.parseInt(tf303.getText().substring(0, 1)) <= 0
							|| Integer.parseInt(tf303.getText().substring(0, 1)) > 8
							|| Integer.parseInt(tf303.getText().substring(0, 1)) == 3
							|| Integer.parseInt(tf303.getText().substring(0, 1)) == 4
							|| Integer.parseInt(tf303.getText().substring(1, 4)) < 940
							|| Integer.parseInt(tf303.getText().substring(0, 1)) >= 945) {
						execucao = 1;
						if (tf303.getText().equals("")){
							execucao = 0;
						} else {
							tf303.setText("");
						}
					}
	
					if (tf304.getText().length() != 4
							|| Integer.parseInt(tf304.getText().substring(0, 1)) <= 0
							|| Integer.parseInt(tf304.getText().substring(0, 1)) > 8
							|| Integer.parseInt(tf304.getText().substring(0, 1)) == 3
							|| Integer.parseInt(tf304.getText().substring(0, 1)) == 4
							|| Integer.parseInt(tf304.getText().substring(1, 4)) < 940
							|| Integer.parseInt(tf304.getText().substring(0, 1)) >= 945) {
						execucao = 1;
						if (tf304.getText().equals("")){
							execucao = 0;
						} else {
							tf304.setText("");
						}
					}
	
					if (tf305.getText().length() != 4
							|| Integer.parseInt(tf305.getText().substring(0, 1)) <= 0
							|| Integer.parseInt(tf305.getText().substring(0, 1)) > 8
							|| Integer.parseInt(tf305.getText().substring(0, 1)) == 3
							|| Integer.parseInt(tf305.getText().substring(0, 1)) == 4
							|| Integer.parseInt(tf305.getText().substring(1, 4)) < 940
							|| Integer.parseInt(tf305.getText().substring(0, 1)) >= 945) {
						execucao = 1;
						if (tf305.getText().equals("")){
							execucao = 0;
						} else {
							tf305.setText("ERRO !");
						}
					}
					
					if (tf306.getText().length() != 4
							|| Integer.parseInt(tf306.getText().substring(0, 1)) <= 0
							|| Integer.parseInt(tf306.getText().substring(0, 1)) > 8
							|| Integer.parseInt(tf306.getText().substring(0, 1)) == 3
							|| Integer.parseInt(tf306.getText().substring(0, 1)) == 4
							|| Integer.parseInt(tf306.getText().substring(1, 4)) < 940
							|| Integer.parseInt(tf306.getText().substring(0, 1)) >= 945) {
						execucao = 1;
						if (tf306.getText().equals("")){
							execucao = 0;
						} else {
							tf306.setText("");
						}
					}
					
					if (tf307.getText().length() != 4
							|| Integer.parseInt(tf307.getText().substring(0, 1)) <= 0
							|| Integer.parseInt(tf307.getText().substring(0, 1)) > 8
							|| Integer.parseInt(tf307.getText().substring(0, 1)) == 3
							|| Integer.parseInt(tf307.getText().substring(0, 1)) == 4
							|| Integer.parseInt(tf307.getText().substring(1, 4)) < 940
							|| Integer.parseInt(tf307.getText().substring(0, 1)) >= 945) {
						execucao = 1;
						if (tf307.getText().equals("")){
							execucao = 0;
						} else {
							tf307.setText("");
						}
					}
					
					if (tf308.getText().length() != 4
							|| Integer.parseInt(tf308.getText().substring(0, 1)) <= 0
							|| Integer.parseInt(tf308.getText().substring(0, 1)) > 8
							|| Integer.parseInt(tf308.getText().substring(0, 1)) == 3
							|| Integer.parseInt(tf308.getText().substring(0, 1)) == 4
							|| Integer.parseInt(tf308.getText().substring(1, 4)) < 940
							|| Integer.parseInt(tf308.getText().substring(0, 1)) >= 945) {
						execucao = 1;
						if (tf308.getText().equals("")){
							execucao = 0;
						} else {
							tf308.setText("");
						}
					}
					
					if (tf309.getText().length() != 4
							|| Integer.parseInt(tf309.getText().substring(0, 1)) <= 0
							|| Integer.parseInt(tf309.getText().substring(0, 1)) > 8
							|| Integer.parseInt(tf309.getText().substring(0, 1)) == 3
							|| Integer.parseInt(tf309.getText().substring(0, 1)) == 4
							|| Integer.parseInt(tf309.getText().substring(1, 4)) < 940
							|| Integer.parseInt(tf309.getText().substring(0, 1)) >= 945) {
						execucao = 1;
						if (tf309.getText().equals("")){
							execucao = 0;
						} else {
							tf309.setText("");
						}
					}
					
					if (tf310.getText().length() != 4
							|| Integer.parseInt(tf310.getText().substring(0, 1)) <= 0
							|| Integer.parseInt(tf310.getText().substring(0, 1)) > 8
							|| Integer.parseInt(tf310.getText().substring(0, 1)) == 3
							|| Integer.parseInt(tf310.getText().substring(0, 1)) == 4
							|| Integer.parseInt(tf310.getText().substring(1, 4)) < 940
							|| Integer.parseInt(tf310.getText().substring(0, 1)) >= 945) {
						execucao = 1;
						if (tf310.getText().equals("")){
							execucao = 0;
						} else {
							tf310.setText("");
						}
					}
					
					if (tf311.getText().length() != 4
							|| Integer.parseInt(tf311.getText().substring(0, 1)) <= 0
							|| Integer.parseInt(tf311.getText().substring(0, 1)) > 8
							|| Integer.parseInt(tf311.getText().substring(0, 1)) == 3
							|| Integer.parseInt(tf311.getText().substring(0, 1)) == 4
							|| Integer.parseInt(tf311.getText().substring(1, 4)) < 940
							|| Integer.parseInt(tf311.getText().substring(0, 1)) >= 945) {
						execucao = 1;
						if (tf311.getText().equals("")){
							execucao = 0;
						} else {
							tf311.setText("");
						}
					}
					
	
					if (execucao == 0) {
						int instrucoes[] = new int[12];
						if (!tf300.getText().equals("")) {
							instrucoes[0] = Integer.parseInt(tf300.getText()
									.substring(0, 1));
						} else {
							instrucoes[0] = 0;
						}
						if (!tf301.getText().equals("")) {
							instrucoes[1] = Integer.parseInt(tf301.getText()
									.substring(0, 1));
						} else {
							instrucoes[1] = 0;
						}
						if (!tf302.getText().equals("")) {
							instrucoes[2] = Integer.parseInt(tf302.getText()
									.substring(0, 1));
						} else {
							instrucoes[2] = 0;
						}
						if (!tf303.getText().equals("")) {
							instrucoes[3] = Integer.parseInt(tf303.getText()
									.substring(0, 1));
						} else {
							instrucoes[3] = 0;
						}
						if (!tf304.getText().equals("")) {
							instrucoes[4] = Integer.parseInt(tf304.getText()
									.substring(0, 1));
						} else {
							instrucoes[4] = 0;
						}
						if (!tf305.getText().equals("")) {
							instrucoes[5] = Integer.parseInt(tf305.getText()
									.substring(0, 1));
						} else {
							instrucoes[5] = 0;
						}
						if (!tf306.getText().equals("")) {
							instrucoes[6] = Integer.parseInt(tf306.getText()
									.substring(0, 1));
						} else {
							instrucoes[6] = 0;
						}
						if (!tf307.getText().equals("")) {
							instrucoes[7] = Integer.parseInt(tf307.getText()
									.substring(0, 1));
						} else {
							instrucoes[7] = 0;
						}
						if (!tf308.getText().equals("")) {
							instrucoes[8] = Integer.parseInt(tf308.getText()
									.substring(0, 1));
						} else {
							instrucoes[8] = 0;
						}
						if (!tf309.getText().equals("")) {
							instrucoes[9] = Integer.parseInt(tf309.getText()
									.substring(0, 1));
						} else {
							instrucoes[9] = 0;
						}
						if (!tf310.getText().equals("")) {
							instrucoes[10] = Integer.parseInt(tf310.getText()
									.substring(0, 1));
						} else {
							instrucoes[10] = 0;
						}
						if (!tf311.getText().equals("")) {
							instrucoes[11] = Integer.parseInt(tf311.getText()
									.substring(0, 1));
						} else {
							instrucoes[11] = 0;
						}
	
						int posMemoria[] = new int[12];
						if (!tf300.getText().equals("")) {
							posMemoria[0] = Integer.parseInt(tf300.getText()
									.substring(1, 4)) - 940;
						} else {
							posMemoria[0] = 0;
						}
						if (!tf301.getText().equals("")) {
							posMemoria[1] = Integer.parseInt(tf301.getText()
									.substring(1, 4)) - 940;
						} else {
							posMemoria[1] = 0;
						}
						if (!tf302.getText().equals("")) {
							posMemoria[2] = Integer.parseInt(tf302.getText()
									.substring(1, 4)) - 940;
						} else {
							posMemoria[2] = 0;
						}
						if (!tf303.getText().equals("")) {
							posMemoria[3] = Integer.parseInt(tf303.getText()
									.substring(1, 4)) - 940;
						} else {
							posMemoria[3] = 0;
						}
						if (!tf304.getText().equals("")) {
							posMemoria[4] = Integer.parseInt(tf304.getText()
									.substring(1, 4)) - 940;
						} else {
							posMemoria[4] = 0;
						}
						if (!tf305.getText().equals("")) {
							posMemoria[5] = Integer.parseInt(tf305.getText()
									.substring(1, 4)) - 940;
						} else {
							posMemoria[5] = 0;
						}
						if (!tf306.getText().equals("")) {
							posMemoria[6] = Integer.parseInt(tf306.getText()
									.substring(1, 4)) - 940;
						} else {
							posMemoria[6] = 0;
						}
						if (!tf307.getText().equals("")) {
							posMemoria[7] = Integer.parseInt(tf307.getText()
									.substring(1, 4)) - 940;
						} else {
							posMemoria[7] = 0;
						}
						if (!tf308.getText().equals("")) {
							posMemoria[8] = Integer.parseInt(tf308.getText()
									.substring(1, 4)) - 940;
						} else {
							posMemoria[8] = 0;
						}
						if (!tf309.getText().equals("")) {
							posMemoria[9] = Integer.parseInt(tf309.getText()
									.substring(1, 4)) - 940;
						} else {
							posMemoria[9] = 0;
						}
						if (!tf310.getText().equals("")) {
							posMemoria[10] = Integer.parseInt(tf310.getText()
									.substring(1, 4)) - 940;
						} else {
							posMemoria[10] = 0;
						}
						if (!tf311.getText().equals("")) {
							posMemoria[11] = Integer.parseInt(tf311.getText()
									.substring(1, 4)) - 940;
						} else {
							posMemoria[11] = 0;
						}
	
						int dado[] = new int[10];
						if (!tf940.getText().equals("")) {
							dado[0] = Integer.parseInt(tf940.getText());
						} else {
							dado[0] = 0;
						}
						if (!tf941.getText().equals("")) {
							dado[1] = Integer.parseInt(tf941.getText());
						} else {
							dado[1] = 0;
						}
						if (!tf942.getText().equals("")) {
							dado[2] = Integer.parseInt(tf942.getText());
						} else {
							dado[2] = 0;
						}
						if (!tf943.getText().equals("")) {
							dado[3] = Integer.parseInt(tf943.getText());
						} else {
							dado[3] = 0;
						}
						if (!tf944.getText().equals("")) {
							dado[4] = Integer.parseInt(tf944.getText());
						} else {
							dado[4] = 0;
						}
						if (!tf945.getText().equals("")) {
							dado[5] = Integer.parseInt(tf945.getText());
						} else {
							dado[5] = 0;
						}
						if (!tf946.getText().equals("")) {
							dado[6] = Integer.parseInt(tf946.getText());
						} else {
							dado[6] = 0;
						}
						if (!tf947.getText().equals("")) {
							dado[7] = Integer.parseInt(tf947.getText());
						} else {
							dado[7] = 0;
						}
						if (!tf948.getText().equals("")) {
							dado[8] = Integer.parseInt(tf948.getText());
						} else {
							dado[8] = 0;
						}
						if (!tf949.getText().equals("")) {
							dado[9] = Integer.parseInt(tf949.getText());
						} else {
							dado[9] = 0;
						}
						
						int tempo = 0;
						
						switch (comboBox.getSelectedIndex()){
							
						case 0:
							tempo = 50;
							break;
							
						case 1:
							tempo = 150;
							break;
							
						case 2: 
							tempo = 500;
							break;
							
						case 3:
							tempo = 5000;
							break;
							
						default:
							tempo = 50;
							break;
						
						}
						
						ThreadSimInstr threadProc = new ThreadSimInstr(tfPc, tfAc, tfIr,
								tfOp, instrucoes, posMemoria, dado, tf940, tf941,
								tf942, tf943, tf944,tf945, tf946, tf947, tf948, tf949, tempo);
						threadProc.start();
					} else {
						JOptionPane.showMessageDialog(null, "Dados Errados !", "Mensagem", 
								JOptionPane.ERROR_MESSAGE);
					}
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
