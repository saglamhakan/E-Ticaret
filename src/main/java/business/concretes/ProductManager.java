package business.concretes;

import business.abstracts.ProductService;
import core.result.DataResult;
import core.result.Result;
import core.result.SuccessDataResult;
import core.result.SuccessResult;
import dataAccess.abstracts.ProductsDao;
import entities.concretes.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;

@Service
public class ProductManager implements ProductService {

    private ProductsDao productsDao;

    @Autowired
    public ProductManager(ProductsDao productsDao){
        this.productsDao=productsDao;
    }

    @Override
    public DataResult<List<Products>> getAll() {
        return new SuccessDataResult<List<Products>>
                (this.productsDao.findAll(), "Data Listed");
    }

    @Override
    public DataResult<List<Products>> getAll(int pageNo, int pageSize) {
        return null;
    }


    @Override
    public Result add(Products products) {
        this.productsDao.save(products);
        return new SuccessResult("Product added");
    }

    @Override
    public DataResult<Products> getByCategoryId(int categoryId) {
        this.productsDao.getByProductId(categoryId);
        return null;

    }
}
