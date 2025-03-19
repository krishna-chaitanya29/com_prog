/* Write a SQL query to list employee names and department names where the 
department is in 'Chicago' using INNER JOIN.

+-------+-------+
| ename | dname |
+-------+-------+
*/
USE test; 

SELECT e.ename, d.dname FROM emp e INNER JOIN dept d ON e.deptno = d.deptno WHERE d.location = 'Chicago';
