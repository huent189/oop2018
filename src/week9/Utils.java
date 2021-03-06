package week9;

import java.io.*;
import java.nio.file.Files;
import java.util.Scanner;

public class Utils {
    public static String readContentFromFile(String path){
        File file = new File(path);
        try {
            Scanner scanner = new Scanner(file);
            String content ="";
            while (scanner.hasNextLine()){
                content += scanner.nextLine() + "\n";
            }
            return content;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void appendToFile(String content, String path){
        File file = new File(path);
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file.getAbsolutePath(), true);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(bufferedWriter != null){
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(fileWriter != null){
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void writeConttentToFile(String data, String path){
        OutputStream os = null;
        File file = new File(path);
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            os = new FileOutputStream(file);
            os.write(data.getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static File findFileByName(String folderPath, String fileName){
        File file = new File(folderPath + "/" + fileName);
        if(file.exists()){
            return file;
        }
        return null;
    }

    public static void main(String[] args){
        System.out.println(readContentFromFile("C:\\Users\\HUE NGUYEN\\Desktop\\test1.txt"));
        appendToFile("test thử nào", "C:\\Users\\HUE NGUYEN\\Desktop\\test1.txt");
    }
}
