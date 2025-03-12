/* List employees who do not receive a commission but earn more than 2500.

Expected Output Columns:
------------------------
+-------+---------+------+
| ename | sal     | comm |
+-------+---------+------+

*/
USE test;

SELECT ename,sal,comm  FROM emp WHERE sal > 2500 and comm is null ;