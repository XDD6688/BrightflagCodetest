create table student (
   studentID integer auto_increment not null,
   firstName varchar(255) not null,
   lastName varchar(255) not null,
   primary key(studentID)
);

create table subject (
   subjectID integer auto_increment not null,
   subjectName varchar(255) not null,
   primary key(subjectID)
);

create table faculty (
   facultyID integer auto_increment not null,
   facultyName varchar(255) not null,
   primary key(facultyID)
);

create table subjectTable(
  studentSubjectID integer auto_increment not null,
  studentID integer,
  subjectID integer,
  subjectName varchar(50),
  primary  key(studentSubjectID)
);

create table exam(
  examID integer  not null,
  examName varchar(255) not null,
  primary key(examID)
);

create table examTable(
  examTableID integer auto_increment not null,
  StudentID integer not null ,
  FirstName varchar(50),
  LastName varchar (50),
  ExamID integer not null,
  ExamName varchar(255),
  primary key (examTableID),
);

create table grade(
  gradeID integer auto_increment not null,
  StudentID integer not null,
  LastName varchar(50),
  ExamID integer not null,
  ExamName varchar(50),
  Grade integer not null,
  primary key(gradeID)
)