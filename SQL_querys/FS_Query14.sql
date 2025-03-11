/* List employees with mgr 7788 or 7566 and sal < 3000

Expected Output Columns:
+----------+------+---------+
| Employee | Boss | Salary  |
+----------+------+---------+

*/
USE test;
SELECT ename as Employee , mgr as Boss, sal as Salary FROM emp WHERE mgr = 7788 or mgr = 7566 and sal < 3000;