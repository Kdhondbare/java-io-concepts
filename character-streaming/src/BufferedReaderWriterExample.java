import java.io.*;
import java.util.Arrays;

/**
 * Reads text from character-input stream, buffering characters to provide
 * for the efficient reading of characters, arrays, and lines.
 * The buffer size may be specified or the default size may be used. 8kb
 * The default is large enough for most purposes.
 */
public class BufferedReaderWriterExample {

    public static void main(String[] args) throws IOException {

        try (
                //file reader
                Reader fileReader = new FileReader("E:\\JavaDevelopment\\java-io-concepts\\character-streaming\\src\\input.txt");
                //buffer reader
                BufferedReader bufferedReader = new BufferedReader(fileReader);
        ) {
            //char array that will hold chars from buffer reader
            char[] charsFromInputFile = new char[50];
            bufferedReader.read(charsFromInputFile);
            //print char array to the console
            System.out.println("Input string read by buffer reader from input.txt" + Arrays.toString(charsFromInputFile));
             try (
                 //file writer
                 Writer fileWriter = new FileWriter("E:\\JavaDevelopment\\java-io-concepts\\character-streaming\\src\\output.txt");
                 //buffer writer
                 BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
             ){
                 bufferedWriter.write(charsFromInputFile);
                 System.out.println("buffer writer done with writing.");
             } catch (IOException ioException) {
                 System.out.println(ioException.getMessage());
             }
        }
    }
}
