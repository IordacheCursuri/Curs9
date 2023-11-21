package com.itFactory.exercitii;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exercitiu2 {

    public static void main(String[] args) {

        List<Integer> list = List.of(1, 2, 4, 6, 8, 8);


//        List<Integer> list2 = new ArrayList<>();
//        list2.add(1);
//        list2.add(2);
//        list2.add(4);
//        list2.add(6);
//        list2.add(8);
//        list2.add(8);

        findDuplicate(list);

    }


    public static void findDuplicate(List<Integer> intgerList){
        Set<Integer> set = new HashSet<>();

        for (Integer x: intgerList) {

            boolean esteAdaugat = set.add(x);

            if(esteAdaugat){
                System.out.println("a fost adaugat in set numarul: " + x);
            } else {
                System.out.println("Numarul duplicat este: " + x);
            }

        }

    }




}
