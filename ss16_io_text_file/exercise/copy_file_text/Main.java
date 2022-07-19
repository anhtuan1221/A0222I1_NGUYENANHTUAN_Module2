package ss16_io_text_file.exercise.copy_file_text;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CopyFileText copyFileText = new CopyFileText();
        List<String> list = copyFileText.readFile("ss16_io_text_file/exercise/copy_file_text/text.txt");
        for (String str : list) {
            copyFileText.writeFile("ss16_io_text_file/exercise/copy_file_text/text_copy.txt", str);
        }
    }
}
