public class Vectornoe extends Images{
    String Raspechatat;

    public Vectornoe(String Naz, String Rashir, String Razresh, String Pechat) {
        super(Naz, Rashir, Razresh);
        Raspechatat = Pechat;
    }

    @Override
    public String getNaz() {
        return "Название векторного изображения: " + Nazvanie + "\n" + "Расширение: " + Rasshirenie + "\n" + "Разрешение: " + Razreshenie + "\n"
                + "Возможность распечатать: " + Raspechatat;
    }
}
