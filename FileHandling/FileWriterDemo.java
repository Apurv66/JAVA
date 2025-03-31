import java.io.*;

class FileWriterDemo {
    public static void main(String args[]) {
        try {
            FileWriter fw = new FileWriter("myfile.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write(args[0]);
            bw.newLine(); // To use newLine() we need BufferedWriter object.
            bw.write(args[1]);

            bw.close();
            fw.close();
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }    
}
