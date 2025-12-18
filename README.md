# Wells Fargo Financial Counselor System

## 🎯 Project Overview
A Spring Boot application for managing financial advisors, their clients, investment portfolios, and securities.

## 🏗️ Entity Relationship Diagram
```
┌─────────────┐       ┌─────────────┐       ┌─────────────┐       ┌─────────────┐
│   ADVISOR   │ 1───M │   CLIENT    │ 1───M │  PORTFOLIO  │ M───M │  SECURITY   │
├─────────────┤       ├─────────────┤       ├─────────────┤       ├─────────────┤
│ advisorId   │       │ clientId    │       │ portfolioId │       │ securityId  │
│ firstName   │       │ firstName   │       │ name        │       │ name        │
│ lastName    │       │ lastName    │       │ creationDate│       │ category    │
│ address     │       │ email       │       │ clientId(FK)│       │ purchasePrice│
│ phone       │       │ phone       │       │             │       │ purchaseDate│
│ email       │       │ advisorId(FK)│      │             │       │ quantity    │
└─────────────┘       └─────────────┘       └─────────────┘       └─────────────┘
```

## 📋 Business Logic

### **Advisor** (Financial Advisor)
- Manages multiple clients
- Has personal contact information
- **Relationship**: One Advisor → Many Clients

### **Client** (Investment Client)
- Belongs to one advisor
- Can have multiple investment portfolios
- **Relationship**: One Client → Many Portfolios

### **Portfolio** (Investment Portfolio)
- Belongs to one client
- Contains multiple securities (stocks, bonds, etc.)
- **Relationship**: Many Portfolios ↔ Many Securities

### **Security** (Investment Security)
- Represents stocks, bonds, mutual funds, etc.
- Can be held in multiple portfolios
- Tracks purchase details and quantity

## 🛠️ Technical Stack
- **Framework**: Spring Boot 3.0.4
- **Database**: H2 (in-memory)
- **ORM**: JPA/Hibernate
- **Build Tool**: Maven
- **Java Version**: 19

## 📁 Project Structure
```
src/main/java/com/wellsfargo/counselor/
├── entity/
│   ├── Advisor.java     ✅ (Provided)
│   ├── Client.java      🚧 (In Progress)
│   ├── Portfolio.java   ⏳ (To Do)
│   └── Security.java    ⏳ (To Do)
└── Entrypoint.java      ✅ (Main Application)
```

## 🎯 Current Task
Implementing JPA entities with proper relationships:
- ✅ **@Entity** annotations
- ✅ **@Id** with **@GeneratedValue** for primary keys
- ✅ **@Column** annotations for database mapping
- ✅ **@ManyToOne**, **@OneToMany**, **@ManyToMany** for relationships
- ✅ Constructors (empty + parameterized)
- ✅ Getters and setters

---
*Wells Fargo Software Engineering Program - Task 2*
