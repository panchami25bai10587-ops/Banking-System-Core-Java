# 🏦 Bank Management System — Project Statement

## 1. Project Title

**Bank Management System using Java**

---

## 2. Problem Statement

Managing banking operations manually can be time-consuming and may lead to errors while maintaining customer, account, transaction, and loan information.

The **Bank Management System** is developed to provide a simple computerized solution for managing basic banking activities.

The system allows bank staff or users to manage customers, create accounts, perform financial transactions, maintain transaction records, manage loans, and simulate ATM operations through a menu-driven Java application.

---

## 3. Aim of the Project

The main aim of this project is to develop a **Core Java-based Bank Management System** that demonstrates how Object-Oriented Programming concepts can be applied to a real-world banking scenario.

---

## 4. Objectives

The major objectives of the project are:

1. To create and manage customer records.
2. To create and manage bank accounts.
3. To maintain account balances.
4. To provide deposit functionality.
5. To provide withdrawal functionality.
6. To support money transfers between accounts.
7. To maintain transaction history.
8. To manage basic loan information.
9. To simulate basic ATM operations.
10. To demonstrate Java OOP concepts in a practical project.

---

## 5. Scope of the Project

The system covers the following areas:

### Customer Management

* Add customers
* Store customer information
* Search customers
* Display customer details

### Account Management

* Create accounts
* Store account numbers
* Support different account types
* Maintain account balances
* Display account information

### Transaction Management

* Deposit money
* Withdraw money
* Transfer money
* Record transaction details
* Display transaction history

### Loan Management

* Create loan records
* Store loan information
* Calculate total payable loan amount
* Display loan details
* Maintain loan status

### ATM Management

* Display ATM information
* Check account balance
* Deposit money
* Withdraw money

---

## 6. Technologies Used

| Technology    | Purpose                   |
| ------------- | ------------------------- |
| Java          | Main programming language |
| Core Java     | Application development   |
| OOP           | Program design            |
| ArrayList     | Data storage              |
| Scanner       | User input                |
| LocalDateTime | Transaction date and time |

---

## 7. Project Modules

The project is divided into seven Java classes.

### `Main.java`

Acts as the entry point of the application and provides the menu-driven interface.

### `Bank.java`

Acts as the central management class for customers, accounts, transfers, and loans.

### `Customer.java`

Stores customer details and manages accounts belonging to a customer.

### `Account.java`

Stores account information and performs deposit and withdrawal operations.

### `Transaction.java`

Stores transaction type, amount, description, and date/time.

### `Loan.java`

Stores loan information and calculates the total payable amount.

### `ATM.java`

Provides basic ATM-related operations such as balance checking, deposits, and withdrawals.

---

## 8. Functional Requirements

The system should allow the user to:

```text
1. Add Customer
2. Create Account
3. Deposit Money
4. Withdraw Money
5. Transfer Money
6. Check Balance
7. Display Customers
8. View Transaction History
9. Create Loan
10. Display Loans
11. View ATM Information
12. Exit
```

---

## 9. Non-Functional Requirements

The system should:

* Be easy to use.
* Provide clear menu options.
* Validate basic user input.
* Prevent invalid financial operations.
* Maintain data during program execution.
* Use modular and reusable Java classes.
* Demonstrate proper object-oriented design.

---

## 10. OOP Concepts Implemented

The project demonstrates:

### Encapsulation

Data members are declared private and accessed through public methods.

### Abstraction

Banking operations are represented through methods such as:

```java
deposit()
withdraw()
transfer()
createAccount()
```

### Composition

A `Customer` can contain multiple `Account` objects.

```text
Customer
   │
   ├── Account
   ├── Account
   └── Account
```

### Classes and Objects

Real-world entities are represented using Java classes:

```text
Bank
Customer
Account
Transaction
Loan
ATM
```

---

## 11. System Flow

```text
              START
                │
                ▼
        Display Main Menu
                │
                ▼
        Select Operation
                │
       ┌────────┼─────────┐
       │        │         │
       ▼        ▼         ▼
   Customer  Account   Transaction
   Management Management Management
       │        │         │
       └────────┼─────────┘
                │
                ▼
          Loan / ATM
          Operations
                │
                ▼
          Display Result
                │
                ▼
          Return to Menu
                │
                ▼
              EXIT
```

---

## 12. Expected Outcome

After successful execution, the system should allow the user to perform basic banking operations through a simple command-line interface.

The application should correctly:

* Store customer information.
* Create bank accounts.
* Update account balances.
* Process deposits and withdrawals.
* Transfer money between accounts.
* Record transaction information.
* Store and display loan details.
* Simulate basic ATM operations.

---

## 13. Limitations

This project is designed primarily for educational purposes.

Current limitations include:

* Data is stored only during program execution.
* No permanent database is connected.
* No real banking network is used.
* No real financial transactions are performed.
* Authentication and authorization are not implemented.
* The application currently uses a console-based interface.

---

## 14. Future Enhancements

The project can be expanded by adding:

* MySQL database integration
* Java Swing or JavaFX GUI
* User authentication
* ATM PIN authentication
* Account statements
* Interest calculation
* Multiple loan repayment options
* Email notifications
* Admin dashboard
* Role-based access
* PDF statement generation
* REST API integration
* Web-based interface

---

## 15. Educational Purpose

This project is intended to demonstrate the practical application of **Core Java and Object-Oriented Programming** concepts.

It can be used as a:

* College mini project
* Java OOP project
* Programming assignment
* GitHub portfolio project
* Learning project

---

## 16. Project Declaration

This project has been developed as an educational implementation of a banking management system. It is a software simulation and does not represent an actual banking service or financial institution.

---

## 17. Author

**Panchami Chakraborty**

**Project:** Bank Management System using Java

**Technology:** Core Java

---

## 18. Conclusion

The **Bank Management System** provides a structured way to simulate common banking operations using Java.

The project demonstrates how real-world entities such as banks, customers, accounts, transactions, loans, and ATMs can be represented using Java classes and how these classes can interact to form a complete application.

The project also provides a foundation for future development into a database-driven, GUI-based, or web-based banking application.
