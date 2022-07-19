package ss16_io_text_file.exercise.read_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public List<String[]> readFile(String filePath) {
        List<String[]> arrayList = new ArrayList<>();
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while ((line = br.readLine()) != null) {
                if (line.trim().isEmpty()) {
                    continue;
                }
                String[] list = line.split(",");
                arrayList.add(list);
            }
        } catch (IOException e) {
            System.out.println("");
        }
        return arrayList;
    }

}
