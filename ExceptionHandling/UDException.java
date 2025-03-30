class InvalidNo extends Exception {
    public String toString(){
        return "Roll number must be > 0";
    }
}

class UDException {
    public static void main(String args[]) throws ArithmeticException {
        try {
            int no = Integer.parseInt(args[0]);
            if(no <= 0) {
                InvalidNo io = new InvalidNo();
                throw io;
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}