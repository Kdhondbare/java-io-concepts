import java.beans.IntrospectionException;
import java.io.*;

/**
 * Working of ObjectInputStream and ObjectOutputStream
 * 1. The ObjectInputStream is mainly used to read data/object written by the ObjectOutputStream.
 * 2. Basically, the ObjectOutputStream converts or writes Java objects into corresponding steams(Output stream).
 *    Those converted streams can be stored in files or transferred through networks.
 *    This is known as 'Serialization'.
 * 3. Now, if we need to read those objects, we will use the ObjectInputStream that will convert the stream back to objects.
 *    This is known as 'Deserialization'.
 */

// Stream is nothing but sequence of elements or flow of data or pipe of data.
// FileOutputStream -> writes into file.
// ObjectOutputStream -> writes to Object Output stream.

// Input and Output that means Read and Write
// Input -> read data
// Output -> write data

    /*
    The goal of the program is to write the object using ObjectOutputStream
    and FileOutputStream into a file and then read all the object from the file
    using ObjectInputStream and FileInputStream
     */

public class ObjectInputOutputStreamExample {

    public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {

        Integer number = 100;
        String msg = "Hello Input/Output Stream";
        Student student = new Student("Karan", 200);

        OutputStream fileOutputStream = new FileOutputStream("E:\\JavaDevelopment\\java-io-concepts\\byte-streaming\\src\\objects.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(number);
        objectOutputStream.writeObject(msg);
        objectOutputStream.writeObject(student);

        Thread.sleep(3000);

        InputStream fileInputStream = new FileInputStream("E:\\JavaDevelopment\\java-io-concepts\\byte-streaming\\src\\objects.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        //this objectInputStream will read objects from specified fileInputStream

        Integer integerObjectFromFile = (Integer) objectInputStream.readObject();
        String stringObjectFromFile = (String) objectInputStream.readObject();
        Student studentObjectFromFile = (Student) objectInputStream.readObject();

        System.out.println("integerObjectFromFile : " + integerObjectFromFile);
        System.out.println("stringObjectFromFile : " + stringObjectFromFile);
        System.out.println("studentObjectFromFile : " + studentObjectFromFile);

    }
}
