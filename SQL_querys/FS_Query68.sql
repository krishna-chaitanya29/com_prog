/* Write a SQL query to list the total commission per department, excluding 
department 40, ordered by total commission.

+--------+-----------+
| deptno | SUM(comm) |
+--------+-----------+
*/
USE test; 
select deptno,SUM(comm) from emp where deptno != 40 group by deptno order by SUM(comm); 