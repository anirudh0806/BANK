# Bank Management System in Java with SQL



This project is a Bank Management System implemented in Java and integrated with a SQL database. It provides basic banking functionalities such as creating accounts, making transactions, checking balances, and managing customer information. The project utilizes Java for the front-end interface and communication, while SQL is used for storing and managing customer data.

## Features

1. Account Creation: Users can create new bank accounts with personal information.
2. Deposit and Withdrawal: Account holders can deposit and withdraw funds from their accounts.
3. Balance Inquiry: Customers can check their account balances at any time.
4. Transaction History: The system keeps track of transaction history, providing users with a record of their financial activities.
5. Customer Management: Admins can manage customer information, including updating details and deleting accounts.
   
## Technologies Used

1. Java: Used for the front-end logic and user interface.
2. SQL: Employed for database management and data storage.
3. JDBC (Java Database Connectivity): Used for connecting Java application to the SQL database.

## Installation

1. Clone the Repository: Clone this repository to your local machine using 'git clone https://github.com/anirudh0806/bank.git'.

2. Database Setup: Install and set up a SQL database (MySQL, PostgreSQL, etc.). Create a new database named 'bank_management' and import the provided SQL schema file 'schema.sql' to set up the necessary tables.

3. Configure Database Connection: Open the 'DatabaseConnection.java' file and modify the database connection details (URL, username, password) to match your database configuration.

4. Compile and Run: Navigate to the project directory and compile the Java files using 'javac *.java'. Then, run the main application using 'java Main'.
