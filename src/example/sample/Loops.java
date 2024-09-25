package example.sample;

import java.util.Arrays;

public class Loops {
    public static void main(String[] args) {
        int temp;
        int b[]={44,66,99,77,33,22,55};
        for (int i = 0; i < b.length; i++)
        {
            for (int j = i + 1; j < b.length; j++)
            {
                if (b[i] > b[j])
                {
                    temp = b[i];
                    b[i] = b[j];
                    b[j] = temp;
                }
                System.out.println(Arrays.toString(b));
            }
            System.out.println("i loop "+ " "+ Arrays.toString(b));
        }
    }
}
