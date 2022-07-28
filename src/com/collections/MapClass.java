package com.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapClass {
    public static void main(String[] args) {
        //Map<Integer(key),String(value)>
        // map is combination of key value pair, map of key doesnot allows duplicate values if you try to give
        //duplicate key it will consider as single eliment and second time given values will be override(replace) the first value
         //map doesnt alow key as null but it will accepet one time value as null

        Map<Integer,String > map= new HashMap<>();
        map.put(1,"naresh");//put method used to insert the elements into map as put(key,value);
        map.put(1,"java");// in this situvation map already contains key as 1 right so duplication is not allowed based on hasing mechanisum in this case key of 1 value is naresh will be replaced by java so if you print key 1 value will be java.
        map.put(2,"k");
        map.put(3,"something");
        map.remove(3);//this one used to remove the key of 3 from map if you dont know the value of 3 you can use this always preferable
        map.remove(3,"something");// this one if you have an idea of key, value then you can use this one in case key correct value worng or value correct key worng in this case this method wont work

        boolean maps=map.containsKey(2);// this method will give you true or false in the situvation of if you want find weather the map having same key already or not checking case we will use this
        Set<Map.Entry<Integer, String>> entries = map.entrySet();//this method will give you all set of key and value pair using this method we can extract the keys and values

        for (Map.Entry<Integer, String> m: entries) {
            Integer key=m.getKey();// this will give you the key eliment
            String value=m.getValue();// this method will give the value of respective key
            System.out.println("Key"+key+" "+"values"+value);
        }
    }
}
