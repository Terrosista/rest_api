import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class AudioPlayer {
    public static void main(String[] args) {
        String audioFilePath = "C:\\Users\\jose4\\OneDrive\\Documentos\\NetBeansProjects\\reprodudor\\src\\c.mp3";

        try {
            // Obtener el archivo de audio
            File audioFile = new File(audioFilePath);

            // Crear un Clip de audio
            Clip audioClip = AudioSystem.getClip();

            // Cargar el audio desde el archivo
            audioClip.open(AudioSystem.getAudioInputStream(audioFile));

            // Reproducir el audio
            audioClip.start();

            // Esperar hasta que termine la reproducción
            while (!audioClip.isRunning()) {
                Thread.sleep(10);
            }

            while (audioClip.isRunning()) {
                Thread.sleep(10);
            }

            // Cerrar el Clip
            audioClip.close();
        } catch (Exception ex) {
            System.out.println("Error al reproducir el audio: " + ex.getMessage());
        }
    }
}
