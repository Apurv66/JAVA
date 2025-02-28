public class IfElseLadder {
    public static void main(String args[]){
        int a = 4;
        int b = 5;
        int c = 6;
        if(a>b && a>c){
            System.out.println(a + " is maximum");
        }
        else if(b>a && b>c){
            System.out.println(b + " is maximum");
        }
        else{
            System.out.println(c + " is maximum");
        }
    }
}
