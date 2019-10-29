package pe.edu.upeu.ventas.dao;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.ventas.entity.Producto;



public interface ProductoDao {
	 int create(Producto prod);
	 int edtit(Producto prod);
	 Producto read(int id);
	 int delete(int id);
	 List<Map<String, Object>> readAll();
	 List<Map<String, Object>> readAll(int id);
}
