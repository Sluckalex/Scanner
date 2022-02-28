public class summassiv {
    public static class SumArray{
        public static void main(String args[]){
            int[] array = {5, 10, 0, 20, 10, -5};
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum=array[i] + sum;
            }
            System.out.println("Сумма элементов массива = " + sum);
        }
    }
}
