package service;

import java.io.*;

class ServiceForTest {
    DataForTest dataForTest = new DataForTest();

    void writeDataToFile(File file, String string){
        if(file.exists())
            file.delete();
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
            bufferedWriter.write(string);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}