import java.util.*;
class HashMapDemo {
    public static void main(String args[]){
        HashMap<Integer,String> std = new HashMap<>();
        std.put(46,"apurv");
        std.put(17,"dhruv");
        std.put(8,"mahesh");
        
        for(int i : std.keySet()){
            System.out.println(i);
        }
        for(String i : std.values()){
            System.out.println(i);
        }
    }
}
