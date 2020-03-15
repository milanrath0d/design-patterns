package structural.adapter;

/**
 * Entry point for adapter design pattern
 *
 * @author Milan Rathod
 */
public class AdapterMain {

    public static void main(String[] args) {
        // For playing Mp3 file
        MediaPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("Test.mp3");

        // For playing Mp4 file
        AdvancedMediaPlayer advancedMediaPlayer = new Mp4Player();
        advancedMediaPlayer.playMp4("Test.mp4");

        // Using adapter to play mp4 with basic media player
        MediaPlayer mediaPlayer = new MediaAdapter(advancedMediaPlayer);
        mediaPlayer.play("Test.mp4");
    }

}
