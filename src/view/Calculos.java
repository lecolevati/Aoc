package view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Calculos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfRes = new JTextField();
	int numeros[] = new int[100];
	String operacoes[] = new String[100];
	private JTextField tfAlg = new JTextField();
	
	OpCalculos opCalculos = new OpCalculos();
	int inicio = 0;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculos frame = new Calculos();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Calculos() {
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		opCalculos.zeraPilha(numeros, operacoes);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.setBounds(685, 528, 89, 23);
		contentPane.add(btnFechar);
		tfRes.setHorizontalAlignment(SwingConstants.RIGHT);
		
		tfRes.setEditable(false);
		tfRes.setBounds(27, 58, 392, 20);
		contentPane.add(tfRes);
		tfRes.setColumns(10);
		
		JButton btnZero = new JButton("0");
		btnZero.setBounds(27, 113, 50, 23);
		contentPane.add(btnZero);
		
		JButton btnUm = new JButton("1");
		btnUm.setBounds(91, 113, 50, 23);
		contentPane.add(btnUm);
		
		JButton btnC = new JButton("C");
		btnC.setBounds(369, 113, 50, 23);
		contentPane.add(btnC);
		
		JButton btnSoma = new JButton("+");
		btnSoma.setBounds(27, 179, 50, 23);
		contentPane.add(btnSoma);
		
		JButton btnSub = new JButton("-");
		btnSub.setBounds(91, 179, 50, 23);
		contentPane.add(btnSub);
		
		JButton btnMult = new JButton("X");
		btnMult.setBounds(27, 213, 50, 23);
		contentPane.add(btnMult);
		
		JButton btnDiv = new JButton("/");
		btnDiv.setBounds(91, 213, 50, 23);
		contentPane.add(btnDiv);
		
		JButton btnIgual = new JButton("=");
		btnIgual.setBounds(27, 247, 114, 23);
		contentPane.add(btnIgual);
		
		tfAlg.setHorizontalAlignment(SwingConstants.RIGHT);
		tfAlg.setEditable(false);
		tfAlg.setBounds(27, 37, 392, 20);
		contentPane.add(tfAlg);
		tfAlg.setColumns(10);
		
		JButton btnCe = new JButton("CE");
		btnCe.setBounds(310, 113, 50, 23);
		contentPane.add(btnCe);
		
		JButton btnDel = new JButton("DEL");
		btnDel.setFont(new Font("Tahoma", Font.BOLD, 8));
		btnDel.setBounds(369, 147, 50, 23);
		contentPane.add(btnDel);
		
		btnFechar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		
		btnZero.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (inicio == 0){
					tfRes.setText(tfRes.getText() + "0");
				}
			}
		});
		
		btnUm.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (inicio == 0){
					tfRes.setText(tfRes.getText() + "1");
				}
			}
		});
		
		btnSoma.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					if (inicio == 0){
						int res = Integer.parseInt(tfRes.getText());
						opCalculos.insereNumero(numeros, res,tfAlg);
						opCalculos.insereOperacao(operacoes, "+", tfAlg);
						tfRes.setText("");
					}
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, ex.getMessage(), "ERRO !!!", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		
		btnDiv.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					if (inicio == 0){
						int res = Integer.parseInt(tfRes.getText());
						opCalculos.insereNumero(numeros, res,tfAlg);
						opCalculos.insereOperacao(operacoes, "/", tfAlg);
						tfRes.setText("");
					}
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, ex.getMessage(), "ERRO !!!", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		
		btnSub.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					if (inicio == 0){
						int res = Integer.parseInt(tfRes.getText());
						opCalculos.insereNumero(numeros, res,tfAlg);
						opCalculos.insereOperacao(operacoes, "-", tfAlg);
						tfRes.setText("");
					}
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, ex.getMessage(), "ERRO !!!", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		
		btnMult.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					if (inicio == 0){
						int res = Integer.parseInt(tfRes.getText());
						opCalculos.insereNumero(numeros, res,tfAlg);
						opCalculos.insereOperacao(operacoes, "*", tfAlg);
						tfRes.setText("");
					}
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, ex.getMessage(), "ERRO !!!", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		
		btnIgual.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					if (inicio == 0){
						int res = Integer.parseInt(tfRes.getText());
						opCalculos.insereNumero(numeros, res,tfAlg);
						tfRes.setText(opCalculos.calcula(operacoes, numeros));
						tfAlg.setEnabled(false);
						tfRes.setEnabled(false);
						inicio = 1;
					}
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, ex.getMessage(), "ERRO !!!", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		
		btnC.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				OpCalculos opCalculos = new OpCalculos();
				opCalculos.zeraPilha(numeros, operacoes);
				tfAlg.setText("");
				tfRes.setText("");
				tfAlg.setEnabled(true);
				tfRes.setEnabled(true);
				inicio = 0;
			}
		});
		
		btnCe.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				tfRes.setText("");
			}
		});
		
		btnDel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String res = tfRes.getText();
				res = res.substring(0, res.length()-1);
				tfRes.setText(res);
			}
		});
		
	}
	
}
