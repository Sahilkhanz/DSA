# HasMap in Java

A hashMap is a part of Java's Collection framework and implements the Map interface. It stores element in the key-value pairs.

- Keys are Unique, If we try to insert a duplicate, it replaces the existing value of the corresponding key.
- Value can be duplicated.
- internally uses **hashing**, hence allows efficeint key-based retrivel, insertion and removeal with an average of O(1) time.
- Not synchronized (unlike hashTabel in java) and hence faster for most cases.
- Allows to store the null keys as well, but there should be only one key object. Multiple values can be null.

---

## HashMap Declaration

> pulbic class HasMap<K,V> extends AbstractMap<K,V> implementsMap<K,M>, Clonable Serializable

It takes two parameters namely as follows:

- The types of keys maintained by this map
- The type if mapped values

> **Note**
> Keys and values in a HashMap cannot be primitve types.
>
> - Keys must be objects that implement hasCode() and equals(), and should be immutable so their hash code and equality remains constant.
> - Values can be wrapper classes, custom objects arrays, reference types or null.
> - Example: Arrays can be used as vlaues but not as keys.

## Hierarcky of HashMap

> Map ← implemets ← HashMap

## Capacity of HashMap

The capacity of a HashMap is the number if buckets it can hold for storing entries.

> new capacity = old capacity x 2

- **Default capacity**: default capacity of hashMap os **16**.
- **Load Factor**: **0.75** (default): when **75%** of the capacity is filled, the capacilty is **doubled**;

## HashMap Constructors

HasMap provides 4 constructor and the access modifier of each is public.

**_1._ HaspMap():**

It is the default construcotr which createa an instance of HashMap with ab initial capacity of 16 and a load factor of 0.75.

    Syntax : HashMap<K,V> hm = new hashMap<K,V>();

**_2._ HashMap(int initialcapacity)**:

It create a hashMap instance with a specified initial capacity and load factor of 0.75.

    Syntax: HashMap<K,V> hm = new HashMap<K,V>(int initialCapacity);

**_3._ HashMap(int initialCapacity, float loadFactor)**:

It create a hashMap instance with a specified initial capacity and apecified load factor.

    Syntax: HashMap<K,V> hm = new HashMapK,V>(int initialCapacity, float loadFactor);

**_4._ HashMap(Map map)**:

It creates an instance of HashMap with the same Mappings as the specified map.

    Syntax: HashMap<K,V> hm = new HashMap<K,V>(Map map);

---

## 2. Changing Elements in HashMap

After adding the element if we wish to change the element, it can be done by again adding the element eith the put(), method ,Since the elemets in the map arre indexed using the keys, the value of the key can be changed by simply inserting the updated value for the key for which we wish to change.

## 3. Removing the element from the HashMap

To remove element from the Map, we can use the remove() method. This method takes the key value and removes the mapping for a key this map if it is present in the map.

## 4. Traverse of HashMap

We can use the Iterate to traverse over any structure of the Collection FRamework. Since Iterates work with one type of data we use Entry< ? , ? > to resovle the two separate types into a compatible format. Then using the next() method we print the enetries of HashMap.

_Example:_

```
HashMap<Integer, String> hm1 = new HashMap<Integer, String>();

// Adding elements using the put method custom input elements
hm1.put(1, "one");
hm1.put(2, "two");
hm1.put(3, "three");
hm1.put(4, "four");
hm1.put(5, "five");
hm1.put(6, "six");

// remove
hm1.remove(6);
// update
hm1.put(2, "twelve");

//Iterate the map using for-each loop
for (Map.Entry<Integer, String> element : hm1.entrySet())
    System.out.println("Key: " + element.getKey() + " Value: " + element.getValue());

```


## Time and Space Complexity

HashMap provide constant time complexity for basic opertation.

| Methods | Time Complexity | Space Complexity |
|---------|-----------------|------------------|
| Adding Elements in HashMap in HashMap | O(1) | O(N) |
| Removing Elements in HashMap in HashMap | O(1) | O(N) |
| Extracting Elements in HashMap in HashMap | O(1) | O(N) |

## Synchronized HashMap
HashMap is unsynchronized, meaning the multiple threads can access it at the same time. If at least one thread modifies it, you must synchronized externally (wrap with Collections.synchronizedAmp()), to prevent concurrent access issues.

    Map m = Collections.synchronizedMap( new HasMap(...));

Now the map is synchronized. Iterates of this class are fail-fast if any structure modification is done after the creation of the iterator, in any way except through the iterators, in any except through the iterators remove method. In a failure of an iterator, it will throw ConstructorModificationException.

```
HashMap is mainly the implementation of hashing.It is useful when we need efficient implmenetation of search, insert and delete operations. 
```

---

## Methods of HashMap
> K - The type of the keys in the map.
> V - The type of values mapped in the map.