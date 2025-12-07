package org.example.userdefinepractice.staticdata;

import org.example.userdefinepractice.entity.Products;
import org.example.userdefinepractice.entity.Serviceses;
import org.example.userdefinepractice.entity.UserDetails;

import java.util.List;


public class Staticdatastorage {

        Products p01 = new Products(1 , 101, "Laptop", "Electronics");
        Products p02= new Products(2 ,102,"Smartphone","Electronics");
        Products p03 = new Products(3 ,103,"Desk Chair","Furniture");
        Products p04 = new Products(4 ,104,"Notebook","Stationery");
        Products p05 = new Products(5 ,105,"Headphones","Electronics");
        Products p06 = new Products(6 ,106,"Coffee Maker","Appliances");
        Products p07 = new Products(7 ,107,"Backpack","Accessories");
        Products p08 = new Products(8 ,108,"Running Shoes","Footwear");
        Products p09 = new Products(9 ,109,"Wristwatch","Accessories");
        Products p010= new Products(10 ,110,"Desk Lamp","Furniture");
        Products  p011 = new Products(11 ,1011,"MobilePhone","Electronics");
       List<Products> productsList = List.of(p01, p02, p03, p04, p05, p06, p07, p08, p09, p010);

    public List<Products> getProductsList() {
        return productsList;
    }

    Serviceses s01 = new Serviceses(1, "HomeService", 500, "Claing the Homes etc");
    Serviceses s012 = new Serviceses(2, "CarService", 1500, "Car Maintanance and Repair");
    Serviceses s03 = new Serviceses(3, "IT Support", 2000, "Technical Support for IT Issues");
    Serviceses s04 = new Serviceses(4, "Gardening", 800, "Lawn Mowing and Garden Care");
    Serviceses s05 = new Serviceses(5, "Plumbing", 1200, "Fixing Leaks and Plumbing Issues");
    Serviceses s06 = new Serviceses(6, "Electrical", 1800, "Electrical Repairs and Installations");
    Serviceses s07 = new Serviceses(7, "Moving Service", 2500, "Assistance with Moving and Relocation");
    List<Serviceses> servicesesList = List.of(s01, s012, s03, s04, s05, s06, s07);

    public Serviceses getServiceses() {
        return (Serviceses) this.servicesesList;
    }

  UserDetails userDetails = new UserDetails(1,"Kavin","kavi12@service.com",servicesesList,productsList);
    UserDetails userDetails2 = new UserDetails(2,"Harry","Harry@service.com",servicesesList,productsList);
    UserDetails userDetails3 = new UserDetails(3,"Ben","Ben@service.com",servicesesList,productsList);
    UserDetails userDetails4 = new UserDetails(4,"Buntty","Buntty@service.com",servicesesList,productsList);
  List<UserDetails> userDetailsList = List.of(userDetails,userDetails2,userDetails3,userDetails4);

    public List<UserDetails> getUserDetailsList() {
        return userDetailsList;
    }
}
