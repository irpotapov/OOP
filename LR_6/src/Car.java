public class Car<T extends Number> implements Vehicle{

    protected String brand;
    protected String model;
    protected int year;
    protected T price;
    public Car (String Brand, String Model, int Year, T Price){
        this.brand = Brand;
        this.model = Model;
        this.year = Year;
        this.price = Price;
    }
    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public int getYear() {
        return year;
    }

    public T getPrice() {
        return price;
    }
}
