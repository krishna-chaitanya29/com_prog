/* Write a SQL query to list all department numbers, department names and their 
employee counts, including departments with no employees, using RIGHT JOIN.

+--------+------------+-----------+
| deptno | dname      | emp_count |
+--------+------------+-----------+
*/
USE test; 

select d.deptno , e.ename , count(e.ename) as emp_count from emp e
right join dept d on e.deptno = d.deptno group by e.deptno ;