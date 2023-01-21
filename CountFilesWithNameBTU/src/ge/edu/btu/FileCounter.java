package ge.edu.btu;

import java.io.File;
import java.util.Locale;

public class FileCounter {
    public static void main(String[] args) {
        File directory = new File("C:\\Users\\ONozadze\\Desktop\\New folder");
        int amount = 0;
        for (String name: directory.list()
             ) {
            if (name.toLowerCase(Locale.ROOT).startsWith("btu")){
                amount++;
            }
        }
        System.out.printf("მოძებნილი ფაილების რაოდენობა: " + amount);
    }
}