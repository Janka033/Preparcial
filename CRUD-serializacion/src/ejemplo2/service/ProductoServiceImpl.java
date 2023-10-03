package ejemplo2.service;


import ejemplo2.dto.ProductDTO;
import ejemplo2.interfaces.IProducto;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProductoServiceImpl implements IProducto {
    private List<ProductDTO> productos;

    public ProductoServiceImpl() throws IOException, ClassNotFoundException {
        productos = new ArrayList<>();
    }

    @Override
    public ProductDTO findById(int id) {
        return productos.stream()
                .filter(producto -> producto.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<ProductDTO> findAll() throws IOException, ClassNotFoundException {
        productos = (List<ProductDTO>) ObjectSerializer.readObjectFromFile("productos.ax");
       return productos;
    }

    @Override
    public void save(ProductDTO producto) throws IOException {
        productos.add(producto);
        ObjectSerializer.writeObjectToFile(productos, "productos.ax");
    }

    @Override
    public void update(ProductDTO producto) throws IOException {
        ProductDTO oldProducto = findById(producto.getId());
        if (oldProducto != null) {
            productos.remove(oldProducto);
            productos.add(producto);
            ObjectSerializer.writeObjectToFile(productos, "productos.ax");
        }
    }

    @Override
    public void delete(ProductDTO producto) throws IOException {
        productos.remove(producto);
        ObjectSerializer.writeObjectToFile(productos, "productos.ax");
    }
}

