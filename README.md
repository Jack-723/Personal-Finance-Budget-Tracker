# Personal Finance & Budget Tracker

Java Group Project - Computer Programming 2

## Project Status
- ✅ Database setup complete
- ✅ User authentication backend ready (DAO, Models)
- 🚧 Login UI (In Progress)

## Setup Instructions

### Prerequisites
- JDK 11 or higher
- IntelliJ IDEA
- SQLite JDBC Driver (included in `lib` folder)

### How to Run
1. Clone the repository
2. Open in IntelliJ IDEA
3. Add `lib/sqlite-jdbc-3.51.0.0.jar` to project libraries:
    - `File` → `Project Structure` → `Libraries` → `+` → Select JAR
4. Run `Main.java` to test database functionality

## Database Structure

### Users Table
- `user_id` (Primary Key)
- `username` (Unique)
- `password`
- `email`
- `full_name`
- `created_at`

## Team Members
- Jack Samawi
- Omar el Hajj
- Salmane Mouhib
- Kenny Tohme
- Adrian Da Silva


## Branch Strategy
- `main` - Production ready code
- `feature/authentication-database` - Current development
- Each member works in their own feature branch
```