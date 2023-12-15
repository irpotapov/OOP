package src;

public class Video extends Multimedia implements IDrawable {
    String RasshirenieVideo;
    String RazreshenieVideo;
    public Video(String Naz, String RashirVideo, String RazreshVideo) {
        super(Naz);
        RasshirenieVideo = RashirVideo;
        RazreshenieVideo = RazreshVideo;
    }

    public void DrawIcon() {
        if (RasshirenieVideo == ".MP4") {
            String str =
                    "-------------------\n" +
                    "|                 |\n" +
                    "|       .MP4      |\n" +
                    "|                 |\n" +
                    "-------------------\n";
            System.out.println(str);
        } else if (RasshirenieVideo == ".AVI") {
            String str =
                    "-------------------\n" +
                    "|                 |\n" +
                    "|       .AVI      |\n" +
                    "|                 |\n" +
                    "-------------------\n";
            System.out.println(str);
        }
    }

    @Override
    public String Info() {
        return "Название видео: " + Nazvanie + "\n" + "Расширение видео: " + RasshirenieVideo + "\n" + "Разрешение видео: " + RazreshenieVideo;
    }
}
