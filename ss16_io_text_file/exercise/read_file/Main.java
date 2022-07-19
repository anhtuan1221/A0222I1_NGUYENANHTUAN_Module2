package ss16_io_text_file.exercise.read_file;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ReadFile readFile = new ReadFile();
        List<Country> countryList = new ArrayList<>();
        List<String[]> list = readFile.readFile("ss16_io_text_file/exercise/read_file/country.csv");
        for (String[] item : list) {
            countryList.add(new Country(Integer.parseInt(item[0]), item[1], item[2]));
        }
        for (Country e : countryList) {
            System.out.println(e);
        }
    }
}
