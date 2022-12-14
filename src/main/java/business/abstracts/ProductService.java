package business.abstracts;

import core.result.DataResult;
import core.result.Result;
import entities.concretes.Product;

import java.util.List;

public interface ProductService {
    DataResult<List<Product>> getAll();
    DataResult<List<Product>> getAll(int pageNo, int pageSize);
    Result add (Product product);
    DataResult<Product> getByCategoryId(int categoryId);



}
