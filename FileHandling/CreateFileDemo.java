import java.io.*;

class CreateFileDemo {
    public static void main(String args[]) {
        try {
            File f = new File("myfile.txt");

            /* 
            If the file doesn't already exist, it will create a new file and return true.
            If the file already exists, it won't create a new file and will return false.
            */

            if(f.createNewFile()) {
                System.out.println("File is successfuly created...");
            }
            else {
                System.out.println("File is alredy created...");
            }
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }    
}
