package pl.kamilF.market.dao;

import org.springframework.data.repository.CrudRepository;
import pl.kamilF.market.controller.CategoryController;
import pl.kamilF.market.model.Category;

public interface CategoryDao extends CrudRepository<Category,Integer> {
}
