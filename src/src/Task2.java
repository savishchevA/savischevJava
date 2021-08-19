package src;
import java.util.Scanner;

public class Task2 {
        Scanner console = new Scanner(System.in);

        public void runTask2(){

        System.out.print("Введите имя: ");
        String name = console.nextLine();

        if(name.equals("Вячеслав")){
            System.out.println("Привет, Вячеслав");
        }else System.out.println("Нет такого имени");
        }
}
