package boundary;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Insets;
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
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

import com.sun.org.apache.bcel.internal.generic.POP;

import entity.Agenda;


public class ContatoDados implements ActionListener{
	JFrame janela = new JFrame("Contato");
	private JPanel panelPrincipal = new JPanel(new BorderLayout());
	private int id;
	private JTextArea txtObs;
	private JTextField txtNomeContato;

	
	private JDialog consultaCltDialog = new JDialog();
	private JTextField txtEndereco;
	private JTextField txtTelefone;
	private JTextField txtCel;
	private JTextField txtUf;
	private JTextField txtEmail;
	private JTextField txtEmpresa;
	private JTextField txtEnderecoEmpresa;
	private JTextField txtTelefoneEmpresa;
	private JTextField txtPager;
	private JTextField txtCargo;
	private JTextField txtFax;
	private JTextField txtCidade;
	private JTextField txtCep;
	private JTextField txtCidadeEmpresa;
	private JTextField txtFaxEmpresa;
	private JTextField txtSite;
	private JTextField txtDepartamento;
	private JTextField txtCepEmpresa;

	public ContatoDados(Agenda ag) {
		
		

		panelPrincipal.add(Centro(ag), BorderLayout.CENTER);

		consultaCltDialog.setModal(true);
		consultaCltDialog.setLocationRelativeTo(null);
		consultaCltDialog.setResizable(false);
		consultaCltDialog.setContentPane(panelPrincipal);
		consultaCltDialog.setSize(950, 600);
		consultaCltDialog.setLocationRelativeTo(null);
		consultaCltDialog.setVisible(true);
		
		
		
		
		
		
		

	}
	


	public JPanel getPanelPrincipal() {
		return panelPrincipal;
	}

	public void setPanelPrincipal(JPanel panelPrincipal) {
		this.panelPrincipal = panelPrincipal;
	}

