package pe.edu.upeu.ventas.serviceImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.ventas.dao.CategoriaDao;
import pe.edu.upeu.ventas.entity.Categoria;
import pe.edu.upeu.ventas.service.CategoriaService;
@Service
public class CategoriaServiceImp implements CategoriaService {
	@Autowired
	private CategoriaDao categoriaDao;
	@Override
	public int create(Categoria cat) {
		// TODO Auto-generated method stub
		return categoriaDao.create(cat);
	}

	@Override
	public int edtit(Categoria cat) {
		// TODO Auto-generated method stub
		return categoriaDao.edtit(cat);
	}

	@Override
	public Categoria read(int id) {
		// TODO Auto-generated method stub
		return categoriaDao.read(id);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return categoriaDao.delete(id);
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return categoriaDao.readAll();
	}

	@Override
	public List<Map<String, Object>> readAll(int id) {
		// TODO Auto-generated method stub
		return categoriaDao.readAll(id);
	}

}
