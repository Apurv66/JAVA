import java.util.*;
class HashSetDemo {
    public static void main(String args[]){
        HashSet<String> mobiles = new HashSet<>();
        mobiles.add("iphone");
        mobiles.add("samsang");
        mobiles.add("vivo");
        mobiles.add("google");
        
        for(String mobile : mobiles){
            System.out.println(mobile);
        }
    }
}
