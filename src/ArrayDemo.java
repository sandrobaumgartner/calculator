public class ArrayDemo {

    public static void main(String[] args) {
        double[] articles = new double[5];

        articles[0] = 2.4;
        articles[1] = 2.0;
        articles[2] = 2.9;

        double sum = 0;
        for(int i = 0; i < articles.length; i++){
            sum += articles[i];
        }

        System.out.println(sum);
    }
}
