/* Write a SQL query to list departments with no assigned employees using 
RIGHT JOIN.

+--------+---------+
| deptno | dname   |
+--------+---------+

*/
USE test; 

SELECT
    d.deptno,
    d.dname
FROM
    emp e
RIGHT JOIN
    dept d ON e.deptno = d.deptno
WHERE
    e.empno IS NULL;