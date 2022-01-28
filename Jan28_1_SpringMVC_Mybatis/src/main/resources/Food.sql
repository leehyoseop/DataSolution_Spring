create table Food(
	menu varchar2(15 char) primary key,
	price number(5) not null,
	file_name varchar2(20 char)
);
drop table Food;

select * from Food;