package stream_api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Solution {
    public static void main(String[] args) {
        String[] array = {"Abc", "CDEV", "MNBVCXZ", "lkjhs"};
//        Arrays.stream(array).filter(a -> a.length() < 7).forEach(System.out::println);
//       String withMaxLength =  Arrays.stream(array).max(Comparator.comparingInt(String::length)).get();
//        System.out.println(withMaxLength);
//        Arrays.stream(array).map(String::length).forEach(System.out::println);
        secondMethod(a -> a.length() < 7, array);
    }

    public static void secondMethod(Predicate<String> predicate, String[] strings){

       var list = Arrays.stream(strings).filter(predicate).toList();
        System.out.println(list.size());
    }
}
