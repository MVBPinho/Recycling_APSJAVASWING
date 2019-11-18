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

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class Praticando_Metal extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Praticando_Metal frame = new Praticando_Metal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Praticando_Metal() {
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

		JPanel Painel_d = new JPanel();
		Painel_d.setBackground(new Color(204, 255, 102));
		Painel_d.setBounds(530, 300, 150, 150);
		contentPane.add(Painel_d);
		Painel_d.setBorder(null);
		Painel_d.setLayout(null);

		JLabel labelImagemD = new JLabel("");
		labelImagemD.setBackground(new Color(204, 255, 102));
		labelImagemD.setHorizontalAlignment(SwingConstants.CENTER);
		labelImagemD.setIcon(new ImageIcon("C:\\Users\\Marcos\\workspace\\ProjAPS\\ProjAPS\\Midias\\LixoVidro.png"));
		labelImagemD.setBounds(0, 0, 150, 150);
		Painel_d.add(labelImagemD);

		JRadioButton Radio4 = new JRadioButton("D");
		Radio4.setFont(new Font("Calibri", Font.BOLD, 20));
		Radio4.setBounds(530, 250, 150, 30);
		Radio4.setBackground(new Color(204, 255, 102));
		contentPane.add(Radio4);
		Radio4.setHorizontalAlignment(SwingConstants.CENTER);
		buttonGroup.add(Radio4);

		JPanel Painel_c = new JPanel();
		Painel_c.setBackground(new Color(204, 255, 102));
		Painel_c.setBounds(360, 300, 150, 150);
		contentPane.add(Painel_c);
		Painel_c.setBorder(null);
		Painel_c.setLayout(null);

		JLabel labelImagemC = new JLabel("");
		labelImagemC.setBackground(new Color(204, 255, 102));
		labelImagemC.setHorizontalAlignment(SwingConstants.CENTER);
		labelImagemC.setIcon(new ImageIcon("C:\\Users\\Marcos\\workspace\\ProjAPS\\ProjAPS\\Midias\\LixoPrastico.png"));
		labelImagemC.setBounds(0, 0, 150, 150);
		Painel_c.add(labelImagemC);

		JRadioButton Radio3 = new JRadioButton("C");
		Radio3.setFont(new Font("Calibri", Font.BOLD, 20));
		Radio3.setBounds(360, 250, 150, 30);
		Radio3.setBackground(new Color(204, 255, 102));
		contentPane.add(Radio3);
		Radio3.setHorizontalAlignment(SwingConstants.CENTER);
		buttonGroup.add(Radio3);

		JPanel Painel_b = new JPanel();
		Painel_b.setBackground(new Color(204, 255, 102));
		Painel_b.setBounds(190, 300, 150, 150);
		contentPane.add(Painel_b);
		Painel_b.setBorder(null);
		Painel_b.setLayout(null);

		JLabel labelImagemB = new JLabel("");
		labelImagemB.setBackground(new Color(204, 255, 102));
		labelImagemB.setHorizontalAlignment(SwingConstants.CENTER);
		labelImagemB.setIcon(new ImageIcon("C:\\Users\\Marcos\\workspace\\ProjAPS\\ProjAPS\\Midias\\LixoPapel.png"));
		labelImagemB.setBounds(0, 0, 150, 150);
		Painel_b.add(labelImagemB);

		JRadioButton Radio2 = new JRadioButton("B");
		Radio2.setFont(new Font("Calibri", Font.BOLD, 20));
		Radio2.setBounds(190, 250, 150, 30);
		Radio2.setBackground(new Color(204, 255, 102));
		contentPane.add(Radio2);
		Radio2.setHorizontalAlignment(SwingConstants.CENTER);
		buttonGroup.add(Radio2);

		JPanel Painel_a = new JPanel();
		Painel_a.setBackground(new Color(204, 255, 102));
		Painel_a.setBounds(15, 300, 150, 150);
		contentPane.add(Painel_a);
		Painel_a.setLayout(null);

		JLabel labelImagemA = new JLabel("");
		labelImagemA.setBackground(new Color(204, 255, 102));
		labelImagemA.setHorizontalAlignment(SwingConstants.CENTER);
		labelImagemA.setIcon(new ImageIcon("C:\\Users\\Marcos\\workspace\\ProjAPS\\ProjAPS\\Midias\\LixoMetal.png"));
		labelImagemA.setBounds(0, 0, 150, 150);
		Painel_a.add(labelImagemA);

		JRadioButton Radio1 = new JRadioButton("A");
		Radio1.setFont(new Font("Calibri", Font.BOLD, 20));
		Radio1.setForeground(new Color(0, 0, 0));
		Radio1.setBounds(15, 250, 150, 30);
		Radio1.setBackground(new Color(204, 255, 102));
		contentPane.add(Radio1);
		Radio1.setHorizontalAlignment(SwingConstants.CENTER);
		buttonGroup.add(Radio1);

		JLabel lblPraticando = new JLabel("Praticando\r\n");
		lblPraticando.setBounds(50, 30, 600, 100);
		lblPraticando.setForeground(new Color(0, 51, 0));
		contentPane.add(lblPraticando);
		lblPraticando.setHorizontalAlignment(SwingConstants.CENTER);
		lblPraticando.setFont(new Font("Showcard Gothic", Font.BOLD, 80));

		JButton btnAvancar = new JButton("AVAN\u00C7AR\r\n");
		btnAvancar.setForeground(new Color(0, 51, 0));
		btnAvancar.setFont(new Font("Showcard Gothic", Font.BOLD, 24));
		btnAvancar.setBackground(new Color(204, 255, 102));
		btnAvancar.setBounds(357, 490, 200, 40);
		btnAvancar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Radio1.isSelected()) {
					Imagem_Plastico imagem_Plastico = new Imagem_Plastico();
					imagem_Plastico.setVisible(true);
					dispose();
				}
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnAvancar);

		JButton btnVoltar = new JButton("VOLTAR");
		btnVoltar.setForeground(new Color(0, 51, 0));
		btnVoltar.setBackground(new Color(204, 255, 102));
		btnVoltar.setFont(new Font("Showcard Gothic", Font.BOLD, 24));

		btnVoltar.setBounds(135, 490, 200, 40);
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Imagem_Metal imagem_Metal = new Imagem_Metal();
				imagem_Metal.setVisible(true);
				dispose();
			}
		});
		contentPane.add(btnVoltar);

		JLabel lblQualDosLixos = new JLabel("Temos que jogar uma latinha em qual lixo?");
		lblQualDosLixos.setBackground(new Color(204, 255, 102));
		lblQualDosLixos.setForeground(new Color(0, 51, 0));
		lblQualDosLixos.setBounds(0, 130, 700, 100);
		lblQualDosLixos.setHorizontalAlignment(SwingConstants.CENTER);
		lblQualDosLixos.setFont(new Font("Showcard Gothic", Font.BOLD, 26));
		contentPane.add(lblQualDosLixos);

		btnAvancar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Radio1.isSelected() || Radio2.isSelected() || Radio3.isSelected() || Radio4.isSelected()) {
					if (Radio1.isSelected()) {
						JOptionPane.showMessageDialog(btnAvancar, "Resposta certa", "Educa\u00E7\u00E3o ambiental",
								JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(btnAvancar, "Resposta errada", "Educa\u00E7\u00E3o ambiental",
								JOptionPane.INFORMATION_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(btnAvancar, "Selecione uma das opções acima",
							"Educa\u00E7\u00E3o ambiental", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		Radio1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Radio4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

	}
}