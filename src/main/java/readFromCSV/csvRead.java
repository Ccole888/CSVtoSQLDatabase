package readFromCSV;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import static readFromCSV.GUI.*;

public class csvRead {


    public static ArrayList<ArrayList<String>> parseCSV() {
        String csvFile = filepath;
        ArrayList<ArrayList<String>> row = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] fields = line.split(",");
                ArrayList<String> col = new ArrayList<String>();
                for (int i = 0; i < fields.length; i++) {
                    col.add(fields[i]);
                }
                row.add(col);
                incProgBar();
                jProgressBar1.repaint();



            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return row;
    }
    public static int getNumRows(){
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filepath));
            String input;
            int count = 0;
            while((input = bufferedReader.readLine()) != null)
            {
                count++;
            }
            System.out.println("Count : "+count);
            return count;
        } catch (IOException e) {
            e.printStackTrace();
            return -1;
        }

    }
}
