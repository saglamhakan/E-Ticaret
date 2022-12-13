package web.Api.Controllers;

import business.abstracts.ProductService;
import core.result.DataResult;
import core.result.Result;
import entities.concretes.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductsController {
    private ProductService productService;

    @Autowired
    public ProductsController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/getAll")
    public DataResult<List<Products>> getAll() {
        return this.productService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody Products products) {
        return this.productService.add(products);
    }

    public DataResult<Products> getByCategoryId(int categoryId) {
        return this.productService.getByCategoryId(categoryId);
    }

}
