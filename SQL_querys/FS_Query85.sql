/* Write a SQL query to list employees and their managers’ names using a LEFT 
JOIN for employees without managers.

+----------+---------+
| employee | manager |
+----------+---------+

*/
USE test; 

SELECT e.ename AS employee, m.ename AS manager FROM emp e LEFT JOIN emp m ON e.mgr = m.empno;