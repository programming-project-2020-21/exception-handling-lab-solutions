## Exercise 1: Using the `try-catch` block

Implement the `readFileSizes()` method of the [`FileLoader`](FileLoader.java) class such that:

- it returns an array containing sizes of the files listed in the input `fileNames` array
- if a file does not exist, it assigns a file size of -1

You must use the method `readFileSize()` to retrieve the size of individual files.

```java
FileLoader.readFileSizes(new String[]{"src/test/resources/names.txt", "src/test/resources/ages.txt"})
// → [28, 14]

FileLoader.readFileSizes(new String[]{"planets.txt", "dimensions.txt"})
// → [-1, -1]
```

Your solution should pass all test cases defined in [`FileLoaderTest`](../../../test/java/ex1/FileLoaderTest.java).

Tip: You can easily print an array using `Arrays.toString()`:

```java
Arrays.toString(new int[]{10, 15, 20})
// → [10, 15, 20]
``` 
