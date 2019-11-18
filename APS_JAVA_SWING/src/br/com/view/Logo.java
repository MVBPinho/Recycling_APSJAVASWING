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
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class Logo extends JFrame {

	BufferedImage imagemFundo;
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Logo frame = new Logo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Logo() {
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

		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon("C:\\Users\\Marcos\\workspace\\ProjAPS\\ProjAPS\\Midias\\Logo1.png"));
		lblLogo.setBounds(0, 0, 700, 100);
		lblLogo.setForeground(new Color(0, 51, 0));
		contentPane.add(lblLogo);
		lblLogo.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogo.setFont(new Font("Showcard Gothic", Font.BOLD, 40));

		JButton btnMenu = new JButton("MENU\r\n");
		btnMenu.setForeground(new Color(0, 51, 0));
		btnMenu.setFont(new Font("Showcard Gothic", Font.BOLD, 24));
		btnMenu.setBackground(new Color(204, 255, 153));
		btnMenu.setBounds(357, 490, 200, 40);
		btnMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu menu = new Menu();
				menu.setVisible(true);
				dispose();
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnMenu);

		JButton btnSair = new JButton("SAIR\r\n");
		btnSair.setForeground(new Color(0, 51, 0));
		btnSair.setBackground(new Color(204, 255, 153));
		btnSair.setFont(new Font("Showcard Gothic", Font.BOLD, 24));

		btnSair.setBounds(135, 490, 200, 40);
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		contentPane.add(btnSair);

		JLabel label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBackground(new Color(204, 255, 102));
		label.setIcon(new ImageIcon("C:\\Users\\Marcos\\workspace\\ProjAPS\\ProjAPS\\Midias\\Logo.png"));
		label.setBounds(50, 100, 600, 350);
		contentPane.add(label);

		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu menu = new Menu();
				menu.setVisible(true);
				dispose();
			}
		});
	}
}