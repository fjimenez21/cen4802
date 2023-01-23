/**
Fernando Jimenez CEN4802
*/
import java.util.Scanner;

public class FibonnacciMain {
    public static int nthterm(int n){
        if(n==0)return 0;
        if(n==1 || n==2) return 1;
        return nthterm(n-1)+nthterm(n-2);
    }
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number: "); //Ask user for input
        int n = reader.nextInt(); 
        System.out.println("The "+n+"th term of the sequence is "+nthterm(n)); //Takes value of N determined by the user to run the nthterm proccess-
    }
}
