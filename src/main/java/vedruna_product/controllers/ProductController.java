package vedruna_product.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import vedruna_product.persistance.models.Product;
import vedruna_product.services.ProductServiceI;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {
	
	@Autowired
	private ProductServiceI productServiceI;// Inyección de dependencias del servicio
	
	// Obtener una lista de productos
	@GetMapping
	public List<Product> getAllProducts() {
		return productServiceI.showAllProducts();
	}
	
	// Obtener un producto por nombre
	@GetMapping("/name/{product}")
	public Product showProductByName(@PathVariable String product) {
		return productServiceI.ShowProductByName(product);
	}
	 
	// Insertar un producto
	@PostMapping("/insert")
	public void postProduct(@RequestBody Product product) {
		productServiceI.insertProduct(product);
	}
	
	// Editar un producto
	@PutMapping("/edit/{id}")
	public void editProduct(@PathVariable int id, @RequestBody Product product) {
		productServiceI.updateProduct(id, product);
	}
	
	// Eliminar un producto
	@DeleteMapping("/delete/{id}")
	public void deleteProduct(@PathVariable int id) {
		productServiceI.deleteProduct(id);
	}
}