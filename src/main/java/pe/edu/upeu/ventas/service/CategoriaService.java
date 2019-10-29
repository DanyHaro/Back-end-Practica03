package pe.edu.upeu.ventas.service;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.ventas.entity.Categoria;

public interface CategoriaService {
	 int create(Categoria cat);
	 int edtit(Categoria cat);
	 Categoria read(int id);
	 int delete(int id);
	 List<Map<String, Object>> readAll();
	 List<Map<String, Object>> readAll(int id);
}
