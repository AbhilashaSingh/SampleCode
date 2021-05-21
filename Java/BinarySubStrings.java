public class BinarySubStrings {
    public static int countBinarySubstring(String s){
    int prevBlock = 0;
    int curBlock = 1;
    int binarySubs = 0;
    char current = s.charAt(0);

    for(int i=1; i<s.length();i++){
        if(s.charAt(i) == current){
            curBlock ++;
        }
        else{
            binarySubs += Math.min(prevBlock, curBlock);
            prevBlock = curBlock;
            curBlock = 1;
        }
        current = s.charAt(i);
    }
    binarySubs+=Math.min(prevBlock,curBlock);
    return binarySubs;
    }


    public static int countBinarySubstrings(String s)
    {
        int binarySubs = 0;
        int curBlock = 1;
        int prevBlock = 0;
        for (int i = 1; i < s.length(); i++){
            if (s.charAt(i) != s.charAt(i - 1))
            {
                prevBlock = curBlock;
                curBlock = 1;
                binarySubs++;
            }
            else{
                curBlock++;
                if (curBlock <= prevBlock)
                    binarySubs++;
            }
        }
        return binarySubs;
    }


    public static void main(String args[]){
        System.out.println(countBinarySubstrings("10101"));
    }

}
