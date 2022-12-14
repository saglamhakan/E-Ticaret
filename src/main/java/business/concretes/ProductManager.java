package business.concretes;

import business.abstracts.ProductService;
import core.result.DataResult;
import core.result.Result;
import core.result.SuccessDataResult;
import core.result.SuccessResult;
import dataAccess.abstracts.ProductsDao;
import entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductManager implements ProductService {

    private ProductsDao productsDao;

    @Autowired
    public ProductManager(ProductsDao productsDao){
        this.productsDao=productsDao;
    }

    @Override
    public DataResult<List<Product>> getAll() {
        return new SuccessDataResult<List<Product>>
                (this.productsDao.findAll(), "Data listed");
    }

    @Override
    public DataResult<List<Product>> getAll(int pageNo, int pageSize) {
        return null;
    }


    @Override
    public Result add(Product product) {
        this.productsDao.save(product);
        return new SuccessResult("Product added");
    }

    @Override
    public DataResult<Product> getByCategoryId(int categoryId) {
        this.productsDao.getByProductId(categoryId);
        return null;

    }
}
