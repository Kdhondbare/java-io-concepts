import java.io.*;
import java.util.Arrays;
//InputStream and OutputStream deals with bytes. (1B or 8 bits)
//Read/Write or Input/Output

//InputStream - Consider it as pipe of input stream
//OutputStream - Consider this as pipe output data

/**
 * ByteArrayInputStream - this is an implementation of InputStream abstract class.
 * This class is used to read byte array'
 * ByteArrayOutputStream - this is an implementation of OutputStream abstract class.
 * This class is used to write array read from InputStream.
 */

public class ByteArrayInputOutputStreamExample {

    public static void main(String[] args) {

        try {
            byte[] byteArray = {'H','e','l','l','o'};

            ByteArrayInputStream inputStream = new ByteArrayInputStream(byteArray,0,byteArray.length);

            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

            System.out.println("inputStream.readAllBytes() = " + Arrays.toString(inputStream.readAllBytes()));
            //once read data gets destroyed or closed
            //we can only read and write once
            outputStream.write(inputStream.readAllBytes());

            byte[] bytesFromOutputStream = outputStream.toByteArray();

            System.out.println("outputStream.toString() = " + new String(bytesFromOutputStream, "UTF-8") );
            //Above line is not able to print any data because it already gets read in above lines
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}
