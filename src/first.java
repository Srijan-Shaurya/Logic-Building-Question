import java.util.Scanner;
//Take a number and print whether it’s positive, negative, or zero.
public class first {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This Program Will Help You To Find Out Whether The Number is Positive, Negative Or Zero");
        System.out.print("Enter The Number: ");
        int num = input.nextInt();
        if(num>0){
            System.out.println("Positive");
        }
        else if(num<0){
            System.out.println("Negative");
        } else{
            System.out.println("Zero");
        }
    }
}
