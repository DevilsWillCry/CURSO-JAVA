package Ejercicios_Java;

import java.util.Scanner;

public class JavaOutputFormating {
    public static void main(String[] args) {
            int Blank_Space = 15;
            String Formating = "";
            Scanner sc=new Scanner(System.in);
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                //Complete this line
                Formating += s1;
                for (int j=0; j < (Blank_Space - s1.length()-1); j++){
                    Formating += " ";
                }
                if (x >= 100){
                    Formating += x;
                }
                else if((Integer.toString(x).length() == 2)){
                    Formating += "0"+x;
                }
                else{
                    Formating += "00" + x;
                }
                if (i != 2){
                    Formating += "\n";
                }
            }
            System.out.println("================================");
            System.out.println(Formating);
            System.out.println("================================");
            sc.close();

    }
}
