SELECT p.project_id , round(avg(e.experience_years),2) as average_years
FROM PROJECT p
LEFT JOIN EMPLOYEE e
on p.employee_id = e.employee_id
GROUP BY p.project_id;