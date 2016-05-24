package persistence;

import java.sql.SQLException;
import java.util.List;

import entity.Agenda;

public interface iAgendaDAO {
	
	List<Agenda> ConsultaTodos ()throws SQLException;
	List<Agenda> ConsultaPorNome (String texto)throws SQLException;
	Agenda ConsultaPorID (int id)throws SQLException;
	
	

}
