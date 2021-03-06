package codegym.service;

import codegym.model.Product;

public interface IProductService extends IGeneralService<Product> {
    Iterable<Product> findAllByNameContaining(String name);

    Iterable<Product> findAllByCategory_Id(Long id);

    void deleteAllByCategory_Id(Long id);
}
