import java.util.Scanner;
//Check if a number is even or odd.
public class Second {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome To Odd Even Identifier");
        System.out.print("Enter the Number: ");
        int n = input.nextInt();
        if(n%2==0){
            System.out.println("Even");
        } else{
            System.out.println("Odd");
        }
    }
}
