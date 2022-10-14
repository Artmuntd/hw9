public class Main {
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void main(String[] args) {
        System.out.println("задача 1");
        int[] arr = generateRandomArray();
        double sum = 0;
        for( int element : arr) {
            sum+= element;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        System.out.println("задача 3 ");
        double sum1 = 0.00;
        for( int element : arr) {
            sum1 = sum/ arr.length;

        }
        System.out.println("Средняя сумма трат за месяц составила " + sum1 + " рублей");
        System.out.println("задача 2");
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i<arr.length; i++){
            if( min > arr[i]){
                min=arr[i];
            } else {
                for (int y = 0; y>arr.length; y++ ){
                    if( max > arr[y]){
                        max=arr[y];
                    }
                }
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. Максимальная сумма трат за день составила " + max + " рублей");
        System.out.println("зачада 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for( int i = reverseFullName.length - 1; i>=0; i--){
            System.out.print(reverseFullName[i]);
        }
    }
}