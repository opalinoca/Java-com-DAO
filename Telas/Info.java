package Telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.SystemColor;

public class Info extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Info frame = new Info();
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
	public Info() {
		setTitle("Informa\u00E7\u00F5es");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 451, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 182, 193));
		panel.setBounds(0, 0, 443, 271);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("A CadasCliente \u00E9 uma empresa feita para cadastros  ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(19, 52, 424, 29);
		panel.add(lblNewLabel);
		
		JLabel lblDoBancoDe = new JLabel("do banco de dados da sua empresa!\r\n");
		lblDoBancoDe.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDoBancoDe.setBounds(81, 101, 251, 29);
		panel.add(lblDoBancoDe);
		
		JLabel lblNewLabel_2 = new JLabel("onde ir\u00E1 agilizar no controle");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(104, 80, 303, 22);
		panel.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Sair");
		btnNewButton.setBackground(new Color(221, 160, 221));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0); 
				
			}
		});
		btnNewButton.setBounds(242, 217, 89, 23);
		panel.add(btnNewButton);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBackground(new Color(221, 160, 221));
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Tela1 tela  = new Tela1();
				Info.this.dispose();
				tela.setVisible(true);
			}
		});
		btnVoltar.setBounds(81, 217, 89, 23);
		panel.add(btnVoltar);
	}

}
