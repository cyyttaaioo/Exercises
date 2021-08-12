/*SQL004*/
SELECT e.last_name,e.first_name,d.dept_no
from dept_emp d join employees e
on e.emp_no = d.emp_no;

/*SQL005*/
/*原则是小表驱动大表，
当使用left join时，左表是驱动表，右表是被驱动表，
当使用right join时，右表时驱动表，左表是被驱动表，
当使用inner join时，mysql会选择数据量比较小的表作为驱动表，大表作为被驱动表*/
SELECT e.last_name, e.first_name, d.dept_no
FROM employees e
LEFT JOIN dept_emp d
ON e.emp_no = d.emp_no;

/*无SQL006*/

/*SQL007*/
/*count(*)的性能很高，count(emp_no)如果该字段没有索引则会很慢*/
SELECT emp_no, COUNT(*)  t
FROM salaries
GROUP BY emp_no
HAVING t > 15;

/*SQL008*/
/*第一种*/
SELECT DISTINCT salary
FROM salaries
ORDER BY salary DESC;
/*第二种*/
SELECT  salary
FROM salaries
GROUP BY salary
ORDER BY salary DESC;