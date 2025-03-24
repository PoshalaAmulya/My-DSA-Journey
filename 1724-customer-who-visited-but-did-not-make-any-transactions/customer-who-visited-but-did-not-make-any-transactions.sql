# Write your MySQL query statement below

select customer_id,count(customer_id) count_no_trans
from Visits 
left join Transactions
on Visits.visit_id=Transactions.visit_id
where transaction_id is NULL
group by customer_id
order by count_no_trans   desc;



