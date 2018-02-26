package labsix;

import org.jfugue.pattern.Pattern;
import org.jfugue.player.Player;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Scanner;

public class MusicGenerator {

  public static void main(String[] args) {

    // display the name of the programmer and the date
    System.out.println("Janyl Jumadinova " + new Date());
    // declare the starting file and scanner
    File inputsFile = null;
    Scanner scanner = null;
    // connect the scanner to the input file
    try {
      inputsFile = new File("input/music_inputs.txt");
      scanner = new Scanner(inputsFile);
    } catch (FileNotFoundException noFile) {
      System.out.println("Unable to locate file");
    }

  }
}
