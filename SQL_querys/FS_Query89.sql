/* 
Find Departments Without Employees (Using LEFT JOIN and NULL Check)

+------------+----------+
| Department | Location |
+------------+----------+


*/
USE test; 

SELECT d.dname AS Department, d.location AS Location FROM dept d LEFT JOIN emp e ON d.deptno = e.deptno WHERE e.empno IS NULL;