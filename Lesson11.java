import java.util.Scanner;


public class Lesson11 {
    public static void main(String[] args) {
        System.out.println("Введено: " + GetNum());
    }

    public static float GetNum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        float num = 0;
        try {
            num = sc.nextFloat();
        } catch (Exception e){
            System.out.println("Некорректный ввод. Повторите попытку.");
            num = GetNum();
        } 
        sc.close();
        return num;
    }
}