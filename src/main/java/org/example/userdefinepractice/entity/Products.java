package org.example.userdefinepractice.entity;

public class Products {
    int Id;
    int productCode;
    String productName;
    String productCategory;

    public Products() {

    }


    @Override
    public String toString() {
        return "Products{" +
                "Id=" + Id +
                ", productCode=" + productCode +
                ", productName='" + productName + '\'' +
                ", productCategory='" + productCategory + '\'' +
                '}';
    }

    public Products(int id, int productCode, String productName, String productCategory) {
        Id = id;
        this.productCode = productCode;
        this.productName = productName;
        this.productCategory = productCategory;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getProductCode() {
        return productCode;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }
}
