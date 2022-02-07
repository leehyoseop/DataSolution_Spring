create table error(
	e_what varchar2(30 char) primary key,
	e_where varchar2(30 char) not null
);
drop table error;

insert into error values('@빼먹음', 'DAO');
insert into error values('mapper입력 빼먹음', 'servlet-context.xml');
insert into error values('세미콜론(;) 넣음', 'mapper.xml');
insert into error values('패키지 클래스 sql', 'mapper.xml');
insert into error values('패키지 파일 위치', '프로젝트');

select * from error;

create table fruit(
	f_name varchar2(10 char) primary key,
	f_price number(5) not null
);

insert into fruit values('포도', 5000); 
insert into fruit values('사과', 6000); 
insert into fruit values('바나나', 7000); 
insert into fruit values('레몬', 8000); 
insert into fruit values('감', 9000); 
insert into fruit values('키위', 10000);

select * from fruit;
drop table fruit;