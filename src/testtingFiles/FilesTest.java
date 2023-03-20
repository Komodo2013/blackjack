package src.testtingFiles;

import java.io.File;
import java.io.FileReader;

public class FilesTest {
    public static void main(String[] args) {
        File file = new File("MyTest.text");
        try {
            if (file.createNewFile()){
                System.out.println("hey");
            }
            try {
                FileReader fileReader = new FileReader(file);
                System.out.println(fileReader.ready());
            }catch (Exception e){
                System.out.println("Wrong");
            }
        }catch (Exception e){
            System.out.println("Not here");
        }

    }
}
