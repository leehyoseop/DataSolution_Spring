create table fruit(
	f_name varchar2(10 char) primary key,
	f_price number(5) not null
);

insert into fruit values('사과', 3000);
insert into fruit values('배', 5000);
insert into fruit values('포도', 8000);

select * from fruit order by f_price;

drop table fruit;