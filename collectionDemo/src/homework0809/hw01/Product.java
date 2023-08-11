package homework0809.hw01;

import java.util.Objects;

public class Product implements Comparable<Product>{
    /**
     * 使用HashSet和TreeSet存储多个商品信息，遍历并输出；
     * 其中商品属性：编号，名称，单价，出版社；要求向其中添加多个相同的商品，验证集合中元素的唯一性。
     * 提示：向HashSet中添加自定义类的对象信息，需要重写hashCode和equals( )
     * 向TreeSet中添加自定义类的对象信息，需要实现Comparable接口，指定比较规则
     */
    private String productId;
    private String productName;
    private double productPrice;
    private String productPublic;//出版社

    public Product() {
    }

    public Product(String productId, String productName, double productPrice, String productPublic) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productPublic = productPublic;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
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

    public String getProductPublic() {
        return productPublic;
    }

    public void setProductPublic(String productPublic) {
        this.productPublic = productPublic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.productPrice, productPrice) == 0 &&
                Objects.equals(productId, product.productId) &&
                Objects.equals(productName, product.productName) &&
                Objects.equals(productPublic, product.productPublic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, productName, productPrice, productPublic);
    }

    @Override
    public int compareTo(Product o) {
        return this.getProductId().compareTo(o.getProductId());
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", productPublic='" + productPublic + '\'' +
                '}';
    }
}
