package structural.adapter;

/**
 * Audit Player supporting mp3 files
 *
 * @author Milan Rathod
 */
public class AudioPlayer implements MediaPlayer {

    @Override
    public void play(String fileName) {
        System.out.println("Playing mp3 file: " + fileName);
    }
}
