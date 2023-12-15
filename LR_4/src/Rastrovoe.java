public class Rastrovoe extends Images{
    String Color_Model;
    public Rastrovoe(String Naz, String Rashir, String Razresh, String ColorModel) {
        super(Naz, Rashir, Razresh);
        Color_Model = ColorModel;
    }
    @Override
    public String getNaz() {
        return "Название растрового изображения: " + Nazvanie + "\n" + "Расширение: " + Rasshirenie + "\n" + "Разрешение: " + Razreshenie + "\n"
                + "Цветовая модель: " + Color_Model;
    }
}
