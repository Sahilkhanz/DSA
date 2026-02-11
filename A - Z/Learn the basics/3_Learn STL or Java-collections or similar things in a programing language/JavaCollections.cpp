/*

Java Collections

When you start programming in Java, the first tool you probably use to store multiple values is an array. Arrays are easy to understand: they hold a fixed number of elements of the same type, and you can access them by index. But they have a big limitation their size is fixed once created. If you suddenly need to store more elements than the array’s capacity, you’re stuck. You’d have to create a new array, copy all the old elements into it, and then add the new ones. This process is not just tedious but also error-prone and inefficient. Arrays also don’t provide built-in methods for common operations like searching, sorting, or removing elements.

This is exactly why Java Collections Framework (JCF) exists. The JCF is part of the java.util package and provides a set of ready-to-use classes and interfaces for storing and manipulating groups of objects. Collections are dynamic — meaning they can grow or shrink in size and they come with built-in methods for common operations. They also follow a consistent design, which means once you learn how to use one collection, you can quickly adapt to others.


The Concept of a Framework
The Java Collections Framework isn’t just a random set of classes it’s an organized hierarchy. At the top sits the Iterable interface, which allows objects to be looped through using the enhanced for-each loop. Then comes the Collection interface, which represents a group of elements and defines basic operations like adding, removing, checking size, and clearing elements.
From Collection, the hierarchy splits into three main branches:
List : ordered collections that can have duplicate elements.
Set : unordered collections that do not allow duplicates.
Queue : collections designed to hold elements before processing.
Alongside these is the Map interface, which isn’t technically a subtype of Collection but is still part of the framework. A Map stores data in key-value pairs, ensuring that each key is unique.

Lists
A List in Java is an ordered collection where you can store duplicate elements and access them by index. It’s perfect when the order of insertion matters or when you need to retrieve elements by position. Common implementations include:

ArrayList : internally backed by a dynamic array, offering fast random access but slower insertions and deletions in the middle.
LinkedList : based on a doubly linked list, making insertions and deletions faster but random access slower.
Vector : similar to ArrayList but synchronized, meaning it’s thread safe (however, it’s considered outdated for most use cases).
Sets
A Set represents a collection that cannot contain duplicate elements. This makes it ideal for storing unique items like usernames, IDs, or distinct values. The most common implementations are:

HashSet uses hashing for storage;
elements are unordered and operations are very
    LinkedHashSet : similar to HashSet but maintains the order in which elements are inserted.TreeSet : stores elements in a
                                                                                                        sorted(ascending) order using a balanced binary search tree, but with slower insertion and lookup times compared to hash-based sets.
Maps
Unlike Collection types, a Map stores data as key-value pairs. Each key maps to exactly one value, and keys must be unique. This is useful when you need quick lookups based on a unique identifier. Common implementations include:

HashMap : fast lookups with no guaranteed order of keys.
LinkedHashMap : maintains insertion order of keys.
TreeMap : keeps keys sorted in ascending order.
Generics and Type Safety
One of the most important features of the Collections Framework is generics. This allows you to specify the type of elements a collection will hold, providing compile-time type safety and avoiding the need for manual type casting.With generics, you prevent inserting the wrong type of data into a collection. For example:

List <String> names = new ArrayList <>();
names.add("John");
// names.add(42); // Error: incompatible type

The Collections Utility Class
The framework also includes a helper class called Collections, which provides static methods for performing common tasks like sorting, reversing, shuffling, and finding minimum or maximum elements in a collection.These methods save time and make your code cleaner. For example:

List <Integer> nums = Arrays.asList(3, 1, 4, 2);
Collections.sort(nums);
Collections.reverse(nums);

How They Work Internally
Hash-based collections like HashMap and HashSet use a hash table internally for fast insertion and lookup.
Tree-based collections like TreeSet and TreeMap use Red-Black trees to store elements in sorted order.
ArrayList uses a resizable array internally, doubling its capacity when needed.
LinkedList uses nodes connected in a sequence, each holding data and links to the previous and next nodes.

*/