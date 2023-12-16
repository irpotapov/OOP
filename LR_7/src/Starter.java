import java.util.Scanner;

public class Starter {
    public static void main(String[] arg) {
        RouteStorage routeStorage = new RouteStorage();
        Searcher searcher = new Searcher(routeStorage);
        Remover remover = new Remover(routeStorage);
        Adder  adder = new Adder(routeStorage);
        Scanner sc = new Scanner(System.in);
        int oper = 0;
        do {
            System.out.print("Выберите действие:\n" + "Поиск маршрута - 1\n" + "Удалить маршрут - 2\n" +
                    "Добавить новый маршрут - 3\n" + "0 – Выход\n" + "Выбор > ");
            oper = sc.nextInt();
            switch (oper) {
                case 1:
                    System.out.print("Введите название маршрута > ");
                    String nameRout = sc.next();
                    searcher.searchByRoute(nameRout);
                    break;
                case 2:
                    System.out.print("Введите номер маршрута > ");
                    String numberTrip = sc.next();
                    remover.removeByRoute(numberTrip);
                    break;
                case 3:
                    System.out.print("Введите номер рейса > ");
                    String numTrip = sc.next();
                    System.out.print("Введите номер автобуса > ");
                    String numberBus = sc.next();
                    System.out.print("Введите марку автобуса > ");
                    String busBrand = sc.next();
                    System.out.print("Введите название маршрута > ");
                    String nazRoute = sc.next();
                    System.out.print("Введите дату отправки > ");
                    String date = sc.next();
                    System.out.print("Введите время отправки > ");
                    String time = sc.next();
                    adder.addByRoute(numTrip, numberBus, busBrand, nazRoute, date, time);
                    break;
            }
        } while (oper != 0);
    }
}
