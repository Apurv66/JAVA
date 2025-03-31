import java.util.ArrayList;

class ArrayListDemo {
    public static void main(String args[]) {
        ArrayList<String> obj = new ArrayList<String>();
        obj.add("ind");
        obj.add("aus");
        obj.add("eng");
        System.out.println(obj);
        
        obj.add(1,"usa");
        System.out.println(obj);
        
        obj.remove(1);
        System.out.println(obj);
        
        obj.set(1, "nz");
        System.out.println(obj);
        
        System.out.println(obj.get(2));
        
        obj.clear();
        System.out.println(obj);
    }
}