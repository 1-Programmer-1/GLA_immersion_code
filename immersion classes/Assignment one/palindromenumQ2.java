public class palindromenumQ2 {
    public static void main(String[] args) {
        int num=121;
        System.out.println(isPalindrome(num));
        
    }
    public static boolean isPalindrome(int x) {
        int y=x;
        int ans=0;
        while(x>0){
            int r=x%10;
            ans=ans*10+r;
            x=x/10;
        }
        return ans==y ;

        
    }
}
