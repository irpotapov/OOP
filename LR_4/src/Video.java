public class Video extends Multimedia{
    String RasshirenieVideo;
    String RazreshenieVideo;
    public Video(String Naz, String RashirVideo, String RazreshVideo) {
        super(Naz);
        RasshirenieVideo = RashirVideo;
        RazreshenieVideo = RazreshVideo;
    }

    @Override
    public String getNaz() {
        return "Название видео: " + Nazvanie + "\n" + "Расширение видео: " + RasshirenieVideo + "\n" + "Разрешение видео: " + RazreshenieVideo;
    }
}
