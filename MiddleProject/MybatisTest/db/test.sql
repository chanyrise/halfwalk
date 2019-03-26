create table product(
no number(4) primary key,
item varchar2(20),
price number(10),
regdate date
)

create sequence seq_no
icrement by 1
start with 1
nocycle
nocache;

insert into product values(seq_no.nextval,'PC',2000000,'2019-2-15');
insert into product values(seq_no.nextval,'Note_Book',1400000,'2017-2-7');
insert into product values(seq_no.nextval,'Desk_Top',3000000,'2016-2-18');
insert into product values(seq_no.nextval,'PC',1800000,'2018-2-21');
insert into product values(seq_no.nextval,'Note_Book',1830000,'2002-2-7');
insert into product values(seq_no.nextval,'Desk_Top',2800000,'2008-6-18');
insert into product values(seq_no.nextval,'PC',5800000,'2012-4-21');

select * from product;