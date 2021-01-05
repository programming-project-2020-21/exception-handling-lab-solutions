package ex1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileLoader {

   public static long readFileSize(String fileName) throws IOException {
      Path path = Paths.get(fileName);
      return Files.size(path);
   }

   public static long[] readFileSizes(String[] fileNames) {
      // Write your code here!
      return null;
   }

}
