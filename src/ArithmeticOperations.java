public class ArithmeticOperations {

    public static void main(String[] args) {
        int a = 5;
        int b = 11;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(b/a);
        System.out.println(b%a);

        printResult(2+5);
        printResult(add(a,b));
    }

    public static void printResult(int result){
        System.out.println(result);
    }

    public static int add(int a, int b){
        return a+b;
    }
}
