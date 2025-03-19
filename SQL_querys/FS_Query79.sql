/* Write a SQL query to find managers and the number of employees they manage in
departments located in 'New York', using the primary key and foreign key 
constraints.

+--------------+-----------+
| manager_name | emp_count |
+--------------+-----------+
*/
USE test; 
SELECT
    m.ename AS manager_name,
    COUNT(e.empno) AS emp_count
FROM
    emp e
JOIN
    emp m ON e.mgr = m.empno
JOIN
    dept d ON m.deptno = d.deptno
WHERE
    d.location = 'New York'
GROUP BY
    m.ename;
