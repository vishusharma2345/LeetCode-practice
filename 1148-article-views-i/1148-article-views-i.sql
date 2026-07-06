# Write your MySQL query statement below
#distict ki should be no duplicates
select distinct author_id as id from Views
where author_id =viewer_id
order by id asc;
