public class Jeep extends Car{

    public Jeep(String Brand, String Model, int Year, Number Price) {
        super(Brand, Model, Year, Price);
    }

    @Override
    public Number getPrice() {
        return super.getPrice();
    }
}
