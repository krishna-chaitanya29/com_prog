/* Write a SQL query to list all employees and departments, including those 
without matches, using a simulated FULL JOIN.


+-------+--------+--------+------------+----------+
| empno | ename  | deptno | dname      | location |
+-------+--------+--------+------------+----------+
*/
USE test; 
SELECT
    e.empno,
    e.ename,
    d.deptno,
    d.dname,
    d.location
FROM
    emp e
LEFT JOIN
    dept d ON e.deptno = d.deptno

UNION

SELECT
    e.empno,
    e.ename,
    d.deptno,
    d.dname,
    d.location
FROM
    emp e
RIGHT JOIN
    dept d ON e.deptno = d.deptno
WHERE
    e.empno IS NULL;

