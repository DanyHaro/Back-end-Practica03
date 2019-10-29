package pe.edu.upeu.ventas.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.ventas.entity.Producto;
import pe.edu.upeu.ventas.service.ProductoService;

@RestController
@RequestMapping("productos")
public class ProductoController {
	@Autowired
	private ProductoService productoService;
	@PostMapping("/")
	public int save(@RequestParam String prod, @RequestParam double precio, @RequestParam int cantidad, @RequestParam int idcat) {		
		return productoService.create(new Producto(prod,precio,cantidad,idcat));		
	}
	
    @GetMapping("/")
    public List<Map<String, Object>> findProd() {
        return productoService.readAll();
    }
    
	@DeleteMapping("/{id}")
	public int delete(@PathVariable int id) {		
		return productoService.delete(id);
	}

	@GetMapping("/{id}")
	public List<Map<String, Object>> read2(@PathVariable int id) {		
		return productoService.readAll(id);
	}
	
	@PutMapping("/")
	public int update(@RequestParam double precio, @RequestParam int cantidad, @RequestParam int idproducto) {
		return productoService.edtit(new Producto(idproducto, "",precio,cantidad, 0));
	}

}
