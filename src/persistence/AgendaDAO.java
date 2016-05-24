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

String sql = "SELECT nome, nome2+' / '+empresa  as nomeEmpCont, mail, residencial, cidade_res, "
		+ "cep_res, uf, tel_res, fax_res, cel, site,end_comercial, cidade_comercial, cep_comercial,"
		+ " + cep_comercial2, site_comercial, tel_comercial, fax_comercial,  empresa, cargo, "
		+ "departamento, end_comercial2, obs, id_contato from agenda";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();

		while (rs.next()) {

			Agenda ag = new Agenda();
			
			ag.setNomeEmpresa(rs.getString("nome"));
			ag.setNomeEmpresaContato(rs.getString("nomeEmpCont"));
			ag.setMail(rs.getString("mail"));
			ag.setResidencial(rs.getString("residencial"));
			ag.setCidade_res(rs.getString("cidade_res"));
			ag.setCep_res(rs.getString("cep_res"));
			ag.setUf(rs.getString("uf"));
			ag.setTel_res(rs.getString("tel_res"));
			ag.setFax_res(rs.getString("fax_res"));
			ag.setCel(rs.getString("cel"));
			ag.setSite(rs.getString("site"));
			ag.setEnd_comercial(rs.getString("end_comercial"));
			ag.setCidade_comercial("cidade_comercial");
			ag.setCep_comercial(rs.getString("cep_comercial"));
			ag.setCep_comercial2(rs.getString("cep_comercial2"));
			ag.setSite_comercial(rs.getString("site_comercial"));
			ag.setTel_comercial(rs.getString("tel_comercial"));
			ag.setFax_comercial(rs.getString("fax_comercial"));
			ag.setCargo(rs.getString("cargo"));
			ag.setDepartamento(rs.getString("departamento"));
			ag.setEnd_comercial2(rs.getString("end_comercial2"));
			ag.setObs(rs.getString("obs"));
			ag.setId(rs.getInt("id_contato"));
			
			listaContatos.add(ag);

		}
		rs.close();
		ps.close();

		return listaContatos;

	}

	@Override
public List<Agenda> ConsultaPorNome(String textoDigitado) throws SQLException {
	
		String texto = textoDigitado.toUpperCase();
		List<Agenda> listaContatos = new ArrayList<Agenda>();
		String sql = "SELECT nome, nome2+' / '+empresa  as nomeEmpCont, mail, residencial, cidade_res, "
				+ "cep_res, uf, tel_res, fax_res, cel, site,end_comercial, cidade_comercial, cep_comercial,"
				+ " + cep_comercial2, site_comercial, tel_comercial, fax_comercial,  empresa, cargo, "
				+ "departamento, end_comercial2, obs, id_contato from agenda where nome like '%"+texto+"%' or nome2 like '%"+texto+"%' or empresa like '%"+texto+"%'";
		
		PreparedStatement ps = con.prepareStatement(sql);
		
		ResultSet rs = ps.executeQuery();

		
		
		while (rs.next()) {

			Agenda ag = new Agenda();
			ag.setNomeEmpresa(rs.getString("nome"));
			ag.setNomeEmpresaContato(rs.getString("nomeEmpCont"));
			ag.setMail(rs.getString("mail"));
			ag.setResidencial(rs.getString("residencial"));
			ag.setCidade_res(rs.getString("cidade_res"));
			ag.setCep_res(rs.getString("cep_res"));
			ag.setUf(rs.getString("uf"));
			ag.setTel_res(rs.getString("tel_res"));
			ag.setFax_res(rs.getString("fax_res"));
			ag.setCel(rs.getString("cel"));
			ag.setSite(rs.getString("site"));
			ag.setEnd_comercial(rs.getString("end_comercial"));
			ag.setCidade_comercial("cidade_comercial");
			ag.setCep_comercial(rs.getString("cep_comercial"));
			ag.setCep_comercial2(rs.getString("cep_comercial2"));
			ag.setSite_comercial(rs.getString("site_comercial"));
			ag.setTel_comercial(rs.getString("tel_comercial"));
			ag.setFax_comercial(rs.getString("fax_comercial"));
			ag.setCargo(rs.getString("cargo"));
			ag.setDepartamento(rs.getString("departamento"));
			ag.setEnd_comercial2(rs.getString("end_comercial2"));
			ag.setObs(rs.getString("obs"));
			ag.setId(rs.getInt("id_contato"));
			
				

			listaContatos.add(ag);

		}
		rs.close();
		ps.close();

		return listaContatos;
		}


	
	

}
