class MultipleCatch {
    public static void main(String args[]) {
        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int c = a/b;
            System.out.println("c = "+c);
        }
        catch(ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        }
        catch(ArrayIndexOutOfBoundsException e2) {
            System.out.println("Array Index Out Of Bounds Exception");
        }
        catch(Exception e3) {
            System.out.println("Exception");
        }

    }
}