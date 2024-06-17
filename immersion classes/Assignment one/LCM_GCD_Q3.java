import java.util.Arrays;

public class LCM_GCD_Q3 {
    public static void main(String[] args) {
        Long A=(long)20;
        Long B=(long)5;
        System.out.println(Arrays.toString(lcmAndGcd(A, B)));
    }
    static Long[] lcmAndGcd(Long A , Long B) {
        Long c=A;
        Long d=B;
        Long [] arr=new Long[2];
        while(A>0 && B>0){
        
            if(A>0){
                A=A%B;
            }
            else{
                B=B%A;
            }
            
        }
        if(A==0){
            arr[0]=(c*d)/B;
            arr[1]=B;
            
        }
        if(B==0){
            arr[0]=(c*d)/A;
            arr[1]=A;
            
        }
        return arr;
        
        
    }
    
}
