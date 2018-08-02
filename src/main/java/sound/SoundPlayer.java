package sound;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

public class SoundPlayer {

    public static void main(String[] args) throws IOException,
            UnsupportedAudioFileException,
            LineUnavailableException {

        String music = "src/main/resources/beep.wav";

        File file = Paths.get(music).toFile();

        AudioInputStream stream = AudioSystem
                .getAudioInputStream(file);

        AudioFormat format = stream.getFormat();

        DataLine.Info info = new DataLine.Info(Clip.class, format);

        Clip clip = (Clip) AudioSystem.getLine(info);

        clip.open(stream);
        clip.start();

    }
}

