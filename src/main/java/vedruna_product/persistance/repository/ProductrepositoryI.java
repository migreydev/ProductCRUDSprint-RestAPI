package vedruna_product.persistance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vedruna_product.persistance.models.Product;

@Repository
public interface ProductrepositoryI extends JpaRepository<Product, Integer>{

	//Query para buscar productos por su nombre
	Product findByProductName (String productName);
	
}
