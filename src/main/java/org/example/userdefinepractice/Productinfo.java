package org.example.userdefinepractice;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.example.userdefinepractice.entity.Products;
import org.example.userdefinepractice.entity.Serviceses;
import org.example.userdefinepractice.entity.UserDetails;
import org.example.userdefinepractice.staticdata.Staticdatastorage;

import java.util.List;
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
        System.out.println(json.toString());


    }


}
