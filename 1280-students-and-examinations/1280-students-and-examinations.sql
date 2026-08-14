select std.student_id, std.student_name, sub.subject_name, (count(ex.student_id))attended_exams
from students std 
cross join subjects sub
left join examinations ex
on std.student_id = ex.student_id 
and
sub.subject_name = ex.subject_name
group by std.student_id, sub.subject_name
order by std.student_id , sub.subject_name;