package pe.edu.upeu.ventas.service;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.ventas.entity.Producto;

public interface ProductoService {
	 int create(Producto prod);
	 int edtit(Producto prod);
	 Producto read(int id);
	 int delete(int id);
	 List<Map<String, Object>> readAll();
	 List<Map<String, Object>> readAll(int id);
}
