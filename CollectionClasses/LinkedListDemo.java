import java.util.*;

class LinkedListDemo {
    public static void main(String args[]) {
        LinkedList<String> obj = new LinkedList<String>();
        obj.add("ind");
        obj.add("aus");
        obj.add("eng");
        System.out.println(obj);
        
        obj.addFirst("nz");
        System.out.println(obj);

        obj.addLast("afg");
        System.out.println(obj);
        
        obj.add(1, "sri");
        System.out.println(obj);
        
        obj.remove();
        System.out.println(obj);
        
        obj.removeFirst();
        System.out.println(obj);
        
        obj.removeLast();
        System.out.println(obj);

        obj.remove(1);
        System.out.println(obj);
    }    
}
