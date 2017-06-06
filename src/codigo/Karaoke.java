package codigo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class Karaoke extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Karaoke frame = new Karaoke();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Karaoke() {
		setTitle("Karaoke");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Archivo");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Salir");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenu mnMantenimiento = new JMenu("Mantenimiento");
		menuBar.add(mnMantenimiento);
		
		JMenuItem mntmUsuario = new JMenuItem("Usuario");
		mnMantenimiento.add(mntmUsuario);
		
		JMenuItem mntmCliente = new JMenuItem("Cliente");
		mnMantenimiento.add(mntmCliente);
		
		JMenuItem mntmCancin = new JMenuItem("Canci\u00F3n");
		mnMantenimiento.add(mntmCancin);
		
		JMenuItem mntmGnero = new JMenuItem("G\u00E9nero");
		mnMantenimiento.add(mntmGnero);
		
		JMenuItem mntmArtista = new JMenuItem("Artista");
		mnMantenimiento.add(mntmArtista);
		
		JMenuItem mntmPedido = new JMenuItem("Pedido");
		mnMantenimiento.add(mntmPedido);
		
		JMenuItem mntmBebida = new JMenuItem("Bebida");
		mnMantenimiento.add(mntmBebida);
		
		JMenuItem mntmPiqueo = new JMenuItem("Piqueo");
		mnMantenimiento.add(mntmPiqueo);
		
		JMenu mnRegistroDePedido = new JMenu("Registro de Pedido");
		menuBar.add(mnRegistroDePedido);
		
		JMenu mnReg = new JMenu("Registro de Consumo");
		menuBar.add(mnReg);
		
		JMenu mnMduloDePago = new JMenu("M\u00F3dulo de Pago de Consumo");
		menuBar.add(mnMduloDePago);
		
		JMenu mnReportes = new JMenu("Reportes");
		menuBar.add(mnReportes);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
}
