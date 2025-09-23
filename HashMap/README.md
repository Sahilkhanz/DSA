# 🔑 Hashing – Complete Explanation

A comprehensive guide to **hashing**, its concepts, internal workings, and applications in Java.

---

## 📌 Table of Contents

1. [Definition](#1-definition)
2. [Why Hashing?](#2-why-hashing)
3. [Key Components](#3-key-components)
4. [Good Hash Function](#4-good-hash-function)
5. [Collision](#5-collision)
6. [Load Factor](#6-load-factor)
7. [HashMap in Java (Internal Working)](#7-hashmap-in-java-internal-working)
8. [Common Hashing Interview Problems](#8-common-hashing-interview-problems)
9. [Applications of Hashing](#9-applications-of-hashing)
10. [Complexities](#10-complexities)

---

## 1. Definition

Hashing is a technique to map data (**keys**) to a fixed-size value (**hash code**) using a **hash function**.  
This hash code is then used to place and quickly retrieve the data in a **hash table**.

> 👉 Think of it as:  
> Instead of searching through the whole phonebook, you jump directly to a page using a "hash code."

---

## 2. Why Hashing?

| Data Structure                | Search Time  |
| ----------------------------- | ------------ |
| Array / Linked List           | O(n)         |
| Binary Search Tree (balanced) | O(log n)     |
| Hash Table                    | O(1) average |

⚡ That’s why hashing is widely used in **maps, sets, caches, and indexing**.

---

## 3. Key Components

**(a) Key** – The data you want to store (e.g., `"name"` or an integer).

**(b) Hash Function** – Converts the key → an integer (hash code).

```java
h("cat") = 2
h("dog") = 5
```

**(c) Hash Table** – An array-like structure where data is stored at `index = hash(key)`.

---

## 4. Good Hash Function

A good hash function should:

- Be **fast** to compute
- **Uniformly distribute** keys across the table
- Minimize **collisions**
- Be **deterministic** (same input → same output)

---

## 5. Collision

When two keys map to the same index:

```text
h("dog") = 5
h("cat") = 5   (collision!)
```

**Handling Collisions:**

### Separate Chaining (Java default)

- Each index stores a **linked list** (or **tree** in Java 8+)
- Multiple keys can be stored at the same index
- If collisions grow too much → tree is used for **O(log n)** lookup

### Open Addressing

- If index is full → try another index using **probing**:
  - **Linear Probing:** `(h + 1) % n`
  - **Quadratic Probing:** `(h+1)^2, (h+2)^2 …`
  - **Double Hashing:** use a second hash function

---

## 6. Load Factor

```text
Load Factor = Number of elements / Table size
```

- Controls when the table grows (rehashing)
- Java HashMap default load factor = 0.75
- If load factor > 0.75 → table doubles in size and all keys are rehashed

---

## 7. HashMap in Java (Internal Working)

- Implemented as **array of buckets**
- Each bucket → linked list (or tree if collisions high)

**Insertion (`put(key, value)`):**

1. Compute `hashCode()` of key
2. Convert `hashCode` → bucket index (mod table size)
3. If bucket empty → insert
4. If not empty:
   - Same key → update value
   - Different key → append to list/tree

> 👉 Lookup, insert, delete:  
> **Average O(1)**  
> **Worst O(n)** (rare in well-designed maps due to resizing + trees)

---

## 8. Common Hashing Interview Problems

- Check if subarray with 0 sum exists → **HashSet**
- Longest consecutive subsequence → **HashSet**
- Count pairs divisible by k → **HashMap**
- Anagrams → **HashMap** (character frequency)
- LRU cache → **HashMap + Doubly Linked List**

---

## 9. Applications of Hashing

- **Collections:** HashMap, HashSet, Hashtable
- **Caching:** Redis, LRU
- **Databases:** Indexing
- **Cryptography:** SHA-256, MD5
- **Load balancing:** Consistent hashing

---

## 10. Complexities

| Operation | Average | Worst Case |
| --------- | ------- | ---------- |
| Insertion | O(1)    | O(n)       |
| Deletion  | O(1)    | O(n)       |
| Search    | O(1)    | O(n)       |

---

## 🔗 References

- [Java HashMap Source Code](https://github.com/openjdk/jdk/blob/master/src/java.base/share/classes/java/util/HashMap.java)
- [GeeksforGeeks - Hashing](https://www.geeksforgeeks.org/hashing-data-structure/)
