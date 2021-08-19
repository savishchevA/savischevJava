package src;
import java.util.Scanner;

public class Task1 {

       Scanner console = new Scanner(System.in);
       public void run(){
           System.out.print("Введите число: ");

            int number = console.nextInt();

            if(number>7){
            System.out.println("Привет");
            }}

public static void main(String[] args) {
        Task1 task1 = new Task1();
        task1.run();
        Task2 task2 = new Task2();
        task2.runTask2();
        Task3 task3 = new Task3();
        task3.runTask3();
        }
}
