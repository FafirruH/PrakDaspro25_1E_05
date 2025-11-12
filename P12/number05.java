package P12;

import java.util.Arrays;

public class number05 {
    public static void main(String[] args) {
        int[][] myNumber05=new int[3][];
        myNumber05[0]=new int[5];
        myNumber05[1]=new int[3];
        myNumber05[2]=new int[1];
        for (int i = 0; i < myNumber05.length; i++) {
            System.out.println(Arrays.toString(myNumber05[i]));
        }
    }
}
