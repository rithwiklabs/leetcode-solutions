# Write your MySQL query statement below
select  tweet_id FROM TWEETS WHERE  OCTET_LENGTH(content) > 15;