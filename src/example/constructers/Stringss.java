package example.constructers;

import java.util.HashMap;
import java.util.Map;

public class Stringss {
    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder("naresh");
        StringBuilder rrr = builder.append("rrr");
        System.out.println(rrr);
        System.out.println(builder);

        StringBuffer stringBuffer = new StringBuffer("jjjj");
        stringBuffer.append("nnn");
        System.out.println(stringBuffer);

        String str= new String("naresh");
        System.out.println("string contains"+str.contains("a"));
        str=str.concat("reddy");
        System.out.println(str);
        String str2="Naresh";
        String st3="nareshasaaa";
        String st="";
        //==
        //.equal
        String stlower=str2.toLowerCase();
        String stup=str2.toUpperCase();
        System.out.println(stlower);
        System.out.println(str.charAt(3));




    }
}
