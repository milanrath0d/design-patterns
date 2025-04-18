package structural.adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

/**
 * Test for Adapter Pattern implementation
 */
class AdapterTest {

    @Test
    void testAudioPlayerWithMp3() {
        MediaPlayer player = new AudioPlayer();
        assertDoesNotThrow(() -> player.play("file.mp3"));
    }

    @Test
    void testMediaAdapter() {
        AdvancedMediaPlayer advancedMediaPlayer = new Mp4Player();
        MediaAdapter adapter = new MediaAdapter(advancedMediaPlayer);
        assertDoesNotThrow(() -> adapter.play("file.mp4"));
    }

    @Test
    void testMp4Player() {
        AdvancedMediaPlayer player = new Mp4Player();
        assertDoesNotThrow(() -> player.playMp4("test.mp4"));
    }
} 