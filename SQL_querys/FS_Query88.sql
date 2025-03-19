/* Write a SQL query to list employees and departments where the employee’s 
hire date is after 1980 using INNER JOIN.

+--------+------------+------------+
| ename  | dname      | hiredate   |
+--------+------------+------------+
*/
USE test; 

SELECT e.ename, d.dname, e.hiredate FROM emp e INNER JOIN dept d ON e.deptno = d.deptno WHERE e.hiredate > '1980-01-01';
