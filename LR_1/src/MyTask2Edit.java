import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MyTask2Edit {
    private ArrayList<Double> aa = new ArrayList<>();
    private int N;

    //Заполнение массива числами
    public void InputArray() {
        aa.clear();
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество чисел > ");
        N = sc.nextInt();

        double a;
        for (int i = 0; i < N; i++) {
            System.out.print("Введите число " + String.valueOf(i+1) + " > ");
            a = sc.nextDouble();
            aa.add(a);
        }
        sc.close();
    }

    //Печать результата вычисления
    public void PrintResult() {
        double b = 0;
        Collections.sort(aa);
        System.out.println("Результат вычисления: ");
        b = (aa.get(aa.size() - 1) * aa.get(aa.size() - 1)) + (aa.get(aa.size() - 2) * aa.get(aa.size() - 2));
        System.out.println(b);
    }
}
