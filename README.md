# 📚 Library Management System 

This project is a Library Management System implemented in Java, designed to demonstrate a strong understanding of:

- Object-Oriented Programming (OOP)
- SOLID principles
- Core Java concepts
- Common design patterns

Note: This assignment focuses on demonstrating your understanding of Java and OOP concepts. Don't worry about persistence, databases, or external APIs at this stage.

## Features

### Book Management
- Add, update, and remove books
- Search books by ISBN
- Track book availability (available / borrowed)

### Patron Management
- Add and manage library patrons
- Track patron borrowing history

### Lending Process
- Checkout books to patrons
- Return books
- Prevent double borrowing of the same book

### Inventory Management
- Track borrowed and available books in real time

## Design Principles Used

### Object-Oriented Programming

- Encapsulation – Internal state hidden behind methods
- Abstraction – Service and repository interfaces
- Polymorphism – Interface-based implementations
- Inheritance – Domain model reuse where applicable

### SOLID Principles

- SRP(Single Responsibility Principle) – Each class has one responsibility.
- OCP(Open Close Principle) – Easy to extend services without modification.
- LSP(Liskov Substituion Principle) – Make child classes work exactly like parent classes.
- ISP(Interface Segregation Principle) – Small and focused interfaces.
- DIP(Dependency Inversion Principle) – High level code should not depend on low level code.

## Design Patterns Used 

| Pattern  | Usage                                |
| -------- | ------------------------------------ |
| Factory  | Book object creation                 | 
| Facade   | Simplified entry point to the system |


## Class Diagram

Note : Use Mermaid Plugin to view the diagram. 
Mermaid is a plugin that enables developers to create and visualize diagrams directly within the IDE using text-based definitions.



```mermaid
classDiagram

    class Book
    class Patron
    class Loan

    Loan --> Book : has
    Loan --> Patron : has

    class BookRepository
    class PatronRepository
    class LoanRepository

    class DefaultBookRepository
    class DefaultPatronRepository
    class DefaultLoanRepository

    BookRepository <|.. DefaultBookRepository
    PatronRepository <|.. DefaultPatronRepository
    LoanRepository <|.. DefaultLoanRepository

    class BookService
    class PatronService
    class LendingService

    BookService --> BookRepository
    PatronService --> PatronRepository
    LendingService --> BookRepository
    LendingService --> PatronRepository
    LendingService --> LoanRepository

    class LibraryFacade

    LibraryFacade --> BookService
    LibraryFacade --> PatronService
    LibraryFacade --> LendingService

