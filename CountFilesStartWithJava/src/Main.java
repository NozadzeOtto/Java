import java.io.File;
import java.util.Locale;

public class Main {
    public static void main(String args[]){
        File directory = new File("C:\\Users\\ONozadze\\Desktop\\New folder");
        int fileCount = 0;
        for (String name: directory.list()) {
            if (name.toLowerCase(Locale.ROOT).startsWith("java")) {
                System.out.printf(name + "\n");
                fileCount++;
            }
        }
        System.out.println("ფაილების რაოდენობა:"+fileCount);
    }
}