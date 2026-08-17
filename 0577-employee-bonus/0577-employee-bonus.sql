# Write your MySQL query statement below
Select employee.name, Bonus.bonus from employee left join bonus on Employee.empId = Bonus.empId where bonus <1000 or Bonus is null