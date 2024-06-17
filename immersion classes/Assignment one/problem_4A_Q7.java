import java.util.Scanner;

public class problem_4A_Q7 {
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(solve(n));
    }
    public static String solve(int n){
        if(n==2){
            return "NO";
        }
        else if(n%2==0){
            return "YES";
        }
        return "NO";
    }
    
}
