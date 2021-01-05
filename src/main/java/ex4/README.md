## Exercise 4: Chaining exceptions

Implement the `parseToInt()` method of the [`Parser`](Parser.java) class so that it transforms an array of strings containing integers to an actual array of integers. 
Make sure that:

- If even one of the strings in the input array cannot be parsed to an `int` the method should fail and throw an `IllegalArgumentException` exception with a descriptive message of the error.  

- When throwing an `IllegalArgumentException`, chain it with the exception that triggered it.

- Your function should parse both positive and negative numbers.

Usage example:

```java
Parser.parseToInt(new String[]{"1", "2", "3"})
// → [1, 2, 3]
```

Your solution should pass all test cases defined in [`ParserTest.java`](../../../test/java/ex4/ParserTest.java).