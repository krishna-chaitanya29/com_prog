/* Find employees who belong to a department with no employees.

Expected Output Columns:
------------------------
+---------+
| dname   |
+---------+

*/
USE test;

SELECT d.dname FROM dept d
WHERE d.deptno NOT IN (SELECT DISTINCT(e.deptno) FROM emp e);