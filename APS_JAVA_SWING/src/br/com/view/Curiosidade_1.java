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
public class Curiosidade_1 extends JFrame  {

	BufferedImage imagemFundo;
	private JPanel contentPane;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Curiosidade_1 frame = new Curiosidade_1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public Curiosidade_1() {
		setAlwaysOnTop(true);
    	setFont(new Font("Calibri", Font.BOLD, 20));
    	setModalExclusionType(ModalExclusionType.TOOLKIT_EXCLUDE);
    	setResizable(false);
    	setForeground(new Color(0, 0, 0));
    	setBackground(new Color(25, 25, 112));
    	setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Marcos\\workspace\\ProjAPS\\ProjAPS\\Midias\\Icone.png"));
        addComponentListener(new ComponentAdapter() {
            public void componentMoved(ComponentEvent arg0) {
                setLocationRelativeTo(null);
            }
        });
        addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent arg0) {
                //Comando para evitar que o sistema mude de tamanho
                setResizable(false);
            }
        });
		setTitle("Educa\u00E7\u00E3o ambiental");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 700, 580);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(204, 255, 102));
        setContentPane(contentPane);

		JButton btnAvancar = new JButton("AVAN\u00C7AR");
		btnAvancar.setForeground(new Color(0, 51, 0));
		btnAvancar.setFont(new Font("Showcard Gothic", Font.BOLD, 24));
		btnAvancar.setBackground(new Color(204, 255, 153));
		btnAvancar.setBounds(357, 490, 200, 40);
		btnAvancar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Curiosidade_2 curiosidade_2 = new Curiosidade_2();
				curiosidade_2.setVisible(true);
				dispose();
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnAvancar);

		JButton btnVoltar = new JButton("VOLTAR");
		btnVoltar.setForeground(new Color(0, 51, 0));
		btnVoltar.setBackground(new Color(204, 255, 153));
		btnVoltar.setFont(new Font("Showcard Gothic", Font.BOLD, 24));
		
		btnVoltar.setBounds(135, 490, 200, 40);
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Menu menu = new Menu();
				menu.setVisible(true);
				dispose();
			}
		});
		contentPane.add(btnVoltar);
		
		JLabel lblEsquadrao = new JLabel("");
		lblEsquadrao.setBackground(Color.WHITE);
		lblEsquadrao.setIcon(new ImageIcon("C:\\Users\\Marcos\\workspace\\ProjAPS\\ProjAPS\\Midias\\Animais.png"));
		lblEsquadrao.setBounds(50, 160, 600, 300);
		contentPane.add(lblEsquadrao);
		
		JLabel lblQuandoVocPr = new JLabel("Pl\u00E1stico mata 100 mil animais marinhos todos os anos");
		lblQuandoVocPr.setHorizontalAlignment(SwingConstants.CENTER);
		lblQuandoVocPr.setFont(new Font("Showcard Gothic", Font.BOLD, 22));
		lblQuandoVocPr.setForeground(new Color(0, 51, 0));
		lblQuandoVocPr.setBounds(0, 80, 700, 100);
		contentPane.add(lblQuandoVocPr);
		
		JLabel lblNewLabel = new JLabel("Curiosidades");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Showcard Gothic", Font.BOLD, 80));
		lblNewLabel.setForeground(new Color(0, 51, 0));
		lblNewLabel.setBackground(new Color(204, 255, 102));
		lblNewLabel.setBounds(0, 0, 700, 100);
		contentPane.add(lblNewLabel);
	}
}