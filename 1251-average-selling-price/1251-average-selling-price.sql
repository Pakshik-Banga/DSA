# Write your MySQL query statement below

select p.product_id , 
coalesce(round(sum(u.units * p.price) / sum(u.units), 2),0)  as average_price from prices as p
left join unitsSold as u
on p.product_id = u.product_id and (u.purchase_date between p.start_date and p.end_date)
group by p.product_id
