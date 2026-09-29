package visao;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import Controle.ControllerGerente;
import Modelo.Funcionario;

public class TelaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	private JPanel painelCentral;
	private CardLayout cardLayout;
	private Funcionario funcionario;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public TelaPrincipal(Funcionario f) {
		funcionario = f;

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 768);
		setMinimumSize(new Dimension(850, 600));
		setLocationRelativeTo(null);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout());
		setContentPane(contentPane);

		JPanel menuLateral = criarMenuLateral();

		contentPane.add(menuLateral, BorderLayout.WEST);

		cardLayout = new CardLayout();
		painelCentral = new JPanel(cardLayout);

		contentPane.add(painelCentral, BorderLayout.CENTER);

		JPanel telaInicial = new JPanel(new BorderLayout());

		painelCentral.add(telaInicial, "inicio");

		cardLayout.show(painelCentral, "inicio");
	}

	private JPanel criarMenuLateral() {

		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setPreferredSize(new Dimension(142, 0));

		RoundedButton imgLogo = new RoundedButton("", 1, 1);

		imgLogo.setBackground(Color.LIGHT_GRAY);
		imgLogo.setForeground(Color.LIGHT_GRAY);

		ImageIcon originalIconLogo =
				new ImageIcon(Login.class.getResource("/Imagens/Logo2.png"));

		Image imageLogo = originalIconLogo.getImage();

		Image novaLogo =
				imageLogo.getScaledInstance(100, 100, Image.SCALE_SMOOTH);

		imgLogo.setIcon(new ImageIcon(novaLogo));
		imgLogo.setVerticalAlignment(SwingConstants.BOTTOM);

		imgLogo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarInicio();
			}
		});

		RoundedButton btnCaixa =
				new RoundedButton("Caixa", 30, 30);

		btnCaixa.setHorizontalAlignment(SwingConstants.LEFT);
		btnCaixa.setForeground(Color.WHITE);
		btnCaixa.setFont(new Font("Arial", Font.PLAIN, 11));
		btnCaixa.setBackground(Color.RED);

		ImageIcon iconCaixa =
				new ImageIcon(getClass().getResource("/Imagens/desktop-solid.png"));

		Image imgCaixa = iconCaixa.getImage();

		Image novaImgCaixa =
				imgCaixa.getScaledInstance(20, 20, Image.SCALE_SMOOTH);

		btnCaixa.setIcon(new ImageIcon(novaImgCaixa));

		configurarHover(btnCaixa);

		btnCaixa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (funcionario != null) {
					ControllerGerente controller =
							new ControllerGerente();

					controller.AbrirTelaCaixa(funcionario);
				}
			}
		});

		RoundedButton btnClientes =
				new RoundedButton("Clientes", 30, 30);

		btnClientes.setHorizontalAlignment(SwingConstants.LEFT);
		btnClientes.setForeground(Color.WHITE);
		btnClientes.setFont(new Font("Arial", Font.PLAIN, 11));
		btnClientes.setBackground(Color.GRAY);

		ImageIcon iconClientes =
				new ImageIcon(getClass().getResource("/Imagens/address-card-solid.png"));

		Image imgClientes = iconClientes.getImage();

		Image novaImgClientes =
				imgClientes.getScaledInstance(20, 20, Image.SCALE_SMOOTH);

		btnClientes.setIcon(new ImageIcon(novaImgClientes));

		configurarHover(btnClientes);

		btnClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarTela(new TelaCadastroCliente(funcionario));
			}
		});

		RoundedButton btnEstoque =
				new RoundedButton("Estoque", 30, 30);

		btnEstoque.setHorizontalAlignment(SwingConstants.LEFT);
		btnEstoque.setForeground(Color.WHITE);
		btnEstoque.setFont(new Font("Arial", Font.PLAIN, 11));
		btnEstoque.setBackground(Color.RED);

		ImageIcon iconProdutos =
				new ImageIcon(getClass().getResource("/Imagens/box-open-solid.png"));

		Image imgProdutos = iconProdutos.getImage();

		Image novaImgProdutos =
				imgProdutos.getScaledInstance(20, 20, Image.SCALE_SMOOTH);

		btnEstoque.setIcon(new ImageIcon(novaImgProdutos));

		configurarHover(btnEstoque);

		btnEstoque.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (funcionario != null) {
					ControllerGerente controller =
							new ControllerGerente();

					controller.AbrirTelaEstoque(funcionario);
				}
			}
		});

		RoundedButton btnFuncionarios =
				new RoundedButton("Funcionários", 30, 30);

		btnFuncionarios.setHorizontalAlignment(SwingConstants.LEFT);
		btnFuncionarios.setForeground(Color.WHITE);
		btnFuncionarios.setFont(new Font("Arial", Font.PLAIN, 11));
		btnFuncionarios.setBackground(Color.RED);

		btnFuncionarios.setIcon(new ImageIcon(novaImgClientes));

		configurarHover(btnFuncionarios);

		btnFuncionarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (funcionario != null) {
					ControllerGerente.TelaCadastro(funcionario);
				}
			}
		});

		RoundedButton btnResumo =
				new RoundedButton("Resumo", 30, 30);

		btnResumo.setHorizontalAlignment(SwingConstants.LEFT);
		btnResumo.setForeground(Color.WHITE);
		btnResumo.setFont(new Font("Arial", Font.PLAIN, 11));
		btnResumo.setBackground(Color.RED);

		btnResumo.setIcon(new ImageIcon(novaImgClientes));

		configurarHover(btnResumo);

		btnResumo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (funcionario != null) {
					ControllerGerente controller =
							new ControllerGerente();

					controller.abrirTelaResumo(funcionario);
				}
			}
		});

		javax.swing.GroupLayout layout =
				new javax.swing.GroupLayout(panel);

		layout.setHorizontalGroup(
			layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING
			)

			.addGroup(
				layout.createSequentialGroup()
				.addGap(19)
				.addComponent(
					imgLogo,
					javax.swing.GroupLayout.PREFERRED_SIZE,
					103,
					javax.swing.GroupLayout.PREFERRED_SIZE
				)
			)

			.addGroup(
				layout.createSequentialGroup()
				.addContainerGap()
				.addComponent(
					btnCaixa,
					javax.swing.GroupLayout.DEFAULT_SIZE,
					122,
					Short.MAX_VALUE
				)
				.addContainerGap()
			)

			.addGroup(
				layout.createSequentialGroup()
				.addContainerGap()
				.addComponent(
					btnClientes,
					javax.swing.GroupLayout.DEFAULT_SIZE,
					122,
					Short.MAX_VALUE
				)
				.addContainerGap()
			)

			.addGroup(
				layout.createSequentialGroup()
				.addContainerGap()
				.addComponent(
					btnEstoque,
					javax.swing.GroupLayout.DEFAULT_SIZE,
					122,
					Short.MAX_VALUE
				)
				.addContainerGap()
			)

			.addGroup(
				layout.createSequentialGroup()
				.addContainerGap()
				.addComponent(
					btnFuncionarios,
					javax.swing.GroupLayout.DEFAULT_SIZE,
					122,
					Short.MAX_VALUE
				)
				.addContainerGap()
			)

			.addGroup(
				layout.createSequentialGroup()
				.addContainerGap()
				.addComponent(
					btnResumo,
					javax.swing.GroupLayout.DEFAULT_SIZE,
					122,
					Short.MAX_VALUE
				)
				.addContainerGap()
			)
		);

		layout.setVerticalGroup(
			layout.createSequentialGroup()

			.addContainerGap()

			.addComponent(
				imgLogo,
				javax.swing.GroupLayout.PREFERRED_SIZE,
				106,
				javax.swing.GroupLayout.PREFERRED_SIZE
			)

			.addGap(18)

			.addComponent(
				btnCaixa,
				javax.swing.GroupLayout.PREFERRED_SIZE,
				26,
				javax.swing.GroupLayout.PREFERRED_SIZE
			)

			.addGap(18)

			.addComponent(
				btnClientes,
				javax.swing.GroupLayout.PREFERRED_SIZE,
				26,
				javax.swing.GroupLayout.PREFERRED_SIZE
			)

			.addGap(18)

			.addComponent(
				btnEstoque,
				javax.swing.GroupLayout.PREFERRED_SIZE,
				26,
				javax.swing.GroupLayout.PREFERRED_SIZE
			)

			.addGap(18)

			.addComponent(
				btnFuncionarios,
				javax.swing.GroupLayout.PREFERRED_SIZE,
				26,
				javax.swing.GroupLayout.PREFERRED_SIZE
			)

			.addGap(18)

			.addComponent(
				btnResumo,
				javax.swing.GroupLayout.PREFERRED_SIZE,
				26,
				javax.swing.GroupLayout.PREFERRED_SIZE
			)

			.addContainerGap(
				javax.swing.GroupLayout.DEFAULT_SIZE,
				Short.MAX_VALUE
			)
		);

		panel.setLayout(layout);

		if (funcionario != null) {

			String tipo = funcionario.getTipoFucionario();

			if (tipo != null && tipo.equals("Caixa")) {

				btnEstoque.setVisible(false);
				btnFuncionarios.setVisible(false);
				btnResumo.setVisible(false);

			} else if (tipo != null && tipo.equals("Gerente")) {

				btnEstoque.setVisible(true);
				btnFuncionarios.setVisible(true);
				btnResumo.setVisible(true);

			} else {

				btnEstoque.setVisible(false);
				btnFuncionarios.setVisible(false);
				btnResumo.setVisible(false);
			}
		} else {

			btnEstoque.setVisible(false);
			btnFuncionarios.setVisible(false);
			btnResumo.setVisible(false);
		}

		return panel;
	}

	private void configurarHover(RoundedButton botao) {

		botao.addMouseListener(new MouseAdapter() {

			public void mouseEntered(MouseEvent e) {
				botao.setBackground(Color.GRAY);
			}

			public void mouseExited(MouseEvent e) {

				if (botao.getText().equals("Clientes")) {
					botao.setBackground(Color.GRAY);
				} else {
					botao.setBackground(Color.RED);
				}
			}
		});
	}

	public void mostrarTela(JPanel tela) {

		String nome = "tela_" + painelCentral.getComponentCount();

		painelCentral.add(tela, nome);

		cardLayout.show(painelCentral, nome);

		painelCentral.revalidate();
		painelCentral.repaint();
	}

	public void mostrarInicio() {

		cardLayout.show(painelCentral, "inicio");

		painelCentral.revalidate();
		painelCentral.repaint();
	}

	public JPanel getPainelCentral() {
		return painelCentral;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}
}