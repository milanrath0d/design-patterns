package structural.adapter;

/**
 * Player supporting mp4 format
 *
 * @author Milan Rathod
 */
public class Mp4Player implements AdvancedMediaPlayer {

    @Override
    public void playMp4(String filename) {
        System.out.println("Playing Mp4 file: " + filename);
    }
}
