import java.util.Arrays;

public class HackerRank {
    public static void main(String[] args) {
        String s = "Good luck with this case!!! h  pk_v toef__";
        // Write your code here.
        String[] ArrayS = s.split(" ");
        String Symbols = "_-!@;'?.,";
        System.out.println(Arrays.toString(ArrayS));
        String newS = "";
        for(int i = 0; i < ArrayS.length; i++){
            if (!(ArrayS[i] == "")){
                for(int j = 0; j < ArrayS[i].length(); j++){
                    if((i+1) < ArrayS.length && (j+1) < ArrayS[i].length()){                        
                        if((ArrayS[i+1] == "" && Symbols.contains(Character.toString(ArrayS[i].charAt(j)))) || (Symbols.contains(Character.toString(ArrayS[i].charAt(j)))) && (Symbols.contains(Character.toString(ArrayS[i].charAt(j+1))))){ 
                            newS += "";
                        }
                        else if (Symbols.contains(Character.toString(ArrayS[i].charAt(j)))){
                            newS += " ";
                        }
                        else{
                            newS += ArrayS[i].charAt(j);
                        }
                    }
                    else if(!Symbols.contains(Character.toString(ArrayS[i].charAt(j)))){
                        newS += ArrayS[i].charAt(j);
                    }
                }   
                newS += " ";
            }
        }
    System.out.println(newS.split(" ").length);  
    for(String EACH: newS.split(" ")){
        System.out.println(EACH);
    }
    }
}
