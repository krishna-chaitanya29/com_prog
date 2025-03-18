/* Write a SQL query to find employees who are managers of other employees using 
a self-join.

+---------+
| manager |
+---------+
*/
USE test; 

select e.ename as manager from emp e
join emp m on m.empno = e.mgr;

