package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import entity.Agenda;
import persistence.AgendaDAO;
import persistence.iAgendaDAO;

public class AgendaController  {
	private JTable tabelaContatos;
	public AgendaController(JTable tabelaContatos) {
	this.tabelaContatos = tabelaContatos;
	}
	public void ConsultaTodos (){
		
		try {
			AgendaDAO aDao = new AgendaDAO();
			List<Agenda> lista = aDao.ConsultaTodos();
			
			for (Agenda ag:  lista){
				
				
				
				
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}


	
	public void listarContatos() {
		if (tabelaContatos != null) {
			DefaultTableModel modelo = (DefaultTableModel) tabelaContatos.getModel();
			if (modelo.getRowCount() > 0) {
				modelo.setRowCount(0);

			}
		}

		try {
			AgendaDAO aDao = new AgendaDAO();

			List<Agenda> listaContatos = aDao.ConsultaTodos();

			DefaultTableModel modelo = (DefaultTableModel) tabelaContatos.getModel();
			if (listaContatos != null) {
				preencheTable(listaContatos);

			}

		} catch (SQLException e) {

			JOptionPane.showMessageDialog(null, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
		}
		tabelaContatos.invalidate();
		tabelaContatos.revalidate();
	}
	private void preencheTable(List<Agenda> listaContatos) {

		DefaultTableModel modelo = (DefaultTableModel) tabelaContatos.getModel();
		for (Agenda ag : listaContatos) {

			Object[] linha = new Object[5];
			linha[0] = ag.getId();
			linha[1] = ag.getNomeEmpresa();
			linha[2] = ag.getNomeEmpresaContato();
			linha[3] = ag.getTel_comercial();
			linha[4] = ag.getCel();
			
			modelo.addRow(linha);
		
		
	}}
	
	
	public void ConsultaNome(String texto) {

		DefaultTableModel modelo = (DefaultTableModel) tabelaContatos.getModel();
		if (tabelaContatos != null) {

			if (modelo.getRowCount() > 0) {
				modelo.setRowCount(0);
			}
		}

		try {
			AgendaDAO aDao = new AgendaDAO();

			List<Agenda> listaContato = aDao.ConsultaPorNome(texto);

			if (listaContato != null) {
				preencheTable(listaContato);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
		}

	}
	

}
