package view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Circuitos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfSaida = new JTextField();
	String entrada[] = new String[10];
	String nos[][] = new String[20][4];

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Circuitos frame = new Circuitos();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Circuitos() {
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.setBounds(685, 528, 89, 23);
		contentPane.add(btnFechar);
		
		JLabel lblA = new JLabel("A");
		lblA.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblA.setBounds(10, 11, 46, 14);
		contentPane.add(lblA);
		
		JLabel lblB = new JLabel("B");
		lblB.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblB.setBounds(10, 52, 46, 14);
		contentPane.add(lblB);
		
		JLabel lblC = new JLabel("C");
		lblC.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblC.setBounds(10, 94, 46, 14);
		contentPane.add(lblC);
		
		JLabel lblD = new JLabel("D");
		lblD.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblD.setBounds(10, 137, 46, 14);
		contentPane.add(lblD);
		
		JLabel lblE = new JLabel("E");
		lblE.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblE.setBounds(10, 177, 46, 14);
		contentPane.add(lblE);
		
		JLabel lblF = new JLabel("F");
		lblF.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblF.setBounds(10, 221, 46, 14);
		contentPane.add(lblF);
		
		JLabel lblG = new JLabel("G");
		lblG.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblG.setBounds(10, 265, 46, 14);
		contentPane.add(lblG);
		
		JLabel lblH = new JLabel("H");
		lblH.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblH.setBounds(10, 309, 46, 14);
		contentPane.add(lblH);
		
		JLabel lblI = new JLabel("I");
		lblI.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblI.setBounds(10, 356, 46, 14);
		contentPane.add(lblI);
		
		JLabel lblJ = new JLabel("J");
		lblJ.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblJ.setBounds(10, 399, 46, 14);
		contentPane.add(lblJ);
		
		final JComboBox<String> cbA = new JComboBox<String>();
		cbA.setModel(new DefaultComboBoxModel<String>(new String[] {"", "0", "1"}));
		cbA.setBounds(45, 10, 37, 20);
		contentPane.add(cbA);
		
		final JComboBox<String> cbB = new JComboBox<String>();
		cbB.setModel(new DefaultComboBoxModel<String>(new String[] {"", "0", "1"}));
		cbB.setBounds(45, 51, 37, 20);
		contentPane.add(cbB);
		
		final JComboBox<String> cbC = new JComboBox<String>();
		cbC.setModel(new DefaultComboBoxModel<String>(new String[] {"", "0", "1"}));
		cbC.setBounds(45, 93, 37, 20);
		contentPane.add(cbC);
		
		final JComboBox<String> cbD = new JComboBox<String>();
		cbD.setModel(new DefaultComboBoxModel<String>(new String[] {"", "0", "1"}));
		cbD.setBounds(45, 136, 37, 20);
		contentPane.add(cbD);
		
		final JComboBox<String> cbE = new JComboBox<String>();
		cbE.setModel(new DefaultComboBoxModel<String>(new String[] {"", "0", "1"}));
		cbE.setBounds(45, 176, 37, 20);
		contentPane.add(cbE);
		
		final JComboBox<String> cbF = new JComboBox<String>();
		cbF.setModel(new DefaultComboBoxModel<String>(new String[] {"", "0", "1"}));
		cbF.setBounds(45, 220, 37, 20);
		contentPane.add(cbF);
		
		final JComboBox<String> cbG = new JComboBox<String>();
		cbG.setModel(new DefaultComboBoxModel<String>(new String[] {"", "0", "1"}));
		cbG.setBounds(45, 264, 37, 20);
		contentPane.add(cbG);
		
		final JComboBox<String> cbH = new JComboBox<String>();
		cbH.setModel(new DefaultComboBoxModel<String>(new String[] {"", "0", "1"}));
		cbH.setBounds(45, 308, 37, 20);
		contentPane.add(cbH);
		
		final JComboBox<String> cbI = new JComboBox<String>();
		cbI.setModel(new DefaultComboBoxModel<String>(new String[] {"", "0", "1"}));
		cbI.setBounds(45, 355, 37, 20);
		contentPane.add(cbI);
		
		final JComboBox<String> cbJ = new JComboBox<String>();
		cbJ.setModel(new DefaultComboBoxModel<String>(new String[] {"", "0", "1"}));
		cbJ.setBounds(45, 398, 37, 20);
		contentPane.add(cbJ);
		
		JLabel lblN = new JLabel("N\u00F3 1");
		lblN.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblN.setBounds(133, 13, 46, 14);
		contentPane.add(lblN);
		
		JLabel lblN_1 = new JLabel("N\u00F3 2");
		lblN_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblN_1.setBounds(133, 54, 46, 14);
		contentPane.add(lblN_1);
		
		JLabel lblN_2 = new JLabel("N\u00F3 3");
		lblN_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblN_2.setBounds(133, 96, 46, 14);
		contentPane.add(lblN_2);
		
		JLabel lblN_3 = new JLabel("N\u00F3 4");
		lblN_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblN_3.setBounds(133, 139, 46, 14);
		contentPane.add(lblN_3);
		
		JLabel lblN_4 = new JLabel("N\u00F3 5");
		lblN_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblN_4.setBounds(133, 179, 46, 14);
		contentPane.add(lblN_4);
		
		JLabel lblN_5 = new JLabel("N\u00F3 6");
		lblN_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblN_5.setBounds(133, 223, 46, 14);
		contentPane.add(lblN_5);
		
		JLabel lblN_6 = new JLabel("N\u00F3 7");
		lblN_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblN_6.setBounds(133, 267, 46, 14);
		contentPane.add(lblN_6);
		
		JLabel lblN_7 = new JLabel("N\u00F3 8");
		lblN_7.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblN_7.setBounds(133, 311, 46, 14);
		contentPane.add(lblN_7);
		
		JLabel lblN_8 = new JLabel("N\u00F3 9");
		lblN_8.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblN_8.setBounds(133, 358, 46, 14);
		contentPane.add(lblN_8);
		
		JLabel lblN_9 = new JLabel("N\u00F3 10");
		lblN_9.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblN_9.setBounds(133, 401, 46, 14);
		contentPane.add(lblN_9);
		
		final JComboBox<String> cbNo1A = new JComboBox<String>();
		cbNo1A.setModel(new DefaultComboBoxModel<String>(new String[] {"", "0", "1", "A", "B", "C", "D", "E", "F", "N\u00F3 1", "N\u00F3 2", "N\u00F3 3", "N\u00F3 4", "N\u00F3 5", "N\u00F3 6", "N\u00F3 7", "N\u00F3 8", "N\u00F3 9", "N\u00F3 10", "N\u00F3 11", "N\u00F3 12", "N\u00F3 13", "N\u00F3 14", "N\u00F3 15", "N\u00F3 16", "N\u00F3 17", "N\u00F3 18", "N\u00F3 19", "N\u00F3 20"}));
		cbNo1A.setBounds(189, 10, 54, 20);
		contentPane.add(cbNo1A);
		
		final JComboBox<String> cbNo1Op = new JComboBox<String>();
		cbNo1Op.setModel(new DefaultComboBoxModel<String>(new String[] {"", "AND", "OR", "NAND", "NOR", "XOR", "XNOR", "NOT"}));
		cbNo1Op.setBounds(253, 10, 54, 20);
		contentPane.add(cbNo1Op);
		
		final JComboBox<String> cbNo1B = new JComboBox<String>();
		cbNo1B.setModel(new DefaultComboBoxModel<String>(new String[] {"", "0", "1", "A", "B", "C", "D", "E", "F", "N\u00F3 1", "N\u00F3 2", "N\u00F3 3", "N\u00F3 4", "N\u00F3 5", "N\u00F3 6", "N\u00F3 7", "N\u00F3 8", "N\u00F3 9", "N\u00F3 10", "N\u00F3 11", "N\u00F3 12", "N\u00F3 13", "N\u00F3 14", "N\u00F3 15", "N\u00F3 16", "N\u00F3 17", "N\u00F3 18", "N\u00F3 19", "N\u00F3 20"}));
		cbNo1B.setBounds(317, 10, 54, 20);
		contentPane.add(cbNo1B);
		
		final JComboBox<String> cbNo2A = new JComboBox<String>();
		cbNo2A.setModel(new DefaultComboBoxModel<String>(new String[] {"", "0", "1", "A", "B", "C", "D", "E", "F", "N\u00F3 1", "N\u00F3 2", "N\u00F3 3", "N\u00F3 4", "N\u00F3 5", "N\u00F3 6", "N\u00F3 7", "N\u00F3 8", "N\u00F3 9", "N\u00F3 10", "N\u00F3 11", "N\u00F3 12", "N\u00F3 13", "N\u00F3 14", "N\u00F3 15", "N\u00F3 16", "N\u00F3 17", "N\u00F3 18", "N\u00F3 19", "N\u00F3 20"}));
		cbNo2A.setBounds(189, 46, 54, 20);
		contentPane.add(cbNo2A);
		
		final JComboBox<String> cbNo2Op = new JComboBox<String>();
		cbNo2Op.setModel(new DefaultComboBoxModel<String>(new String[] {"", "AND", "OR", "NAND", "NOR", "XOR", "XNOR", "NOT"}));
		cbNo2Op.setBounds(253, 46, 54, 20);
		contentPane.add(cbNo2Op);
		
		final JComboBox<String> cbNo2B = new JComboBox<String>();
		cbNo2B.setModel(new DefaultComboBoxModel<String>(new String[] {"", "0", "1", "A", "B", "C", "D", "E", "F", "N\u00F3 1", "N\u00F3 2", "N\u00F3 3", "N\u00F3 4", "N\u00F3 5", "N\u00F3 6", "N\u00F3 7", "N\u00F3 8", "N\u00F3 9", "N\u00F3 10", "N\u00F3 11", "N\u00F3 12", "N\u00F3 13", "N\u00F3 14", "N\u00F3 15", "N\u00F3 16", "N\u00F3 17", "N\u00F3 18", "N\u00F3 19", "N\u00F3 20"}));
		cbNo2B.setBounds(317, 46, 54, 20);
		contentPane.add(cbNo2B);
		
		final JComboBox<String> cbNo3A = new JComboBox<String>();
		cbNo3A.setModel(new DefaultComboBoxModel<String>(new String[] {"", "0", "1", "A", "B", "C", "D", "E", "F", "N\u00F3 1", "N\u00F3 2", "N\u00F3 3", "N\u00F3 4", "N\u00F3 5", "N\u00F3 6", "N\u00F3 7", "N\u00F3 8", "N\u00F3 9", "N\u00F3 10", "N\u00F3 11", "N\u00F3 12", "N\u00F3 13", "N\u00F3 14", "N\u00F3 15", "N\u00F3 16", "N\u00F3 17", "N\u00F3 18", "N\u00F3 19", "N\u00F3 20"}));
		cbNo3A.setBounds(189, 88, 54, 20);
		contentPane.add(cbNo3A);
		
		final JComboBox<String> cbNo3Op = new JComboBox<String>();
		cbNo3Op.setModel(new DefaultComboBoxModel<String>(new String[] {"", "AND", "OR", "NAND", "NOR", "XOR", "XNOR", "NOT"}));
		cbNo3Op.setBounds(253, 88, 54, 20);
		contentPane.add(cbNo3Op);
		
		final JComboBox<String> cbNo3B = new JComboBox<String>();
		cbNo3B.setModel(new DefaultComboBoxModel<String>(new String[] {"", "0", "1", "A", "B", "C", "D", "E", "F", "N\u00F3 1", "N\u00F3 2", "N\u00F3 3", "N\u00F3 4", "N\u00F3 5", "N\u00F3 6", "N\u00F3 7", "N\u00F3 8", "N\u00F3 9", "N\u00F3 10", "N\u00F3 11", "N\u00F3 12", "N\u00F3 13", "N\u00F3 14", "N\u00F3 15", "N\u00F3 16", "N\u00F3 17", "N\u00F3 18", "N\u00F3 19", "N\u00F3 20"}));
		cbNo3B.setBounds(317, 88, 54, 20);
		contentPane.add(cbNo3B);
		
		final JComboBox<String> cbNo4A = new JComboBox<String>();
		cbNo4A.setModel(new DefaultComboBoxModel<String>(new String[] {"", "0", "1", "A", "B", "C", "D", "E", "F", "N\u00F3 1", "N\u00F3 2", "N\u00F3 3", "N\u00F3 4", "N\u00F3 5", "N\u00F3 6", "N\u00F3 7", "N\u00F3 8", "N\u00F3 9", "N\u00F3 10", "N\u00F3 11", "N\u00F3 12", "N\u00F3 13", "N\u00F3 14", "N\u00F3 15", "N\u00F3 16", "N\u00F3 17", "N\u00F3 18", "N\u00F3 19", "N\u00F3 20"}));
		cbNo4A.setBounds(189, 136, 54, 20);
		contentPane.add(cbNo4A);
		
		final JComboBox<String> cbNo4Op = new JComboBox<String>();
		cbNo4Op.setModel(new DefaultComboBoxModel<String>(new String[] {"", "AND", "OR", "NAND", "NOR", "XOR", "XNOR", "NOT"}));
		cbNo4Op.setBounds(253, 136, 54, 20);
		contentPane.add(cbNo4Op);
		
		final JComboBox<String> cbNo4B = new JComboBox<String>();
		cbNo4B.setModel(new DefaultComboBoxModel<String>(new String[] {"", "0", "1", "A", "B", "C", "D", "E", "F", "N\u00F3 1", "N\u00F3 2", "N\u00F3 3", "N\u00F3 4", "N\u00F3 5", "N\u00F3 6", "N\u00F3 7", "N\u00F3 8", "N\u00F3 9", "N\u00F3 10", "N\u00F3 11", "N\u00F3 12", "N\u00F3 13", "N\u00F3 14", "N\u00F3 15", "N\u00F3 16", "N\u00F3 17", "N\u00F3 18", "N\u00F3 19", "N\u00F3 20"}));
		cbNo4B.setBounds(317, 136, 54, 20);
		contentPane.add(cbNo4B);
		
		final JComboBox<String> cbNo5A = new JComboBox<String>();
		cbNo5A.setModel(new DefaultComboBoxModel<String>(new String[] {"", "0", "1", "A", "B", "C", "D", "E", "F", "N\u00F3 1", "N\u00F3 2", "N\u00F3 3", "N\u00F3 4", "N\u00F3 5", "N\u00F3 6", "N\u00F3 7", "N\u00F3 8", "N\u00F3 9", "N\u00F3 10", "N\u00F3 11", "N\u00F3 12", "N\u00F3 13", "N\u00F3 14", "N\u00F3 15", "N\u00F3 16", "N\u00F3 17", "N\u00F3 18", "N\u00F3 19", "N\u00F3 20"}));
		cbNo5A.setBounds(189, 176, 54, 20);
		contentPane.add(cbNo5A);
		
		final JComboBox<String> cbNo5Op = new JComboBox<String>();
		cbNo5Op.setModel(new DefaultComboBoxModel<String>(new String[] {"", "AND", "OR", "NAND", "NOR", "XOR", "XNOR", "NOT"}));
		cbNo5Op.setBounds(253, 176, 54, 20);
		contentPane.add(cbNo5Op);
		
		final JComboBox<String> cbNo5B = new JComboBox<String>();
		cbNo5B.setModel(new DefaultComboBoxModel<String>(new String[] {"", "0", "1", "A", "B", "C", "D", "E", "F", "N\u00F3 1", "N\u00F3 2", "N\u00F3 3", "N\u00F3 4", "N\u00F3 5", "N\u00F3 6", "N\u00F3 7", "N\u00F3 8", "N\u00F3 9", "N\u00F3 10", "N\u00F3 11", "N\u00F3 12", "N\u00F3 13", "N\u00F3 14", "N\u00F3 15", "N\u00F3 16", "N\u00F3 17", "N\u00F3 18", "N\u00F3 19", "N\u00F3 20"}));
		cbNo5B.setBounds(317, 176, 54, 20);
		contentPane.add(cbNo5B);
		
		final JComboBox<String> cbNo6A = new JComboBox<String>();
		cbNo6A.setModel(new DefaultComboBoxModel<String>(new String[] {"", "0", "1", "A", "B", "C", "D", "E", "F", "N\u00F3 1", "N\u00F3 2", "N\u00F3 3", "N\u00F3 4", "N\u00F3 5", "N\u00F3 6", "N\u00F3 7", "N\u00F3 8", "N\u00F3 9", "N\u00F3 10", "N\u00F3 11", "N\u00F3 12", "N\u00F3 13", "N\u00F3 14", "N\u00F3 15", "N\u00F3 16", "N\u00F3 17", "N\u00F3 18", "N\u00F3 19", "N\u00F3 20"}));
		cbNo6A.setBounds(189, 215, 54, 20);
		contentPane.add(cbNo6A);
		
		final JComboBox<String> cbNo6Op = new JComboBox<String>();
		cbNo6Op.setModel(new DefaultComboBoxModel<String>(new String[] {"", "AND", "OR", "NAND", "NOR", "XOR", "XNOR", "NOT"}));
		cbNo6Op.setBounds(253, 215, 54, 20);
		contentPane.add(cbNo6Op);
		
		final JComboBox<String> cbNo6B = new JComboBox<String>();
		cbNo6B.setModel(new DefaultComboBoxModel<String>(new String[] {"", "0", "1", "A", "B", "C", "D", "E", "F", "N\u00F3 1", "N\u00F3 2", "N\u00F3 3", "N\u00F3 4", "N\u00F3 5", "N\u00F3 6", "N\u00F3 7", "N\u00F3 8", "N\u00F3 9", "N\u00F3 10", "N\u00F3 11", "N\u00F3 12", "N\u00F3 13", "N\u00F3 14", "N\u00F3 15", "N\u00F3 16", "N\u00F3 17", "N\u00F3 18", "N\u00F3 19", "N\u00F3 20"}));
		cbNo6B.setBounds(317, 215, 54, 20);
		contentPane.add(cbNo6B);
		
		final JComboBox<String> cbNo7A = new JComboBox<String>();
		cbNo7A.setModel(new DefaultComboBoxModel<String>(new String[] {"", "0", "1", "A", "B", "C", "D", "E", "F", "N\u00F3 1", "N\u00F3 2", "N\u00F3 3", "N\u00F3 4", "N\u00F3 5", "N\u00F3 6", "N\u00F3 7", "N\u00F3 8", "N\u00F3 9", "N\u00F3 10", "N\u00F3 11", "N\u00F3 12", "N\u00F3 13", "N\u00F3 14", "N\u00F3 15", "N\u00F3 16", "N\u00F3 17", "N\u00F3 18", "N\u00F3 19", "N\u00F3 20"}));
		cbNo7A.setBounds(189, 259, 54, 20);
		contentPane.add(cbNo7A);
		
		final JComboBox<String> cbNo7Op = new JComboBox<String>();
		cbNo7Op.setModel(new DefaultComboBoxModel<String>(new String[] {"", "AND", "OR", "NAND", "NOR", "XOR", "XNOR", "NOT"}));
		cbNo7Op.setBounds(253, 259, 54, 20);
		contentPane.add(cbNo7Op);
		
		final JComboBox<String> cbNo7B = new JComboBox<String>();
		cbNo7B.setModel(new DefaultComboBoxModel<String>(new String[] {"", "0", "1", "A", "B", "C", "D", "E", "F", "N\u00F3 1", "N\u00F3 2", "N\u00F3 3", "N\u00F3 4", "N\u00F3 5", "N\u00F3 6", "N\u00F3 7", "N\u00F3 8", "N\u00F3 9", "N\u00F3 10", "N\u00F3 11", "N\u00F3 12", "N\u00F3 13", "N\u00F3 14", "N\u00F3 15", "N\u00F3 16", "N\u00F3 17", "N\u00F3 18", "N\u00F3 19", "N\u00F3 20"}));
		cbNo7B.setBounds(317, 259, 54, 20);
		contentPane.add(cbNo7B);
		
		final JComboBox<String> cbNo8A = new JComboBox<String>();
		cbNo8A.setModel(new DefaultComboBoxModel<String>(new String[] {"", "0", "1", "A", "B", "C", "D", "E", "F", "N\u00F3 1", "N\u00F3 2", "N\u00F3 3", "N\u00F3 4", "N\u00F3 5", "N\u00F3 6", "N\u00F3 7", "N\u00F3 8", "N\u00F3 9", "N\u00F3 10", "N\u00F3 11", "N\u00F3 12", "N\u00F3 13", "N\u00F3 14", "N\u00F3 15", "N\u00F3 16", "N\u00F3 17", "N\u00F3 18", "N\u00F3 19", "N\u00F3 20"}));
		cbNo8A.setBounds(189, 303, 54, 20);
		contentPane.add(cbNo8A);
		
		final JComboBox<String> cbNo8Op = new JComboBox<String>();
		cbNo8Op.setModel(new DefaultComboBoxModel<String>(new String[] {"", "AND", "OR", "NAND", "NOR", "XOR", "XNOR", "NOT"}));
		cbNo8Op.setBounds(253, 303, 54, 20);
		contentPane.add(cbNo8Op);
		
		final JComboBox<String> cbNo8B = new JComboBox<String>();
		cbNo8B.setModel(new DefaultComboBoxModel<String>(new String[] {"", "0", "1", "A", "B", "C", "D", "E", "F", "N\u00F3 1", "N\u00F3 2", "N\u00F3 3", "N\u00F3 4", "N\u00F3 5", "N\u00F3 6", "N\u00F3 7", "N\u00F3 8", "N\u00F3 9", "N\u00F3 10", "N\u00F3 11", "N\u00F3 12", "N\u00F3 13", "N\u00F3 14", "N\u00F3 15", "N\u00F3 16", "N\u00F3 17", "N\u00F3 18", "N\u00F3 19", "N\u00F3 20"}));
		cbNo8B.setBounds(317, 303, 54, 20);
		contentPane.add(cbNo8B);
		
		final JComboBox<String> cbNo9A = new JComboBox<String>();
		cbNo9A.setModel(new DefaultComboBoxModel<String>(new String[] {"", "0", "1", "A", "B", "C", "D", "E", "F", "N\u00F3 1", "N\u00F3 2", "N\u00F3 3", "N\u00F3 4", "N\u00F3 5", "N\u00F3 6", "N\u00F3 7", "N\u00F3 8", "N\u00F3 9", "N\u00F3 10", "N\u00F3 11", "N\u00F3 12", "N\u00F3 13", "N\u00F3 14", "N\u00F3 15", "N\u00F3 16", "N\u00F3 17", "N\u00F3 18", "N\u00F3 19", "N\u00F3 20"}));
		cbNo9A.setBounds(189, 350, 54, 20);
		contentPane.add(cbNo9A);
		
		final JComboBox<String> cbNo9Op = new JComboBox<String>();
		cbNo9Op.setModel(new DefaultComboBoxModel<String>(new String[] {"", "AND", "OR", "NAND", "NOR", "XOR", "XNOR", "NOT"}));
		cbNo9Op.setBounds(253, 350, 54, 20);
		contentPane.add(cbNo9Op);
		
		final JComboBox<String> cbNo9B = new JComboBox<String>();
		cbNo9B.setModel(new DefaultComboBoxModel<String>(new String[] {"", "0", "1", "A", "B", "C", "D", "E", "F", "N\u00F3 1", "N\u00F3 2", "N\u00F3 3", "N\u00F3 4", "N\u00F3 5", "N\u00F3 6", "N\u00F3 7", "N\u00F3 8", "N\u00F3 9", "N\u00F3 10", "N\u00F3 11", "N\u00F3 12", "N\u00F3 13", "N\u00F3 14", "N\u00F3 15", "N\u00F3 16", "N\u00F3 17", "N\u00F3 18", "N\u00F3 19", "N\u00F3 20"}));
		cbNo9B.setBounds(317, 350, 54, 20);
		contentPane.add(cbNo9B);
		
		final JComboBox<String> cbNo10A = new JComboBox<String>();
		cbNo10A.setModel(new DefaultComboBoxModel<String>(new String[] {"", "0", "1", "A", "B", "C", "D", "E", "F", "N\u00F3 1", "N\u00F3 2", "N\u00F3 3", "N\u00F3 4", "N\u00F3 5", "N\u00F3 6", "N\u00F3 7", "N\u00F3 8", "N\u00F3 9", "N\u00F3 10", "N\u00F3 11", "N\u00F3 12", "N\u00F3 13", "N\u00F3 14", "N\u00F3 15", "N\u00F3 16", "N\u00F3 17", "N\u00F3 18", "N\u00F3 19", "N\u00F3 20"}));
		cbNo10A.setBounds(189, 398, 54, 20);
		contentPane.add(cbNo10A);
		
		final JComboBox<String> cbNo10Op = new JComboBox<String>();
		cbNo10Op.setModel(new DefaultComboBoxModel<String>(new String[] {"", "AND", "OR", "NAND", "NOR", "XOR", "XNOR", "NOT"}));
		cbNo10Op.setBounds(253, 398, 54, 20);
		contentPane.add(cbNo10Op);
		
		final JComboBox<String> cbNo10B = new JComboBox<String>();
		cbNo10B.setModel(new DefaultComboBoxModel<String>(new String[] {"", "0", "1", "A", "B", "C", "D", "E", "F", "N\u00F3 1", "N\u00F3 2", "N\u00F3 3", "N\u00F3 4", "N\u00F3 5", "N\u00F3 6", "N\u00F3 7", "N\u00F3 8", "N\u00F3 9", "N\u00F3 10", "N\u00F3 11", "N\u00F3 12", "N\u00F3 13", "N\u00F3 14", "N\u00F3 15", "N\u00F3 16", "N\u00F3 17", "N\u00F3 18", "N\u00F3 19", "N\u00F3 20"}));
		cbNo10B.setBounds(317, 398, 54, 20);
		contentPane.add(cbNo10B);
		
		JLabel lblN_10 = new JLabel("N\u00F3 11");
		lblN_10.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblN_10.setBounds(433, 14, 46, 14);
		contentPane.add(lblN_10);
		
		final JComboBox<String> cbNo11A = new JComboBox<String>();
		cbNo11A.setModel(new DefaultComboBoxModel<String>(new String[] {"", "0", "1", "A", "B", "C", "D", "E", "F", "N\u00F3 1", "N\u00F3 2", "N\u00F3 3", "N\u00F3 4", "N\u00F3 5", "N\u00F3 6", "N\u00F3 7", "N\u00F3 8", "N\u00F3 9", "N\u00F3 10", "N\u00F3 11", "N\u00F3 12", "N\u00F3 13", "N\u00F3 14", "N\u00F3 15", "N\u00F3 16", "N\u00F3 17", "N\u00F3 18", "N\u00F3 19", "N\u00F3 20"}));
		cbNo11A.setBounds(489, 11, 54, 20);
		contentPane.add(cbNo11A);
		
		final JComboBox<String> cbNo11Op = new JComboBox<String>();
		cbNo11Op.setModel(new DefaultComboBoxModel<String>(new String[] {"", "AND", "OR", "NAND", "NOR", "XOR", "XNOR", "NOT"}));
		cbNo11Op.setBounds(553, 11, 54, 20);
		contentPane.add(cbNo11Op);
		
		final JComboBox<String> cbNo11B = new JComboBox<String>();
		cbNo11B.setModel(new DefaultComboBoxModel<String>(new String[] {"", "0", "1", "A", "B", "C", "D", "E", "F", "N\u00F3 1", "N\u00F3 2", "N\u00F3 3", "N\u00F3 4", "N\u00F3 5", "N\u00F3 6", "N\u00F3 7", "N\u00F3 8", "N\u00F3 9", "N\u00F3 10", "N\u00F3 11", "N\u00F3 12", "N\u00F3 13", "N\u00F3 14", "N\u00F3 15", "N\u00F3 16", "N\u00F3 17", "N\u00F3 18", "N\u00F3 19", "N\u00F3 20"}));
		cbNo11B.setBounds(617, 11, 54, 20);
		contentPane.add(cbNo11B);
		
		JLabel lblN_11 = new JLabel("N\u00F3 12");
		lblN_11.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblN_11.setBounds(433, 55, 46, 14);
		contentPane.add(lblN_11);
		
		final JComboBox<String> cbNo12A = new JComboBox<String>();
		cbNo12A.setModel(new DefaultComboBoxModel<String>(new String[] {"", "0", "1", "A", "B", "C", "D", "E", "F", "N\u00F3 1", "N\u00F3 2", "N\u00F3 3", "N\u00F3 4", "N\u00F3 5", "N\u00F3 6", "N\u00F3 7", "N\u00F3 8", "N\u00F3 9", "N\u00F3 10", "N\u00F3 11", "N\u00F3 12", "N\u00F3 13", "N\u00F3 14", "N\u00F3 15", "N\u00F3 16", "N\u00F3 17", "N\u00F3 18", "N\u00F3 19", "N\u00F3 20"}));
		cbNo12A.setBounds(489, 47, 54, 20);
		contentPane.add(cbNo12A);
		
		final JComboBox<String> cbNo12Op = new JComboBox<String>();
		cbNo12Op.setModel(new DefaultComboBoxModel<String>(new String[] {"", "AND", "OR", "NAND", "NOR", "XOR", "XNOR", "NOT"}));
		cbNo12Op.setBounds(553, 47, 54, 20);
		contentPane.add(cbNo12Op);
		
		final JComboBox<String> cbNo12B = new JComboBox<String>();
		cbNo12B.setModel(new DefaultComboBoxModel<String>(new String[] {"", "0", "1", "A", "B", "C", "D", "E", "F", "N\u00F3 1", "N\u00F3 2", "N\u00F3 3", "N\u00F3 4", "N\u00F3 5", "N\u00F3 6", "N\u00F3 7", "N\u00F3 8", "N\u00F3 9", "N\u00F3 10", "N\u00F3 11", "N\u00F3 12", "N\u00F3 13", "N\u00F3 14", "N\u00F3 15", "N\u00F3 16", "N\u00F3 17", "N\u00F3 18", "N\u00F3 19", "N\u00F3 20"}));
		cbNo12B.setBounds(617, 47, 54, 20);
		contentPane.add(cbNo12B);
		
		JLabel lblN_12 = new JLabel("N\u00F3 13");
		lblN_12.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblN_12.setBounds(433, 97, 46, 14);
		contentPane.add(lblN_12);
		
		final JComboBox<String> cbNo13A = new JComboBox<String>();
		cbNo13A.setModel(new DefaultComboBoxModel<String>(new String[] {"", "0", "1", "A", "B", "C", "D", "E", "F", "N\u00F3 1", "N\u00F3 2", "N\u00F3 3", "N\u00F3 4", "N\u00F3 5", "N\u00F3 6", "N\u00F3 7", "N\u00F3 8", "N\u00F3 9", "N\u00F3 10", "N\u00F3 11", "N\u00F3 12", "N\u00F3 13", "N\u00F3 14", "N\u00F3 15", "N\u00F3 16", "N\u00F3 17", "N\u00F3 18", "N\u00F3 19", "N\u00F3 20"}));
		cbNo13A.setBounds(489, 89, 54, 20);
		contentPane.add(cbNo13A);
		
		final JComboBox<String> cbNo13Op = new JComboBox<String>();
		cbNo13Op.setModel(new DefaultComboBoxModel<String>(new String[] {"", "AND", "OR", "NAND", "NOR", "XOR", "XNOR", "NOT"}));
		cbNo13Op.setBounds(553, 89, 54, 20);
		contentPane.add(cbNo13Op);
		
		final JComboBox<String> cbNo13B = new JComboBox<String>();
		cbNo13B.setModel(new DefaultComboBoxModel<String>(new String[] {"", "0", "1", "A", "B", "C", "D", "E", "F", "N\u00F3 1", "N\u00F3 2", "N\u00F3 3", "N\u00F3 4", "N\u00F3 5", "N\u00F3 6", "N\u00F3 7", "N\u00F3 8", "N\u00F3 9", "N\u00F3 10", "N\u00F3 11", "N\u00F3 12", "N\u00F3 13", "N\u00F3 14", "N\u00F3 15", "N\u00F3 16", "N\u00F3 17", "N\u00F3 18", "N\u00F3 19", "N\u00F3 20"}));
		cbNo13B.setBounds(617, 89, 54, 20);
		contentPane.add(cbNo13B);
		
		final JComboBox<String> cbNo14B = new JComboBox<String>();
		cbNo14B.setModel(new DefaultComboBoxModel<String>(new String[] {"", "0", "1", "A", "B", "C", "D", "E", "F", "N\u00F3 1", "N\u00F3 2", "N\u00F3 3", "N\u00F3 4", "N\u00F3 5", "N\u00F3 6", "N\u00F3 7", "N\u00F3 8", "N\u00F3 9", "N\u00F3 10", "N\u00F3 11", "N\u00F3 12", "N\u00F3 13", "N\u00F3 14", "N\u00F3 15", "N\u00F3 16", "N\u00F3 17", "N\u00F3 18", "N\u00F3 19", "N\u00F3 20"}));
		cbNo14B.setBounds(617, 137, 54, 20);
		contentPane.add(cbNo14B);
		
		final JComboBox<String> cbNo14Op = new JComboBox<String>();
		cbNo14Op.setModel(new DefaultComboBoxModel<String>(new String[] {"", "AND", "OR", "NAND", "NOR", "XOR", "XNOR", "NOT"}));
		cbNo14Op.setBounds(553, 137, 54, 20);
		contentPane.add(cbNo14Op);
		
		final JComboBox<String> cbNo14A = new JComboBox<String>();
		cbNo14A.setModel(new DefaultComboBoxModel<String>(new String[] {"", "0", "1", "A", "B", "C", "D", "E", "F", "N\u00F3 1", "N\u00F3 2", "N\u00F3 3", "N\u00F3 4", "N\u00F3 5", "N\u00F3 6", "N\u00F3 7", "N\u00F3 8", "N\u00F3 9", "N\u00F3 10", "N\u00F3 11", "N\u00F3 12", "N\u00F3 13", "N\u00F3 14", "N\u00F3 15", "N\u00F3 16", "N\u00F3 17", "N\u00F3 18", "N\u00F3 19", "N\u00F3 20"}));
		cbNo14A.setBounds(489, 137, 54, 20);
		contentPane.add(cbNo14A);
		
		JLabel lblN_13 = new JLabel("N\u00F3 14");
		lblN_13.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblN_13.setBounds(433, 140, 46, 14);
		contentPane.add(lblN_13);
		
		JLabel lblN_14 = new JLabel("N\u00F3 15");
		lblN_14.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblN_14.setBounds(433, 180, 46, 14);
		contentPane.add(lblN_14);
		
		final JComboBox<String> cbNo15A = new JComboBox<String>();
		cbNo15A.setModel(new DefaultComboBoxModel<String>(new String[] {"", "0", "1", "A", "B", "C", "D", "E", "F", "N\u00F3 1", "N\u00F3 2", "N\u00F3 3", "N\u00F3 4", "N\u00F3 5", "N\u00F3 6", "N\u00F3 7", "N\u00F3 8", "N\u00F3 9", "N\u00F3 10", "N\u00F3 11", "N\u00F3 12", "N\u00F3 13", "N\u00F3 14", "N\u00F3 15", "N\u00F3 16", "N\u00F3 17", "N\u00F3 18", "N\u00F3 19", "N\u00F3 20"}));
		cbNo15A.setBounds(489, 177, 54, 20);
		contentPane.add(cbNo15A);
		
		final JComboBox<String> cbNo15Op = new JComboBox<String>();
		cbNo15Op.setModel(new DefaultComboBoxModel<String>(new String[] {"", "AND", "OR", "NAND", "NOR", "XOR", "XNOR", "NOT"}));
		cbNo15Op.setBounds(553, 177, 54, 20);
		contentPane.add(cbNo15Op);
		
		final JComboBox<String> cbNo15B = new JComboBox<String>();
		cbNo15B.setModel(new DefaultComboBoxModel<String>(new String[] {"", "0", "1", "A", "B", "C", "D", "E", "F", "N\u00F3 1", "N\u00F3 2", "N\u00F3 3", "N\u00F3 4", "N\u00F3 5", "N\u00F3 6", "N\u00F3 7", "N\u00F3 8", "N\u00F3 9", "N\u00F3 10", "N\u00F3 11", "N\u00F3 12", "N\u00F3 13", "N\u00F3 14", "N\u00F3 15", "N\u00F3 16", "N\u00F3 17", "N\u00F3 18", "N\u00F3 19", "N\u00F3 20"}));
		cbNo15B.setBounds(617, 177, 54, 20);
		contentPane.add(cbNo15B);
		
		JLabel lblN_15 = new JLabel("N\u00F3 16");
		lblN_15.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblN_15.setBounds(433, 223, 46, 14);
		contentPane.add(lblN_15);
		
		final JComboBox<String> cbNo16A = new JComboBox<String>();
		cbNo16A.setModel(new DefaultComboBoxModel<String>(new String[] {"", "0", "1", "A", "B", "C", "D", "E", "F", "N\u00F3 1", "N\u00F3 2", "N\u00F3 3", "N\u00F3 4", "N\u00F3 5", "N\u00F3 6", "N\u00F3 7", "N\u00F3 8", "N\u00F3 9", "N\u00F3 10", "N\u00F3 11", "N\u00F3 12", "N\u00F3 13", "N\u00F3 14", "N\u00F3 15", "N\u00F3 16", "N\u00F3 17", "N\u00F3 18", "N\u00F3 19", "N\u00F3 20"}));
		cbNo16A.setBounds(489, 215, 54, 20);
		contentPane.add(cbNo16A);
		
		final JComboBox<String> cbNo16Op = new JComboBox<String>();
		cbNo16Op.setModel(new DefaultComboBoxModel<String>(new String[] {"", "AND", "OR", "NAND", "NOR", "XOR", "XNOR", "NOT"}));
		cbNo16Op.setBounds(553, 215, 54, 20);
		contentPane.add(cbNo16Op);
		
		final JComboBox<String> cbNo16B = new JComboBox<String>();
		cbNo16B.setModel(new DefaultComboBoxModel<String>(new String[] {"", "0", "1", "A", "B", "C", "D", "E", "F", "N\u00F3 1", "N\u00F3 2", "N\u00F3 3", "N\u00F3 4", "N\u00F3 5", "N\u00F3 6", "N\u00F3 7", "N\u00F3 8", "N\u00F3 9", "N\u00F3 10", "N\u00F3 11", "N\u00F3 12", "N\u00F3 13", "N\u00F3 14", "N\u00F3 15", "N\u00F3 16", "N\u00F3 17", "N\u00F3 18", "N\u00F3 19", "N\u00F3 20"}));
		cbNo16B.setBounds(617, 215, 54, 20);
		contentPane.add(cbNo16B);
		
		final JComboBox<String> cbNo17B = new JComboBox<String>();
		cbNo17B.setModel(new DefaultComboBoxModel<String>(new String[] {"", "0", "1", "A", "B", "C", "D", "E", "F", "N\u00F3 1", "N\u00F3 2", "N\u00F3 3", "N\u00F3 4", "N\u00F3 5", "N\u00F3 6", "N\u00F3 7", "N\u00F3 8", "N\u00F3 9", "N\u00F3 10", "N\u00F3 11", "N\u00F3 12", "N\u00F3 13", "N\u00F3 14", "N\u00F3 15", "N\u00F3 16", "N\u00F3 17", "N\u00F3 18", "N\u00F3 19", "N\u00F3 20"}));
		cbNo17B.setBounds(617, 259, 54, 20);
		contentPane.add(cbNo17B);
		
		final JComboBox<String> cbNo17Op = new JComboBox<String>();
		cbNo17Op.setModel(new DefaultComboBoxModel<String>(new String[] {"", "AND", "OR", "NAND", "NOR", "XOR", "XNOR", "NOT"}));
		cbNo17Op.setBounds(553, 259, 54, 20);
		contentPane.add(cbNo17Op);
		
		final JComboBox<String> cbNo17A = new JComboBox<String>();
		cbNo17A.setModel(new DefaultComboBoxModel<String>(new String[] {"", "0", "1", "A", "B", "C", "D", "E", "F", "N\u00F3 1", "N\u00F3 2", "N\u00F3 3", "N\u00F3 4", "N\u00F3 5", "N\u00F3 6", "N\u00F3 7", "N\u00F3 8", "N\u00F3 9", "N\u00F3 10", "N\u00F3 11", "N\u00F3 12", "N\u00F3 13", "N\u00F3 14", "N\u00F3 15", "N\u00F3 16", "N\u00F3 17", "N\u00F3 18", "N\u00F3 19", "N\u00F3 20"}));
		cbNo17A.setBounds(489, 259, 54, 20);
		contentPane.add(cbNo17A);
		
		JLabel lblN_16 = new JLabel("N\u00F3 17");
		lblN_16.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblN_16.setBounds(433, 267, 46, 14);
		contentPane.add(lblN_16);
		
		JLabel lblN_17 = new JLabel("N\u00F3 18");
		lblN_17.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblN_17.setBounds(433, 311, 46, 14);
		contentPane.add(lblN_17);
		
		final JComboBox<String> cbNo18A = new JComboBox<String>();
		cbNo18A.setModel(new DefaultComboBoxModel<String>(new String[] {"", "0", "1", "A", "B", "C", "D", "E", "F", "N\u00F3 1", "N\u00F3 2", "N\u00F3 3", "N\u00F3 4", "N\u00F3 5", "N\u00F3 6", "N\u00F3 7", "N\u00F3 8", "N\u00F3 9", "N\u00F3 10", "N\u00F3 11", "N\u00F3 12", "N\u00F3 13", "N\u00F3 14", "N\u00F3 15", "N\u00F3 16", "N\u00F3 17", "N\u00F3 18", "N\u00F3 19", "N\u00F3 20"}));
		cbNo18A.setBounds(489, 303, 54, 20);
		contentPane.add(cbNo18A);
		
		final JComboBox<String> cbNo18Op = new JComboBox<String>();
		cbNo18Op.setModel(new DefaultComboBoxModel<String>(new String[] {"", "AND", "OR", "NAND", "NOR", "XOR", "XNOR", "NOT"}));
		cbNo18Op.setBounds(553, 303, 54, 20);
		contentPane.add(cbNo18Op);
		
		final JComboBox<String> cbNo18B = new JComboBox<String>();
		cbNo18B.setModel(new DefaultComboBoxModel<String>(new String[] {"", "0", "1", "A", "B", "C", "D", "E", "F", "N\u00F3 1", "N\u00F3 2", "N\u00F3 3", "N\u00F3 4", "N\u00F3 5", "N\u00F3 6", "N\u00F3 7", "N\u00F3 8", "N\u00F3 9", "N\u00F3 10", "N\u00F3 11", "N\u00F3 12", "N\u00F3 13", "N\u00F3 14", "N\u00F3 15", "N\u00F3 16", "N\u00F3 17", "N\u00F3 18", "N\u00F3 19", "N\u00F3 20"}));
		cbNo18B.setBounds(617, 303, 54, 20);
		contentPane.add(cbNo18B);
		
		final JComboBox<String> cbNo19B = new JComboBox<String>();
		cbNo19B.setModel(new DefaultComboBoxModel<String>(new String[] {"", "0", "1", "A", "B", "C", "D", "E", "F", "N\u00F3 1", "N\u00F3 2", "N\u00F3 3", "N\u00F3 4", "N\u00F3 5", "N\u00F3 6", "N\u00F3 7", "N\u00F3 8", "N\u00F3 9", "N\u00F3 10", "N\u00F3 11", "N\u00F3 12", "N\u00F3 13", "N\u00F3 14", "N\u00F3 15", "N\u00F3 16", "N\u00F3 17", "N\u00F3 18", "N\u00F3 19", "N\u00F3 20"}));
		cbNo19B.setBounds(617, 350, 54, 20);
		contentPane.add(cbNo19B);
		
		final JComboBox<String> cbNo19Op = new JComboBox<String>();
		cbNo19Op.setModel(new DefaultComboBoxModel<String>(new String[] {"", "AND", "OR", "NAND", "NOR", "XOR", "XNOR", "NOT"}));
		cbNo19Op.setBounds(553, 350, 54, 20);
		contentPane.add(cbNo19Op);
		
		final JComboBox<String> cbNo19A = new JComboBox<String>();
		cbNo19A.setModel(new DefaultComboBoxModel<String>(new String[] {"", "0", "1", "A", "B", "C", "D", "E", "F", "N\u00F3 1", "N\u00F3 2", "N\u00F3 3", "N\u00F3 4", "N\u00F3 5", "N\u00F3 6", "N\u00F3 7", "N\u00F3 8", "N\u00F3 9", "N\u00F3 10", "N\u00F3 11", "N\u00F3 12", "N\u00F3 13", "N\u00F3 14", "N\u00F3 15", "N\u00F3 16", "N\u00F3 17", "N\u00F3 18", "N\u00F3 19", "N\u00F3 20"}));
		cbNo19A.setBounds(489, 350, 54, 20);
		contentPane.add(cbNo19A);
		
		JLabel lblN_18 = new JLabel("N\u00F3 19");
		lblN_18.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblN_18.setBounds(433, 358, 46, 14);
		contentPane.add(lblN_18);
		
		JLabel lblN_19 = new JLabel("N\u00F3 20");
		lblN_19.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblN_19.setBounds(433, 401, 46, 14);
		contentPane.add(lblN_19);
		
		final JComboBox<String> cbNo20A = new JComboBox<String>();
		cbNo20A.setModel(new DefaultComboBoxModel<String>(new String[] {"", "0", "1", "A", "B", "C", "D", "E", "F", "N\u00F3 1", "N\u00F3 2", "N\u00F3 3", "N\u00F3 4", "N\u00F3 5", "N\u00F3 6", "N\u00F3 7", "N\u00F3 8", "N\u00F3 9", "N\u00F3 10", "N\u00F3 11", "N\u00F3 12", "N\u00F3 13", "N\u00F3 14", "N\u00F3 15", "N\u00F3 16", "N\u00F3 17", "N\u00F3 18", "N\u00F3 19", "N\u00F3 20"}));
		cbNo20A.setBounds(489, 398, 54, 20);
		contentPane.add(cbNo20A);
		
		final JComboBox<String> cbNo20Op = new JComboBox<String>();
		cbNo20Op.setModel(new DefaultComboBoxModel<String>(new String[] {"", "AND", "OR", "NAND", "NOR", "XOR", "XNOR", "NOT"}));
		cbNo20Op.setBounds(553, 398, 54, 20);
		contentPane.add(cbNo20Op);
		
		final JComboBox<String> cbNo20B = new JComboBox<String>();
		cbNo20B.setModel(new DefaultComboBoxModel<String>(new String[] {"", "0", "1", "A", "B", "C", "D", "E", "F", "N\u00F3 1", "N\u00F3 2", "N\u00F3 3", "N\u00F3 4", "N\u00F3 5", "N\u00F3 6", "N\u00F3 7", "N\u00F3 8", "N\u00F3 9", "N\u00F3 10", "N\u00F3 11", "N\u00F3 12", "N\u00F3 13", "N\u00F3 14", "N\u00F3 15", "N\u00F3 16", "N\u00F3 17", "N\u00F3 18", "N\u00F3 19", "N\u00F3 20"}));
		cbNo20B.setBounds(617, 398, 54, 20);
		contentPane.add(cbNo20B);
		
		JLabel lblSadaDoCircuito = new JLabel("Sa\u00EDda do Circuito");
		lblSadaDoCircuito.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblSadaDoCircuito.setBounds(10, 517, 169, 23);
		contentPane.add(lblSadaDoCircuito);
		
		tfSaida.setEditable(false);
		tfSaida.setBounds(189, 517, 86, 20);
		contentPane.add(tfSaida);
		tfSaida.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(10, 465, 89, 23);
		contentPane.add(btnCalcular);
		
		
		btnFechar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		
		btnCalcular.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				entrada[1] = cbA.getSelectedItem().toString();
				entrada[2] = cbB.getSelectedItem().toString();
				entrada[3] = cbC.getSelectedItem().toString();
				entrada[4] = cbD.getSelectedItem().toString();
				entrada[5] = cbE.getSelectedItem().toString();
				entrada[6] = cbF.getSelectedItem().toString();
				entrada[7] = cbG.getSelectedItem().toString();
				entrada[8] = cbH.getSelectedItem().toString();
				entrada[9] = cbI.getSelectedItem().toString();
				entrada[10] = cbJ.getSelectedItem().toString();
				nos[1][1] = cbNo1A.getSelectedItem().toString();
				nos[2][1] = cbNo2A.getSelectedItem().toString();
				nos[3][1] = cbNo3A.getSelectedItem().toString();
				nos[4][1] = cbNo4A.getSelectedItem().toString();
				nos[5][1] = cbNo5A.getSelectedItem().toString();
				nos[6][1] = cbNo6A.getSelectedItem().toString();
				nos[7][1] = cbNo7A.getSelectedItem().toString();
				nos[8][1] = cbNo8A.getSelectedItem().toString();
				nos[9][1] = cbNo9A.getSelectedItem().toString();
				nos[10][1] = cbNo11A.getSelectedItem().toString();
				nos[11][1] = cbNo11A.getSelectedItem().toString();
				nos[12][1] = cbNo12A.getSelectedItem().toString();
				nos[13][1] = cbNo13A.getSelectedItem().toString();
				nos[14][1] = cbNo14A.getSelectedItem().toString();
				nos[15][1] = cbNo15A.getSelectedItem().toString();
				nos[16][1] = cbNo16A.getSelectedItem().toString();
				nos[17][1] = cbNo17A.getSelectedItem().toString();
				nos[18][1] = cbNo18A.getSelectedItem().toString();
				nos[19][1] = cbNo19A.getSelectedItem().toString();
				nos[20][1] = cbNo20A.getSelectedItem().toString();
				
				nos[1][2] = cbNo1Op.getSelectedItem().toString();
				nos[2][2] = cbNo2Op.getSelectedItem().toString();
				nos[3][2] = cbNo3Op.getSelectedItem().toString();
				nos[4][2] = cbNo4Op.getSelectedItem().toString();
				nos[5][2] = cbNo5Op.getSelectedItem().toString();
				nos[6][2] = cbNo6Op.getSelectedItem().toString();
				nos[7][2] = cbNo7Op.getSelectedItem().toString();
				nos[8][2] = cbNo8Op.getSelectedItem().toString();
				nos[9][2] = cbNo9Op.getSelectedItem().toString();
				nos[10][2] = cbNo11Op.getSelectedItem().toString();
				nos[11][2] = cbNo11Op.getSelectedItem().toString();
				nos[12][2] = cbNo12Op.getSelectedItem().toString();
				nos[13][2] = cbNo13Op.getSelectedItem().toString();
				nos[14][2] = cbNo14Op.getSelectedItem().toString();
				nos[15][2] = cbNo15Op.getSelectedItem().toString();
				nos[16][2] = cbNo16Op.getSelectedItem().toString();
				nos[17][2] = cbNo17Op.getSelectedItem().toString();
				nos[18][2] = cbNo18Op.getSelectedItem().toString();
				nos[19][2] = cbNo19Op.getSelectedItem().toString();
				nos[20][2] = cbNo20Op.getSelectedItem().toString();
				
				nos[1][3] = cbNo1A.getSelectedItem().toString();
				nos[2][3] = cbNo2B.getSelectedItem().toString();
				nos[3][3] = cbNo3B.getSelectedItem().toString();
				nos[4][3] = cbNo4B.getSelectedItem().toString();
				nos[5][3] = cbNo5B.getSelectedItem().toString();
				nos[6][3] = cbNo6B.getSelectedItem().toString();
				nos[7][3] = cbNo7B.getSelectedItem().toString();
				nos[8][3] = cbNo8B.getSelectedItem().toString();
				nos[9][3] = cbNo9B.getSelectedItem().toString();
				nos[10][3] = cbNo10B.getSelectedItem().toString();
				nos[11][3] = cbNo11B.getSelectedItem().toString();
				nos[12][3] = cbNo12B.getSelectedItem().toString();
				nos[13][3] = cbNo13B.getSelectedItem().toString();
				nos[14][3] = cbNo14B.getSelectedItem().toString();
				nos[15][3] = cbNo15B.getSelectedItem().toString();
				nos[16][3] = cbNo16B.getSelectedItem().toString();
				nos[17][3] = cbNo17B.getSelectedItem().toString();
				nos[18][3] = cbNo18B.getSelectedItem().toString();
				nos[19][3] = cbNo19B.getSelectedItem().toString();
				nos[20][3] = cbNo20B.getSelectedItem().toString();
				
			}
		});
		
	}
	
}
