class ThrowDemo {
    public static void main(String args[]) {
        try{
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            if(b==0) {
                ArithmeticException ae = new ArithmeticException("Divide by zero");
                throw ae;
            }
            int c = a / b;
            System.out.println("c = " + c);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
