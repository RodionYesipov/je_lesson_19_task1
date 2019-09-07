import java.io.File;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        File file = new File(".");
        List<File> files = Arrays.asList(file.listFiles());
        for (File f:files) {
            if(!f.isDirectory()){
                System.out.println(f.getAbsolutePath());
            }
        }
    }
}
