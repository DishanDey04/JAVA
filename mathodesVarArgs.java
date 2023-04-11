public class mathodesVarArgs {
    static int sumVarArgs(int ...arr){
        int sum=0;
        for(int i:arr){
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sumVarArgs(1,1,1,1,1));
    }
}
