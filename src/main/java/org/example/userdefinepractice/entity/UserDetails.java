package org.example.userdefinepractice.entity;

import java.util.List;

public class UserDetails {

    int id;
    String name;
    String email;
    List<Serviceses> serviceses;
    List<Products>  products;

    public UserDetails(int id, String name, String email, List<Serviceses> serviceses, List<Products> products) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.serviceses = serviceses;
        this.products = products;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "UserDetails{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", serviceses=" + serviceses +
                ", products=" + products +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Serviceses> getServiceses() {
        return serviceses;
    }

    public void setServiceses(List<Serviceses> serviceses) {
        this.serviceses = serviceses;
    }

    public List<Products> getProducts() {
        return products;
    }

    public void setProducts(List<Products> products) {
        this.products = products;
    }


}
