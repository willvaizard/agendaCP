package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.Agenda;
import persistence.AgendaDAO;
import persistence.iAgendaDAO;

public class AgendaController  {
	
	public void ConsultaTodos (){
		
		try {
			AgendaDAO aDao = new AgendaDAO();
			List<Agenda> lista = aDao.ConsultaTodos();
			
			for (Agenda ag:  lista){
				
				System.out.println(ag.getId()+ " - " + ag.getNomeEmpresa());
				
				
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	public void ConsultaPorNome(String text) {
		
		
		
		try {
			AgendaDAO aDao = new AgendaDAO();
			List<Agenda> lista =aDao.ConsultaPorNome(text);
			for(Agenda ag: lista){
				
				System.out.println(ag.getId());
				
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
