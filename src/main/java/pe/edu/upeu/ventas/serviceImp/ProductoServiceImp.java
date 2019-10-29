package pe.edu.upeu.ventas.serviceImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.ventas.dao.ProductoDao;
import pe.edu.upeu.ventas.entity.Producto;
import pe.edu.upeu.ventas.service.ProductoService;
@Service
public class ProductoServiceImp implements ProductoService {
	@Autowired
	private ProductoDao productoDao;
	@Override
	public int create(Producto prod) {
		// TODO Auto-generated method stub
		return productoDao.create(prod);
	}

	@Override
	public int edtit(Producto prod) {
		// TODO Auto-generated method stub
		return productoDao.edtit(prod);
	}

	@Override
	public Producto read(int id) {
		// TODO Auto-generated method stub
		return productoDao.read(id);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return productoDao.delete(id);
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return productoDao.readAll();
	}

	@Override
	public List<Map<String, Object>> readAll(int id) {
		// TODO Auto-generated method stub
		return productoDao.readAll(id);
	}

}
