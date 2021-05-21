public class BalancedStringSplit {
    public static int balancedStringSplit(String s) {
        int balancer  = 0;
        int counter = 0;
        for(int i=0;i<s.length();i++){
            if(Character.compare(s.charAt(i), 'L') > 0){
                balancer ++;
            }else{
                balancer --;
            }
            if(balancer == 0){
                counter ++;
            }
        }
        return counter;
    }

    public static void main(String args[]){
        System.out.print(balancedStringSplit("LLLLLLRRRRRR"));
    }
}
