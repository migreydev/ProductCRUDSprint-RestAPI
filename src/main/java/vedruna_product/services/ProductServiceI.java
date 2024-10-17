package vedruna_product.services;

import java.util.List;

import org.springframework.stereotype.Service;

import vedruna_product.persistance.models.Product;

@Service
public interface ProductServiceI {
	
	// Lista todos los productos
	List<Product> showAllProducts();
	
	// Muestra un producto por su nombre
	Product ShowProductByName(String productName);
	
	//Añade un producto nuevo
	void insertProduct(Product product);
	
	//Actualiza un producto
	void updateProduct(int id, Product product);
	
	//Elimina un producto
	void deleteProduct(int id);


}
