// Two abstract classes - Reader and Writer
// FileReader extends Reader class
// FileWriter extend Writer class
// FileReader will read characters from specified file
// FileWriter write characters into the specified file

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

public class FileReaderWriterExample {

    public static void main(String[] args) throws IOException {

        Reader fileReader = new FileReader("E:\\JavaDevelopment\\java-io-concepts\\character-streaming\\src\\input.txt");

        System.out.println(fileReader.ready());

        int size = 100;
        char[] charsFromFile = new char[size];
        fileReader.read(charsFromFile);

        System.out.println(charsFromFile); // print on the console

        fileReader.close();

        FileWriter fileWriter = new FileWriter("E:\\JavaDevelopment\\java-io-concepts\\character-streaming\\src\\output.txt");
        fileWriter.write(charsFromFile);

        fileWriter.close();
    }

}
