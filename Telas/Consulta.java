package Telas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import DAO.PessoaDao;
import Model.Pessoa;

public class Consulta extends JFrame {

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
	private JTextField txtId;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Consulta frame = new Consulta();
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
	public Consulta() {
		setResizable(false);
		setTitle("Consulta");
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
		txtNome.setBounds(56, 57, 95, 23);
		panel.add(txtNome);
		
		JLabel lblNome_1 = new JLabel("Email:");
		lblNome_1.setFont(new Font("Sitka Small", Font.BOLD, 13));
		lblNome_1.setBounds(250, 63, 86, 14);
		panel.add(lblNome_1);
		
		lblNome_2 = new JLabel("RG:");
		lblNome_2.setFont(new Font("Sitka Small", Font.BOLD, 13));
		lblNome_2.setBounds(10, 91, 86, 14);
		panel.add(lblNome_2);
		
		lblNome_3 = new JLabel("CPF:");
		lblNome_3.setFont(new Font("Sitka Small", Font.BOLD, 13));
		lblNome_3.setBounds(250, 88, 86, 14);
		panel.add(lblNome_3);
		
		lblNome_4 = new JLabel("UF:");
		lblNome_4.setFont(new Font("Sitka Small", Font.BOLD, 13));
		lblNome_4.setBounds(10, 119, 86, 14);
		panel.add(lblNome_4);
		
		lblNome_5 = new JLabel("Cidade:");
		lblNome_5.setFont(new Font("Sitka Small", Font.BOLD, 13));
		lblNome_5.setBounds(250, 116, 86, 14);
		panel.add(lblNome_5);
		
		lblNome_6 = new JLabel("CEP:");
		lblNome_6.setFont(new Font("Sitka Small", Font.BOLD, 13));
		lblNome_6.setBounds(10, 147, 86, 14);
		panel.add(lblNome_6);
		
		lblNome_7 = new JLabel("Endere\u00E7o:");
		lblNome_7.setFont(new Font("Sitka Small", Font.BOLD, 13));
		lblNome_7.setBounds(250, 144, 86, 14);
		panel.add(lblNome_7);
		
		lblNome_8 = new JLabel("Fone:");
		lblNome_8.setFont(new Font("Sitka Small", Font.BOLD, 13));
		lblNome_8.setBounds(10, 178, 86, 14);
		panel.add(lblNome_8);
		
		lblNome_9 = new JLabel("Celular:");
		lblNome_9.setFont(new Font("Sitka Small", Font.BOLD, 13));
		lblNome_9.setBounds(250, 178, 86, 14);
		panel.add(lblNome_9);
		
		txtRg = new JTextField();
		txtRg.setColumns(10);
		txtRg.setBounds(56, 85, 95, 23);
		panel.add(txtRg);
		
		txtUf = new JTextField();
		txtUf.setColumns(10);
		txtUf.setBounds(56, 113, 95, 23);
		panel.add(txtUf);
		
		txtCep = new JTextField();
		txtCep.setColumns(10);
		txtCep.setBounds(56, 141, 95, 23);
		panel.add(txtCep);
		
		txtTelefone = new JTextField();
		txtTelefone.setColumns(10);
		txtTelefone.setBounds(56, 172, 95, 23);
		panel.add(txtTelefone);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(322, 53, 95, 23);
		panel.add(txtEmail);
		
		txtCpf = new JTextField();
		txtCpf.setColumns(10);
		txtCpf.setBounds(322, 81, 95, 23);
		panel.add(txtCpf);
		
		txtCidade = new JTextField();
		txtCidade.setColumns(10);
		txtCidade.setBounds(322, 113, 95, 22);
		panel.add(txtCidade);
		
		txtEndereco = new JTextField();
		txtEndereco.setColumns(10);
		txtEndereco.setBounds(322, 141, 95, 23);
		panel.add(txtEndereco);
		
		txtCelular = new JTextField();
		txtCelular.setColumns(10);
		txtCelular.setBounds(322, 172, 95, 23);
		panel.add(txtCelular);
		
		JButton btnNewButton = new JButton("Consultar");
		btnNewButton.setBackground(new Color(255, 182, 193));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pessoa pessoa = new Pessoa();
				pessoa.setIdPessoa(Integer.parseInt(txtId.getText().toString()));
				
				try {
					List <Pessoa> pessoas = new PessoaDao().consultar();
					
					for(Pessoa p: pessoas) {
						if(p.getIdPessoa()==Integer.parseInt(txtId.getText().toString())) {
							txtNome.setText(p.getNome());
							txtEndereco.setText(p.getEndereco());
							txtCidade.setText(p.getCidade());
							txtUf.setText(p.getEstado());
							txtCep.setText(p.getCep());
							txtRg.setText(p.getRg());
							txtCpf.setText(p.getCpf());
							txtTelefone.setText(p.getTelefone());
							txtEmail.setText(p.getEmail());
							txtCelular.setText(p.getCelular());
						} 
					}	
				} catch (SQLException e1){
					e1.printStackTrace();
					
				}
			}
		});
		
		btnNewButton.setBounds(10, 10, 105, 23);
		panel.add(btnNewButton);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setBackground(new Color(255, 182, 193));
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				txtNome.requestFocus();
				
				Pessoa pessoa = new Pessoa();
				pessoa.setIdPessoa(Integer.parseInt(txtId.getText().toString()));
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
				
				
				PessoaDao pessoaDao = new PessoaDao();
				
				try {
					pessoaDao.alterar(pessoa);
				}catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnAlterar.setBounds(130, 10, 89, 23);
		panel.add(btnAlterar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBackground(new Color(255, 182, 193));
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Pessoa pessoa = new Pessoa();
				pessoa.setIdPessoa(Integer.parseInt(txtId.getText().toString()));
				
				PessoaDao pessoaDao = new PessoaDao();
				
				try {
					pessoaDao.excluir(pessoa);
				}catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnExcluir.setBounds(229, 10, 89, 23);
		panel.add(btnExcluir);
		
		txtId = new JTextField();
		txtId.setBounds(168, 226, 95, 24);
		panel.add(txtId);
		txtId.setColumns(10);
		
		JLabel lblNome_4_1 = new JLabel("Id:");
		lblNome_4_1.setFont(new Font("Sitka Small", Font.BOLD, 13));
		lblNome_4_1.setBounds(140, 230, 33, 21);
		panel.add(lblNome_4_1);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBackground(new Color(255, 182, 193));
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tela1 tela = new Tela1();
				Consulta.this.dispose();
				tela.setVisible(true);
			}
		});
		btnVoltar.setBounds(328, 10, 89, 23);
		panel.add(btnVoltar);
	}
}
