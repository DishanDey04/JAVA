public class mathodesOverloading {
    static int sum(int a,int b){
        return a+b;
    }
    static int sum(int a,int b,int c){              // overloading of mathodes...
        return a+b+c;
    }
    public static void main(String[] args) {
        System.out.println(sum(2, 3));
        System.out.println(sum(2, 3, 4));
    }
}
