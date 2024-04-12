//Вычислить n-ое треугольного число(сумма чисел от 1 до n).
//Внутри класса Answer напишите метод countNTriangle, который принимает число n и
//возвращает его n-ое треугольное число.
//Если число n < 1 (ненатуральное) метод должен вернуть -1
import java.util.Scanner;
public class Main {
    public void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int number = scn.nextInt();
        countNTriangle(number);
        System.out.println(STR."N-ое треугольное число для вашего числа = \{countNTriangle(number)}");
    }
    public int countNTriangle(int n){
        if(n<1){
            return -1;
        }
        else {
            return n * (n + 1) / 2;
        }
    }

}