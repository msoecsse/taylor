## Week 3

### Announcements
* Masks in class/lab starting next week
* Error in `LinkedListTests` class - remove line 194 - `add(0, x);` should not throw and `IndexOutOfBoundsException`
* Lunch with me at noon today
* ~~Lunch with me 11am Tues. and Thurs.~~
* ~~3-4pm office hour moved to noon-1pm today~~
* ~~Homework 3 includes an extra credit portion... No extra credit will be given~~

### Iterators
* [x] List the methods declared in the [`Iterator<E>`](http://javadoc.taylorial.com/java.base/util/Iterator.html) interface
* [x] List the methods declared in the [`Iterable<E>`](http://javadoc.taylorial.com/java.base/lang/Iterable.html) interface
* [x] Implement the [`iterator()`](http://javadoc.taylorial.com/java.base/util/List.html#iterator%28%29) method in the `ArrayList` class (returning a fully functional iterator)
* [x] Implement the [`iterator()`](http://javadoc.taylorial.com/java.base/util/List.html#iterator%28%29) method in the `LinkedList` class (returning a fully functional iterator)
* [x] Explain why the enhanced for loop only works on classes that implement the `Iterable<E>` interface
* [x] Be familiar with the [`ListIterator<E>`](http://javadoc.taylorial.com/java.base/util/ListIterator.html) interface

### Java Collections Framework and Testing
* [x] Explain the purpose of the Java Collections Framework
* [x] Be familiar with class/interface hierarchy for the Java Collections Framework
* [x] Describe the following levels of testing: unit, integration, system, and acceptance
* [x] Describe the differences between black-box testing and white-box testing
* [x] List advantages and disadvantages of black-box testing verses white-box testing
* [x] Develop tests that test boundary conditions

#Testing Notes
## Levels of Testing
* Unit Testing
  - Tests the smallest testable pieces of the software
  - In OOD, this is usually methods/classes
* Integration testing
  - Tests interaction among units
  - More commonly tests interaction between several classes
  - Can test interaction of methods in a single class
* System testing
  - Tests the whole program in the context it is being used
* Acceptance testing
  - System testing designed to demonstrate that the program meets its functional requirements
    
## Types of Testing
* Black-box testing
  - Assumes you don't know the implementation
  - Based on interface and functional requirements
  - Vary input values verify output values
  - Test both valid and invalid input values
* White-box testing
  - Tests with knowledge of the internal structure
  - Attempts to exercise as many paths through the code as possible
  - Code coverage metrics measure degree of coverage
    + Statement coverage
    + Branch coverage
    + Path coverage (every combination of branches through the method)
  - Testing loops
    + Body never executed
    + Body executed once
    + Body executed the maximum number of times
  - Boundary conditions are special cases that should be explicitly tested, e.g., List.add(int, E)
    + Add to empty list
    + Add to front of non-empty list
    + Add to back of non-empty list
    + Add to middle of non-empty list
    + Add with negative index
    + Add with too large index
    + Add `null` element
    + Add non-`null` element
  

