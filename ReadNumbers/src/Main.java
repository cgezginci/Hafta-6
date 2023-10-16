import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        try {
            FileReader readFile = new FileReader("ReadNumbers/src/number.txt");
            BufferedReader readBuffer = new BufferedReader(readFile);
            String line = readBuffer.readLine();
            int total = 0;
            while (line != null){
                System.out.println(line);
                int number =Integer.parseInt(line);
                total +=number;
                line = readBuffer.readLine();
            }
            System.out.println("Toplam: " + total);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
