/* Write a SQL query to list employee names and department names for employees with a salary greater than 2000 using INNER JOIN.


+-------+------------+
| ename | dname      |
+-------+------------+
*/
USE test; 

select e.ename , d.dname from emp e 
join dept d ON e.deptno = d.deptno
where e.sal > 2000;