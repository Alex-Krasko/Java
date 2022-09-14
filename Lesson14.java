import java.util.Scanner;

public class Lesson14{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String line = sc.nextLine();
        sc.close();
        if ( line.isEmpty() ){
            throw new RuntimeException("Нельзя вводить пустую строку");
        }
        System.out.println("Вы ввели: " + line);
    }
}