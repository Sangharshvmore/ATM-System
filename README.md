Here’s a cleaned-up and combined version of your `README.md` for the **ATM System** project, with an added license section at the end:

---

# ATM System

This project is a simple command-line Automated Teller Machine (ATM) simulation written in Java. It allows users to perform basic banking operations such as withdrawing money, depositing money, and checking their account balance.

## Features

* **Withdraw Money:** Allows users to withdraw money if sufficient balance is available.
* **Deposit Money:** Allows users to deposit money into their account.
* **Check Balance:** Displays the current account balance.
* **Input Validation:** Ensures that only positive amounts can be deposited or withdrawn.
* **Password Authentication:** (`atmsystem.java` only) Requires a password to access the ATM system. The default password is `1234`.

## Files

* `atm.java`: Basic ATM functionality (withdraw, deposit, check balance) without authentication.
* `atmsystem.java`: ATM functionality with password authentication for added security.

## How to Run

1. **Compile the Java files:**

   ```sh
   javac atm.java
   javac atmsystem.java
   ```

2. **Run the program:**

   * To run the basic ATM:

     ```sh
     java atm
     ```
   * To run the ATM with authentication:

     ```sh
     java atmsystem
     ```

## Usage

* Follow the on-screen menu to select an operation:

  1. Withdraw
  2. Deposit
  3. Check Balance
  4. Exit
* Enter the required amounts when prompted.
* For `atmsystem.java`, you must enter the correct password (`1234`) to access the menu.

## Notes

* The account balance is initialized to 100,000 units each time the program runs.
* This is a simple simulation and does not persist data between runs.
* Intended for educational and demonstration purposes only.

## License

This project is licensed under the **MIT License**.
You are free to use, modify, and distribute this code for educational, personal, or commercial purposes with proper attribution.

---
