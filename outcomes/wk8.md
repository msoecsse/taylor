## Week 8

### Announcements
* ~~Exam II: High: 100% Median: 92%, Low: 47%~~
* Office hours today: 7-8am, ~~9-10am~~, 10-11am, 1-2pm
* Invitation to attend demo lecture for faculty candidate 9am today in DH210

### Sets and Maps

* [ ] Use the [`Set<E>`](http://javadoc.taylorial.com/java.base/util/Set.html) and [`Map<K, V>`](http://javadoc.taylorial.com/java.base/util/Map.html) interfaces defined in the Java Collections Framework
* [ ] Choose the appropriate interface to use from the following choices: `Collection<E>`, `List<E>`, `Set<E>`, and `Map<K, V>`
* [ ] List two classes that implement the `Map<K, V>` interface
* [ ] Interpret and write Java code using the `TreeMap` and `TreeSet` classes
* [ ] State and explain the asymptotic time complexity of the following methods from a `TreeSet`: `add(E)`, `clear()`, `contains(Object)`, `isEmpty()`, `remove(Object)`, and `size()`

### Hash Tables

* [ ] Describe how elements are added to a hash table
* [ ] Describe how elements are removed from a hash table
* [ ] Explain the **capacity** of a hash table and how it is used
* [ ] Define the **load factor** of a hash table and explain how it is used
* [ ] Define a **collision** as it relates to hash tables and describe ways of coping with collisions
* [ ] Describe the **open addressing** method for dealing with collisions within a hash table
* [ ] Describe the **chaining** method for dealing with collisions within a hash table
* [ ] Write a hash table implementation (using chaining) that includes the following methods:
    * [ ] [`add(E)`](http://javadoc.taylorial.com/java.base/util/Set.html#add%28E%29)
    * [ ] [`clear()`](http://javadoc.taylorial.com/java.base/util/Set.html#clear%28%29)
    * [ ] [`contains(Object)`](http://javadoc.taylorial.com/java.base/util/Set.html#contains%28java.lang.Object%29)
    * [ ] [`isEmpty()`](http://javadoc.taylorial.com/java.base/util/Set.html#isEmpty%28%29)
    * [ ] [`remove(Object)`](http://javadoc.taylorial.com/java.base/util/Set.html#remove%28java.lang.Object%29)
    * [ ] [`size()`](http://javadoc.taylorial.com/java.base/util/Set.html#size%28%29)
* [ ] Explain why the `Object.hashCode()` method must be overridden if the `Object.equals()` method is overridden
* [ ] Describe the criteria for a good `hashCode()` implementation
* [ ] Interpret and develop simple hashing functions
* [ ] Interpret and write Java code using the `HashMap` and `HashSet` classes
* [ ] State and explain the asymptotic time complexity of the following methods from a `HashSet`: `add(E)`, `clear()`, `contains(Object)`, `isEmpty()`, `remove(Object)`, and `size()`
