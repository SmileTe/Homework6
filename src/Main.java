import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
    }

    public static void task1() {
        int array [] = generateRandomArray();
        int sum = 0;
        for (int i:array) {
            sum+=i;
        }

        System.out.println("Сумма трат за месяц составила "+ sum+ " рублей");

    }
    public static void task2() {
        int array [] = generateRandomArray();
        int min = array[0];
        int max = array[0];
        for (int i:array) {
            if(min>i){
                min = i;
            }
            if(max<i){
                max = i;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " +
                min + " рублей. Максимальная сумма трат за день составила " +
                max +  " рублей");

    }
    public static void task3() {
        int array [] = generateRandomArray();
        int sum = 0;
        for (int i: array
        ) {
            sum+=i;
        }
        float average = (float)sum/ (array.length);
        System.out.println("Средняя сумма трат за месяц составила "+average+ " рублей");
    }
    public static void task4() {
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >=0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println("");
    }
    public static void task5() {
        int[][] matrix = new int[3][3];
        for(int i =0; i<matrix.length; i++) {
            matrix[i][i]=1;
        }

        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }

    }
    public static void task6() {
        int[] array = {5, 4, 3, 2, 1};
        int[] array2 =new int[array.length];

        for (int i = array.length-1, j=0; i>=0; i--, j++){
            array2[j] = array[i];

        }
        System.out.println(Arrays.toString(array2));

    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}