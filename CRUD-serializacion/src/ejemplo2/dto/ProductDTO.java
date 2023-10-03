package ejemplo2.dto;

import java.io.Serializable;

public class ProductDTO implements Serializable {
    public Integer Id;
    private String nameProduct;
    private String description;
    private String state;

    public ProductDTO(Integer id, String nameProduct, String description, String state) {
        Id = id;
        this.nameProduct = nameProduct;
        this.description = description;
        this.state = state;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getState() {
        return state;
    }

    public void setState(String  state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "ProductDTO{" +
                "Id=" + Id +
                ", nameProduct='" + nameProduct + '\'' +
                ", description='" + description + '\'' +
                ", state=" + state +
                '}';
    }
}
