# JDBC (Java Database Connectivity)

> JDBC is API in Java that allows programs to connect to databases.

### JDBC Concept
- JDBC is an interface in Java that performs like a bridge between Java Program and Database.
- JDBC can work with any database as long as the Databases provide JDBC driver.
- With JDBC, we can perform :
- - Establish Connection to Database
- - Send SQL Queries to Database
- - Retrieve and Process the Result
- - Close the Connection

### How JDBC Works
> Java Program -> JDBC API -> JDBC Driver -> Database


### JDBC Components
- DriverManager, is a class in JDBC API that manages a list of database drivers. It can be used to get a connection with a database.
- Driver, is an interface in JDBC API that provides the API for registering and connecting drivers.
- Connection, is an interface in JDBC API that provides methods for connecting to a database, creating statements, executing queries and retrieving results.
- Statement, is an interface in JDBC API that provides methods to execute queries with the database. There are three types of statements: Statement, PreparedStatement (extends Statement and mor secure for SQL Injection), CallableStatement (extends PreparedStatement and used to call stored procedures). 
- ResultSet, is an interface in JDBC API that provides methods to retrieve and process the results returned by the database.
- SQLException, is an exception class in JDBC API that provides information on a database access error or other errors.

### JDBC Implementing Steps
1. Load and Register JDBC Driver
2. Establish Connection to Database
3. Create Statement
4. Execute Query
5. Process Result
6. Close Connection
7. Handle Exception


### When to use JDBC instead of ORM like Hibernate, JPA, etc.
- Applications that require high performance and need to execute complex queries.
- Applications without complex database tables relationships.
- Batch processing applications that require high performance.


