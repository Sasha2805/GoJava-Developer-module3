USE hibernate;

# Creating new records in table developers
INSERT INTO `hibernate`.`developers` (`id`, `first_name`, `last_name`, `age`, `gender`, `salary`) VALUES (1, 'John', 'Smith', 25, 'male', 1000);
INSERT INTO `hibernate`.`developers` (`id`, `first_name`, `last_name`, `age`, `gender`, `salary`) VALUES (2, 'Sarah', 'Jones', 22, 'female', 1000.50);
INSERT INTO `hibernate`.`developers` (`id`, `first_name`, `last_name`, `age`, `gender`, `salary`) VALUES (3, 'Daniel', 'Brown', 25, 'male', 2055);
INSERT INTO `hibernate`.`developers` (`id`, `first_name`, `last_name`, `age`, `gender`, `salary`) VALUES (4, 'Olivia', 'Evans', 25, 'female', 3000);
INSERT INTO `hibernate`.`developers` (`id`, `first_name`, `last_name`, `age`, `gender`, `salary`) VALUES (5, 'Daniel', 'Smith', 25, 'male', 800);

# Creating new records in table skills
INSERT INTO `hibernate`.`skills` (`id`, `skill`, `skill_level`) VALUES (1, 'Java', 'Junior');
INSERT INTO `hibernate`.`skills` (`id`, `skill`, `skill_level`) VALUES (2, 'Java', 'Middle');
INSERT INTO `hibernate`.`skills` (`id`, `skill`, `skill_level`) VALUES (3, 'Java', 'Senior');
INSERT INTO `hibernate`.`skills` (`id`, `skill`, `skill_level`) VALUES (4, 'C++', 'Junior');
INSERT INTO `hibernate`.`skills` (`id`, `skill`, `skill_level`) VALUES (5, 'C++', 'Middle');
INSERT INTO `hibernate`.`skills` (`id`, `skill`, `skill_level`) VALUES (6, 'C++', 'Senior');
INSERT INTO `hibernate`.`skills` (`id`, `skill`, `skill_level`) VALUES (7, 'C#', 'Junior');
INSERT INTO `hibernate`.`skills` (`id`, `skill`, `skill_level`) VALUES (8, 'C#', 'Middle');
INSERT INTO `hibernate`.`skills` (`id`, `skill`, `skill_level`) VALUES (9, 'C#', 'Senior');
INSERT INTO `hibernate`.`skills` (`id`, `skill`, `skill_level`) VALUES (10, 'JavaScript', 'Junior');
INSERT INTO `hibernate`.`skills` (`id`, `skill`, `skill_level`) VALUES (11, 'JavaScript', 'Middle');
INSERT INTO `hibernate`.`skills` (`id`, `skill`, `skill_level`) VALUES (12, 'JavaScript', 'Senior');

# Creating new records in table projects
INSERT INTO `hibernate`.`projects` (`id`, `name`, `info`, `cost`) VALUES (1, 'YouTube Analyzer', 'Application for YouTube channel analytics', 5000);
INSERT INTO `hibernate`.`projects` (`id`, `name`, `info`, `cost`) VALUES (2, 'Makeup', 'Online shop of cosmetics', 3500);
INSERT INTO `hibernate`.`projects` (`id`, `name`, `info`, `cost`) VALUES (3, 'Nike', 'Clothing catalog Nike', 8000);
INSERT INTO `hibernate`.`projects` (`id`, `name`, `info`, `cost`) VALUES (4, 'Ant Logistics', 'Transport logistics application', 4080);
INSERT INTO `hibernate`.`projects` (`id`, `name`, `info`, `cost`) VALUES (5, 'MX Player Pro', 'Powerful video player with hardware acceleration and subtitle support', 10000);

# Creating new records in table companies
INSERT INTO `hibernate`.`companies` (`id`, `name`, `info`) VALUES (1, 'DataArt', 'Informatoin about DataArt...');
INSERT INTO `hibernate`.`companies` (`id`, `name`, `info`) VALUES (2, 'Lucky Labs', 'Informatoin about Lucky Labs...');
INSERT INTO `hibernate`.`companies` (`id`, `name`, `info`) VALUES (3, 'Symphony Solutions', 'Informatoin about Symphony Solutions...');
INSERT INTO `hibernate`.`companies` (`id`, `name`, `info`) VALUES (4, 'Netpeak', 'Informatoin about Netpeak...');

