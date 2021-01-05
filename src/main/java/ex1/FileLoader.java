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
      long[] sizes = new long[fileNames.length];

      for (int i = 0; i < fileNames.length; i++) {
         try {
            sizes[i] = readFileSize(fileNames[i]);
         } catch (IOException e) {
            sizes[i] = -1;
         }
      }

      return sizes;
   }

}
