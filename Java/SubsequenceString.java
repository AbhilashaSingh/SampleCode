public class SubsequenceString {
    public static boolean subsequencePossible(String s, String t){
        int j = 0;
        int i = 0;
        while(i<t.length() && j<s.length()){
            if(t.charAt(i) == s.charAt(j)){
                j++;
            }
            i++;
        }
        return j == s.length();
    }
    public static void main(String args[]){

    System.out.println(subsequencePossible("abc","sdsfdsf"));

    }
}
