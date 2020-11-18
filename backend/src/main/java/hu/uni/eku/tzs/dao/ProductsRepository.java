package hu.uni.eku.tzs.dao;

import hu.uni.eku.tzs.model.Products;
import org.springframework.data.repository.CrudRepository;

public interface ProductsRepository extends CrudRepository<Products,String> {
}
