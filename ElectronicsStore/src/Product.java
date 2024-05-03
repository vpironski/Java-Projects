import java.io.*;
public interface Product {
    public abstract String getModel();
    public abstract String getCategory();
    default void writeOnFile(Product product){
        //TODO
        String fileName = "stock";

        File file = new File(fileName);
        if(file.exists()){
            try {
                FileWriter fileWriter = new FileWriter(fileName);
                int amount;
                String format = String.format("%s#%s#%d", );
                fileWriter.write("");
                fileWriter.close();
                System.out.println("Successfully wrote to the file.");
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }


    }

}
