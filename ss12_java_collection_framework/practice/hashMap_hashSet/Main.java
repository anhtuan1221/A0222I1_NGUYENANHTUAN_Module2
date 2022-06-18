package ss12_java_collection_framework.practice.hashMap_hashSet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student student1= new Student("Tuan",16,"DN");
        Student student2= new Student("Ha",16,"DN");
        Student student3= new Student("Hoang",19,"DN");
        Map<Integer,Student> studentMap= new HashMap<>();
        studentMap.put(1,student1);
        studentMap.put(2,student2);
        studentMap.put(3,student3);
        studentMap.put(4,student1);
        for(Map.Entry<Integer,Student> s : studentMap.entrySet()){
            System.out.println(s);
        }
        System.out.println("-------set");
        Set<Student> students= new HashSet<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student1);
        for(Student s: students){
            System.out.println(s);
        }
    }
}
