package files;
import java.io.*;
public class BuffWriterExample {
    public static void main(String[] args) {
        BufferedWriter buffWriter= null;
        FileWriter fileWriter = null;
        try {
            String textToBeWritten = "Some text..";
            File file = new File("/Users/vihrenpironski/Dropbox/Mac/Documents/Workspace/Java-Projects/SchoolWorkJava/oop/src/files/writeOut.txt");
            fileWriter = new FileWriter(file.getAbsoluteFile());
            buffWriter= new BufferedWriter(fileWriter);
            buffWriter.write(textToBeWritten);
            buffWriter.flush();
            System.out.println("Ready!");
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            if(buffWriter!=null ){
                try {
                    buffWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }if(fileWriter != null){
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}