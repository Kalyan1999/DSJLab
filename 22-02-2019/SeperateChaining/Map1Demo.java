import java.util.*;

public class Map1Demo { 
  
    public static void main(String[] args) 
    { 
        Map1<Integer, String> map = new Map1<Integer, String>();
        map.insert(1, "This"); 
  
        map.insert(2, "Is");  
  
        map.insert(3, "A");
  
        map.insert(4, "Seperate Chaining");
  
        map.insert(5, "Demo");
		
		System.out.println();
		map.display();
    } 
} 