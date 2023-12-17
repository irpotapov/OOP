public class Starter {
    public static void main(String[] args) {
        Car sedan = new Sedan("Hyundai", "Elantra", 2022, 2000000);
        Car hatchback = new Hatchback("Hyundai", "i30", 2016, 1500000.00);
        Car crossover = new Crossover("Hyundai", "Tucson", 2019, 3500000);
        Car jeep = new Jeep("Range Rover", "Sport", 2022, 6000000.00);

        System.out.println("Седан: " + sedan.getBrand() + " " + sedan.getModel() + ", "
                + sedan.getYear() + ", " + sedan.getPrice() + " руб");
        System.out.println("Хэчбек: " + hatchback.getBrand() + " " + hatchback.getModel() + ", "
        + hatchback.getYear() + ", " + hatchback.getPrice() + " руб");
        System.out.println("Кроссовер: " + crossover.getBrand() + " " + crossover.getModel() + ", "
                + crossover.getYear() + ", " + crossover.getPrice() + " рус");
        System.out.println("Джип: " + jeep.getBrand() + " " + jeep.getModel() + ", "
        + jeep.getYear() + ", " + jeep.getPrice() + " руб");
    }
}