# Creating new records in table customers
INSERT INTO `hibernate`.`customers` (`id`, `first_name`, `last_name`, `info`) VALUES (1, 'Sharon', 'Tracey','Informatoin about Sharon Tracey...');
INSERT INTO `hibernate`.`customers` (`id`, `first_name`, `last_name`, `info`) VALUES (2, 'Sarah', 'Brown','Informatoin about Sarah Brown...');
INSERT INTO `hibernate`.`customers` (`id`, `first_name`, `last_name`, `info`) VALUES (3, 'Garry', 'Potter','Informatoin about Garry Potter...');
INSERT INTO `hibernate`.`customers` (`id`, `first_name`, `last_name`, `info`) VALUES (4, 'Dean', 'Jones','Informatoin about Dean Jones...');
INSERT INTO `hibernate`.`customers` (`id`, `first_name`, `last_name`, `info`) VALUES (5, 'Brian', 'Tracey','Informatoin about Brian Tracey...');

# Creating new records in table developer_projects
INSERT INTO `hibernate`.`developer_projects` (`developer_id`, `project_id`) VALUES (1, 1);
INSERT INTO `hibernate`.`developer_projects` (`developer_id`, `project_id`) VALUES (1, 2);
INSERT INTO `hibernate`.`developer_projects` (`developer_id`, `project_id`) VALUES (2, 2);
INSERT INTO `hibernate`.`developer_projects` (`developer_id`, `project_id`) VALUES (2, 5);
INSERT INTO `hibernate`.`developer_projects` (`developer_id`, `project_id`) VALUES (3, 3);
INSERT INTO `hibernate`.`developer_projects` (`developer_id`, `project_id`) VALUES (4, 4);
INSERT INTO `hibernate`.`developer_projects` (`developer_id`, `project_id`) VALUES (5, 1);
INSERT INTO `hibernate`.`developer_projects` (`developer_id`, `project_id`) VALUES (5, 5);

# Creating new records in table developer_skills
INSERT INTO `hibernate`.`developer_skills` (`developer_id`, `skill_id`) VALUES (1, 1);
INSERT INTO `hibernate`.`developer_skills` (`developer_id`, `skill_id`) VALUES (1, 5);
INSERT INTO `hibernate`.`developer_skills` (`developer_id`, `skill_id`) VALUES (1, 10);
INSERT INTO `hibernate`.`developer_skills` (`developer_id`, `skill_id`) VALUES (2, 8);
INSERT INTO `hibernate`.`developer_skills` (`developer_id`, `skill_id`) VALUES (2, 12);
INSERT INTO `hibernate`.`developer_skills` (`developer_id`, `skill_id`) VALUES (3, 3);
INSERT INTO `hibernate`.`developer_skills` (`developer_id`, `skill_id`) VALUES (3, 12);
INSERT INTO `hibernate`.`developer_skills` (`developer_id`, `skill_id`) VALUES (4, 7);
INSERT INTO `hibernate`.`developer_skills` (`developer_id`, `skill_id`) VALUES (4, 9);
INSERT INTO `hibernate`.`developer_skills` (`developer_id`, `skill_id`) VALUES (5, 5);
INSERT INTO `hibernate`.`developer_skills` (`developer_id`, `skill_id`) VALUES (5, 11);

# Creating new records in table company_projects
INSERT INTO `hibernate`.`company_projects` (`company_id`, `project_id`) VALUES (1, 5);
INSERT INTO `hibernate`.`company_projects` (`company_id`, `project_id`) VALUES (2, 3);
INSERT INTO `hibernate`.`company_projects` (`company_id`, `project_id`) VALUES (2, 4);
INSERT INTO `hibernate`.`company_projects` (`company_id`, `project_id`) VALUES (3, 5);
INSERT INTO `hibernate`.`company_projects` (`company_id`, `project_id`) VALUES (4, 1);
INSERT INTO `hibernate`.`company_projects` (`company_id`, `project_id`) VALUES (4, 2);

# Creating new records in table customer_projects
INSERT INTO `hibernate`.`customer_projects` (`customer_id`, `project_id`) VALUES (1, 5);
INSERT INTO `hibernate`.`customer_projects` (`customer_id`, `project_id`) VALUES (2, 3);
INSERT INTO `hibernate`.`customer_projects` (`customer_id`, `project_id`) VALUES (2, 4);
INSERT INTO `hibernate`.`customer_projects` (`customer_id`, `project_id`) VALUES (2, 5);
INSERT INTO `hibernate`.`customer_projects` (`customer_id`, `project_id`) VALUES (3, 1);
INSERT INTO `hibernate`.`customer_projects` (`customer_id`, `project_id`) VALUES (4, 2);
INSERT INTO `hibernate`.`customer_projects` (`customer_id`, `project_id`) VALUES (4, 4);
INSERT INTO `hibernate`.`customer_projects` (`customer_id`, `project_id`) VALUES (5, 3);
INSERT INTO `hibernate`.`customer_projects` (`customer_id`, `project_id`) VALUES (5, 5);