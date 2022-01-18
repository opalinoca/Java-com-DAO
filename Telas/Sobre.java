package Telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

public class Sobre extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sobre frame = new Sobre();
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
	public Sobre() {
		setTitle("Sobre");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 468, 338);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 182, 193));
		panel.setBounds(0, 0, 462, 309);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("A empresa CadasCliente \u00E9 uma empresa que trabalha com \r\n");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(38, 71, 424, 24);
		panel.add(lblNewLabel);
		
		JLabel lblDePequenoE = new JLabel("cadastros e consultas de pessoas em nosso sistema, desta forma\r\n\r\n");
		lblDePequenoE.setForeground(new Color(0, 0, 0));
		lblDePequenoE.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDePequenoE.setBounds(10, 95, 452, 24);
		panel.add(lblDePequenoE);
		
		JLabel lblComSistemasDe = new JLabel(" controlando sistema de dados entre outros servi\u00E7os.");
		lblComSistemasDe.setForeground(new Color(0, 0, 0));
		lblComSistemasDe.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblComSistemasDe.setBounds(38, 120, 424, 24);
		panel.add(lblComSistemasDe);
		
		JButton btnNewButton = new JButton("Voltar");
		btnNewButton.setBackground(new Color(221, 160, 221));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Tela1 tela = new Tela1();
				Sobre.this.dispose();
				tela.setVisible(true);
			}
		});
		btnNewButton.setBounds(53, 258, 89, 23);
		panel.add(btnNewButton);
		
		JButton btnSair = new JButton("Sair");
		btnSair.setBackground(new Color(221, 160, 221));
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
		});
		btnSair.setBounds(323, 258, 89, 23);
		panel.add(btnSair);
	}
}
