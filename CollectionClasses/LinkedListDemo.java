import java.util.*;
class LinkedListDemo {
    public static void main(String args[]){
        LinkedList<String> cars = new LinkedList<>();
        cars.add("BMW");
        cars.add("Audi");
        cars.add("Farari");
        cars.add("Rolse Royels");

        for(String car : cars){
            System.out.println(car);
        }
    }    
}
