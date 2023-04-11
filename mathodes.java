public class mathodes {
    static int sum(int a,int b){        
        return a+b;
    }
    int mul(int a, int b){
        return a*b;
    }
    public static void main(String[] args) {
        System.out.println(sum(4, 5));
        mathodes object = new mathodes();
        System.out.println(object.mul(4, 10));
    }
}
