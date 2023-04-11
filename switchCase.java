import java.util.Scanner;
public class switchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int number = sc.nextInt();
        switch (number) {
            case 1:
                System.out.println("it's 1");
                break;
            case 2:
                System.out.println("it's 2");
                break;
            default:
                System.out.println("numner is not in the list...");
                break;
        }
        sc.close();
    }
}
