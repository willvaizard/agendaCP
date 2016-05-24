package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.Agenda;

public class AgendaDAO implements iAgendaDAO{
	Connection con;
	public AgendaDAO() throws SQLException {
	con = JDBCUtil.getConnection();
	}

	@Override
	public List<Agenda> ConsultaTodos() throws SQLException {
		
		List<Agenda> listaContatos = new ArrayList<Agenda>();
		String sql = "SELECT * from agenda";

		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();

		while (rs.next()) {

			Agenda ag = new Agenda();
			ag.setId(rs.getInt("id_contato"));
			ag.setNomeEmpresa(rs.getString("nome"));
			ag.setTel_comercial(rs.getString("tel_comercial"));
			ag.setCel(rs.getString("cel"));
				

			listaContatos.add(ag);

		}
		rs.close();
		ps.close();

		return listaContatos;

	}

	@Override
public List<Agenda> ConsultaPorNome(String texto) throws SQLException {
	
		
		List<Agenda> listaContatos = new ArrayList<Agenda>();
		String sql = "SELECT id_contato, nome, tel_comercial, cel from agenda where nome like '%?%' ";

		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();

		ps.setString(1, 	texto.toUpperCase());
		
		while (rs.next()) {

			Agenda ag = new Agenda();
			ag.setId(rs.getInt("id_contato"));
			ag.setNomeEmpresa(rs.getString("nome"));
			ag.setTel_comercial(rs.getString("tel_comercial"));
			ag.setCel(rs.getString("cel"));
				

			listaContatos.add(ag);

		}
		rs.close();
		ps.close();

		return listaContatos;
		}


	
	

}
