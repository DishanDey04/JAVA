import java.util.Scanner;
public class strings {
    public static void main(String[] args) {
        String name = new String("Dishan Dey");
        System.out.println(name);
        String name2 = "Dishan";
        System.out.println(name2);
        Scanner sc = new Scanner(System.in);
        String name3 = new String(sc.next());
        System.out.println(name3);
        String name4 = sc.nextLine();
        System.out.println(name4);
        sc.close();
    }
}
