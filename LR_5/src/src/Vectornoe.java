package src;

public class Vectornoe extends Images implements IDrawable{
    String Raspechatat;

    public Vectornoe(String Naz, String Rashir, String Razresh, String Pechat) {
        super(Naz, Rashir, Razresh);
        Raspechatat = Pechat;
    }

    @Override
    public String Info() {
        return "Название векторного изображения: " + Nazvanie + "\n" + "Расширение: " + Rasshirenie + "\n" + "Разрешение: " + Razreshenie + "\n"
                + "Возможность распечатать: " + Raspechatat;
    }

    public void DrawIcon() {
        if (Rasshirenie == ".PDF") {
            String str =
                    "-------------------\n" +
                    "|                 |\n" +
                    "|       .PDF      |\n" +
                    "|                 |\n" +
                    "-------------------\n";
            System.out.println(str);
        } else if (Rasshirenie == ".SVG") {
            String str =
                    "-------------------\n" +
                    "|                 |\n" +
                    "|       .SVG      |\n" +
                    "|                 |\n" +
                    "-------------------\n";
            System.out.println(str);
        }
    }
}
