import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        УчётОборудования учёт = УчётОборудования.Инициализация();
        int операция = 0;
        do {
            System.out.print("Выберите операцию: \n1 - Вывод списка всего оборудования\n"
                    + "2 - Вывод списка оборудования по отделу\n" + "3 - Внести оборудование\n" + "0 - Выход\n Ваш выбор > ");
            операция = sc.nextInt();
            sc.nextLine();
            switch (операция) {
                case 1: учёт.СписокОборудования(); break;
                case 2:
                    учёт.ВыводСпискаПоОтделам(sc, учёт);
                    break;
                case 3:
                    Оборудование новоеОборудование = new Оборудование();
                    новоеОборудование.название = new ArrayList<>();
                    новоеОборудование.название.add(УчётОборудования.ЗаписьНазваниеСостояниеТип(sc));
                    учёт.ВносОборудования(новоеОборудование);
                    break;

                default: break;
            }
        } while (операция != 0);

        sc.close();
        System.out.println("Программа завершила свою работу!");
    }
}

/*         Scanner sc = new Scanner(System.in);
        Библиотека мояБиблиотека = Библиотека.Инициализация();
        System.out.println("Библиотека готова к работе!");
        System.out.println("Идентификация читателя: ");
        System.out.print("ФИО > ");
        String фиоЧ = sc.nextLine();
        System.out.print("Читательский билет > ");
        String билетЧ = sc.next();
        Читатель клиент = new Читатель(фиоЧ, билетЧ);
        int операция = 0;
        do {
            System.out.print("Уважаемый " + клиент.фио + ", Выберите деёствие: \n1 - Вывод каталога\n" +
                    "2 - Запрос книги\n3 - Сдача книги\n" +
                    "0 - выход\n Ваш выбор > ");
            операция = sc.nextInt();
            switch (операция) {
                case 1: мояБиблиотека.Каталог(); break;
                case 2:
                    System.out.print("Код книги ? > ");
                    String код = sc.next();
                    мояБиблиотека.ВыдачаКниги(код, клиент);
                    break;
                case 3:
                    мояБиблиотека.ВозвратКниги(клиент);
                    break;
                default:break;
            }
        } while (операция != 0);

        sc.close();
        System.out.println("Библиотека. Работа завершена!");*/