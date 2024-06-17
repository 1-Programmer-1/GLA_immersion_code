import java.util.Scanner;

public class problem_1899A_Q8 {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while (n-->0) {
            int k=sc.nextInt();
            System.out.println(solve(k));
            
        }
    }
    public static String solve(int k){
        if((k+1)%3==0 || (k-1)%3==0){
            return "First";
        }
        else{
            return "Second";
        }

    }
    
}
