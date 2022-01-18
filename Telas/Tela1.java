package Telas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Tela1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela1 frame = new Tela1();
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
	public Tela1() {
		setResizable(false);
		setTitle("CadasCliente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 246, 377);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 182, 193));
		panel.setBounds(0, 0, 253, 348);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Informa\u00E7\u00F5es");
		btnNewButton.setBackground(new Color(221, 160, 221));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Info infor = new Info();
				Tela1.this.dispose();
				infor.setVisible(true);
			}
		});
		btnNewButton.setBounds(32, 256, 169, 23);
		panel.add(btnNewButton);
		
		JButton btnDs = new JButton("Sobre");
		btnDs.setBackground(new Color(221, 160, 221));
		btnDs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Sobre sob = new Sobre();
				Tela1.this.dispose();
				sob.setVisible(true);
			}
		});
		btnDs.setBounds(32, 290, 169, 23);
		panel.add(btnDs);
		
		JButton btnIniciar = new JButton("Cadastrar pessoa");
		btnIniciar.setBackground(new Color(221, 160, 221));
		btnIniciar.setForeground(new Color(0, 0, 0));
		btnIniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cadastro tela = new Cadastro();
				Tela1.this.dispose();
				tela.setVisible(true);
			}
		});
		btnIniciar.setBounds(32, 188, 169, 23);
		panel.add(btnIniciar);
		
		JLabel lblNewLabel = new JLabel("CadasCliente");
		lblNewLabel.setBackground(new Color(0, 0, 0));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Malgun Gothic", Font.BOLD, 26));
		lblNewLabel.setBounds(45, 37, 172, 23);
		panel.add(lblNewLabel);
		
		JButton btnConsultar = new JButton("Consultar pessoa");
		btnConsultar.setBackground(new Color(221, 160, 221));
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Consulta consulta = new Consulta();
				Tela1.this.dispose();
				consulta.setVisible(true);
			}
		});
		btnConsultar.setBounds(32, 222, 169, 23);
		panel.add(btnConsultar);
		
		JLabel lblNewLabel_1 = new JLabel("o seu cadastro num clique!");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_1.setBounds(66, 71, 117, 14);
		panel.add(lblNewLabel_1);
	}
}
