public class MethodArray {
    public static void main(String[] args) {
        int[] array = {2, 4, -6, 9, 21,77};
       // int sum = 0;
        int sumValues = 0;
        int sumIndexes = 0;

        for (int index = 0; index < array.length; index++) {
            sumValues += array[index];//это значение ячеек
            sumIndexes += index;//это сумма индексов ячеек

           // sum += array[i];


        }
       //System.out.println(array[2]);
       //System.out.println(2);
       // System.out.println(sum);
        System.out.println(sumValues);
        System.out.println(sumIndexes);



    }
}
