public class NestedIfElse {
    public static void main(String args[]){
        int a = 4;
        int b = 5;
        int c = 6;
        if(a>b){
            if(a>c){
                System.out.println(a + " is maximum");
            }
            else{
                System.out.println(c + " is maximum");
            }
        }
        else{
            if(b>c){
                System.out.println(b + " is maximum");
            }
            else{
                System.out.println(c + " is maximum");
            }
        }
    }
}
