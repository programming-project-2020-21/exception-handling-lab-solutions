## Exercise 3: Creating your own exception types

Implement the [`MyStack`](MyStack.java) class such that:

- it can hold only `int` values

- the elements on the stack are stored in an array
  
- the maximum size of the stack is fixed and defined when constructing an instance of `MyStack`  

- `getSize()` returns how many elements the stack currently contains

- `getMaxSize()` returns maximum number of elements the stack can hold
      
- `push()` adds an element to the top of the stack. If that stack is full, it should throw an `FullStackException`

- `pop()` removes the element from the top of the stack and returns it. If that stack is empty, it should throw an `EmptyStackException`

- `peek()` returns the element from the top of the stack without removing it. If that stack is empty, it should throw an `EmptyStackException`

- both `EmptyStackException` and `FullStackException` are custom unchecked exceptions that you must create

- Instances of `EmptyStackException` should display the message `"Cannot perform operation. The stack is empty!"`

- Instances of `FullStackException` should display messages following the template `"Cannot add 30 to the stack. The stack reached its maximum capacity of 2."`, where 30 is the value pushed to the stack and 2 is the number of values the stack can hold.

Usage example:

```java
MyStack stack = new MyStack(3);

stack.push(10);
stack.push(20);
// → [10, 20]

stack.pop()
// → [10]

stack.push(30);
// → [10, 30]
```

Your solution should pass all test cases defined in [`MyStackTest`](../../../test/java/ex3/MyStackTest.java), [`EmptyStackExceptionTest`](../../../test/java/ex3/EmptyStackExceptionTest.java), and [`FullStackExceptionTest`](../../../test/java/ex3/FullStackExceptionTest.java).

Read more about stacks and how they work at https://en.wikipedia.org/wiki/Stack_(abstract_data_type)
