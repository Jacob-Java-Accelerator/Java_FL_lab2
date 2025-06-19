# Java_FL_lab2

## Table of Contents

- [Lab 1: Spring Boot Project](#lab-1-spring-boot-project)
  - [Overview](#overview)
  - [Project Structure](#project-structure)
  - [How It Works](#how-it-works)
  - [How to Run](#how-to-run)
  - [Dependencies](#dependencies)
- [Lab 2: Data Structures and Algorithms (DSA)](#lab-2-data-structures-and-algorithms-dsa)
  - [Overview](#overview-1)
  - [Project Structure](#project-structure-1)
  - [Implemented Data Structures & Algorithms](#implemented-data-structures--algorithms)
  - [How to Run](#how-to-run-1)
  - [Dependencies](#dependencies-1)

---

## Lab 1: Spring Boot Project

### Overview

This lab demonstrates a simple Spring Boot application that prints a message to the console using dependency injection and component scanning.

### Project Structure

```
Fl_lab2_SpringProject1/
  ├── src/
  │   └── main/
  │       ├── java/com/roczyno/fl_lab2_springproject1/
  │       │   ├── FlLab2SpringProject1Application.java
  │       │   ├── MessagePrinter.java
  │       │   ├── MessageService.java
  │       │   └── MessageServiceImpl.java
  │       └── resources/
  │           └── application.properties
  └── pom.xml
```

### How It Works

- **FlLab2SpringProject1Application.java**: The main entry point. It starts the Spring context and retrieves the `MessagePrinter` bean to print a message.
- **MessagePrinter.java**: A Spring component that depends on `MessageService` and prints its message.
- **MessageService.java**: An interface defining a method to get a message.
- **MessageServiceImpl.java**: Implementation of `MessageService` that returns "Hello World!".

### How to Run

1. Ensure you have Java 17+ and Maven installed.
2. Navigate to `Fl_lab2_SpringProject1` directory.
3. Run:
   ```
   ./mvnw spring-boot:run
   ```
   or
   ```
   mvn spring-boot:run
   ```
4. You should see "Hello World!" printed in the console.

### Dependencies

- Spring Boot Starter Web
- Spring Boot Starter Test (for testing)

---

## Lab 2: Data Structures and Algorithms (DSA)

### Overview

This lab contains Java implementations of fundamental data structures and algorithms, including arrays, linked lists, stacks, queues, and sorting/searching algorithms.

### Project Structure

```
lab2Dsa/
  ├── src/
  │   └── main/
  │       └── java/org/example/
  │           ├── Array.java
  │           ├── LinkedList.java
  │           ├── Stack.java
  │           ├── Queue.java
  │           ├── BubbleSort.java
  │           ├── SelectionSort.java
  │           ├── BinarySearch.java
  │           ├── LinearSearchAlgo.java
  │           └── Main.java
  └── pom.xml
```

### Implemented Data Structures & Algorithms

- **Array.java**: Dynamic array for storing student names, with add, remove, find, and list operations.
- **LinkedList.java**: Singly linked list with add (first, last, at position), search, delete, and print operations.
- **Stack.java**: Integer stack with push, pop, and arithmetic operations (add, subtract, multiply, divide).
- **Queue.java**: Circular integer queue with add and remove operations.
- **BubbleSort.java**: Implements bubble sort algorithm for integer arrays.
- **SelectionSort.java**: Implements selection sort algorithm for integer arrays.
- **BinarySearch.java**: Recursive binary search for sorted integer arrays.
- **LinearSearchAlgo.java**: Linear search for integer arrays.
- **Main.java**: Entry point (currently prints "Hello world!").

### How to Run

1. Ensure you have Java 17+ and Maven installed.
2. Navigate to `lab2Dsa` directory.
3. Compile and run the project:
   ```
   mvn compile
   mvn exec:java -Dexec.mainClass="org.example.Main"
   ```
   _(You may need to add the Maven Exec plugin to `pom.xml` if not present.)_

### Dependencies

- No external dependencies; uses standard Java.

---
