import java.util.*;
import java.io.*;

import static java.lang.Math.pow;

class hk7{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            in.nextLine();
            int temp=a;
            for(int j=0;j<n;j++){
                double temp1=Math.pow(2,j)*b;
                temp+=(int)temp1;

                System.out.print(temp+" ");
            }
            System.out.println();
        }
        in.close();
    }
}