package Telas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import java.util.List;

import DAO.PessoaDao;
import Model.Pessoa;

public class Cadastro extends JFrame {
	private JPanel contentPane;
	private JTextField txtNome;
	private JLabel lblNome_2;
	private JLabel lblNome_3;
	private JLabel lblNome_4;
	private JLabel lblNome_5;
	private JLabel lblNome_6;
	private JLabel lblNome_7;
	private JLabel lblNome_8;
	private JLabel lblNome_9;
	private JTextField txtRg;
	private JTextField txtUf;
	private JTextField txtCep;
	private JTextField txtTelefone;
	private JTextField txtEmail;
	private JTextField txtCpf;
	private JTextField txtCidade;
	private JTextField txtEndereco;
	private JTextField txtCelular;
	private JButton btnExcluir_1;
	private JButton btnExcluir;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastro frame = new Cadastro();
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
	public Cadastro() {
		setResizable(false);
		setTitle("Cadastro");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 445, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(221, 160, 221));
		panel.setBounds(0, 0, 429, 261);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Sitka Small", Font.BOLD, 13));
		lblNome.setBounds(10, 63, 86, 14);
		panel.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setColumns(10);
		txtNome.setBounds(81, 57, 95, 23);
		panel.add(txtNome);
		
		JLabel lblNome_1 = new JLabel("Email:");
		lblNome_1.setFont(new Font("Sitka Small", Font.BOLD, 13));
		lblNome_1.setBounds(246, 63, 86, 14);
		panel.add(lblNome_1);
		
		lblNome_2 = new JLabel("RG:");
		lblNome_2.setFont(new Font("Sitka Small", Font.BOLD, 13));
		lblNome_2.setBounds(10, 102, 86, 14);
		panel.add(lblNome_2);
		
		lblNome_3 = new JLabel("CPF:");
		lblNome_3.setFont(new Font("Sitka Small", Font.BOLD, 13));
		lblNome_3.setBounds(246, 102, 86, 14);
		panel.add(lblNome_3);
		
		lblNome_4 = new JLabel("UF:");
		lblNome_4.setFont(new Font("Sitka Small", Font.BOLD, 13));
		lblNome_4.setBounds(10, 147, 86, 14);
		panel.add(lblNome_4);
		
		lblNome_5 = new JLabel("Cidade:");
		lblNome_5.setFont(new Font("Sitka Small", Font.BOLD, 13));
		lblNome_5.setBounds(246, 147, 86, 14);
		panel.add(lblNome_5);
		
		lblNome_6 = new JLabel("CEP:");
		lblNome_6.setFont(new Font("Sitka Small", Font.BOLD, 13));
		lblNome_6.setBounds(10, 191, 86, 14);
		panel.add(lblNome_6);
		
		lblNome_7 = new JLabel("Endere\u00E7o:");
		lblNome_7.setFont(new Font("Sitka Small", Font.BOLD, 13));
		lblNome_7.setBounds(246, 191, 86, 14);
		panel.add(lblNome_7);
		
		lblNome_8 = new JLabel("Fone:");
		lblNome_8.setFont(new Font("Sitka Small", Font.BOLD, 13));
		lblNome_8.setBounds(10, 233, 86, 14);
		panel.add(lblNome_8);
		
		lblNome_9 = new JLabel("Celular:");
		lblNome_9.setFont(new Font("Sitka Small", Font.BOLD, 13));
		lblNome_9.setBounds(246, 233, 86, 14);
		panel.add(lblNome_9);
		
		txtRg = new JTextField();
		txtRg.setColumns(10);
		txtRg.setBounds(81, 96, 95, 23);
		panel.add(txtRg);
		
		txtUf = new JTextField();
		txtUf.setColumns(10);
		txtUf.setBounds(81, 141, 95, 23);
		panel.add(txtUf);
		
		txtCep = new JTextField();
		txtCep.setColumns(10);
		txtCep.setBounds(81, 185, 95, 23);
		panel.add(txtCep);
		
		txtTelefone = new JTextField();
		txtTelefone.setColumns(10);
		txtTelefone.setBounds(81, 227, 95, 23);
		panel.add(txtTelefone);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(322, 57, 95, 23);
		panel.add(txtEmail);
		
		txtCpf = new JTextField();
		txtCpf.setColumns(10);
		txtCpf.setBounds(322, 96, 95, 23);
		panel.add(txtCpf);
		
		txtCidade = new JTextField();
		txtCidade.setColumns(10);
		txtCidade.setBounds(322, 141, 95, 22);
		panel.add(txtCidade);
		
		txtEndereco = new JTextField();
		txtEndereco.setColumns(10);
		txtEndereco.setBounds(322, 185, 95, 23);
		panel.add(txtEndereco);
		
		txtCelular = new JTextField();
		txtCelular.setColumns(10);
		txtCelular.setBounds(322, 227, 95, 23);
		panel.add(txtCelular);
		
		JButton btnConsultar = new JButton("Cadastrar");
		btnConsultar.setBackground(new Color(255, 182, 193));
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Pessoa pessoa = new Pessoa();
				pessoa.setNome(txtNome.getText().toString());
				pessoa.setEndereco(txtEndereco.getText().toString());
				pessoa.setCidade(txtCidade.getText().toString());
				pessoa.setEstado(txtUf.getText().toString());
				pessoa.setCep(txtCep.getText().toString());
				pessoa.setRg(txtRg.getText().toString());
				pessoa.setCpf(txtCpf.getText().toString());
				pessoa.setTelefone(txtTelefone.getText().toString());
				pessoa.setEmail(txtEmail.getText().toString());
				pessoa.setCelular(txtCelular.getText().toString());
				
			
				PessoaDao pessoaDao =  new PessoaDao();
				try {
					pessoaDao.adicionar(pessoa);
				}catch (SQLException e1) {
					e1.printStackTrace();
				}
			}	
		});
		btnConsultar.setBounds(28, 11, 107, 23);
		panel.add(btnConsultar);
		
		btnExcluir_1 = new JButton("Voltar");
		btnExcluir_1.setBackground(new Color(255, 182, 193));
		btnExcluir_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tela1 tela = new Tela1();
				Cadastro.this.dispose();
				tela.setVisible(true);
				
			}
		});
		btnExcluir_1.setBounds(171, 11, 89, 23);
		panel.add(btnExcluir_1);
		
		btnExcluir = new JButton("Sair");
		btnExcluir.setBackground(new Color(255, 182, 193));
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExcluir.setBounds(311, 11, 89, 23);
		panel.add(btnExcluir);
	}
}

