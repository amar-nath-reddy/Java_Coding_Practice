package org.example.streams.stremssupereasy;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class UnderstandingStreams {

    public static void main(String[] args) {

    //how to implement the Streams
        List<String> names = Arrays.asList("ben","Ravi","kavi");
        List<String> listof_Streams = names.stream().collect(Collectors.toList());
        System.out.println("Streams are coller to list :"+listof_Streams);


    }
}
