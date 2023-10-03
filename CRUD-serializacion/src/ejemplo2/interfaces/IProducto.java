package ejemplo2.interfaces;

import ejemplo2.dto.ProductDTO;

import java.io.IOException;
import java.util.List;

public interface IProducto {
    ProductDTO findById(int id);
    List<ProductDTO> findAll() throws IOException, ClassNotFoundException;
    void save(ProductDTO producto) throws IOException;
    void update(ProductDTO producto) throws IOException;
    void delete(ProductDTO producto) throws IOException;
}
