package business.abstracts;

import core.result.DataResult;
import core.result.Result;
import entities.concretes.Products;

import java.util.List;

public interface ProductService {
    DataResult<List<Products>> getAll();
    DataResult<List<Products>> getAll(int pageNo, int pageSize);
    Result add (Products products);
    DataResult<Products> getByCategoryId(int categoryId);



}
