/* Write a SQL query to find employees who are managers of other employees using 
a self-join.

+---------+
| manager |
+---------+
*/
USE test; 

select distinct  m.ename as manager from emp m
join emp e on m.empno = e.mgr ;

