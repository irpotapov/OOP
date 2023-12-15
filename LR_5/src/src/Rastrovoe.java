package src;

public class Rastrovoe extends Images implements IDrawable{
    String Color_Model;
    public Rastrovoe(String Naz, String Rashir, String Razresh, String ColorModel) {
        super(Naz, Rashir, Razresh);
        Color_Model = ColorModel;
    }
    @Override
    public String Info() {
        return "Название растрового изображения: " + Nazvanie + "\n" + "Расширение: " + Rasshirenie + "\n" + "Разрешение: " + Razreshenie + "\n"
                + "Цветовая модель: " + Color_Model;
    }

    public void DrawIcon() {
        if (Rasshirenie == ".JPEG") {
            String str =
                    "-------------------\n" +
                    "|                 |\n" +
                    "|       .JPEG     |\n" +
                    "|                 |\n" +
                    "-------------------\n";
            System.out.println(str);
        } else if (Rasshirenie == ".PNG") {
            String str =
                    "-------------------\n" +
                    "|                 |\n" +
                    "|       .PNG      |\n" +
                    "|                 |\n" +
                    "-------------------\n";
            System.out.println(str);
        }
    }
}
