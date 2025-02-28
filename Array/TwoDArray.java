public class TwoDArray {
    public static void main(String args[]){
        int a[][]; // Declaration
        a = new int[2][2]; // Memory allocation

        // int a[][] = new int[2][2]; // Declaration + Memory Allocation

        // int a[][] = { // Declaration + Initialize
        //     {1,2},
        //     {3,4}
        // };

        a[0][0] = 10;
        a[0][1] = 20;
        a[1][0] = 30;
        a[1][1] = 40;

        for(int i=0; i<a.length; i++){
            for(int j=0; j<a.length; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
