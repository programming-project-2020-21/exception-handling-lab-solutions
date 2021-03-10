## Exercise 2: Throwing exceptions

Implement the `divide()` method of the [`Divider`](Divider.java) class such that:

- it returns an array containing the quotients of the division of each value of the `dividends` array per each value of the `divisors` array 
      
- it rounds each quotient to its nearest integer

- if one of the parameters is null, it throws an `IllegalArgumentException` with an appropriate message

- if the parameters are arrays of different lengths, it throws an `IllegalArgumentException` with an appropriate message  

- if one if the dividers is zero, it throws an `IllegalArgumentException` with an appropriate message

You must use the method `readFileSize()` to retrieve the size of individual files.

```java
Divider.divide(new int[]{2, 6, 7}, new int[]{2, 2, 2})
// → [1, 3, 4]
```

Your solution should pass all test cases defined in  [`DividerTest`](../../../test/java/ex2/DividerTest.java).
