package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
       int[] arr = {7,7,7,7,7,7,7};
        //List<Integer> li = new ArrayList<>();

        HashMap<Integer, Integer> kv = new HashMap<Integer, Integer>();
        int v=0;
        for (int i = 0; i < arr.length; i++) {
            if (kv.containsKey(arr[i])) {
                v=kv.get(arr[i])+1;
            } else v=1;
            kv.put(arr[i], v);
        }

        int result=-1;
        for (int key:kv.keySet()) {
            if (key == kv.get(key)) {
               // li.add(key);
                result = Math.max(result, kv.get(key));
            }
        }


/*
        if (li.size() > 0) {
            for (int i:li) {
                if(i>result)
                    result=i;
            }
        }
*/

        System.out.println(result);

        System.out.println(kv);
    }
}
