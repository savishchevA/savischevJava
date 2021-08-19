package src;
import java.util.Scanner;

public class Task3 {
        Scanner console = new Scanner(System.in);

        public void runTask3() {

            System.out.print("Введите длину массива: ");
            int arrayLength = console.nextInt();

            int[] array = new int[arrayLength];
            System.out.print("Введите массив: ");
            for (int i = 0; i < arrayLength; i++) {
                array[i] = console.nextInt();
                if (array[i] % 3 == 0) {
                    System.out.println(array[i]);
                }
            }
        }
}


