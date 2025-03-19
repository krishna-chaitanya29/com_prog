/* Write a SQL query to combine employee and department data with duplicates 
using UNION ALL.


+--------+------------+
| ename  | dname      |
+--------+------------+

*/
USE test; 

SELECT e.ename AS ename, d.dname FROM emp e
left JOIN dept d ON e.deptno = d.deptno
UNION ALL
SELECT e.ename AS ename, d.dname FROM emp e
right JOIN dept d ON e.deptno = d.deptno
