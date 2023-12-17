public class Hatchback extends Car{

    public Hatchback(String Brand, String Model, int Year, Number Price) {
        super(Brand, Model, Year, Price);
    }

    @Override
    public Number getPrice() {
        return super.getPrice();
    }
}
