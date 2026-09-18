# 🏦 Bank Management System — Java

A **console-based Bank Management System** developed using **Core Java and Object-Oriented Programming (OOP)** concepts.

The project simulates basic banking operations such as customer management, account creation, deposits, withdrawals, money transfers, transaction history, loan management, and ATM operations.

---

## 📌 Project Overview

The **Bank Management System** is designed to provide a simple simulation of how a banking application works.

The system allows users to:

* 👤 Register customers
* 🏦 Create bank accounts
* 💰 Deposit money
* 💸 Withdraw money
* 🔄 Transfer money between accounts
* 💳 Check account balance
* 📜 View transaction history
* 🏠 Create and manage loans
* 🏧 View ATM information
* 🔍 Manage and display customer information

The project is completely developed using **Java**, without external frameworks or databases.

---

## ✨ Features

### 👤 Customer Management

* Add new customers
* Store customer ID, name, email, and phone number
* Display customer information
* Manage multiple accounts for a customer

### 🏦 Account Management

* Create savings/current accounts
* Generate unique account numbers
* Maintain account balance
* Search accounts
* Display account details

### 💰 Banking Operations

The system supports:

```text
Deposit
   ↓
Update Balance
   ↓
Create Transaction Record
```

and:

```text
Withdrawal
   ↓
Check Balance
   ↓
Update Balance
   ↓
Create Transaction Record
```

### 🔄 Money Transfer

Users can transfer money between two accounts.

The system checks:

* Source account
* Destination account
* Transfer amount
* Available balance

### 📜 Transaction History

Every deposit and withdrawal is recorded with:

* Transaction type
* Amount
* Description
* Date and time

### 🏠 Loan Management

The system allows users to:

* Create loans
* Store loan details
* Calculate total payable amount
* View loan status
* Close loans

### 🏧 ATM Simulation

The ATM module provides:

* Balance checking
* Deposit
* Withdrawal
* ATM information

---

# 📂 Project Structure

```text
Bank-Management-System-Java/
│
├── .gitignore
├── README.md
│
├── Account.java
├── ATM.java
├── Bank.java
├── Customer.java
├── Loan.java
├── Main.java
└── Transaction.java
```

---

# 🧩 Java Classes

| File               | Responsibility                                    |
| ------------------ | ------------------------------------------------- |
| `Main.java`        | Main program and menu-driven interface            |
| `Bank.java`        | Manages customers, accounts, transfers, and loans |
| `Customer.java`    | Stores customer information and accounts          |
| `Account.java`     | Handles account balance and banking operations    |
| `Transaction.java` | Stores transaction records                        |
| `Loan.java`        | Handles loan information and calculations         |
| `ATM.java`         | Simulates ATM operations                          |

---

# 🛠️ Technologies Used

* **Java**
* **Core Java**
* **Object-Oriented Programming**
* **ArrayList**
* **Java Scanner**
* **Java Date & Time API**

No external frameworks or libraries are required.

---

# 🧠 OOP Concepts Used

This project demonstrates several important Java OOP concepts.

### 1. Encapsulation

Class variables are declared `private` and accessed through methods.

Example:

```java
private double balance;

public double getBalance() {
    return balance;
}
```

### 2. Classes and Objects

The project uses multiple classes:

```java
Bank
Customer
Account
Transaction
Loan
ATM
```

Objects are created from these classes to represent real-world entities.

### 3. Composition

A customer can have multiple accounts:

```text
Customer
   │
   ├── Account
   ├── Account
   └── Account
```

### 4. ArrayList

`ArrayList` is used to store:

* Customers
* Accounts
* Transactions
* Loans

### 5. Constructors

Constructors initialize objects when they are created.

Example:

```java
Account account =
    new Account(
        1001,
        "Savings",
        10000
    );
```

---

# 📋 Main Menu

When the application starts, users get the following menu:

```text
==========================================
          ABC National Bank
          BANK MANAGEMENT SYSTEM
==========================================

1. Add Customer
2. Create Account
3. Deposit Money
4. Withdraw Money
5. Transfer Money
6. Check Balance
7. Display Customers
8. Transaction History
9. Create Loan
10. Display Loans
11. ATM Information
12. Exit

==========================================
Enter your choice:
```

---

# 🚀 How to Run

## Step 1 — Install Java

Make sure Java is installed on your computer.

Check the Java version:

```bash
java -version
```

Check the Java compiler:

```bash
javac -version
```

---

## Step 2 — Clone the Repository

```bash
git clone https://github.com/YOUR-USERNAME/Bank-Management-System-Java.git
```

Move into the project directory:

```bash
cd Bank-Management-System-Java
```

---

## Step 3 — Compile the Project

Compile all Java files:

```bash
javac *.java
```

---

## Step 4 — Run the Application

```bash
java Main
```

---

# 💻 Example

### Deposit

```text
Enter your choice: 3

Enter Account Number: 1001
Enter Amount: ₹5000

Deposit successful!
```

### Transfer

```text
Enter your choice: 5

From Account: 1001
To Account: 1002
Amount: ₹2000

Transfer successful!
Transferred: ₹2000
```

### Transaction History

```text
========== TRANSACTIONS ==========

--------------------------------
Type        : Deposit
Amount      : ₹5000.0
Description : Money deposited
Date        : 18-09-2026 22:10:20
--------------------------------
```

---

# 🔐 Validation

The application performs basic validation such as:

* Preventing negative deposits
* Preventing invalid withdrawals
* Checking insufficient balance
* Checking whether accounts exist
* Checking whether customers exist
* Preventing transfers to invalid accounts
* Preventing duplicate account numbers
* Validating loan information

---

# 📈 Future Improvements

The current project is a **Core Java console application**. It can be extended with:

* 🖥️ Java Swing GUI
* 🗄️ MySQL database
* 🔐 User login and authentication
* 🔑 PIN-based ATM authentication
* 📧 Email notifications
* 📱 JavaFX interface
* 📊 Banking dashboard
* 🧾 PDF statement generation
* 💳 Card management
* 🔔 Transaction notifications
* ☁️ Cloud-based database
* 🌐 Web-based banking application

---

# 🎯 Learning Objectives

This project helps demonstrate practical understanding of:

* Java programming
* OOP principles
* Classes and objects
* Encapsulation
* Constructors
* Methods
* ArrayList
* Conditional statements
* Loops
* User input
* Date and time handling
* Basic software architecture

---

# 👩‍💻 Author

**Panchami Chakraborty**

Java Developer / Student Project

---

# 📜 License

This project is created for **educational and learning purposes**.

You are free to study, modify, and improve the project.

---

## ⭐ If you found this project useful

Give the repository a ⭐ on GitHub!
# Banking-System-Core-Java
