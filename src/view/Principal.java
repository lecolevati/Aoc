package view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class Principal {

	private JFrame frame;
	private final SimInst simInst = new SimInst();
	private final Sair sair = new Sair();
	private final Sobre sobre = new Sobre();
	private final Des des = new Des();
	private final LeiDeAmdahl leiDeAmdahl = new LeiDeAmdahl();
	private final Bases bases = new Bases();
	private final Op op = new Op();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal window = new Principal();
					window.frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); 
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Principal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnMisc = new JMenu("Misc");
		menuBar.add(mnMisc);
		
		JMenuItem mntmSobre = new JMenuItem("Sobre");
		mntmSobre.setAction(sobre);
		mnMisc.add(mntmSobre);
		
		JMenuItem mntmSair = new JMenuItem("Sair");
		mntmSair.setAction(sair);
		mnMisc.add(mntmSair);
		
		JMenu mnSemestre = new JMenu("1\u00BA Bimestre");
		menuBar.add(mnSemestre);
		
		JMenuItem mntmSimuladorDeInstrues = new JMenuItem("Simulador de Instru\u00E7\u00F5es");
		mntmSimuladorDeInstrues.setAction(simInst);
		mnSemestre.add(mntmSimuladorDeInstrues);
		
		JMenuItem mntmDesempenho = new JMenuItem("Desempenho");
		mntmDesempenho.setAction(des);
		mnSemestre.add(mntmDesempenho);
		
		JMenuItem mntmLeiDeAmdahl = new JMenuItem("Lei de Amdahl");
		mntmLeiDeAmdahl.setAction(leiDeAmdahl);
		mnSemestre.add(mntmLeiDeAmdahl);
		
		JMenu mnSemestre_1 = new JMenu("2\u00BA Bimestre");
		menuBar.add(mnSemestre_1);
		
		JMenuItem mntmConversorDeBases = new JMenuItem("Conversor de Bases");
		mntmConversorDeBases.setAction(bases);
		mnSemestre_1.add(mntmConversorDeBases);
		
		JMenuItem mntmOperaesComBinrios = new JMenuItem("Opera\u00E7\u00F5es com Bin\u00E1rios");
		mntmOperaesComBinrios.setAction(op);
		mnSemestre_1.add(mntmOperaesComBinrios);
	}

	private class SimInst extends AbstractAction {
		private static final long serialVersionUID = 1L;
		public SimInst() {
			putValue(NAME, "Simulador de Instruções");
			putValue(SHORT_DESCRIPTION, "Simulador de Instruções");
		}
		public void actionPerformed(ActionEvent e) {
			SimuladorInstr simuladorInstr = new SimuladorInstr();
			simuladorInstr.setVisible(true);
		}
	}
	private class Sair extends AbstractAction {
		private static final long serialVersionUID = 1L;
		public Sair() {
			putValue(NAME, "Sair");
			putValue(SHORT_DESCRIPTION, "Finaliza a aplicação");
		}
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	}
	private class Sobre extends AbstractAction {
		private static final long serialVersionUID = 1L;
		public Sobre() {
			putValue(NAME, "Sobre");
			putValue(SHORT_DESCRIPTION, "Sobre a aplicação");
		}
		public void actionPerformed(ActionEvent e) {
			String frase1 = "Aplicativo desenvolvido por ";
			String frase2 = "Prof. M.Sc. Leandro Colevati dos Santos";
			String frase3 = "Para o estudo complementar da disciplina";
			String frase4 = "Arquitetura e Organização de Computadores";
			String frase5 = "Faculdade de Tecnologia da Zona Leste";
			String frase6 = "Todos os direitos reservados";
			String versao = "Versão Alpha 0.01";
			String total = versao + "\n" + "\n" + frase1 + "\n" + frase2 + "\n" + frase3 + "\n" + 
				frase4 + "\n" + "\n" + frase5 + "\n" + "\n" + frase6 ;
			JOptionPane.showMessageDialog(null, total ,"Sobre ... ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	private class Des extends AbstractAction {
		private static final long serialVersionUID = 1L;
		public Des() {
			putValue(NAME, "Desempenho");
			putValue(SHORT_DESCRIPTION, "CPI - MIPS - T");
		}
		public void actionPerformed(ActionEvent e) {
			CpiMips cpiMips = new CpiMips();
			cpiMips.setVisible(true);
		}
	}
	private class LeiDeAmdahl extends AbstractAction {
		private static final long serialVersionUID = 1L;
		public LeiDeAmdahl() {
			putValue(NAME, "Lei De Amdahl");
			putValue(SHORT_DESCRIPTION, "Cálculo de SPEEDUP");
		}
		public void actionPerformed(ActionEvent e) {
			Amdahl amdahl = new Amdahl();
			amdahl.setVisible(true);
		}
	}
	private class Bases extends AbstractAction {
		private static final long serialVersionUID = 1L;
		public Bases() {
			putValue(NAME, "Conversor de Bases");
			putValue(SHORT_DESCRIPTION, "Conversor de Bases");
		}
		public void actionPerformed(ActionEvent e) {
			Conversor conversor = new Conversor();
			conversor.setVisible(true);
		}
	}
	private class Op extends AbstractAction {
		private static final long serialVersionUID = 1L;
		public Op() {
			putValue(NAME, "Operações com Binários");
			putValue(SHORT_DESCRIPTION, "Operações com Binários");
		}
		public void actionPerformed(ActionEvent e) {
			Calculos calculos = new Calculos();
			calculos.setVisible(true);
		}
	}
}
