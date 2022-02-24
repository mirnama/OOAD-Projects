package Store.Obersvables;

import java.io.File;
import java.io.FileWriter;
import Store.Store;

import java.io.IOException;

public class ConcreteLogger implements Logger {
    public String path = "";
    File current;

    public void update(String info, Store s) {
        path = "C:\\Users\\tmahr\\OneDrive\\Documents\\School\\Cu Boulder 2022 Spring Semeseter\\OOAD\\LAB_3_CURRENT\\project_3\\logger\\logger-"+s.getDayCount()+".txt";
        File tempFile = new File(path);
        boolean exists = tempFile.exists();
        if (exists == false) {
            System.out.println("create file");
            current = new File(path);
        }

        try {
            System.out.println("Writing to file");
            FileWriter myWriter = new FileWriter(path);
            myWriter.write(info);
            myWriter.close();
        } catch (IOException e) {
            System.out.println("A writer error occurred.");
            e.printStackTrace();
        }
    }

    //public void newFile(int day) {
    //
    //    current = new File(path);
    //}


}
