create database ims;
use ims;
drop table customers;

create table customers(
	id int auto_increment,
    primary key(id),
	first_name varchar(30),
	last_name varchar(30),
	email_address varchar(40)
);
create table orders(
	id int auto_increment,
    primary key(id),
    customers_id int,
    foreign key(customers_id) references customers(id)
);

create table orderline(
    items_id int,
    orders_id int,
    foreign key(orders_id) references orders(id),
    quantity int,
    foreign key(items_id) references items(id)
);
create table items(
	id int auto_increment,
    primary key(id),
    product_name varchar(20) NOT NULL,
    cost float
);
delete from orderline where item_id=(select id from items where product_name ="frog");

INSERT INTO orders(customers_id)
SELECT id
FROM customers
  
WHERE email_address = 'nathan_rees@live.co.uk';





Insert into customers(first_name, last_name,email_address) values("Nathan","Rees","nathan_rees@live.co.uk");
insert into items (product_name,cost) values("frog",69);
select @last :=last_insert_id();
insert into orders  (id,customers_id) values (NULL,last_insert_id()) ;
insert into orderline (items_id,orders_id,quantity) values (1,1,1);
Insert into customers values(first_name="Nathan",last_name="Rees",email_address="nathan_rees@live.co.uk");
-- delete an item
delete from orderline where item_id=(select id from items where name="lol");
-- add an order to the system
insert into orders values(customers_id=69);
-- update the quantity
update orderline set quantity=69;
-- view all orders in the system (use the other 
select * from orderline;












