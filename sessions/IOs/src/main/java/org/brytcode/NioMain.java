package org.brytcode;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;

public class NioMain {
    public static void main(String[] args) throws IOException {
        FileInputStream in = new FileInputStream(new File("C:/Krishna/Java/F1/Temp2/sample.txt"));
        FileChannel channel = in.getChannel();
        ByteBuffer buff = ByteBuffer.allocate(1024);
        StringBuilder content = new StringBuilder();
        while(channel.read(buff)!=-1){
            buff.flip();
            while(buff.hasRemaining()){
                content.append((char)buff.get());
            }
            buff.clear();
        }
        System.out.println(content);
        in.close();
    }
}
