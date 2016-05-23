package boundary;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.plaf.metal.MetalBorders.TableHeaderBorder;
import javax.swing.table.DefaultTableModel;

import controller.AgendaController;

public class AgendaBoundary implements ActionListener{
	AgendaController control;
	JFrame janela = new JFrame("Consulta de Contatos - Camera Press");
	JPanel panelPrincipal = new JPanel(new BorderLayout());
	JTable tabelaContatos = new JTable();
	JTextField txtPesquisar;
	JButton btnVisualizar;
	JButton btnPesquisar;
		
		public AgendaBoundary() {
			//JLabel logo = new JLabel();
			
			
			
			JLabel titulo = new JLabel("Agenda de Contatos", SwingConstants.CENTER);
			titulo.setIcon(new ImageIcon(AgendaBoundary.class.getResource("/resources/logocp.jpg")));
			titulo.setHorizontalTextPosition( SwingConstants.CENTER );
			titulo.setFont(new Font("Palatino Linotype", Font.BOLD, 30));
			titulo.setVerticalTextPosition(SwingConstants.BOTTOM);
			
			panelPrincipal.setBackground(Color.WHITE);
			
			
			
			//titulo.setHorizontalAlignment(JLabel.CENTER);
			
			panelPrincipal.add(titulo, BorderLayout.NORTH);
			panelPrincipal.add(centroTabela(), BorderLayout.CENTER);
			panelPrincipal.add(rodape(), BorderLayout.SOUTH);
			
			janela.setVisible(true);
			janela.setSize(900, 600);
			janela.setContentPane(panelPrincipal);
			janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			
		}
		
		public JComponent centroTabela (){
			JPanel panelCentro = new JPanel(new BorderLayout());
			
			
			
			panelCentro.setBackground(Color.WHITE);
			JScrollPane ScroolPaneContatos = new JScrollPane();
			
			
			
			
			tabelaContatos.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"Empresa", "Nome / Contato", "Telefone", "Celular"
				}
			));
			tabelaContatos.getColumnModel().getColumn(0).setPreferredWidth(256);
			tabelaContatos.getColumnModel().getColumn(1).setPreferredWidth(196);
			tabelaContatos.getColumnModel().getColumn(2).setPreferredWidth(199);
			tabelaContatos.getColumnModel().getColumn(3).setPreferredWidth(199);
			tabelaContatos.setFont(new Font("Palatino Linotype", Font.PLAIN, 16));
			tabelaContatos.setBorder(null);
			tabelaContatos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			
			
			
			ScroolPaneContatos.setViewportView(tabelaContatos);
			
			panelCentro.add(ScroolPaneContatos);
			
			
			
			
			
			return panelCentro;
			
			
			
			
			
		}
		public JComponent rodape(){
			JPanel panelRodape = new JPanel();
			JLabel pesquisar = new JLabel("Pesquisar: ");
			pesquisar.setFont(new Font("Palatino Linotype", Font.BOLD, 16));
			
			panelRodape.add(pesquisar);
			txtPesquisar =  new JTextField(30);
			panelRodape.add(txtPesquisar);
			
			btnPesquisar = new JButton("Pesquisar");
			panelRodape.add(btnPesquisar);
			btnPesquisar.addActionListener(this);
			btnVisualizar = new JButton("Visualizar contato");
			panelRodape.add(btnVisualizar);
			btnVisualizar.setEnabled(false);
			control = new AgendaController();
			control.ConsultaTodos();		
			
			return panelRodape;
			
			
		}
		
		
		
		
public static void main(String[] args) {
	new AgendaBoundary();
}

@Override
public void actionPerformed(ActionEvent e) {
if(e.getSource() == btnPesquisar){
	
	
	
	//control.ConsultaPorNome(txtPesquisar.getText());
}
	
}
}
