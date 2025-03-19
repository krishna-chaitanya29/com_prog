/* Write a SQL query to list employee names and department names using an
implicit join, ordered by employee name.

+--------+------------+
| ename  | dname      |
+--------+------------+

*/
USE test; 

Select e.ename, d.dname from emp e, dept d where e.deptno = d.deptno order by e.ename;
