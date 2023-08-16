import java.io.*;

/**
 * FileInputStream will read all bytes from input file
 * and FileOutputStream will write all bytes read from FileInputStream into output file.
 */
public class FileInputOutputStreamExample {

    public static void main(String[] args) {
        try {
            FileInputStream inputStream = new FileInputStream("E:\\JavaDevelopment\\java-io-concepts\\byte-streaming\\src\\input.txt");

            FileOutputStream outputStream = new FileOutputStream("E:\\JavaDevelopment\\java-io-concepts\\byte-streaming\\src\\output.txt");

            System.out.println(inputStream.available());

            byte[] bytes = inputStream.readAllBytes();//read all bytes from input file
            outputStream.write(bytes);//write all bytes to the output file

            System.out.println(outputStream);
            inputStream.close();
            outputStream.close();
        } catch (IOException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
    }
}
