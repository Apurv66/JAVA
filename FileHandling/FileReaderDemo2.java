import java.io.*;

class FileReaderDemo2 {
    public static void main(String args[]) {
        try {
            FileReader fr = new FileReader("myfile.txt");
            BufferedReader br = new BufferedReader(fr);
            String i;

            while ((i=br.readLine())!=null) {
                System.out.println(i);
            }
            br.close();
            fr.close();
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
