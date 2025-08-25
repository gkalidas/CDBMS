# CDBMS - Customized Database Management System

CDBMS is a **Java-based educational DBMS** that demonstrates how a database system can be built from scratch.
It provides a menu-driven console interface where users can perform common database operations such as inserting, querying, deleting, and backing up employee records.

---

## ✨ Features

* Insert new employee records
* View all records (`SELECT *`)
* Search employee by **ID** or **Name**
* Delete employee by **ID**
* Backup and restore data using serialization
* Menu-driven console application

---

## 📂 Project Structure

```
CDBMS/
 ├── src/
 │   └── cdbms/
 │       ├── Employee.java
 │       ├── CDBMS.java
 │       ├── CDBMSApplication.java
 │       └── ... (other Java files)
 ├── practice/
    ├── Program831.java
    ├── *.java
    ├── Program847.java
    └── Program847.java
├── docs/
    └── HISTORY.md
└── README.md
```

* `src/cdbms/` → All Java source files.
* `practice/` → All practice programs.
* `docs/` → All docs related to the proejct.
* `HISTORY.md` → Keeps track of incremental changes made to each program.

---

## 🚀 How to Run

1. Navigate to the `src` directory and compile the code into a `bin` folder:

   ```bash
   cd src
   javac cdbms/*.java
   ```

2. Run the application:

   ```bash
   java cdbms.CDBMSApplication
   ```

---

## 🖥️ Sample Usage

Example menu:

```
-------- Welcome to CDBMS ----------
1: Insert into Employee
2: Select * from Employee
3: Take a backup of Table
4: Select * from Employee where EmpID
5: Select * from Employee where EmpName
6: Delete * from Employee where EmpID
20: Terminate the DBMS
```

* Insert an employee
* Query employees by ID or Name
* Delete records
* Take or restore backups

---

## 📜 History

Check the full changelog in [`docs/HISTORY.md`](./docs/HISTORY.md)

---

## 🔮 Future Enhancements

* Implement `UPDATE` queries
* Add more SQL-like syntax
* Support multiple tables
* Improve persistence with databases instead of file serialization
* Add more database-related logic incrementally.
* Convert Java programs to **Python equivalents** in later commits.
* Improve modularity and structure for easier experimentation.
