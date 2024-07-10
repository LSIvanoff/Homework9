public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10_000) + 10_000;
        }
        return arr;
    }


    public static void task1() {
        System.out.println("Task 1");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int a = 0; a < arr.length; a++) {
            sum += arr[a];
            System.out.println(arr[a]);
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей \n");
    }


    public static void task2() {
        System.out.println("Task 2");
        int[] arr2 = generateRandomArray();
        int max = arr2[0];
        int min = arr2[0];
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
            if (arr2[i] > max) {
                max = arr2[i];
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] < min) {
                min = arr2[i];
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + min + " рублей. Максимальная сумма трат за неделю составила " + max + " рублей \n");
    }


    public static void task3() {
        System.out.println("Task 3");
        int[] arr3 = generateRandomArray();
        double sum = 0;
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
            sum += arr3[i];
        }
        System.out.println("Средняя сумма трат за месяц составила " + sum / 2 + " рублей \n");
    }


    public static void task4() {
        System.out.println("Task 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}