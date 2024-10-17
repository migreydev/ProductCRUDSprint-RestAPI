package vedruna_product.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vedruna_product.persistance.models.Product;
import vedruna_product.persistance.repository.ProductrepositoryI;

@Service
public class ProductServiceImpl implements ProductServiceI{
	
	@Autowired
	ProductrepositoryI productrepository;// Inyección de dependencias del repositorio
	
	// Devuelve todos los productos
	public List<Product> showAllProducts(){
		return productrepository.findAll();
	}
	
	// Busca un producto por su nombre
	@Override
	public Product ShowProductByName(String productName) {	
		return productrepository.findByProductName(productName);
	}
	
	//Añade un producto
	public void insertProduct(Product product) {
		productrepository.save(product);
	}
	
	//Actualiza un prodcuto
	public void updateProduct(int productId, Product product) {
		product.setProductId(productId);
		productrepository.save(product);
	}
	
	
	//Elimina un producto
	@Override
	public void deleteProduct(int productId) {
		productrepository.deleteById(productId);
	}

	


}
