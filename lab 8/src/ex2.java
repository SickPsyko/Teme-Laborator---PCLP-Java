import java.io.*;

public class ex2 {
    public static void cat(File file) {
        BufferedReader input = null;
        String line = null;

        try {
            input = new BufferedReader(new FileReader(file));
            while ((line = input.readLine()) != null) {
                System.out.println(line);
            }
            return;
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (input != null) {
                    input.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
