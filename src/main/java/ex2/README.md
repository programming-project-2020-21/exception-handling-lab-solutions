## Exercise 2: Throwing exceptions

Implement the `divide()` method of the [`Divider`](Divider.java) class such that it:

- it returns an array containing the quotients of the division of each value of the `dividends` array per each value of the `divisors` array 
      
- round each quotient to its nearest integer

- if one of the parameters is null, it should throw an `IllegalArgumentException` with an appropriate message

- if the parameters are arrays of different lengths, it should throw an `IllegalArgumentException` with an appropriate message  

- if one if the dividers is zero, it should throw an `IllegalArgumentException` with an appropriate message

You must use the method `readFileSize()` to retrieve the size of individual files.

See test cases at [`DividerTest`](DividerTest.java).

```java
Divider.divide(new int[]{2, 6, 7}, new int[]{2, 2, 2})
// → [1, 3, 4]
```

Tip: You can easily print an array using `Arrays.toString()`:

```java
Arrays.toString(new int[]{10, 15, 20})
// → [10, 15, 20]
``` 
