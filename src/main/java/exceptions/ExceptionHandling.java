package exceptions;

import java.io.File;
import java.io.IOException;

public class ExceptionHandling {

    public static void main(String[] args) {
        File file = new File("resources/nonexistenttext.txt");

        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("Sorry, an error has occurred");
        }
    }
}
