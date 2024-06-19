package Ejercicios_Java;

import java.util.Scanner;

public class JavaLoopsII {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int c = 1;
            int PrevState = 0;
            for (int j = 0; j < n; j++){
                if (a == 0){
                    PrevState = (int)PrevState + (a+(c*b));
                }
                else if(a != 0 && j == 0){
                    PrevState = (int)PrevState + (a+(c*b));
                }
                else{
                    PrevState = (int)PrevState + ((c*b));
                }
                System.out.print(PrevState + " ");
                c *= 2;
            }
        }
        in.close();
    }
}
