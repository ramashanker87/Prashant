package com.prashant.app;
import java.util.*;
public class Lists {

    //Normal list
    public void arrayList(){
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4));
        list.add(7);
        list.add(5,6);
        System.out.println(list);
    }


}
