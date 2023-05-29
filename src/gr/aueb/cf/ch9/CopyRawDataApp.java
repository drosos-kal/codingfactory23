package gr.aueb.cf.ch9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyRawDataApp {

    public static void main(String[] args) {

        int b = 0;
        int count = 0;
        byte[] buffer = new byte[8192];
        long start, end;
        double elapsed;

        try (FileInputStream in = new FileInputStream("C:/tmp/v1.jpg");
             FileOutputStream out  = new FileOutputStream("C:/tmp/v1out.jpg")) {

            start = System.currentTimeMillis();
            while ((b = in.read()) != -1) {
                out.write(buffer, 0, b);
                count+= b;
            }
            end = System.currentTimeMillis();
            elapsed = (end - start) / 1000.0;
            System.out.println(elapsed + "secs");
            System.out.printf("%d MB", count / (1024 * 1000));

             } catch (IOException e) {
                throw new RuntimeException();
        }

    }
}
