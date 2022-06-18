package ss11_das_stack_queue.excercise.count_character_string;

import java.util.*;

public class CountCharacterString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = scanner.nextLine();
        str = str.toLowerCase();
        List<String> arr = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            arr.add(String.valueOf(str.charAt(i)));
        }
        Map<String, Integer> map = new TreeMap<>();
        for (String s : arr) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.print(entry.getKey() + ":" + entry.getValue()+" ,");
          //  System.out.print(entry);
        }
    }
}
