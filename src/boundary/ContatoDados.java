package boundary;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

import entity.Agenda;


public class ContatoDados implements ActionListener{
	JFrame janela = new JFrame("Contato");
	private JPanel panelPrincipal = new JPanel(new BorderLayout());
	private int id;
	private JTextArea txtObs;
	private JTextField txtNomeContato;

	
	private JDialog consultaCltDialog = new JDialog();

	public ContatoDados(Agenda ag) {

		panelPrincipal.add(Centro(), BorderLayout.CENTER);

		consultaCltDialog.setModal(true);
		consultaCltDialog.setLocationRelativeTo(null);
		consultaCltDialog.setResizable(false);
		consultaCltDialog.setContentPane(panelPrincipal);
		consultaCltDialog.setSize(1020, 600);
		consultaCltDialog.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
		consultaCltDialog.setLocationRelativeTo(null);
		consultaCltDialog.setVisible(true);
		
		
		
		
		
		
		

	}
	
	public void PopulaDados (Agenda ag){
		

		this.txtNomeContato.setText(ag.getNomeEmpresa());
		this.txtObs.setText("AA");
	}

	public JPanel getPanelPrincipal() {
		return panelPrincipal;
	}

	public void setPanelPrincipal(JPanel panelPrincipal) {
		this.panelPrincipal = panelPrincipal;
	}

	public JComponent Centro() {
		JPanel panelCentro = new JPanel();
		panelCentro.setLayout(null);
		panelCentro.setBackground(Color.WHITE);
		JLabel lblVisualizandoContato = new JLabel("Visualizando Contato");
		lblVisualizandoContato.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblVisualizandoContato.setBounds(332, 11, 173, 22);
		panelCentro.add(lblVisualizandoContato);
		
		JLabel lblNomeContato = new JLabel("Nome Contato:");
		lblNomeContato.setFont(new Font("Dialog", Font.PLAIN, 11));
		lblNomeContato.setBounds(28, 58, 122, 14);
		panelCentro.add(lblNomeContato);
		
		txtNomeContato = new JTextField();
		txtNomeContato.setFont(new Font("Dialog", Font.PLAIN, 11));
		txtNomeContato.setBounds(171, 55, 538, 20);
		panelCentro.add(txtNomeContato);
		txtNomeContato.setColumns(10);
		
		JLabel lblDadosPessoais = new JLabel("Dados Pessoais:");
		lblDadosPessoais.setFont(new Font("Dialog", Font.BOLD, 11));
		lblDadosPessoais.setBounds(28, 83, 122, 14);
		panelCentro.add(lblDadosPessoais);
		
		JLabel lblEnd = new JLabel("End:");
		lblEnd.setFont(new Font("Dialog", Font.PLAIN, 11));
		lblEnd.setBounds(28, 108, 46, 14);
		panelCentro.add(lblEnd);
		
		JLabel lblTel = new JLabel("Tel:");
		lblTel.setFont(new Font("Dialog", Font.PLAIN, 11));
		lblTel.setBounds(28, 133, 46, 14);
		panelCentro.add(lblTel);
		
		JLabel lblCel = new JLabel("Cel:");
		lblCel.setFont(new Font("Dialog", Font.PLAIN, 11));
		lblCel.setBounds(28, 158, 46, 14);
		panelCentro.add(lblCel);
		
		JLabel lblUf = new JLabel("UF:");
		lblUf.setFont(new Font("Dialog", Font.PLAIN, 11));
		lblUf.setBounds(28, 183, 46, 14);
		panelCentro.add(lblUf);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Dialog", Font.PLAIN, 11));
		lblEmail.setBounds(28, 208, 46, 14);
		panelCentro.add(lblEmail);
		
		JLabel lblFax = new JLabel("Fax:");
		lblFax.setFont(new Font("Dialog", Font.PLAIN, 11));
		lblFax.setBounds(601, 108, 46, 14);
		panelCentro.add(lblFax);
		
		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setFont(new Font("Dialog", Font.PLAIN, 11));
		lblCidade.setBounds(601, 133, 62, 14);
		panelCentro.add(lblCidade);
		
		JLabel lblCep = new JLabel("Cep:");
		lblCep.setFont(new Font("Dialog", Font.PLAIN, 11));
		lblCep.setBounds(601, 158, 46, 14);
		panelCentro.add(lblCep);
		
		JLabel lblDadosComerciais = new JLabel("Dados Comerciais:");
		lblDadosComerciais.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDadosComerciais.setBounds(28, 233, 106, 14);
		panelCentro.add(lblDadosComerciais);
		
		JLabel lblEmpresa = new JLabel(" Empresa:");
		lblEmpresa.setBounds(28, 258, 73, 14);
		panelCentro.add(lblEmpresa);
		
		JLabel lblEnd_1 = new JLabel(" End:");
		lblEnd_1.setBounds(28, 283, 46, 14);
		panelCentro.add(lblEnd_1);
		
		JLabel lblTel_1 = new JLabel("Tel:");
		lblTel_1.setBounds(28, 308, 46, 14);
		panelCentro.add(lblTel_1);
		
		JLabel lblPager = new JLabel("Pager:");
		lblPager.setBounds(28, 333, 46, 14);
		panelCentro.add(lblPager);
		
		JLabel lblCargo = new JLabel("Cargo: ");
		lblCargo.setBounds(28, 358, 46, 14);
		panelCentro.add(lblCargo);
		
		JLabel lblCidade_1 = new JLabel("Cidade:");
		lblCidade_1.setBounds(600, 258, 46, 14);
		panelCentro.add(lblCidade_1);
		
		JLabel lblFax_1 = new JLabel("Fax:");
		lblFax_1.setBounds(600, 296, 46, 14);
		panelCentro.add(lblFax_1);
		
		JLabel lblSite = new JLabel("Site:");
		lblSite.setBounds(600, 333, 46, 14);
		panelCentro.add(lblSite);
		
		JLabel lblDepartamento = new JLabel("Departamento: ");
		lblDepartamento.setBounds(600, 373, 91, 14);
		panelCentro.add(lblDepartamento);
		
		JLabel lblCep_1 = new JLabel("Cep:");
		lblCep_1.setBounds(600, 408, 46, 14);
		panelCentro.add(lblCep_1);
		
		JLabel lblObservaes = new JLabel("Observa\u00E7\u00F5es");
		lblObservaes.setBounds(28, 408, 91, 14);
		panelCentro.add(lblObservaes);
		
		txtObs = new JTextArea();
		txtObs.setBounds(28, 433, 753, 104);
		panelCentro.add(txtObs);
		
	
		

		return panelCentro;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	






}
