package org.brytcode;

import java.io.*;

public class IOStreams {
    public static void main(String[] args) throws IOException {
        try(
                FileInputStream inStream = new FileInputStream(new File("C:/Krishna/Java/F1/Temp2/nethaji.jpeg"));
                FileOutputStream outStream = new FileOutputStream(new File("C:/Krishna/Java/F1/Temp2/nethaji2.jpeg"))
        ) {
            int byt;
            while ((byt = inStream.read()) != -1) {
                outStream.write(byt);
            }
        }
    }
}
