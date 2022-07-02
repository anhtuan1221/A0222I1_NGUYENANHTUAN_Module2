package ss16_io_text_file.practice.maxvalue_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public List<Integer> readFile(String filePath) {
        List<Integer> numbers = new ArrayList<>();
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) != null) {
                numbers.add(Integer.parseInt(line));
            }
            br.close();
        } catch (Exception e) {
            System.err.println("File ko ton tai or noi dung co loi");
        }
        return numbers;
    }

    public void writeFile(String filePath, int max) {
        try {
            FileWriter write = new FileWriter(filePath, true);
            BufferedWriter bufferedWriter= new BufferedWriter(write);
            bufferedWriter.write("Giá trị lớn nhật "+ max);
            bufferedWriter.close();
        } catch (IOException e) {

        }
    }
}
