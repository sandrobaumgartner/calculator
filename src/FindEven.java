public class FindEven {

    public static void main(String[] args) {
        int number = 10;
        int count = 1;

        while(count <= number){
            if(count % 2 == 0){
                System.out.println(count);
            }
            count++;
        }
    }
}
