
public class HackerRank2 {
    public static void main(String[] args) {
        String s = "Good luck with this case!!! h  pk_v toef__";

        s = removeLeadingNonLetters(s);
        System.out.println(s);

        /* Check special cases */
        if (s.length() == 0) {
            System.out.println(0);
            return;
        }
        /* Split on all non-alphabetic characters */
        String[] words = s.split("[^a-zA-Z]+");
        
        System.out.println(words.length);
        for(String word : words) {
            System.out.println(word);
        }
    }

    private static String removeLeadingNonLetters(String str) {
        int i;
        for (i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                break;
            }
        }
        return str.substring(i);
    }    
}
