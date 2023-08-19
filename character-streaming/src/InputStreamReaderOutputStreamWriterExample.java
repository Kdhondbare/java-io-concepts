import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * Two types of stream:
 * 1. Byte Streaming -> read bytes and write bytes (1B)
 * 2. Character Streaming -> read chars and write chars (2B)
 * Input and Output Stream -> Byte streaming
 * Reader and Writer Stream -> Character Streaming
 * An InputStreamReader is a bridge from byte streams to character stream.
 * It reads bytes and decodes them into characters using a specified charset.
 * The charset that it uses may be specified by name or may be given explicitly,
 * or the default charset may be used.
 */

/*
InputStreamReader and OutputStreamReader
 */

public class InputStreamReaderOutputStreamWriterExample {

    public static void main(String[] args) throws IOException {

        try ( //fileInputStream
              FileInputStream fileInputStream = new FileInputStream("E:\\JavaDevelopment\\java-io-concepts\\character-streaming\\src\\input.txt");
              //InputStreamReader will read from fileInputStream
              InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, StandardCharsets.UTF_8);) {
            //char that will hold chars from inputStreamReader
            char[] charsFromInputFile = new char[100];
            inputStreamReader.read(charsFromInputFile);

            System.out.println(charsFromInputFile);//print char array to console
            try (  //fileOutputStream
                   FileOutputStream fileOutputStream = new FileOutputStream("E:\\JavaDevelopment\\java-io-concepts\\character-streaming\\src\\output.txt");
                   //OutputStreamWriter will write into output.txt using fileOutputStream byte by byte
                   OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream
                           , StandardCharsets.UTF_8);
            ) {
                outputStreamWriter.write(charsFromInputFile);
            } catch (IOException ioException) {
                System.out.println(ioException.getMessage());
            }
        } catch (IOException ioException) {
            System.out.println(ioException.getMessage());
        }
    }
}
