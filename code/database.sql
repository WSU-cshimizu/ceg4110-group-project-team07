-- Table for 'ImageEntity'
CREATE TABLE testimages ( id SERIAL PRIMARY KEY, name VARCHAR(255), description TEXT, location VARCHAR(255) NOT NULL, geo_location VARCHAR(255) NOT NULL );

-- Table for 'ImageLikesEntity'
CREATE TABLE image_likes ( id SERIAL PRIMARY KEY, likes INTEGER, image_id INTEGER NOT NULL, CONSTRAINT fk_image FOREIGN KEY (image_id) REFERENCES testimages (id) ON DELETE CASCADE );

-- Table for 'ImageChildEntity' 
CREATE TABLE image_child ( id SERIAL PRIMARY KEY, image_name VARCHAR(255), image_type VARCHAR(255), image_data BYTEA, image_id INTEGER NOT NULL, CONSTRAINT fk_image_child FOREIGN KEY (image_id) REFERENCES testimages (id) ON DELETE CASCADE );

-- Table for 'ImageCommentChildEntity' 
CREATE TABLE image_child_comment ( id SERIAL PRIMARY KEY, comment TEXT, image_id INTEGER NOT NULL, CONSTRAINT fk_image_comment FOREIGN KEY (image_id) REFERENCES testimages (id) ON DELETE CASCADE );
