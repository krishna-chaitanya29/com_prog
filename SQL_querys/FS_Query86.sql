/* Write a SQL query to retrieve average salaries per department using INNER 
JOIN and GROUP BY.

+--------+------------+-------------+
| deptno | dname      | avg_salary  |
+--------+------------+-------------+

*/
USE test; 

SELECT d.deptno, d.dname, AVG(e.sal) AS avg_salary FROM emp e INNER JOIN dept d ON e.deptno = d.deptno GROUP BY d.deptno, d.dname;
