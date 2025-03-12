/* Find the second highest salary from employees.

Expected Output Columns:
------------------------
+-----------------------+
| second_highest_salary |
+-----------------------+

*/
USE test;
SELECT max(sal) as second_highest_salary FROM emp WHERE sal < (SELECT max(sal) FROM emp );


USE test;
SELECT
    MAX(sal) AS second_highest_salary
FROM
    emp
WHERE
    sal < (SELECT MAX(sal) FROM emp);