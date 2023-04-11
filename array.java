import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] num = new int[10];
        for(int i=0;i<10;i++){
            num[i]=sc.nextInt();
        }
        for(int i=0;i<10;i++){
            System.out.println("The number is : "+num[i]);
        }
        sc.close();

        int []  number = {1,2,3,4,5,6,7,9};
        for(int i=0;i<number.length;i++){
            System.out.println(number[i]);
        }
        
        for(int ele:number){
            System.out.println(ele);
        }
    }
}
