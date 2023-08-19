import java.io.*;

//Two abstract classes - Reader and Writer
//FileReader extends Reader class.
//FileWriter extends Writer class.
//FileReader will read characters from specified file.
//FileWriter will write characters into the specified file.
public class FileReaderWriterExampleWithTryWithResources {
    public static void main(String[] args) throws IOException {

        try(Reader fileReader = new FileReader("C:\\Users\\vikra\\IdeaProjects\\java-io-concepts-2\\character-streaming\\src\\input.txt");){
            System.out.println(fileReader.ready());

            int size = 100;
            char[] charsFromFile = new char[size];//all arrays always have fixed length

            fileReader.read(charsFromFile);

            System.out.println(charsFromFile);//print on the console

            try(Writer fileWriter = new FileWriter("C:\\Users\\vikra\\IdeaProjects\\java-io-concepts-2\\character-streaming\\src\\output.txt");
            ){
                fileWriter.write(charsFromFile);
            }catch (IOException ioException){
                System.out.println(ioException.getMessage());
            }

        } catch (IOException ioException){
            System.out.println(ioException.getMessage());
        }
    }
}
