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
public class Curiosidade_2 extends JFrame  {

	BufferedImage imagemFundo;
	private JPanel contentPane;
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Curiosidade_2 frame = new Curiosidade_2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public Curiosidade_2() {
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
				Curiosidade_3 curiosidade_3 = new Curiosidade_3();
				curiosidade_3.setVisible(true);
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
				Curiosidade_1 curiosidade_1 = new Curiosidade_1();
				curiosidade_1.setVisible(true);
				dispose();
			}
		});
		contentPane.add(btnVoltar);
		
		JLabel lblEsquadrao = new JLabel("");
		lblEsquadrao.setBackground(new Color(204, 255, 102));
		lblEsquadrao.setIcon(new ImageIcon("C:\\Users\\Marcos\\workspace\\ProjAPS\\ProjAPS\\Midias\\Canudos.png"));
		lblEsquadrao.setBounds(50, 160, 600, 300);
		contentPane.add(lblEsquadrao);
		
		JLabel lblQuandoVocPr = new JLabel("O canudo \u00E9  feitos normalmente de polipropileno ou poliestireno");
		lblQuandoVocPr.setHorizontalAlignment(SwingConstants.CENTER);
		lblQuandoVocPr.setFont(new Font("Showcard Gothic", Font.BOLD, 17));
		lblQuandoVocPr.setForeground(new Color(0, 51, 0));
		lblQuandoVocPr.setBounds(0, 100, 700, 50);
		contentPane.add(lblQuandoVocPr);
		
		JLabel lblNewLabel = new JLabel("Curiosidades");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Showcard Gothic", Font.BOLD, 80));
		lblNewLabel.setForeground(new Color(0, 51, 0));
		lblNewLabel.setBackground(new Color(204, 255, 102));
		lblNewLabel.setBounds(0, 0, 700, 100);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel(" materiais que n\u00E3o s\u00E3o biodegrad\u00E1veis, eles demoram at\u00E9 200 anos, ");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(0, 51, 0));
		lblNewLabel_1.setFont(new Font("Showcard Gothic", Font.BOLD, 17));
		lblNewLabel_1.setBounds(0, 140, 700, 50);
		contentPane.add(lblNewLabel_1);
	}
}