package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> l=new ArrayList<Integer>();
        l.add(8);
        l.add(4);
        l.add(33);
        l.add(7);
        l.add(9);
        l.add(16);
        List<Integer> l1=l.stream().filter(i ->i%2==0 ).collect(Collectors.toList());
        System.out.println("even numbers using stream are: "+l1);
        List<Integer> l2=l.stream().filter(i ->i%2!=0 ).collect(Collectors.toList());
        System.out.println("odd numbers using stream are: "+l2);
        System.out.println("prime numbers using stream are: "+l.stream().filter(Main::isPrime).collect(Collectors.toList()));}
        public static boolean isPrime(int number) {
            return !IntStream.rangeClosed(2, number/2).anyMatch(i -> number%i == 0);
        }


    }
