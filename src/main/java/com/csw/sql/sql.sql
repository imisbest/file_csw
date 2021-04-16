drop table fuser cascade constraint;
create table fuser(
username varchar2(20) primary key not null,
password varchar2(20)
);
commit;
insert into fuser values('qqq','qqq');
commit;
select * from fuser;

drop table ffile cascade constraint;
create table ffile(
id varchar2(99),
oname varchar2(99),
nname varchar2(99),
z_file varchar2(99),
path varchar2 (99),
sizes varchar2(99),
type varchar2(99),
istrue varchar2(99),
count varchar2(999)
);
commit;
insert into ffile values('11111','张三.txt','uuid.txt','.txt','/files/..','1024','text/pain','是','0');
commit;
select * from ffile;

