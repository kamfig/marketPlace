package pl.kamilF.market.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.kamilF.market.dao.CategoryDao;
import pl.kamilF.market.dao.ProductDao;
import pl.kamilF.market.model.Product;

@Controller
public class ProductController {


    @Autowired
    private ProductDao productDao;

    @Autowired
    private CategoryDao categoryDao;

    @GetMapping("/product/add")
    public String add(ModelMap modelMap){
        modelMap.put("product", new Product());
        modelMap.put("categories",categoryDao.findAll());

        return "product/add";
    }


    @PostMapping("product/add")
    public String save(@ModelAttribute Product product, ModelMap modelMap)
    {
        modelMap.put("product",product);

        productDao.save(product);
        return "product/show";
    }

    @GetMapping("/product/all")

    public String findAll(ModelMap modelMap){

        modelMap.addAttribute("products",productDao.findAll());

        return "product/all";

    }

}
