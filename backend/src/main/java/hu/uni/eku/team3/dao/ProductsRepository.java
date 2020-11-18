package hu.uni.eku.team3.dao;

import hu.uni.eku.team3.dao.entity.Products;
import org.springframework.data.repository.CrudRepository;

public interface ProductsRepository extends CrudRepository<Products,String> {
    Products findUsageById(Integer id);
}
