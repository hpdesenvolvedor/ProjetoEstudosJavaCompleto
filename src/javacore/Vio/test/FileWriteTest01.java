package javacore.Vio.test;
//File
// FileWrite
// File Render
// BufferedWriter
// BufferedReader

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteTest01 {
    public static void main(String[] args) throws IOException {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file, true)) {
            fw.write("O meu arquivo é ótimo\nDigitando em uma próxima linha\n");
            fw.flush();
        }catch (IOException ex){
            ex.printStackTrace();
        }

    }
}
