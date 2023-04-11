import java.util.Scanner;
public class multiDimArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] array2Dim = new int[3][3];
        System.out.println("Enter numbers : ");
        for(int i=0;i<array2Dim.length;i++){
            for(int j=0;j<array2Dim[0].length;j++){
                array2Dim[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<array2Dim.length;i++){
            for(int j=0;j<array2Dim[0].length;j++){
                System.out.print(array2Dim[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
