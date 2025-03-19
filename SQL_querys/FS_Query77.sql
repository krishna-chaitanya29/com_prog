/* Write a SQL query to list departments with employees earning more than 2500 
using EXISTS.

+--------+------------+
| deptno | dname      |
+--------+------------+
*/
USE test; 

select  e.deptno , d.dname from emp e join dept d on e.deptno = d.deptno  
where sal>2500 group by e.deptno ;