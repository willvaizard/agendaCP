package boundary;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
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

import com.sun.javafx.fxml.BeanAdapter;

import controller.AgendaController;

public class AgendaBoundary implements ActionListener, MouseListener{
	private AgendaController control;
	private JFrame janela = new JFrame("Consulta de Contatos - Camera Press");
	private JPanel panelPrincipal = new JPanel(new BorderLayout());
	private JTable tabelaContatos ;
	private JTextField txtPesquisar;
	private JButton btnVisualizar;
	private JButton btnPesquisar;
	private int id;
		
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
			janela.setExtendedState(JFrame.MAXIMIZED_BOTH);
			janela.setSize(900, 600);
			janela.setContentPane(panelPrincipal);
			janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			
		}
		
		public JComponent centroTabela (){
			JPanel panelCentro = new JPanel(new BorderLayout());
			
			
			
			panelCentro.setBackground(Color.WHITE);
			JScrollPane ScroolPaneContatos = new JScrollPane();
			
			panelCentro.add(ScroolPaneContatos);
			
			tabelaContatos= new JTable();
			
			DefaultTableModel modelo = new DefaultTableModel(new Object[][]{},new String[] {
					"ID","Empresa", "Nome / Contato", "Telefone", "Celular"
				} );
			ScroolPaneContatos.setViewportView(tabelaContatos);
			tabelaContatos.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"ID","Empresa", "Nome / Contato", "Telefone", "Celular"
				}) {

				/**
				* 
				*/
				private static final long serialVersionUID = 1L;
				boolean[] canEdit = new boolean[] { false, false, false, false, false };

				@Override
				public boolean isCellEditable(int rowIndex, int columnIndex) {
					return canEdit[columnIndex];
				}
			}
	
			);
			

			tabelaContatos.getColumnModel().getColumn(0).setPreferredWidth(40);
			tabelaContatos.getColumnModel().getColumn(1).setPreferredWidth(236);
			tabelaContatos.getColumnModel().getColumn(2).setPreferredWidth(196);
			tabelaContatos.getColumnModel().getColumn(3).setPreferredWidth(250);
			tabelaContatos.getColumnModel().getColumn(4).setPreferredWidth(150);
			tabelaContatos.setFont(new Font("Tahoma", Font.PLAIN, 12));
			tabelaContatos.revalidate();
			tabelaContatos.setBorder(null);
			tabelaContatos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			tabelaContatos.addMouseListener(this);
			
			
			
			
			
			
			
			

			control = new AgendaController(tabelaContatos);
			control.listarContatos();
			
			
			return panelCentro;
			
			
			
			
			
		}
		public JComponent rodape(){
			JPanel panelRodape = new JPanel();
			JLabel pesquisar = new JLabel("Pesquisar: ");
			pesquisar.setFont(new Font("Palatino Linotype", Font.BOLD, 16));
			
			panelRodape.add(pesquisar);
			txtPesquisar =  new JTextField(30);
			txtPesquisar.addActionListener(this);
			panelRodape.add(txtPesquisar);
			
			btnPesquisar = new JButton("Pesquisar");
			panelRodape.add(btnPesquisar);
			btnPesquisar.addActionListener(this);
			btnVisualizar = new JButton("Visualizar contato");
			panelRodape.add(btnVisualizar);
			btnVisualizar.setEnabled(false);
			btnVisualizar.addActionListener(this);
					
			
			return panelRodape;
			
			
		}
		
		
		
		
public static void main(String[] args) {
	new AgendaBoundary();
}

@Override
public void actionPerformed(ActionEvent e) {
if(e.getSource() == btnPesquisar || e.getSource() == txtPesquisar){
	
	
	
	control.ConsultaNome(txtPesquisar.getText());
}else if (e.getSource() == btnVisualizar){
	ContatoDados cDados = new ContatoDados(control.VisualizaContato(id));
	tabelaContatos.clearSelection();
	btnVisualizar.setEnabled(false);
	
}
	
}

@Override
public void mouseClicked(MouseEvent arg0) {
	if (arg0.getSource() == tabelaContatos) {

		int linha = tabelaContatos.getSelectedRow();
		btnVisualizar.setEnabled(true);
		 id = (int) tabelaContatos.getValueAt(linha, 0); 
		
	}
	
}

@Override
public void mouseEntered(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void mouseExited(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void mousePressed(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void mouseReleased(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
}
}
