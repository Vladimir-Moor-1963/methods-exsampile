public class MethodExample {
    public static void main(String[] args) {
        sum(2,3);
        int answer = sum2(2,3);
        System.out.println("Ответ равняется");
        System.out.println(answer);
        System.out.println("Ответ + 2 = ");
        System.out.println(answer + 2);


    }

    public static void sum(int a, int b){
        int c = a + b;
        System.out.println(c);

    }
    public static int sum2(int a, int b){
        int c = a + b;
        return c;
    }





}
