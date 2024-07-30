# Write your MySQL query statement below

select e.name from employee as e
inner join(
select e2.managerId , count(*) as c
from employee as e2
group by e2.managerId) as e3 
on e.id = e3.managerId
where e3.c >= 5