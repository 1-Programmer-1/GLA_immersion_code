public class ArmstrongNumQ4 {
    public static void main(String[] args) {
        int num=153;
        System.out.println(armstrongNumber(num));
    }
    static String armstrongNumber(int n){
        int sum=0;
        int k=n;
        String str=n+"";
        int len=str.length();
        while(k>0){
            int r=k%10;
            sum=sum+(int)Math.pow(r,len);
            k=k/10;
            
        }
        if(sum==n){
            return "Yes";
        }
        return "No";
        
    }
}
