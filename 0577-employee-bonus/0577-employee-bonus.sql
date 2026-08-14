select emp.name as name, b.bonus 
from employee emp 
left join bonus b 
on
emp.empid = b.empid
where b.bonus < 1000 or b.bonus is null;