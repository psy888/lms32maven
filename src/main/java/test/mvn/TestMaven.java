package test.mvn;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;

import java.util.List;

public class TestMaven {
    public static void main(String[] args) {
        List<String> fruits = Lists.newArrayList("banana", "kiwi", "orange");
        fruits.forEach(System.out::println);

        List<String> reverseFruits = Lists.reverse(fruits);
        reverseFruits.forEach(System.out::println);


        Multimap<String,String> multimap = ArrayListMultimap.create();
        multimap.put("key","1st value");
        multimap.put("key","2nd value");
        System.out.println(multimap);
    }
}
