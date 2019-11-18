package br.com.view;

import java.awt.Color;
import java.awt.Dialog.ModalExclusionType;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class Menu extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Menu() {
		setAlwaysOnTop(true);
		setFont(new Font("Calibri", Font.BOLD, 20));
		setModalExclusionType(ModalExclusionType.TOOLKIT_EXCLUDE);
		setResizable(false);
		setForeground(new Color(0, 0, 0));
		setBackground(new Color(25, 25, 112));
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage("C:\\Users\\Marcos\\workspace\\ProjAPS\\ProjAPS\\Midias\\Icone.png"));
		addComponentListener(new ComponentAdapter() {
			public void componentMoved(ComponentEvent arg0) {
				setLocationRelativeTo(null);
			}
		});
		addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent arg0) {
				// Comando para evitar que o sistema mude de tamanho
				setResizable(false);
			}
		});
		setTitle("Educa\u00E7\u00E3o ambiental");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 700, 580);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 102));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblQuesto = new JLabel("Menu");
		lblQuesto.setBackground(new Color(0, 51, 0));
		lblQuesto.setBounds(150, 10, 400, 125);
		lblQuesto.setForeground(new Color(0, 51, 0));
		contentPane.add(lblQuesto);
		lblQuesto.setHorizontalAlignment(SwingConstants.CENTER);
		lblQuesto.setFont(new Font("Showcard Gothic", Font.BOLD, 80));

		JButton btnSair = new JButton("VOLTAR");
		btnSair.setForeground(new Color(0, 51, 0));
		btnSair.setBackground(new Color(204, 255, 153));
		btnSair.setFont(new Font("Showcard Gothic", Font.BOLD, 40));

		btnSair.setBounds(150, 400, 400, 75);
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Logo logo = new Logo();
				logo.setVisible(true);
				dispose();
			}
		});
		contentPane.add(btnSair);

		JButton btnCuriosidades = new JButton("CURIOSIDADES");
		btnCuriosidades.setForeground(new Color(0, 51, 0));
		btnCuriosidades.setBackground(new Color(204, 255, 153));
		btnCuriosidades.setFont(new Font("Showcard Gothic", Font.BOLD, 40));

		btnCuriosidades.setBounds(150, 275, 400, 75);
		btnCuriosidades.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Curiosidade_1 curiosidade_1 = new Curiosidade_1();
				curiosidade_1.setVisible(true);
				dispose();
			}
		});
		contentPane.add(btnCuriosidades);

		JButton btnIniciar = new JButton("INICIAR");
		btnIniciar.setForeground(new Color(0, 51, 0));
		btnIniciar.setBackground(new Color(204, 255, 153));
		btnIniciar.setFont(new Font("Showcard Gothic", Font.BOLD, 40));

		btnIniciar.setBounds(150, 150, 400, 75);
		btnIniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EsquadraoReciclagem esquadraoReciclagem = new EsquadraoReciclagem();
				esquadraoReciclagem.setVisible(true);
				dispose();
			}
		});
		contentPane.add(btnIniciar);
	}

}
