# Java Stream API Mini-Test Assignment

This repository contains solutions to a set of carefully crafted problems designed to test and demonstrate proficiency with the **Java Stream API**. The problems cover a range of difficulty levels and Stream API features such as `map`, `flatMap`, `filter`, `collect`, custom collectors, and grouping operations.

## 📌 Problem Set Overview

| #  | Title                                  | Difficulty   | Key Concepts Used                                               |
|----|----------------------------------------|--------------|------------------------------------------------------------------|
| 1  | Even Squares                           | Easy         | `filter`, `map`, `collect(toList)`                              |
| 2  | Case-Insensitive Distinct Word Count   | Easy         | `map(String::toLowerCase)`, `distinct`, `count`                 |
| 3  | Average Salary per Department          | Medium       | `groupingBy`, `averagingDouble`, `collectingAndThen`            |
| 4  | Flatten & Alphabetise                  | Medium       | `flatMap`, `filter`, `sorted`                                   |
| 5  | First Non-Repeating Character          | Medium       | `IntStream`, `groupingBy`, `LinkedHashMap`, `findFirst`         |
| 6  | Top Traders by Year                    | Medium-Hard  | `groupingBy`, `summingInt`, `sorted`, `limit`, `collectingAndThen` |
| 7  | Custom Collector - Immutable LinkedSet | Hard         | `Collector.of`, `unmodifiableSet`, insertion order preservation |
| 8  | map vs flatMap Demonstration           | Medium       | `map`, `flatMap`, `split`, `distinct`, `sorted`                 |
| 9  | Prime Partitioning Collector           | Hard         | Stateful custom collector, efficient prime check logic          |

---

> 💡 Each file contains one solution. Problems that require model classes like `Employee` or `Tx` include them inside the same file for simplicity.

---
