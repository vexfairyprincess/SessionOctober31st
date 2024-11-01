package models;

public class Product {
    private String productName;
    private double productPrice;
    private int productQuantity;

    public Product() {
    }

    public Product(String productName, double productPrice, int productQuantity) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public void updateProductQuantity(int quantity) {
        this.productQuantity += quantity;
    }
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Product{");
        sb.append("productName='").append(productName).append('\'');
        sb.append(", productPrice=").append(productPrice);
        sb.append(", productQuantity=").append(productQuantity);
        sb.append('}');
        return sb.toString();
    }
}
