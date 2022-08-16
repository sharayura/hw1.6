import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int days = 30;
        int[] spendArray = generateRandomArray(days);

        //Задание 1
        int spendSumm = 0;
        for (int i : spendArray) {
            spendSumm += i;
        }
        System.out.println("Сумма трат за месяц составила " + spendSumm + " рублей.");

        // Задание 2

        int spendMin = spendArray[0];
        int spendMax = spendArray[0];
        for (int i = 1; i < spendArray.length; i++) {
            if (spendArray[i] < spendMin) {
                spendMin = spendArray[i];
            }
            if (spendArray[i] > spendMax) {
                spendMax = spendArray[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + spendMin + " рублей. Максимальная сумма трат " +
                "за день составила " + spendMax + " рублей.");

        //Задание 3

        System.out.println("Средняя сумма трат за месяц составила " + (float) spendSumm / days + " рублей.");

        //Задание 4

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();


        //Задание 5*
        System.out.println();

        int matrixSize = 3;
        int[][] matrix = new int[matrixSize][matrixSize];
        for (int i = 0; i < matrixSize; i++) {
            matrix[i][i] = 1;
            matrix[i][matrixSize - 1 - i] = 1;
        }
        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }

        //Задание 6*
        System.out.println();

        int[] arr = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(arr));
        int[] arr1 = new int[arr.length];
        arr1 = arr.clone();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr1[arr1.length - 1 - i];
        }
        System.out.println(Arrays.toString(arr));

        //Задание 7*
        System.out.println();

        int[] arr2 = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(arr2));
        int temp;
        for (int i = 0; i < arr2.length / 2; i++) {
            temp = arr2[i];
            arr2[i] = arr2[arr2.length - 1 - i];
            arr2[arr2.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(arr2));

        //Задание 8*
        System.out.println();
        int[] arr3 = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        int num1 = 0;
        int num2 = 0;
        exit:
        for (int i = 0; i < arr3.length - 1; i++) {
            for (int j = i + 1; j < arr3.length; j++) {
                if (arr3[i] + arr3[j] == -2) {
                    num1 = arr3[i];
                    num2 = arr3[j];
                    break exit;
                }
            }
        }
        if (num1 != 0 && num2 != 0) {
            System.out.println(num1 + ", " + num2);
        } else {
            System.out.println("Заданные числа не найдены.");
        }

        //Задание 9*
        System.out.println();
        int[] arr4 = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        int[] numArr = new int[arr4.length];
        int index = 0;
        Arrays.sort(arr4);
        for (int i = 0; i < arr4.length - 1; i++) {
            for (int j = arr4.length - 1; j > i; j--) {
                if ((arr4[i] + arr4[j] < -2) || (arr4[i] > -1)) {
                    break;
                }
                if (arr4[i] + arr4[j] == -2) {
                    numArr[index] = arr4[i];
                    numArr[index + 1] = arr4[j];
                    index += 2;
                }
            }
        }
        if (numArr[0] == 0) {
            System.out.println("Заданные числа не найдены.");
        }
        for (int i = 0; i < numArr.length; i += 2) {
            if (numArr[i] == 0) {
                break;
            }
            System.out.println(numArr[i] + ", " + numArr[i + 1]);
        }

    }

    public static int[] generateRandomArray(int l) {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[l];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}

