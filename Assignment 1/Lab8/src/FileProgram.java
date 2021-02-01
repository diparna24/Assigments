import java.io.*;

public class FileProgram {

    public static void main(String[] args) {

        try{
            BufferedReader bReader = new BufferedReader(new FileReader(new File("src//Source.txt")));
            PrintWriter writer = new PrintWriter(new FileWriter(new File("src//Target.txt"),true));

            CopyDataThread dataThread = new CopyDataThread(bReader, writer); //Pass the reader and writer to the User Thread
            Thread thread = new Thread(dataThread);
            thread.start(); //Start the Thread
            
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
