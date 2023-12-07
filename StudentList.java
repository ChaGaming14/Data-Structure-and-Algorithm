package taskperformance;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;


public class TaskPerformance {

    
    public static void main(String[] args) {
     Map<String, String> students = new HashMap<>();
     Scanner scanner = new Scanner(System.in);
    
     for (int i = 1; i <= 3; i++) {

System.out.print("Enter student number " + i + ": ");

String number = scanner.nextLine();

System.out.print("Enter first name " + i + ": ");

String name = scanner.nextLine();

students.put(number, name);

}
     
students.remove(students.keySet().toArray()); 


System.out.println("Student List:");

for (Map.Entry<String, String> entry : students.entrySet()) {

System.out.println(entry.getKey() + " " + entry.getValue());

}



System.out.print("Enter your student number: ");

String number = scanner.nextLine();

System.out.print("Enter your first name: ");

String name = scanner.nextLine();

students.put(number, name);

System.out.println("Student List:");

for (String key : students.keySet()) {

System.out.println(key + " " + students.get(key));

}
    }
    
}