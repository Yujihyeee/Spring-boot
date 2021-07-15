package com.example.demo.util.service;

import java.util.function.Consumer;
import java.util.function.Function;

public class LambdaUtils {
    public static Consumer<String> print = System.out::print;
    public static Function<Object, String > string = String::valueOf;
    public static Function<String , Integer> strToInt = Integer::parseInt;
}
