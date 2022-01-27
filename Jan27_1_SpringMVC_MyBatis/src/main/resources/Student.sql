create table Student(
	s_no number(3) primary key,
	s_name varchar2(10 char) not null,
	s_nickname varchar2(10 char) not null
);

drop table Student;

create sequence student_seq;

select * from Student;