public class Calculator {

    public static void main(String[] args) {
        int a = 10;
        int b = 16;

        printResult(add(a,b));
        printResult(sub(a,b));
        printResult(div(a,b));
        printResult(mul(a,b));
        printResult(mod(a,b));
    }

    public static int add(int a, int b){
        return a+b;
    }

    public static int sub(int a, int b){
        return a-b;
    }

    public static int div(int a, int b){
        return a/b;
    }

    public static int mul(int a, int b){
        return a*b;
    }

    public static int mod(int a, int b){
        return a%b;
    }

    public static void printResult(int result){
        System.out.println(result);
    }
}
