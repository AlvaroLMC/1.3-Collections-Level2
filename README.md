# 📅 Java Exercise: Collections-Level 2

## 📌 Description

###  Exercise 1

This Java project involves creating a class named `Restaurant` with two attributes: `name` (String) and `score` (int). The main objective is to implement the necessary methods to prevent duplicate `Restaurant` objects from being added to a `HashSet`.

A `Restaurant` object is considered a duplicate if it has the **same name and the same score** as another one. It's important to note that **restaurants with the same name but different scores are allowed**.

The project includes a main class where a `HashSet<Restaurant>` is created and tested with different combinations of names and scores.

###  Exercise 2

This project consists of creating a Java class named `Restaurant` with two attributes: `name` (String) and `score` (int). The main goal is to ensure that no two `Restaurant` objects with the same name and the same score can be inserted into a `HashSet`. However, restaurants with the same name but different scores are allowed.

Additionally, the implementation ensures that `Restaurant` objects are **sorted by name in descending order**, and when names are equal, **by score in descending order** as well.

---

## 🛠️ Technologies Used

- Java 17
- IntelliJ IDEA
- JDK (Java Development Kit)  

---

## 📋 Requirements

Before running the project, make sure you have the following installed:

- ✅ Java JDK 17 or higher  
- ✅ An IDE like IntelliJ IDEA, Eclipse, or Visual Studio Code (optional)  
- ✅ Operating system: Windows, Linux, or macOS  

---

## ⚙️ Installation

1. Clone this repository or copy the source code to your local environment.
2. Open the project in your preferred editor.
3. Compile the main Java file.

---

## ▶️ Execution

Run the program with the following command (In each package):
```bash
	javac Main.java
