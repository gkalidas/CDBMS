# 📜 Project History – CDBMS

This file keeps track of learning progress and practice programs.

---

## ✅ Program 833

**File:** `practice/program833.java`  
**Date:** 24/sep/2025

### Description
Demonstrates Java `static` initialization and constructor behavior while implementing an auto-incrementing employee ID.

### What the code does
- Declares an `Employee` class with fields: `EmpID`, `EmpName`, `EmpAge`, `EmpAddress`, `EmpSalary`.
- Uses a `private static int Counter` and a static block to initialize the counter:
  - Static block prints `"Inside static block."` and sets `Counter = 1`.
- Constructor prints `"Inside constuctor."` each time an `Employee` is created and assigns `EmpID = Counter++`.
- In `main`, creates four `Employee` instances with different names.
- Prints the `EmpID` of each created `Employee`.

### Key learnings
- A **static block** runs once when the class is first loaded (before any object is constructed).
- A **static counter** can be used to generate unique, auto-incrementing IDs across instances.
- Constructor side-effects (like printing) run every time an object is created.
- Order of outputs demonstrates class-loading vs. object-construction timing.

## ✅ Program 832

**File:** `practice/program832.java`  
**Date:** 23/sep/2025

### Description
Small practice program that defines an `Employee` class and demonstrates object creation.

### What the code does
- Declares an `Employee` class with fields: `EmpID`, `EmpName`, `EmpAge`, `EmpAddress`, `EmpSalary`.
- Constructs an `Employee` object with explicit values: `(11, "Amit", 23, "Pune", 21000)`.
- Prints the `Employee` object using `System.out.println(eobj)`.

### Key learnings / notes
- Printing the object directly uses the default `Object.toString()` implementation, which prints a reference (class@hashcode) unless `toString()` is overridden.
- This program highlights the need to override `toString()` (or provide a display method) for meaningful object output — implemented in later versions.

### Example output (default)
Employee@1a2b3c4d // actual hex/hash will vary


## ✅ Program 831
**File:** `practice/program831.java`  
**Date:** 23/sep/2025

### 🔹 Description
This was the **first practice program** written during the journey of building the customized DBMS.  
It demonstrates:
- Declaring a **LinkedList** in Java
- Adding elements (`10, 20, 30, 40`) into it
- Printing the list contents directly

### 🔹 Key Learning
- How to use **Java Collections Framework** (`LinkedList` class).
- `LinkedList` automatically prints all elements inside square brackets when passed to `System.out.println`.
- Difference between **primitive arrays** and **collections** like `LinkedList`.

### 🔹 Output
Data from LL is : [10, 20, 30, 40]

### 🔹 Outcome
- Learned the basics of working with **LinkedList**.  
- This foundation will later be useful when storing employee records in the DBMS implementation.

---
