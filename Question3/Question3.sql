# To answer question 1, I would create 2 tables, one for skill which has the skill name, and the other is a table that has user id and skill id as foreign keys with the needed information.

CREATE TABLE `users` (
  `id` bigint PRIMARY KEY AUTO_INCREMENT,
  `first_name` varchar(255),
  `last_name` timestamp
);

CREATE TABLE `skill` (
  `id` bigint PRIMARY KEY AUTO_INCREMENT,
  `name` varchar(255)
);

CREATE TABLE `user_skill` (
  `skill_id` bigint,
  `user_id` bigint,
  `is_endorsed` boolean,
  `last_used` varchar(255),
  `level` varchar(255),
  `usage` varchar(255),
  `last_modified` timestamp,
  `date_created` datetime
);

ALTER TABLE `user_skill` ADD FOREIGN KEY (`skill_id`) REFERENCES `skill` (`id`);

ALTER TABLE `user_skill` ADD FOREIGN KEY (`user_id`) REFERENCES `users` (`id`);

CREATE INDEX `users_index_0` ON `users` (`id`);

CREATE INDEX `skill_index_1` ON `skill` (`id`);

CREATE INDEX `skill_index_2` ON `skill` (`name`);

CREATE INDEX `user_skill_index_3` ON `user_skill` (`skill_id`);

CREATE INDEX `user_skill_index_4` ON `user_skill` (`user_id`);

###############################################################################################################################################

SELECT u.first_name,
u.last_name,
s.name
FROM user_skill us join user u on u.id = us.user_id join skill s on s.id = us.skill_id
WHERE u.first_name = "Kim" and u.last_name = "Simpson"
LIMIT 10;

###############################################################################################################################################

SELECT c.* 
FROM companies AS c JOIN users AS u on u.companyid = c.companyid JOIN jobs AS j on j.userId = u.userId JOIN
useraccounts AS ua on ua.userId = u.userId WHERE j.jobid = 123;

# I presume we are fetching the companies that has users with job id '123'

# I believe the useraccounts is used to verify that a user has an account so we may add a RIGHT. Otherwise, it can be ommitted. We may move the join id condition to the joining clause

SELECT c.* 
FROM companies AS c JOIN users AS u on u.companyid = c.companyid 
JOIN jobs AS j on j.userId = u.userId and j.jobid = 123 
RIGHT JOIN useraccounts AS ua on ua.userId = u.userId;