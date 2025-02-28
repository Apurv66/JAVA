class OneDArray{
    public static void main(String args[]){
        int a[]; // Declaration
        a = new int[5]; // Memory allocation

        // int a[] = new int[5]; // Declaration + Memory Allocation

        // int a[] = {1,2,3,4,5}; // Declaration + Initialize

        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        a[3] = 40;
        a[4] = 50;

        for(int i : a){
            System.out.println(i);
        }
    }
}