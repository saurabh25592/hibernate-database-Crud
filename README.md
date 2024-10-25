<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Hibernate CRUD Example Project</title>
</head>
<body>

<h1>Hibernate CRUD Example Project</h1>

<p>A simple Java application demonstrating CRUD (Create, Read, Update, Delete) operations with Hibernate ORM. This project provides a foundation for understanding and using Hibernate for object-relational mapping (ORM) in Java.</p>

<h2>Overview</h2>
<p>This project uses Hibernate ORM to map the <code>Employee</code> entity class to a relational database, enabling object-oriented database interactions. It covers core Hibernate operations such as inserting, updating, and retrieving employee data, showcasing the use of Hibernate annotations, session management, and the Criteria API.</p>

<h2>Features</h2>
<ul>
    <li><strong>Object-Relational Mapping (ORM)</strong>: Automatically maps Java objects to database tables.</li>
    <li><strong>CRUD Operations</strong>: Supports Create, Read, Update, and Delete operations on <code>Employee</code> records.</li>
    <li><strong>Criteria API</strong>: Uses the Criteria API to fetch data in an object-oriented manner.</li>
    <li><strong>Transaction Management</strong>: Ensures database consistency with transaction handling.</li>
    <li><strong>Configurable Database Connection</strong>: Easily switch database settings in <code>hibernate.cfg.xml</code>.</li>
</ul>

<h2>Technologies Used</h2>
<ul>
    <li><strong>Java</strong>: Core language for development.</li>
    <li><strong>Hibernate ORM</strong>: Main ORM framework for database operations.</li>
    <li><strong>Jakarta Persistence (JPA)</strong>: Standard API for persistence in Java.</li>
    <li><strong>MySQL</strong> (or other relational databases): Example database configuration (can be adapted to other databases).</li>
</ul>

<h2>Installation</h2>
<ol>
    <li><strong>Clone the Repository</strong>
        <pre><code>git clone https://github.com/your-username/hibernate-crud-example.git
cd hibernate-crud-example</code></pre>
    </li>
    <li><strong>Add Dependencies</strong>
        <p>Ensure you have the necessary dependencies in your <code>pom.xml</code> (Maven) or <code>build.gradle</code> (Gradle) for Hibernate, JPA, and your preferred database (e.g., MySQL).</p>
    </li>
    <li><strong>Configure Database</strong>
        <p>Update <code>hibernate.cfg.xml</code> with your database details:</p>
        <pre><code>&lt;hibernate-configuration&gt;
    &lt;session-factory&gt;
        &lt;property name="hibernate.dialect"&gt;org.hibernate.dialect.MySQLDialect&lt;/property&gt;
        &lt;property name="hibernate.connection.driver_class"&gt;com.mysql.cj.jdbc.Driver&lt;/property&gt;
        &lt;property name="hibernate.connection.url"&gt;jdbc:mysql://localhost:3306/your_database&lt;/property&gt;
        &lt;property name="hibernate.connection.username"&gt;your_username&lt;/property&gt;
        &lt;property name="hibernate.connection.password"&gt;your_password&lt;/property&gt;
        &lt;property name="hibernate.hbm2ddl.auto"&gt;update&lt;/property&gt;
    &lt;/session-factory&gt;
&lt;/hibernate-configuration&gt;
</code></pre>
    </li>
    <li><strong>Compile and Run</strong>
        <p>Compile the project and run individual classes (e.g., <code>Insert</code>, <code>Update</code>, <code>FletchAllData</code>) to test CRUD operations.</p>
    </li>
</ol>

<h2>Usage</h2>
<ul>
    <li><strong>Insert Employee Data</strong>: Run <code>com.main.Insert</code> to add new employee records.</li>
    <li><strong>Update Employee Data</strong>: Run <code>com.main.Update</code> to modify existing employee records.</li>
    <li><strong>Fetch All Employees</strong>: Run <code>com.main.FletchAllData</code> to retrieve all employees from the database.</li>
</ul>

<h3>Code Example</h3>
<p>Here is a simple code snippet for inserting a new employee:</p>
<pre><code>Employee employee = new Employee();
employee.setName("John Doe");
employee.setSalary("60000");
employee.setAge(30);

Session session = sessionFactory.openSession();
Transaction transaction = session.beginTransaction();

session.persist(employee);
transaction.commit();
session.close();
</code></pre>

<h2>Contributing</h2>
<p>We welcome contributions to improve this project! Please follow these steps:</p>
<ol>
    <li><strong>Fork the Repository</strong>: Create a personal fork of the project.</li>
    <li><strong>Clone Your Fork</strong>: Clone your forked repository to your local machine.</li>
    <li><strong>Create a New Branch</strong>: Create a branch for your changes (<code>git checkout -b feature-branch</code>).</li>
    <li><strong>Make Your Changes</strong>: Implement your feature or fix.</li>
    <li><strong>Push Changes to Your Fork</strong>: Commit and push your changes.</li>
    <li><strong>Submit a Pull Request</strong>: Create a pull request to merge your changes.</li>
</ol>

<p>Please ensure your code adheres to the project’s coding standards and includes relevant documentation.</p>

<p>This project provides a foundational understanding of Hibernate and can be extended to support more complex mappings, queries, and configurations.</p>

</body>
</html>
