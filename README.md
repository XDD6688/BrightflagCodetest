# Student Subjects Selection Management System Tutorial
### Running the application
1. Run src/main/com/brightflag/codetest/Application.java as a Spring Boot app
2. Open http://localhost:8080/
## Home Page
1. The homepage shows the selection of all students, and one student can choose multiple subjects.
![image](https://github.com/sindychiu/BrightflagCodetest/blob/master/src/main/resources/codeTestImages/HomePage.png)
2. When a student chooses multiple subjects, all subjects names will be displayed in the Subjects column of the table.
![image](https://github.com/sindychiu/BrightflagCodetest/blob/master/src/main/resources/codeTestImages/HomePage2.png)
## Select Subject Page
1. This page allows you to select a specific subject for a given student, by entering the StudentID and SubjectID.
2. On the right side of this page, there will be a table showing all the selectable Subject Names and their corresponding Subject IDs.
![image](https://github.com/sindychiu/BrightflagCodetest/blob/master/src/main/resources/codeTestImages/addPage.png)
3. When the entered Student ID or Subject ID has an error, the record will not be added to the database at this time, and the error message will be displayed on the page, but the user's input will not be cleared.
![image](https://github.com/sindychiu/BrightflagCodetest/blob/master/src/main/resources/codeTestImages/addPageError.png)
## Exam Page
1. The Exam page shows some information about the exam. When a student select a subject, the exam corresponding to the subject is also added to the student.
![image](https://github.com/sindychiu/BrightflagCodetest/blob/master/src/main/resources/codeTestImages/examPage.png)
2. This page can also display specific exam information, such as all exam information for a given exam. Users can select and query through the drop-down menu on the right side of the page.
![image](https://github.com/sindychiu/BrightflagCodetest/blob/master/src/main/resources/codeTestImages/examOfExamID.png)
3. Same as described above, the user can also display all the test information of the student according to the designated student.
![image](https://github.com/sindychiu/BrightflagCodetest/blob/master/src/main/resources/codeTestImages/examPageOfStudentID.png)

## Grade Page
1. The grade page shows the grade information for the student exams. At the same time as the exam is added, the grade is added to students, with an initial value of 0 (the function to modify grades can be added in the future).
![image](https://github.com/sindychiu/BrightflagCodetest/blob/master/src/main/resources/codeTestImages/gradePage.png)
2. The grade page can also display specific grade information based on user preferences. For example, the user can only see all the grade information for the specified exam. The user can do this from the down menu on the right side of the page.
![image](https://github.com/sindychiu/BrightflagCodetest/blob/master/src/main/resources/codeTestImages/gradePageOfExamID.png)
3. Same with the above operation, the user can also view all grade information of the specified student.
![image](https://github.com/sindychiu/BrightflagCodetest/blob/master/src/main/resources/codeTestImages/examPageOfStudentID.png)
