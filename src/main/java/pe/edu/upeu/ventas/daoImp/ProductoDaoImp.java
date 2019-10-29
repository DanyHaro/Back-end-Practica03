package pe.edu.upeu.ventas.daoImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


import pe.edu.upeu.ventas.dao.ProductoDao;
import pe.edu.upeu.ventas.entity.Producto;

@Repository
public class ProductoDaoImp implements ProductoDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public int create(Producto prod) {
		int x= 0;
		String sql = "INSERT INTO producto (nom_prod, precio, cantidad, idcategoria) VALUES (?,?,?,?)";
		x = jdbcTemplate.update(sql,prod.getNom_prod(), prod.getPrecio(), prod.getCantidad(),prod.getIdcategoria());
		return x;
	}

	@Override
	public int edtit(Producto prod) {
		int x = 0;
		String sql = "UPDATE producto SET precio=?, cantidad=? WHERE idproducto=?";		
		x = jdbcTemplate.update(sql,prod.getPrecio(), prod.getCantidad(), prod.getIdproducto());
		return x;
	}

	@Override
	public Producto read(int id) {
		String sql = "SELECT * producto WHERE idproducto=?";
        Producto prod = jdbcTemplate.queryForObject(sql,new Object[]{id},new BeanPropertyRowMapper<>(Producto.class));
		return prod;
	}

	@Override
	public int delete(int id) {
		int x = 0;
		String sql = "DELETE FROM producto WHERE idproducto=?";
		x = jdbcTemplate.update(sql, id);
		return x;		
	}

	@Override
	public List<Map<String, Object>> readAll() {
		return jdbcTemplate.queryForList("select c.idcategoria, c.nom_cat, p.idproducto, p.nom_prod, "
				+"p.precio, p.cantidad from categoria as c, producto as p "+ 
				"where c.idcategoria = p.idcategoria");
	}

	@Override
	public List<Map<String, Object>> readAll(int id) {
		String sql = "select c.idcategoria, c.nom_cat, p.idproducto, p.nom_prod, p.precio, p.cantidad FROM categoria as c, producto as p "
	    +"WHERE c.idcategoria = p.idcategoria AND idproducto=?";
		return jdbcTemplate.queryForList(sql,id);
	}

}
