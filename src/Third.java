import java.util.Scanner;
//Check if a number is divisible by 5.
public class Third{
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome! to Divisibility Checker for 5");
        System.out.println("Enter The Number: ");
        int n = input.nextInt();
//        Here I have used ternary Conditional Operator
        String Status = n%5==0 ? "Divisible by 5" : "Not divisible by 5";
        System.out.println(Status);
    }
}