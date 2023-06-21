# Write your MySQL query statement below
select T2.id from Weather as T1,Weather as T2
where T2.temperature>T1.temperature and  datediff(T2.recordDate,T1.recordDate)=1 ;
