/*SQL10*/
/*NOT IN+子查询*/
SELECT emp_no
FROM employees
WHERE emp_no not in (
    SELECT emp_no
    FROM dept_manager
);
/*LEFT JOIN左连接+IS NULL*/
SELECT e.emp_no
FROM employees e
LEFT JOIN dept_manager d
ON e.emp_no = d.emp_no
WHERE d.emp_no IS NULL;

/*SQL11*/
SELECT de.emp_no, dm.emp_no
FROM dept_emp de
JOIN dept_manager dm
ON de.dept_no = dm.dept_no
WHERE de.emp_no!=dm.emp_no
AND de.to_date='9999-01-01'
AND dm.to_date='9999-01-01';