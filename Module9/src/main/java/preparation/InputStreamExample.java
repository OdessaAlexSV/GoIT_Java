package main.java.preparation;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class InputStreamExample {
    public static void main(String[] args) throws IOException {
        byte[] in = new byte[]{1, 2, 90, 127};

        InputStream stream = new InputStream() {
            private int index = 0;

            @Override
            public int read() throws IOException {
                if (index == in.length) {
                    return -1;
                }
                byte result = in[index];
                index++;

                return result;
            }
        };

//        int data = stream.read();
//
//        while (data != -1) {
//            System.out.println(data);
//            data = stream.read();
//        }

        byte[] out = new byte[in.length];
        int read = stream.read(out);
        System.out.println(read);
        System.out.println(Arrays.toString(out));
    }
}
