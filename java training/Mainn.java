import java.util.*;
public class Mainn{
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(1, 2);
        map.put(2, 3);
        System.out.println(map);
        System.out.println(map.get(1));
        System.out.println(map.getOrDefault(11, 3));
        for(int x :map.keySet()){
            System.out.println(map.get(x));
        }
        
    }
}