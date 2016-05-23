package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.Agenda;
import persistence.AgendaDAO;
import persistence.iAgendaDAO;

public class AgendaController  {
	
	public void ConsultaTodos (){
		
		AgendaDAO aDao = new AgendaDAO();
		
		try {
			List<Agenda> lista =aDao.ConsultaTodos();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	public void ConsultaPorNome(String text) {
		
		AgendaDAO aDao = new AgendaDAO();
		
		try {
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
