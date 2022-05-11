package FileAndIO.File;

import java.io.*;


public class TestFileWriter {

    public static void main(String[] args) throws IOException {
        // Create an output stream to the file
        FileWriter output = new FileWriter("temp1.txt", false);

        // Output a string to the file
        output.write("Introduction to Java");
        output.write("hahah");

        // Close the stream
        output.close();

       System.out.println("a");
    }

}
