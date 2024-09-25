package example.sample;

public class TESTONG {
    public static void main(String[] args) {
        String str="004 7163-A18-22|2220047163";

        String[] split = str.split("\\|");
        for (String s : split) {
            System.out.println(s);
        }

    }
}
