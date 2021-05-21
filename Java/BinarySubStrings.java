/*Given a binary string s, return the number of non-empty substrings that have the same number of 0's and 1's, and all the 0's and all the 1's in these substrings are grouped consecutively.
        Substrings that occur multiple times are counted the number of times they occur.
        Input: s = "00110011"
        Output: 6
        Explanation: There are 6 substrings that have equal number of consecutive 1's and 0's: "0011", "01", "1100", "10", "0011", and "01".
        Notice that some of these substrings repeat and are counted the number of times they occur.
        Also, "00110011" is not a valid substring because all the 0's (and 1's) are not grouped together.

        Input: s = "10101"
        Output: 4
        Explanation: There are 4 substrings: "10", "01", "10", "01" that have equal number of consecutive 1's and 0's.
*/
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
