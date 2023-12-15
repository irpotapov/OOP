package src;

import java.util.Vector;

public class Starter {
    public static void main(String[] args) {

        Vector<IDrawable> allMultimedia = new Vector<>();
        allMultimedia.add(new Rastrovoe("Праздничная открытка", ".JPEG", "FullHD", "RGB"));
        allMultimedia.add(new Vectornoe("Снимок экрана 1", ".SVG", "FullHD", "Можно"));
        allMultimedia.add(new Video("Готовое видео", ".MP4", "UltraHD4k"));

        for (int i = 0; i < allMultimedia.size(); i++){
            System.out.println("-------->");
            System.out.println(allMultimedia.get(i).Info());
            allMultimedia.get(i).DrawIcon();
        }
    }
}

