# Write your MySQL query statement below
select distinct(e.email) as Email from person e, person p where e.email = p.email and e.id!=p.id; 