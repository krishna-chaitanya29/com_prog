/* Write a SQL query to show all employees sorted by department number and then
by job title alphabetically.


+-------+--------+-----------+------+------------+---------+---------+--------+
| empno | ename  | job       | mgr  | hiredate   | sal     | comm    | deptno |
+-------+--------+-----------+------+------------+---------+---------+--------+

*/
USE test; 
SELECT empno,ename,job,mgr,hiredate,sal,comm,deptno from emp order by deptno,job ;