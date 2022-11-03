package u02_x08_iniciosesion;
import java.io.File;
import java.nio.file.Paths;
import java.util.Scanner;
import java.io.Closeable;
import java.io.IOException;

/**
 * Clase de métodos de utilidad. Necesario cerrar al final del programa.
 * @author Aser <agranadoa09@iesvjp.es>
 * @see Utils#cerrarRecursos()
 */
public class Utils {
    // ! ======================== Ficheros ========================
    /**
     * Intenta cerrar un Stream, si existe.
     * @param stream Stream a cerrar
     */
    public static <T extends Closeable> void cerrarStream(T stream) {
        try {
            stream.close();
        } catch (NullPointerException e) { // Si no existe no hay nada que cerrar
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static File getFile(String rutaFichero) {
        File f = Paths.get(rutaFichero).toFile();
        // Crea los directorios padre si hace falta
        f.getParentFile().mkdirs();
        return f;
    }
}