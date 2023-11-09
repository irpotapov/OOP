import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class MyTask {
    public static void DoTask() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество чисел > ");
        int N = sc.nextInt();

        double a;
        ArrayList<Double> aa = new ArrayList<>();

        //Заполнение списка числами
        for (int i = 0; i < N; i++) {
            System.out.print("Введите число " + String.valueOf(i+1) + " > ");
            a = sc.nextDouble();
            aa.add(a);
        }

        //Сортировка массива введённых чисел
        Collections.sort(aa);

        double b = 0;
        System.out.println("Результат вычисления: ");
        //Вывод результата вычисления
        b = (aa.get(aa.size() - 1) * aa.get(aa.size() - 1)) + (aa.get(aa.size() - 2) * aa.get(aa.size() - 2));
        System.out.println(b);

        sc.close();
    }
}
