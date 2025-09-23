# 📜 Project History – CDBMS

This file keeps track of learning progress and practice programs.

---

## ✅ Program 832

**File:** `practice/program832.java`  
**Date:** (add date here)

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
**Date:** [Add the date you created it]

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
