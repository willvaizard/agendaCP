package boundary;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class VisualizarContattoBoundary {

	private JFrame frame;
	private JTextField txtNomeContato;
	private JTextArea txtObs;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VisualizarContattoBoundary window = new VisualizarContattoBoundary();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VisualizarContattoBoundary() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Dialog", Font.PLAIN, 11));
		frame.setBounds(100, 100, 900, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblVisualizandoContato = new JLabel("Visualizando Contato");
		lblVisualizandoContato.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblVisualizandoContato.setBounds(332, 11, 173, 22);
		frame.getContentPane().add(lblVisualizandoContato);
		
		JLabel lblNomeContato = new JLabel("Nome Contato:");
		lblNomeContato.setFont(new Font("Dialog", Font.PLAIN, 11));
		lblNomeContato.setBounds(28, 58, 122, 14);
		frame.getContentPane().add(lblNomeContato);
		
		txtNomeContato = new JTextField();
		txtNomeContato.setFont(new Font("Dialog", Font.PLAIN, 11));
		txtNomeContato.setBounds(171, 55, 538, 20);
		frame.getContentPane().add(txtNomeContato);
		txtNomeContato.setColumns(10);
		
		JLabel lblDadosPessoais = new JLabel("Dados Pessoais:");
		lblDadosPessoais.setFont(new Font("Dialog", Font.BOLD, 11));
		lblDadosPessoais.setBounds(28, 83, 122, 14);
		frame.getContentPane().add(lblDadosPessoais);
		
		JLabel lblEnd = new JLabel("End:");
		lblEnd.setFont(new Font("Dialog", Font.PLAIN, 11));
		lblEnd.setBounds(28, 108, 46, 14);
		frame.getContentPane().add(lblEnd);
		
		JLabel lblTel = new JLabel("Tel:");
		lblTel.setFont(new Font("Dialog", Font.PLAIN, 11));
		lblTel.setBounds(28, 133, 46, 14);
		frame.getContentPane().add(lblTel);
		
		JLabel lblCel = new JLabel("Cel:");
		lblCel.setFont(new Font("Dialog", Font.PLAIN, 11));
		lblCel.setBounds(28, 158, 46, 14);
		frame.getContentPane().add(lblCel);
		
		JLabel lblUf = new JLabel("UF:");
		lblUf.setFont(new Font("Dialog", Font.PLAIN, 11));
		lblUf.setBounds(28, 183, 46, 14);
		frame.getContentPane().add(lblUf);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Dialog", Font.PLAIN, 11));
		lblEmail.setBounds(28, 208, 46, 14);
		frame.getContentPane().add(lblEmail);
		
		JLabel lblFax = new JLabel("Fax:");
		lblFax.setFont(new Font("Dialog", Font.PLAIN, 11));
		lblFax.setBounds(601, 108, 46, 14);
		frame.getContentPane().add(lblFax);
		
		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setFont(new Font("Dialog", Font.PLAIN, 11));
		lblCidade.setBounds(601, 133, 62, 14);
		frame.getContentPane().add(lblCidade);
		
		JLabel lblCep = new JLabel("Cep:");
		lblCep.setFont(new Font("Dialog", Font.PLAIN, 11));
		lblCep.setBounds(601, 158, 46, 14);
		frame.getContentPane().add(lblCep);
		
		JLabel lblDadosComerciais = new JLabel("Dados Comerciais:");
		lblDadosComerciais.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDadosComerciais.setBounds(28, 233, 106, 14);
		frame.getContentPane().add(lblDadosComerciais);
		
		JLabel lblEmpresa = new JLabel(" Empresa:");
		lblEmpresa.setBounds(28, 258, 73, 14);
		frame.getContentPane().add(lblEmpresa);
		
		JLabel lblEnd_1 = new JLabel(" End:");
		lblEnd_1.setBounds(28, 283, 46, 14);
		frame.getContentPane().add(lblEnd_1);
		
		JLabel lblTel_1 = new JLabel("Tel:");
		lblTel_1.setBounds(28, 308, 46, 14);
		frame.getContentPane().add(lblTel_1);
		
		JLabel lblPager = new JLabel("Pager:");
		lblPager.setBounds(28, 333, 46, 14);
		frame.getContentPane().add(lblPager);
		
		JLabel lblCargo = new JLabel("Cargo: ");
		lblCargo.setBounds(28, 358, 46, 14);
		frame.getContentPane().add(lblCargo);
		
		JLabel lblCidade_1 = new JLabel("Cidade:");
		lblCidade_1.setBounds(600, 258, 46, 14);
		frame.getContentPane().add(lblCidade_1);
		
		JLabel lblFax_1 = new JLabel("Fax:");
		lblFax_1.setBounds(600, 296, 46, 14);
		frame.getContentPane().add(lblFax_1);
		
		JLabel lblSite = new JLabel("Site:");
		lblSite.setBounds(600, 333, 46, 14);
		frame.getContentPane().add(lblSite);
		
		JLabel lblDepartamento = new JLabel("Departamento: ");
		lblDepartamento.setBounds(600, 373, 91, 14);
		frame.getContentPane().add(lblDepartamento);
		
		JLabel lblCep_1 = new JLabel("Cep:");
		lblCep_1.setBounds(600, 408, 46, 14);
		frame.getContentPane().add(lblCep_1);
		
		JLabel lblObservaes = new JLabel("Observa\u00E7\u00F5es");
		lblObservaes.setBounds(28, 408, 91, 14);
		frame.getContentPane().add(lblObservaes);
		
		txtObs = new JTextArea();
		txtObs.setBounds(28, 433, 753, 104);
		frame.getContentPane().add(txtObs);
		
		
		
		
		
		
	}
}
