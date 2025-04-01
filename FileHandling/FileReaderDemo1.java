import java.io.*;

class FileReaderDemo1 {
    public static void main(String args[]) {
        try {
            FileReader fr = new FileReader("myfile.txt");
            int i;
            while ((i=fr.read()) != -1) {
                System.out.print((char)i);
            }
            fr.close();
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}