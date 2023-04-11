import java.util.Scanner;
public class userInput {
    public static void main(String[] args) {
        int number1,number2;
        System.out.println("reading data from keyboard...");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a integer : ");
        number1 = sc.nextInt();
        number2 = sc.nextInt();
        System.out.println(number1 + number2);
        sc.close();
    }
}
