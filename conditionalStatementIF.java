import java.util.Scanner;
class conditionalStatementIF{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Eneter any number : ");
        int number = sc.nextInt();
        if (number>10) {
            System.out.println("The number is greter than 10...");
        }
        else if (number == 10){
            System.out.println("The number is equal to 10...");
        }
        else{
            System.out.println("The number is less than 10...");
        }
        sc.close();
    }
}