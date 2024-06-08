public class MethodArraySum {
    public static void main(String[] args) {
        int[] array = {4, 8, 3, 9};
        int sum = 0;

        int result = sumOfALLElements(array);
        System.out.println(result);

        int[] array2 = {22, 33, 44, 66};
       int result2 = sumOfALLElements(array2);
        System.out.println(result + result2);
       // for (int i = 0; i < array.length; i++) {
       //     sum += array[i];
//
       // }
       // System.out.println(sum);

    }
    public static int sumOfALLElements(int[] a){
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            
        }
        return sum;
        
    }
}
