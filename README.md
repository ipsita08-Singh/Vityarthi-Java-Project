# Vityarthi-Java-Project
A Java SE application for managing campus courses and student records.

# 1. Project Overview
The Campus Course & Records Manager (CCRM) is a console-based Java application built to handle the core administrative tasks of an educational institution. It provides a command-line interface (CLI) for managing students, courses, enrollments, and grades. The application also features utilities for data persistence through file import/export and a system for creating backups.

This project serves as a practical demonstration of Java SE capabilities, from fundamental syntax and object-oriented principles to advanced topics like the NIO.2 File API, Streams, functional interfaces, and design patterns.

# 2. Key Features:
* Student Management: Add, list, update, and deactivate student records. Enroll and unenroll students from courses.
* Course Management: Create, list, update, and search for courses. Assign instructors to courses.
* Grading & Transcripts: Record student marks, compute GPA, and print formatted student transcripts.
* Data Operations: Import and export student and course data from/to CSV-like text files.
* Backup Utility: Create timestamped backups of all application data.
* Reporting: Generate simple reports, such as GPA distribution, using the Stream API.

# 3. Java Platform Explained
Evolution of Java
JDK 1.0 (1996): The initial release.
J2SE 1.2 (1998): Introduced Swing, Collections Framework.
J2SE 5.0 (2004): Added Generics, Enums, Annotations, Autoboxing.
Java SE 7 (2011): Included NIO.2, try-with-resources, the diamond operator.
Java SE 8 (2014): A major release introducing Lambda Expressions, the Stream API, and a new Date/Time API.
Java SE 9 (2017): Introduced the Java Platform Module System.
Java SE 11 (2018): The second Long-Term Support (LTS) release after Java 8.
Java SE 17 (2021): The latest LTS release, bringing Sealed Classes and Pattern Matching for instanceof.

# 4. JDK vs. JRE vs. JVM
* JVM (Java Virtual Machine): An abstract machine that provides the runtime environment in which Java bytecode can be executed. It is platform-dependent.
* JRE (Java Runtime Environment): A software package that contains the JVM, standard libraries, and other components needed to run Java applications.
* JDK (Java Development Kit): A superset of the JRE. It contains everything in the JRE, plus development tools like the compiler (javac) and debugger, required to create Java applications.
--> Interaction: Developers write code and use the JDK to compile it. The compiled bytecode is then run on any machine that has a JRE installed. The JRE uses its JVM to execute that code.

# 5. Setup & Installation (Windows)
1. Download and Install JDK: Download the appropriate JDK installer for Windows from the official Oracle website or an alternative like Adoptium. Run the installer and follow the on-screen instructions.

2. Configure Environment Variables: Set the JAVA_HOME system variable to the JDK installation directory (e.g., C:\Program Files\Java\jdk-17). Add the bin folder of the JDK to the Path variable (e.g., %JAVA_HOME%\bin).

3. Verify Installation: Open Command Prompt and run java -version. You should see your installed JDK version.

[Your screenshot of the java -version command output here]

4. Eclipse IDE Setup:

Create a new Java Project in Eclipse.
Set up a Run Configuration for the main class.
[Your screenshot of the Eclipse project setup here]


