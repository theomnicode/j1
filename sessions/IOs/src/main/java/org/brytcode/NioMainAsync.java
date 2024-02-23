package org.brytcode;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.CompletionHandler;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class NioMainAsync {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:/Krishna/Java/F1/Temp2/sample.txt");
        AsynchronousFileChannel fileChannel = AsynchronousFileChannel.open(path, StandardOpenOption.READ);
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        readFromFile(fileChannel, buffer, 0);
        System.out.println("Completed");
    }

    private static void readFromFile(AsynchronousFileChannel fileChannel, ByteBuffer buffer, long position) {
        fileChannel.read(buffer, position, buffer, new CompletionHandler<Integer, ByteBuffer>() {
            @Override
            public void completed(Integer result, ByteBuffer attachment) {
                if (result == -1) {
                    try {
                        fileChannel.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    return;
                }

                attachment.flip();
                byte[] data = new byte[result];
                attachment.get(data);
                System.out.print(new String(data));

                long newPosition = position + result;
                attachment.clear();
                readFromFile(fileChannel, attachment, newPosition);
            }

            @Override
            public void failed(Throwable exc, ByteBuffer attachment) {
                exc.printStackTrace();
                try {
                    fileChannel.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
