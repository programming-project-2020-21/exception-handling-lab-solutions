package ex1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class FileLoaderTest {

   @Test
   void readExistingFileSizes() {
      String[] files = new String[]{"src/test/resources/names.txt", "src/test/resources/ages.txt"};
      long[] fileSizes = FileLoader.readFileSizes(files);
      assertArrayEquals(new long[]{28, 14}, fileSizes);
   }

   @Test
   void readOnlyNonExistingFileSizes() {
      String[] files = new String[]{"planets.txt", "dimensions.txt"};

      long[] fileSizes = FileLoader.readFileSizes(files);
      assertArrayEquals(new long[]{-1, -1}, fileSizes);
   }

   @Test
   void readSomeNonExistingFileSizes() {
      String[] files = new String[]{"src/test/resources/names.txt", "planets.txt", "src/test/resources/ages.txt", "dimensions.txt"};
      long[] fileSizes = FileLoader.readFileSizes(files);
      assertArrayEquals(new long[]{28, -1, 14, -1}, fileSizes);
   }
}