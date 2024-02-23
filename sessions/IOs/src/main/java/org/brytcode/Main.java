package org.brytcode;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("C:/Krishna/Java/F1/Temp2/accounts.csv");
//        try(FileWriter writer = new FileWriter(file, true)) {
//            writer.append("....Jai Hindh");
//        }
        FileReader reader = new FileReader(file);
        BufferedReader bReader = new BufferedReader(reader, 1024);


        try {
            String acc = null;
            while((acc=bReader.readLine())!=null){
                System.out.println(acc);
            }

        }finally {
            reader.close();
        }
    }
}