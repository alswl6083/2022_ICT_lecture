select a.c_name,a.c_mobile,b.voucher_amount,b.issue_date
from work_user.customer as a
inner join voucher as b
on a.c_id = b.c_id;

select a.c_name, a.c_mobile, a.age, b.voucher_amount, b.issue_date
from work_user.customer as a
inner join voucher as b
on a.c_id = b.c_id
where age between 20 and 29;

select a.c_name, a.c_mobile, b.voucher_amount, b.issue_date
from work_user.customer as a
left join voucher as b
on a.c_id = b.c_id;

select a.c_name, a.c_mobile, a.age, b.voucher_amount, b.issue_date
from work_user.customer as a
left join voucher as b
on a.c_id = b.c_id
where age between 30 and 39;

select a.c_name, a.c_mobile, b.voucher_amount, b.issue_date
from work_user.customer as a
right join voucher as b
on a.c_id= b.c_id;

select a.c_name, a.c_mobile, a.age, b.voucher_amount, b.issue_date
from work_user.customer as a
right join voucher as b
on a.c_id = b.c_id
where age >= 40;

select *
from work_user.goods as a
inner join work_user.manufacturer as b
on a.manf_no = b.manf_no;

select b.manf_nm, a.goods_no,a.goods_nm,a.price ,sum(c.quantity) as '판매수량'
from work_user.goods as a
left join work_user.manufacturer as b
on a.manf_no = b.manf_no
left join work_user.sales as c
on a.goods_no = c.goods_no
group by c.goods_no;

select a.goods_no, a.goods_nm, a.price * sum(b.quantity) as '가격 합계'
from work_user.goods as a
inner join work_user.sales as b
on a.goods_no = b.goods_no
group by a.goods_no;









