package pl.kamilF.market.dao;

import org.springframework.data.repository.CrudRepository;
import pl.kamilF.market.model.Category;
import pl.kamilF.market.model.Product;

public interface ProductDao extends CrudRepository<Product, Integer> {
}
