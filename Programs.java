package programs;
import java.util.HashMap;
import java.util.Map;


public class Programs {

 
    public static void main(String[] args) {   
    Map <String, String> nameMap = new HashMap<>();
    nameMap.put("BSIT" , "Bachelor of Sciene in Information Technology " );
    nameMap.put("BSCS" , "Bachelor of Science in Computer Science" );
    nameMap.put("BSIS" , "Bachelor of Science in Information System ");
    
    System.out.println(nameMap.get("BSCS"));
    System.out.println(nameMap.get("BSIS"));
    System.out.println(nameMap.keySet());
    System.out.println(nameMap.values());
    
   
  
    
    for (Map.Entry e : nameMap.entrySet()) {
        System.out.println(e.getKey() + ": " + e.getValue());
        
    }
        System.out.println("The program does not contain 'BSCpE' ");
    
    }
    
}

