package org.example;

import java.util.HashMap;
import java.util.Map;

public class HashMapHighestValue {

    static void meth(){
        Map<Integer,Integer> mp = new HashMap();
        mp.put(1,100);
        mp.put(2,200);
        mp.put(3,600);
        mp.put(4,400);
        mp.put(5,500);

        int max = 0;
        int id = 0;

        for(Map.Entry<Integer,Integer> jh : mp.entrySet()){
            int  value = jh.getValue();

            if(value> max){

                max=value;
                id=jh.getKey();

            }
        }

        System.out.println(id + ","+max);
    }


    public static void main(String[] args) {
      //  HashMapHighestValue.meth();
        int j=0;
        Map<Integer ,Integer> m = new HashMap<>();
        int[] a = {2,3,4,5,6};
        for(int i =0;i<a.length;i++){
            m.put(++j,a[i]);
        }
        System.out.println(m);
    }
}
