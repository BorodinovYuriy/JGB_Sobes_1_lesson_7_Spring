create table students (
    id             bigserial primary key,
    name           varchar(255) unique,
    age            int not null
);
insert into students (name, age) values
('Student_1', 18),
('Student_2', 19),
('Student_3', 20),
('Student_4', 18),
('Student_5', 21),
('Student_6', 21),
('Student_7', 18),
('Student_8', 22),
('Student_9', 18),
('Student_10', 23),
('Student_11', 18),
('Student_12', 24)
;