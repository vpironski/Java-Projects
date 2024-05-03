package files;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class BuffExample{
    public static void main(String[] args) {
        BufferedReader br = null;
        StringBuilder line = null;
        try {

            String currentLine;

            br = new BufferedReader(new FileReader("/Users/vihrenpironski/Dropbox/Mac/Documents/Workspace/Java-Projects/SchoolWorkJava/oop/src/files/buffOutput.txt"));

            line = new StringBuilder();
            while ((currentLine = br.readLine()) != null) {
                line.append(currentLine);
            }

            String finaly = Arrays.toString(line.toString().split("\n"));

            System.out.println(finaly);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)br.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

    }
}