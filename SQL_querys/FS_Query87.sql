/* Write a SQL query to find departments with more than 3 employees using 
INNER JOIN and HAVING.

+--------+----------+-----------+
| deptno | dname    | emp_count |
+--------+----------+-----------+

*/
USE test; 

SELECT d.deptno, d.dname, COUNT(e.empno) AS emp_count FROM dept d INNER JOIN emp e ON d.deptno = e.deptno GROUP BY d.deptno, d.dname HAVING COUNT(e.empno) > 3;
