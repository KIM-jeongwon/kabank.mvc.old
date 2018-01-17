drop bank;
create sequence customer_num start with 1000;
careate table kakao{
	customer_num number primary key,
	account_num varchar2(20) not null,
	money varchar2(20) default 0,
	id varchar2(20),
	foreign key(id) references Member(id)
	on delete cascade;
};
insert into bank(customer_num,account_num,money,id)
values(customer_num.nextval, "1234-5678-9123",0, kim);
select * from member;
select * from tab;
select * from bank;
desc bank;
drop table bank;
update member set pass = '1' where id = '김정원';
DELETE FROM BANK WHERE id = 'GW';
select * from member where id like= 'kim';
select * from member where id like ? ;
