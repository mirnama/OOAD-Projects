package Store.Obersvables;

import java.io.File;
import java.io.FileWriter;
import Store.Store;

import java.io.IOException;

public class ConcreteLogger implements Logger {
    public String path = "";
    File current;

    public ConcreteLogger(Store s) {
        path = "C:\\Users\\tmahr\\OneDrive\\Documents\\School\\Cu Boulder 2022 Spring Semeseter\\OOAD\\LAB_3_CURRENT\\project_3\\Logs\\"+s.getDayCount()+".txt";
        File tempFile = new File(path);
        boolean exists = tempFile.exists();
        if (exists == false) {
            current = new File(path);
        }
        else {
            tempFile.delete();
            current = new File(path);
        }
    }

    public void update(String info) {
        try {
            FileWriter myWriter = new FileWriter(path, true);
            myWriter.write(info+"\n");
//            myWriter.write("--------------------------------------------------------------------------"+"\n");
            myWriter.close();
        } catch (IOException e) {
            System.out.println("A writer error occurred.");
            e.printStackTrace();
        }
    }
}
