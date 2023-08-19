import java.io.*;
/*
StringReader extends Reader.
StringWriter extends Writer.
StringReader will read from a String object.
StringWriter will write to a String Object.
 */

public class StringReaderWriterExample {
    public static void main(String[] args) throws IOException {
        String stringMessage ="Hello from String";
        try(Reader stringReader = new StringReader(stringMessage);){
            char[] charsFromString = new char[20];

            stringReader.read(charsFromString);

            System.out.println(charsFromString);

            try(Writer stringWriter = new StringWriter();){
                String writtenString = "";

                stringWriter.write(writtenString);

                System.out.println("Written String "+ writtenString);
            }catch (IOException ioException){
                System.out.println(ioException.getMessage());
            }

        }catch (IOException ioException){
            System.out.println(ioException.getMessage());
        }

    }
}
