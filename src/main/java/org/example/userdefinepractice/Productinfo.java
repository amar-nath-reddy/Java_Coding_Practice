package org.example.userdefinepractice;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.example.userdefinepractice.entity.Products;
import org.example.userdefinepractice.entity.Serviceses;
import org.example.userdefinepractice.entity.UserDetails;
import org.example.userdefinepractice.staticdata.Staticdatastorage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Productinfo {

    public static void main(String[] args) {
        Staticdatastorage s = new Staticdatastorage();

        List<UserDetails> userList = s.getUserDetailsList().stream()
                .map(user -> new UserDetails(
                        user.getId(),
                        user.getName(),
                        user.getEmail(),
                        user.getServiceses()
                                .stream().map(service -> new Serviceses(
                                        service.getId(),
                                        service.getServiceName(),
                                        service.getCost(),
                                        service.getDescription()
                                )).collect(Collectors.toList()),
                        user.getProducts()
                ))
                .collect(Collectors.toList());

        //System.out.println(userList);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(userList);
      //  System.out.println(json.toString());

        List<Products> electronicsProducts = userList.stream()
                .flatMap(user -> user.getProducts().stream()) // flatten all products from all users
                .filter(product -> product.getProductCategory().equalsIgnoreCase("Electronics"))
                .distinct()// filter by category
                .collect(Collectors.toList()); // collect result
        Map<String, Object> payload = new HashMap<>();
        payload.put("products", electronicsProducts);
        String json1 = gson.toJson(payload);
     //   System.out.println(json1.toString());


        List<String> acat = new ArrayList<>();
        Map<String, Object> payload1 = new HashMap<>();
        Map<String,Products> poo = new HashMap<>();
        for ( UserDetails po : userList){
            if (po.getName().contains("Kavin")){
                acat.add(po.getName());
                for (Products p : po.getProducts()){
                    if (p.getProductCategory().equalsIgnoreCase("Electronics")){

                        poo.put(p.getProductName(),p);

                    }

                }
            }
        }

        payload1.put(acat.toString(), poo);
        String json2 = gson.toJson(payload1);
        System.out.println(json2.toString());
    }


}
