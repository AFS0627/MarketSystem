package visao;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;

import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import Controle.ControleDeLogin;
import Controle.ControllerGerente;
import Modelo.Funcionario;

public class Cadastro_Gerente extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public static JTable table;
	private static Cadastro_Gerente frame;
	public int id;
	public static JButton BtnGerente;
//	public 		Funcionario f;
	public ControllerGerente tipo = new ControllerGerente();
	public String tipoFunci;

	public Cadastro_Gerente(Funcionario f) {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 768);
		setMinimumSize(new java.awt.Dimension(850, 600));
		setLocationRelativeTo(null);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		contentPane.add(panel_1, BorderLayout.WEST);

		RoundedButton imgLogo = new RoundedButton("", 1, 1);

		imgLogo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControllerGerente abrir = new ControllerGerente();
				abrir.AbrirTelaInicial(f);
				dispose();
			}
		});

		imgLogo.setBackground(Color.LIGHT_GRAY);
		imgLogo.setForeground(Color.LIGHT_GRAY);

		ImageIcon originalIconLogo = new ImageIcon(Login.class.getResource("/Imagens/Logo2.png"));

		Image imageLogo = originalIconLogo.getImage();
		Image novaLogo = imageLogo.getScaledInstance(100, 100, Image.SCALE_SMOOTH);

		imgLogo.setIcon(new ImageIcon(novaLogo));
		imgLogo.setVerticalAlignment(SwingConstants.BOTTOM);

		/*
		 * ESTOQUE
		 */

		RoundedButton rndbtnHomeProdutos = new RoundedButton("Estoque", 30, 30);

		rndbtnHomeProdutos.setHorizontalAlignment(SwingConstants.LEFT);
		rndbtnHomeProdutos.setForeground(Color.WHITE);
		rndbtnHomeProdutos.setFont(new Font("Arial", Font.PLAIN, 11));
		rndbtnHomeProdutos.setBackground(Color.RED);

		rndbtnHomeProdutos.addMouseListener(new MouseAdapter() {

			public void mouseEntered(MouseEvent e) {
				rndbtnHomeProdutos.setBackground(Color.GRAY);
			}

			public void mouseExited(MouseEvent e) {
				rndbtnHomeProdutos.setBackground(Color.RED);
			}
		});

		rndbtnHomeProdutos.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				ControllerGerente abrir = new ControllerGerente();
				abrir.AbrirTelaEstoque(f);
				dispose();
			}
		});

		ImageIcon iconProdutos = new ImageIcon(getClass().getResource("/Imagens/box-open-solid.png"));

		Image imgProdutos = iconProdutos.getImage();

		Image novaImgProdutos = imgProdutos.getScaledInstance(20, 20, Image.SCALE_SMOOTH);

		rndbtnHomeProdutos.setIcon(new ImageIcon(novaImgProdutos));

		RoundedButton rndbtnHomeClientes = new RoundedButton("Clientes", 30, 30);

		rndbtnHomeClientes.setForeground(Color.WHITE);
		rndbtnHomeClientes.setHorizontalAlignment(SwingConstants.LEFT);
		rndbtnHomeClientes.setFont(new Font("Arial", Font.PLAIN, 11));
		rndbtnHomeClientes.setBackground(Color.RED);

		rndbtnHomeClientes.addMouseListener(new MouseAdapter() {

			public void mouseEntered(MouseEvent e) {
				rndbtnHomeClientes.setBackground(Color.GRAY);
			}

			public void mouseExited(MouseEvent e) {
				rndbtnHomeClientes.setBackground(Color.RED);
			}
		});

		rndbtnHomeClientes.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				ControllerGerente abrir = new ControllerGerente();
				abrir.AbrirTelaCliente(f);
				dispose();
			}
		});

		ImageIcon iconClientes = new ImageIcon(getClass().getResource("/Imagens/address-card-solid.png"));

		Image imgClientes = iconClientes.getImage();

		Image novaImgClientes = imgClientes.getScaledInstance(20, 20, Image.SCALE_SMOOTH);

		rndbtnHomeClientes.setIcon(new ImageIcon(novaImgClientes));

		RoundedButton rndbtnHomeCaixa = new RoundedButton("Caixa", 30, 30);

		rndbtnHomeCaixa.setHorizontalAlignment(SwingConstants.LEFT);
		rndbtnHomeCaixa.setForeground(Color.WHITE);
		rndbtnHomeCaixa.setFont(new Font("Arial", Font.PLAIN, 11));
		rndbtnHomeCaixa.setBackground(Color.RED);

		rndbtnHomeCaixa.addMouseListener(new MouseAdapter() {

			public void mouseEntered(MouseEvent e) {
				rndbtnHomeCaixa.setBackground(Color.GRAY);
			}

			public void mouseExited(MouseEvent e) {
				rndbtnHomeCaixa.setBackground(Color.RED);
			}
		});

		rndbtnHomeCaixa.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				ControllerGerente abrir = new ControllerGerente();
				abrir.AbrirTelaCaixa(f);
				dispose();
			}
		});

		ImageIcon iconCaixa = new ImageIcon(getClass().getResource("/Imagens/desktop-solid.png"));

		Image imgCaixa = iconCaixa.getImage();

		Image novaImgCaixa = imgCaixa.getScaledInstance(20, 20, Image.SCALE_SMOOTH);

		rndbtnHomeCaixa.setIcon(new ImageIcon(novaImgCaixa));

		/*
		 * FUNCIONÁRIOS
		 */

		RoundedButton rndbtnFuncionarios = new RoundedButton("Funcionários", 30, 30);

		rndbtnFuncionarios.setHorizontalAlignment(SwingConstants.LEFT);
		rndbtnFuncionarios.setForeground(Color.WHITE);
		rndbtnFuncionarios.setFont(new Font("Arial", Font.PLAIN, 11));
		rndbtnFuncionarios.setBackground(Color.GRAY);
		rndbtnFuncionarios.setIcon(new ImageIcon(novaImgClientes));

		rndbtnFuncionarios.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				dispose();
				ControllerGerente.TelaCadastro(f);
			}
		});

		ImageIcon iconResumo = new ImageIcon(getClass().getResource("/Imagens/address-card-solid.png"));

		Image imgResumo = iconResumo.getImage();

		Image novaImgResumo = imgResumo.getScaledInstance(20, 20, Image.SCALE_SMOOTH);

		RoundedButton rndbtnResumo = new RoundedButton("Resumo", 30, 30);

		rndbtnResumo.setIcon(new ImageIcon(novaImgResumo));
		rndbtnResumo.setHorizontalAlignment(SwingConstants.LEFT);
		rndbtnResumo.setForeground(Color.WHITE);
		rndbtnResumo.setFont(new Font("Arial", Font.PLAIN, 11));
		rndbtnResumo.setBackground(Color.RED);

		rndbtnResumo.addMouseListener(new MouseAdapter() {

			public void mouseEntered(MouseEvent e) {
				rndbtnResumo.setBackground(Color.GRAY);
			}

			public void mouseExited(MouseEvent e) {
				rndbtnResumo.setBackground(Color.RED);
			}
		});

		rndbtnResumo.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				ControllerGerente abrir = new ControllerGerente();
				abrir.abrirTelaResumo(f);
				dispose();
			}
		});

		GroupLayout gl_panel_1 = new GroupLayout(panel_1);

		gl_panel_1.setHorizontalGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)

				.addGroup(gl_panel_1.createSequentialGroup().addGap(10)
						.addComponent(imgLogo, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE).addGap(10))

				.addGroup(gl_panel_1.createSequentialGroup().addContainerGap()
						.addComponent(rndbtnHomeCaixa, GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
						.addContainerGap())

				.addGroup(gl_panel_1.createSequentialGroup().addContainerGap()
						.addComponent(rndbtnHomeClientes, GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
						.addContainerGap())

				.addGroup(gl_panel_1.createSequentialGroup().addContainerGap()
						.addComponent(rndbtnHomeProdutos, GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
						.addContainerGap())

				.addGroup(gl_panel_1.createSequentialGroup().addContainerGap()
						.addComponent(rndbtnFuncionarios, GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
						.addContainerGap())

				.addGroup(gl_panel_1.createSequentialGroup().addContainerGap()
						.addComponent(rndbtnResumo, GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE).addContainerGap()));

		gl_panel_1.setVerticalGroup(gl_panel_1.createSequentialGroup()

				.addGap(10)

				.addComponent(imgLogo, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)

				.addGap(18)

				.addComponent(rndbtnHomeCaixa, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)

				.addGap(15)

				.addComponent(rndbtnHomeClientes, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)

				.addGap(15)

				.addComponent(rndbtnHomeProdutos, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)

				.addGap(15)

				.addComponent(rndbtnFuncionarios, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)

				.addGap(15)

				.addComponent(rndbtnResumo, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)

				.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		panel_1.setLayout(gl_panel_1);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);

		contentPane.add(panel_2, BorderLayout.CENTER);

		JLabel lblNewLabel_1 = new JLabel("Cadastro Funcionário");

		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);

		table = new JTable();

		String[] columnNames = { "Id", "Nome", "Sobrenome", "Telefone", "Salário", "Endereço" };

		Object[][] data = {};

		table = new JTable(new DefaultTableModel(data, columnNames));

		table.setFont(new Font("Arial", Font.PLAIN, 12));
		table.setRowHeight(25);

		JScrollPane scrollPane = new JScrollPane(table);

		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Arial", Font.PLAIN, 15));

		TextFielArredondada TextNome = new TextFielArredondada(15, 20, 20);

		TextNome.setColumns(10);

		JLabel lblSobrenome = new JLabel("Sobrenome:");
		lblSobrenome.setFont(new Font("Arial", Font.PLAIN, 15));

		TextFielArredondada TextSobrenome = new TextFielArredondada(15, 20, 20);

		TextSobrenome.setColumns(10);

		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setFont(new Font("Arial", Font.PLAIN, 15));

		TextFielArredondada TextTelefone = new TextFielArredondada(15, 20, 20);

		TextTelefone.setColumns(10);

		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setFont(new Font("Arial", Font.PLAIN, 15));

		TextFielArredondada TextCpf = new TextFielArredondada(15, 20, 20);

		TextCpf.setColumns(10);

		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setFont(new Font("Arial", Font.PLAIN, 15));

		TextFielArredondada TextSenha = new TextFielArredondada(15, 20, 20);

		TextSenha.setColumns(10);

		JLabel lblFuncao = new JLabel("Função:");
		lblFuncao.setFont(new Font("Arial", Font.PLAIN, 15));

		JComboBox<Object> comboFuncao = new JComboBox<Object>();

		comboFuncao.setModel(
				new DefaultComboBoxModel<Object>(new String[] { "Selecionar", "Caixa", "Gerente", "Estoquista" }));

		JLabel lblSalario = new JLabel("Salário:");
		lblSalario.setFont(new Font("Arial", Font.PLAIN, 15));

		TextFielArredondada TextSalario = new TextFielArredondada(15, 20, 20);

		TextSalario.setColumns(10);

		JLabel lblEndereco = new JLabel("Endereço:");
		lblEndereco.setFont(new Font("Arial", Font.PLAIN, 15));

		TextFielArredondada TextEndereco = new TextFielArredondada(15, 20, 20);

		TextEndereco.setColumns(10);

		RoundedButton Cadastrar = new RoundedButton("Cadastrar", 30, 30);

		Cadastrar.setForeground(Color.WHITE);
		Cadastrar.setFont(new Font("Arial", Font.PLAIN, 15));
		Cadastrar.setBackground(Color.RED);

		Cadastrar.addMouseListener(new MouseAdapter() {

			public void mouseEntered(MouseEvent e) {
				Cadastrar.setBackground(Color.LIGHT_GRAY);
			}

			public void mouseExited(MouseEvent e) {
				Cadastrar.setBackground(Color.RED);
			}
		});

		Cadastrar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				int op = comboFuncao.getSelectedIndex();

				try {

					ControllerGerente.Cadastro(TextNome, TextSobrenome, TextTelefone, TextCpf, TextSenha, op,
							TextSalario, TextEndereco);

				} catch (SQLException e1) {

					e1.printStackTrace();

					JOptionPane.showMessageDialog(Cadastro_Gerente.this, "Erro ao cadastrar funcionário!", "Erro",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});

		RoundedButton excluir = new RoundedButton("Excluir", 30, 30);

		excluir.setFont(new Font("Arial", Font.PLAIN, 15));
		excluir.setForeground(Color.WHITE);
		excluir.setBackground(Color.RED);

		excluir.addMouseListener(new MouseAdapter() {

			public void mouseEntered(MouseEvent e) {
				excluir.setBackground(Color.LIGHT_GRAY);
			}

			public void mouseExited(MouseEvent e) {
				excluir.setBackground(Color.RED);
			}
		});

		excluir.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				JFrame janelaExcluir = new JFrame("Demitir Funcionario");

				janelaExcluir.setSize(300, 200);
				janelaExcluir.setLocationRelativeTo(null);
				janelaExcluir.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

				JPanel painelExcluir = new JPanel();

				painelExcluir.setLayout(new BorderLayout(10, 10));
				painelExcluir.setBorder(new EmptyBorder(15, 15, 15, 15));

				janelaExcluir.setContentPane(painelExcluir);

				JLabel lblId = new JLabel("ID do Funcionário:");

				lblId.setFont(new Font("Arial", Font.PLAIN, 15));

				TextFielArredondada textId = new TextFielArredondada(15, 20, 20);

				textId.setColumns(10);

				JPanel painelDados = new JPanel(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 10));

				painelDados.add(lblId);
				painelDados.add(textId);

				RoundedButton btnExcluir = new RoundedButton("Excluir", 30, 30);

				btnExcluir.setForeground(Color.WHITE);
				btnExcluir.setBackground(Color.RED);

				btnExcluir.addMouseListener(new MouseAdapter() {

					public void mouseEntered(MouseEvent e) {
						btnExcluir.setBackground(Color.LIGHT_GRAY);
					}

					public void mouseExited(MouseEvent e) {
						btnExcluir.setBackground(Color.RED);
					}
				});

				btnExcluir.addActionListener(new ActionListener() {

					public void actionPerformed(ActionEvent e) {

						try {

							int id = Integer.parseInt(textId.getText());

							ControllerGerente.excluir(id);

							janelaExcluir.dispose();

						} catch (NumberFormatException ex) {

							JOptionPane.showMessageDialog(janelaExcluir, "Por favor, insira um ID válido!", "Erro",
									JOptionPane.ERROR_MESSAGE);
						}
					}
				});

				painelExcluir.add(painelDados, BorderLayout.CENTER);

				painelExcluir.add(btnExcluir, BorderLayout.SOUTH);

				janelaExcluir.setVisible(true);
			}
		});

		RoundedButton editar = new RoundedButton("Editar", 30, 30);

		editar.setFont(new Font("Arial", Font.PLAIN, 15));
		editar.setForeground(Color.WHITE);
		editar.setBackground(Color.RED);

		editar.addMouseListener(new MouseAdapter() {

			public void mouseEntered(MouseEvent e) {
				editar.setBackground(Color.LIGHT_GRAY);
			}

			public void mouseExited(MouseEvent e) {
				editar.setBackground(Color.RED);
			}
		});

		editar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				JFrame editarWindow = new JFrame("Editar Funcionário");

				editarWindow.setSize(400, 400);
				editarWindow.setLocationRelativeTo(null);
				editarWindow.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

				JPanel painelEditar = new JPanel();

				painelEditar.setBorder(new EmptyBorder(15, 15, 15, 15));

				painelEditar.setLayout(new java.awt.GridBagLayout());

				editarWindow.setContentPane(painelEditar);

				java.awt.GridBagConstraints gbc = new java.awt.GridBagConstraints();

				gbc.insets = new java.awt.Insets(5, 5, 5, 5);

				gbc.fill = java.awt.GridBagConstraints.HORIZONTAL;

				JLabel lblId = new JLabel("ID do Funcionário:");

				lblId.setFont(new Font("Arial", Font.PLAIN, 14));

				TextFielArredondada textId = new TextFielArredondada(15, 20, 20);

				textId.setColumns(10);

				gbc.gridx = 0;
				gbc.gridy = 0;
				gbc.weightx = 0;

				painelEditar.add(lblId, gbc);

				gbc.gridx = 1;
				gbc.weightx = 1;

				painelEditar.add(textId, gbc);

				RoundedButton btnBuscar = new RoundedButton("Buscar", 30, 30);

				btnBuscar.setForeground(Color.WHITE);
				btnBuscar.setBackground(Color.RED);

				gbc.gridx = 2;
				gbc.weightx = 0;

				painelEditar.add(btnBuscar, gbc);

				JLabel lblNome = new JLabel("Nome:");

				JLabel lblSobrenome = new JLabel("Sobrenome:");

				JLabel lblTelefone = new JLabel("Telefone:");

				JLabel lblSalario = new JLabel("Salário:");

				JLabel lblEndereco = new JLabel("Endereço:");

				JTextField tfNome = new JTextField();

				JTextField tfSobrenome = new JTextField();

				JTextField tfTelefone = new JTextField();

				JTextField tfSalario = new JTextField();

				JTextField tfEndereco = new JTextField();

				JLabel[] labels = { lblNome, lblSobrenome, lblTelefone, lblSalario, lblEndereco };

				JTextField[] campos = { tfNome, tfSobrenome, tfTelefone, tfSalario, tfEndereco };

				for (int i = 0; i < labels.length; i++) {

					labels[i].setFont(new Font("Arial", Font.PLAIN, 14));

					gbc.gridx = 0;
					gbc.gridy = i + 1;
					gbc.weightx = 0;

					painelEditar.add(labels[i], gbc);

					gbc.gridx = 1;
					gbc.gridwidth = 2;
					gbc.weightx = 1;

					painelEditar.add(campos[i], gbc);

					gbc.gridwidth = 1;
				}

				btnBuscar.addActionListener(new ActionListener() {

					public void actionPerformed(ActionEvent e) {

						try {

							int id = Integer.parseInt(textId.getText());

							ControllerGerente.buscarFuncionarioPorId(id, tfNome, tfSobrenome, tfTelefone, tfSalario,
									tfEndereco);

						} catch (NumberFormatException ex) {

							JOptionPane.showMessageDialog(editarWindow, "Informe um ID válido!", "Erro",
									JOptionPane.ERROR_MESSAGE);
						}
					}
				});

				RoundedButton btnSalvar = new RoundedButton("Salvar", 30, 30);

				btnSalvar.setForeground(Color.WHITE);
				btnSalvar.setBackground(Color.RED);

				btnSalvar.addMouseListener(new MouseAdapter() {

					public void mouseEntered(MouseEvent e) {
						btnSalvar.setBackground(Color.LIGHT_GRAY);
					}

					public void mouseExited(MouseEvent e) {
						btnSalvar.setBackground(Color.RED);
					}
				});

				btnSalvar.addActionListener(new ActionListener() {

					public void actionPerformed(ActionEvent e) {

						try {

							int id = Integer.parseInt(textId.getText());

							ControllerGerente.editar(id, tfNome, tfSobrenome, tfSalario, tfTelefone, tfEndereco);

							editarWindow.dispose();

						} catch (NumberFormatException ex) {

							JOptionPane.showMessageDialog(editarWindow, "Informe um ID válido!", "Erro",
									JOptionPane.ERROR_MESSAGE);
						}
					}
				});

				gbc.gridx = 1;
				gbc.gridy = 6;
				gbc.gridwidth = 2;
				gbc.weightx = 0;

				painelEditar.add(btnSalvar, gbc);

				editarWindow.setVisible(true);
			}
		});

		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(gl_panel_2.createParallelGroup(Alignment.CENTER)
				.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, 838, Short.MAX_VALUE)
				.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 838, Short.MAX_VALUE)
				.addGroup(gl_panel_2.createSequentialGroup()
						.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING).addComponent(lblNome)
								.addComponent(TextNome, GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE))
						.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING).addComponent(lblSobrenome)
								.addComponent(TextSobrenome, GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE))
						.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING).addComponent(lblTelefone)
								.addComponent(TextTelefone, GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE))
						.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING).addComponent(lblCpf)
								.addComponent(TextCpf, GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)))
				.addGroup(gl_panel_2.createSequentialGroup()
						.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING).addComponent(lblSenha)
								.addComponent(TextSenha, GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE))
						.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING).addComponent(lblFuncao)
								.addComponent(comboFuncao, 0, 205, Short.MAX_VALUE))
						.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING).addComponent(lblSalario)
								.addComponent(TextSalario, GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE))
						.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING).addComponent(lblEndereco)
								.addComponent(TextEndereco, GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)))
				.addGroup(gl_panel_2.createSequentialGroup()
						.addComponent(Cadastrar, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE).addGap(30)
						.addComponent(excluir, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE).addGap(30)
						.addComponent(editar, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
						.addGap(143)));
		gl_panel_2.setVerticalGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
						.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(scrollPane, 0, 502, Short.MAX_VALUE)
						.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE).addComponent(lblNome)
								.addComponent(lblSobrenome).addComponent(lblTelefone).addComponent(lblCpf))
						.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
								.addComponent(TextNome, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
								.addComponent(TextSobrenome, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
								.addComponent(TextTelefone, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
								.addComponent(TextCpf, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE).addComponent(lblSenha)
								.addComponent(lblFuncao).addComponent(lblSalario).addComponent(lblEndereco))
						.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
								.addComponent(TextSenha, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboFuncao, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
								.addComponent(TextSalario, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
								.addComponent(TextEndereco, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
						.addGap(15)
						.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
								.addComponent(Cadastrar, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
								.addComponent(excluir, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
								.addComponent(editar, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
						.addGap(10)));

		gl_panel_2.setAutoCreateGaps(true);
		gl_panel_2.setAutoCreateContainerGaps(true);

		panel_2.setLayout(gl_panel_2);

		ControllerGerente.BuscarF(Cadastro_Gerente.table);
	}
}