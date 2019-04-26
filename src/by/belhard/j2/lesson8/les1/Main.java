package by.belhard.j2.lesson8.les1;

import java.io.*;

//урок ввода вывода данных
public class Main {
    public static void main(String[] args) throws IOException {
        String pathInput = "example.data";
        String pathOutput = "exampleOut.data"; //создал автоматически файл


        /*File nonExist = new File("nonExist.ex");
        nonExist.createNewFile();*/ //создаём вручную файл

        File fileInput = new File(pathInput);
        File fileOutput = new File(pathOutput);
        System.out.println(fileInput.getParent());

        InputStream inputStream = new FileInputStream(fileInput);
        OutputStream outputStream = new FileOutputStream(pathOutput);

        int read;
        while ((read = inputStream.read()) != -1) {
            outputStream.write(read + 1);
        }
        outputStream.flush();

        //   System.out.println("\nend of stream");

    }
}
