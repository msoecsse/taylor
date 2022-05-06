## Week 9

### Announcements
* ~~SLM 9~~
* ~~Lab 9 details~~
* ~~Final exam~~

### Big-O Analysis

| Data Structure | add(E) | add(int, E) | get(int) | remove(0) | remove(E) | contains(E) | iterator.remove() |
|----------------|--------|-------------|----------|-----------|-----------|-------------|-------------------|
| ArrayList      |   1*   |      n      |     1    |     n     |     n     |      n      |          n        |
| LinkedList     |   1    |      n      |     n    |     1     |     n     |      n      |          1        |
| PureStack AL   |   1*   |      .      |     .    |     1     |     .     |      .      |          .        |
| PureStack LL   |   1    |      .      |     .    |     1     |     .     |      .      |          .        |
| PureQueue AL   |   1*   |      .      |     .    |     n     |     .     |      .      |          .        |
| PureQueue LL   |   1    |      .      |     .    |     1     |     .     |      .      |          .        |
| CircularQueue  |   1    |      .      |     .    |     1     |     .     |      .      |          .        |
| ArrayDeque     |   1*   |      .      |     .    |     1*    |     .     |      .      |          .        |
| TreeSet        |  log n |      .      |     .    |     .     |   log n   |    log n    |          .        |
| HashSet        |   1*   |      .      |     .    |     .     |     1     |      1      |          .        |
| Heap/PriorityQ |  log n |      .      |     .    |     .     |   log n+  |      .      |          .        |

* *Amortized time
* +only largest element can be removed

#### Red-Black Trees
* All nodes are either black or red
* The null at the end of a branch as black
* A red node must have a black parent
* The number of black nodes from root to all nulls is the same

### Balanced Trees

* [x] Describe the impact that balance has on the performance of binary search trees
* [x] Implement the `leftRotate()` and `rightRotate()` methods for a binary tree
* [x] Explain the mechanism used in AVL trees to ensure that they remain balanced
* [x] Illustrate the steps required to balance an AVL tree upon insertion of an additional element

### Deep verses Shallow Copies

* [ ] Distinguish between copying a reference and copying an object
* [ ] Demonstrate proper use of `==` and `.equals()`
* [ ] Describe approaches to making deep copies, e.g., `clone()` and copy constructors
