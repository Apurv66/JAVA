import java.util.*;
class ArrayListDemo {
    public static void main(String args[]){
        ArrayList<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("white");
        colors.add("black");

        for(String color : colors){
            System.out.println(color);
        }
    }    
}
