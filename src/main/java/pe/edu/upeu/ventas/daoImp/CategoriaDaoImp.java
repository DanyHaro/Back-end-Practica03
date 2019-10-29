package pe.edu.upeu.ventas.daoImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upeu.ventas.dao.CategoriaDao;
import pe.edu.upeu.ventas.entity.Categoria;
@Transactional
@Repository
public class CategoriaDaoImp implements CategoriaDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public int create(Categoria cat) {
		// TODO Auto-generated method stub
		int x= 0;
		String sql = "INSERT INTO categoria (nom_cat) VALUES (?)";
		x = jdbcTemplate.update(sql,cat.getNom_cat());
		return x;
	}

	@Override
	public int edtit(Categoria cat) {
		// TODO Auto-generated method stub
		int x = 0;
		String sql = "UPDATE categoria SET nom_cat=? WHERE idcategoria=?";		
		x = jdbcTemplate.update(sql,cat.getNom_cat(), cat.getIdcategoria());
		return x;
	}

	@Override
	public Categoria read(int id) {
		String sql = "SELECT *from categoria WHERE idcategoria=?";
        Categoria cat = jdbcTemplate.queryForObject(sql,new Object[]{id},new BeanPropertyRowMapper<>(Categoria.class));
		return cat;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		int x = 0;
		String sql = "DELETE FROM categoria WHERE idcategoria=?";
		x = jdbcTemplate.update(sql, id);
		return x;
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return jdbcTemplate.queryForList("SELECT *FROM categoria");
	}

	@Override
	public List<Map<String, Object>> readAll(int id) {
		// TODO Auto-generated method stub
		String sql = "select *from categoria WHERE idcategoria =?";
				return jdbcTemplate.queryForList(sql,id);
	}

}
