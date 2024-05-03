package files;
import java.io.*;
public class CopyFile {
    public static void main(String args[]) throws IOException   {
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream("/Users/vihrenpironski/Dropbox/Mac/Documents/Workspace/Java-Projects/SchoolWorkJava/oop/src/files/input.txt");
            out = new FileOutputStream("/Users/vihrenpironski/Dropbox/Mac/Documents/Workspace/Java-Projects/SchoolWorkJava/oop/src/files/output.txt");
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        }
        finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}