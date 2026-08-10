SELECT prd.product_name, sal.year , sal.price
FROM sales sal JOIN
product prd
ON
prd.product_id = sal.product_id; 