	public JComponent Centro(Agenda ag) {
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
		
		
		
		JLabel lblDadosPessoais = new JLabel("Dados Pessoais:");
		lblDadosPessoais.setFont(new Font("Dialog", Font.BOLD, 11));
		lblDadosPessoais.setBounds(28, 83, 122, 14);
		panelCentro.add(lblDadosPessoais);
		
		JLabel lblEnd = new JLabel("End:");
		lblEnd.setFont(new Font("Dialog", Font.PLAIN, 11));
		lblEnd.setBounds(28, 108, 73, 14);
		panelCentro.add(lblEnd);
		
		JLabel lblTel = new JLabel("Tel:");
		lblTel.setFont(new Font("Dialog", Font.PLAIN, 11));
		lblTel.setBounds(28, 133, 73, 14);
		panelCentro.add(lblTel);
		
		JLabel lblCel = new JLabel("Cel:");
		lblCel.setFont(new Font("Dialog", Font.PLAIN, 11));
		lblCel.setBounds(28, 158, 73, 14);
		panelCentro.add(lblCel);
		
		JLabel lblUf = new JLabel("UF:");
		lblUf.setFont(new Font("Dialog", Font.PLAIN, 11));
		lblUf.setBounds(28, 183, 73, 14);
		panelCentro.add(lblUf);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Dialog", Font.PLAIN, 11));
		lblEmail.setBounds(28, 208, 73, 14);
		panelCentro.add(lblEmail);
		
		JLabel lblFax = new JLabel("Fax:");
		lblFax.setFont(new Font("Dialog", Font.PLAIN, 11));
		lblFax.setBounds(601, 106, 46, 14);
		panelCentro.add(lblFax);
		
		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setFont(new Font("Dialog", Font.PLAIN, 11));
		lblCidade.setBounds(601, 133, 62, 14);
		panelCentro.add(lblCidade);
		
		JLabel lblCep = new JLabel("Cep:");
		lblCep.setFont(new Font("Dialog", Font.PLAIN, 11));
		lblCep.setBounds(601, 161, 46, 14);
		panelCentro.add(lblCep);
		
		JLabel lblDadosComerciais = new JLabel("Dados Comerciais:");
		lblDadosComerciais.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDadosComerciais.setBounds(28, 233, 173, 14);
		panelCentro.add(lblDadosComerciais);
		
		JLabel lblEmpresa = new JLabel(" Empresa:");
		lblEmpresa.setBounds(28, 258, 73, 14);
		panelCentro.add(lblEmpresa);
		
		JLabel lblEnd_1 = new JLabel(" End:");
		lblEnd_1.setBounds(28, 296, 73, 14);
		panelCentro.add(lblEnd_1);
		
		JLabel lblTel_1 = new JLabel("Tel:");
		lblTel_1.setBounds(28, 323, 62, 14);
		panelCentro.add(lblTel_1);
		
		JLabel lblPager = new JLabel("Pager:");
		lblPager.setBounds(28, 355, 73, 14);
		panelCentro.add(lblPager);
		
		JLabel lblCargo = new JLabel("Cargo: ");
		lblCargo.setBounds(28, 392, 73, 14);
		panelCentro.add(lblCargo);
		
		JLabel lblCidade_1 = new JLabel("Cidade:");
		lblCidade_1.setBounds(601, 293, 46, 14);
		panelCentro.add(lblCidade_1);
		
		JLabel lblFax_1 = new JLabel("Fax:");
		lblFax_1.setBounds(600, 255, 46, 14);
		panelCentro.add(lblFax_1);
		
		JLabel lblSite = new JLabel("Site:");
		lblSite.setBounds(600, 333, 46, 14);
		panelCentro.add(lblSite);
		
		JLabel lblDepartamento = new JLabel("Departamento: ");
		lblDepartamento.setBounds(600, 370, 91, 14);
		panelCentro.add(lblDepartamento);
		
		JLabel lblCep_1 = new JLabel("Cep:");
		lblCep_1.setBounds(600, 405, 46, 14);
		panelCentro.add(lblCep_1);
		
		JLabel lblObservaes = new JLabel("Observa\u00E7\u00F5es");
		lblObservaes.setBounds(28, 427, 91, 14);
		panelCentro.add(lblObservaes);
		
		txtNomeContato = new JTextField();
		txtNomeContato.setFont(new Font("Dialog", Font.PLAIN, 11));
		txtNomeContato.setBounds(120, 55, 793, 20);
		panelCentro.add(txtNomeContato);
		txtNomeContato.setColumns(10);
		txtNomeContato.setText(ag.getNomeEmpresaContato());
	
		
		txtEndereco = new JTextField();
		txtEndereco.setBounds(84, 106, 499, 20);
		panelCentro.add(txtEndereco);
		txtEndereco.setColumns(10);
		txtEndereco.setText(ag.getEnd_comercial());
		
		txtTelefone = new JTextField();
		txtTelefone.setBounds(84, 133, 499, 20);
		panelCentro.add(txtTelefone);
		txtTelefone.setColumns(10);
		txtTelefone.setText(ag.getTel_res());
		
		txtCel = new JTextField();
		txtCel.setBounds(84, 158, 499, 20);
		panelCentro.add(txtCel);
		txtCel.setColumns(10);
		txtCel.setText(ag.getCel());
		
		txtUf = new JTextField();
		txtUf.setBounds(84, 183, 289, 20);
		panelCentro.add(txtUf);
		txtUf.setColumns(10);
		txtUf.setText(ag.getUf());
		
		txtEmail = new JTextField();
		txtEmail.setBounds(84, 208, 499, 20);
		panelCentro.add(txtEmail);
		txtEmail.setColumns(10);
		txtEmail.setText(ag.getMail());
		
		txtEmpresa = new JTextField();
		txtEmpresa.setBounds(94, 255, 489, 20);
		panelCentro.add(txtEmpresa);
		txtEmpresa.setColumns(10);
		txtEmpresa.setText(ag.getNomeEmpresa());
		
		txtEnderecoEmpresa = new JTextField();
		txtEnderecoEmpresa.setBounds(84, 293, 499, 20);
		panelCentro.add(txtEnderecoEmpresa);
		txtEnderecoEmpresa.setColumns(10);
		txtEnderecoEmpresa.setText(ag.getEnd_comercial2());
		
		txtTelefoneEmpresa = new JTextField();
		txtTelefoneEmpresa.setBounds(84, 321, 499, 20);
		panelCentro.add(txtTelefoneEmpresa);
		txtTelefoneEmpresa.setColumns(10);
		txtTelefoneEmpresa.setText(ag.getTel_comercial());
		
		
		txtPager = new JTextField();
		txtPager.setBounds(84, 352, 499, 20);
		panelCentro.add(txtPager);
		txtPager.setColumns(10);
		txtPager.setText(ag.getPager());
		
		
		txtCargo = new JTextField();
		txtCargo.setBounds(84, 389, 499, 20);
		panelCentro.add(txtCargo);
		txtCargo.setColumns(10);
		txtCargo.setText(ag.getCargo());
		
		txtFax = new JTextField();
		txtFax.setBounds(650, 103, 284, 20);
		panelCentro.add(txtFax);
		txtFax.setColumns(10);
		txtFax.setText(ag.getFax_res());
		
		txtCidade = new JTextField();
		txtCidade.setBounds(660, 130, 274, 20);
		panelCentro.add(txtCidade);
		txtCidade.setColumns(10);
		txtCidade.setText(ag.getCidade_res());
		
		txtCep = new JTextField();
		txtCep.setBounds(653, 158, 281, 20);
		panelCentro.add(txtCep);
		txtCep.setColumns(10);
		txtCep.setText(ag.getCep_comercial());
		
		txtCidadeEmpresa = new JTextField();
		txtCidadeEmpresa.setBounds(663, 290, 271, 20);
		panelCentro.add(txtCidadeEmpresa);
		txtCidadeEmpresa.setColumns(10);
		txtCidadeEmpresa.setText(ag.getCidade_comercial());
		
		txtFaxEmpresa = new JTextField();
		txtFaxEmpresa.setBounds(660, 252, 274, 20);
		panelCentro.add(txtFaxEmpresa);
		txtFaxEmpresa.setColumns(10);
		txtFaxEmpresa.setText(ag.getFax_comercial());
		
		txtSite = new JTextField();
		txtSite.setBounds(650, 330, 284, 20);
		panelCentro.add(txtSite);
		txtSite.setColumns(10);
		txtSite.setText(ag.getSite());

		
		txtDepartamento = new JTextField();
		txtDepartamento.setBounds(704, 367, 230, 20);
		panelCentro.add(txtDepartamento);
		txtDepartamento.setColumns(10);
		txtDepartamento.setText(ag.getDepartamento());
		
		txtCepEmpresa = new JTextField();
		txtCepEmpresa.setBounds(650, 402, 284, 20);
		panelCentro.add(txtCepEmpresa);
		txtCepEmpresa.setColumns(10);
		txtCepEmpresa.setText(ag.getCep_comercial2()+" - "+ ag.getCep_comercial());
		
		txtObs = new JTextArea();
		txtObs.setBounds(28, 452, 753, 104);
		txtObs.setLineWrap(true);
		panelCentro.add(txtObs);
		txtObs.setText(ag.getObs());
		
		
		
		
		
		
		
		
		
	
		

		return panelCentro;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
