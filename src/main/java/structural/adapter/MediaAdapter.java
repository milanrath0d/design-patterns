package structural.adapter;

/**
 * Adapter for media player
 *
 * @author Milan Rathod
 */
public class MediaAdapter implements MediaPlayer {

    private final AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(AdvancedMediaPlayer advancedMediaPlayer) {
        this.advancedMediaPlayer = advancedMediaPlayer;
    }

    @Override
    public void play(String fileName) {
        advancedMediaPlayer.playMp4(fileName);
    }
}
