package pe.edu.upeu.ventas.dao;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.ventas.entity.Categoria;

public interface CategoriaDao {
 public int create(Categoria cat);
 public int edtit(Categoria cat);
 public Categoria read(int id);
 public int delete(int id);
 public List<Map<String, Object>> readAll();
 public List<Map<String, Object>> readAll(int id);
}
