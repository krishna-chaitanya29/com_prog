/* 
Retrieve Department-wise Total Salary and Number of Employees (Using GROUP BY and JOIN)

+------------+---------------+--------------+
| dname      | num_employees | total_salary |
+------------+---------------+--------------+

*/
USE test; 
SELECT
    d.dname,
    COUNT(e.empno) AS num_employees,
    SUM(e.sal) AS total_salary
FROM
    dept d
left JOIN
    emp e ON e.deptno = d.deptno
GROUP BY
    d.dname;
