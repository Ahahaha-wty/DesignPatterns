package DecoratorPattern.IO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @Description:
 * @Author: wty
 * @Date: Created in 14:39 2017/12/27
 */
public class InputTest {

    public static void main(String[] args) {
        int c;
        try {
            InputStream inputStream = new LowCaseInputStream(new BufferedInputStream(new FileInputStream("Files/DecoratorPatternIOTest.txt")));
            while ((c = inputStream.read()) >= 0) {
                System.out.println((char)c);
            }
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
