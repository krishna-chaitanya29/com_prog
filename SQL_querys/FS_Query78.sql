/* Write a SQL query to find departments with number of employees earning less 
than 1000 using NOT EXISTS.

+------------+--------+
| dname      | deptno |
+------------+--------+
*/
USE test; 

SELECT
    d.dname,
    d.deptno
FROM
    dept d
WHERE NOT EXISTS (
    SELECT *
    FROM emp e
    WHERE e.deptno = d.deptno AND e.sal < 1000
);