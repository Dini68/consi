CREATE TABLE songs (id BIGINT AUTO_INCREMENT,
						  band VARCHAR(50) NOT NULL,
						  title VARCHAR(50) NOT NULL,
						  length DOUBLE(5,2),
						  PRIMARY KEY (id));