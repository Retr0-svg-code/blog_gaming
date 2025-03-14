INSERT INTO users (username, email, password, created_at) VALUES ('admin', 'admin@localhost.it', 'admin', NOW());

INSERT INTO roles (name) VALUES ('ROLE_ADMIN');
INSERT INTO roles (name) VALUES ('ROLE_USER');

INSERT INTO user_roles (user_id, role_id) VALUES (1, 1);
INSERT INTO user_roles (user_id, role_id) VALUES (2, 2);

INSERT INTO categories (name) VALUES 
('FPS'),
('RPG'),
('RTS'),
('MMORPG'),
('MOBA'),
('SPORT'),
('RACING'),
('SIMULATION'),
('ACTION'),
('ADVENTURE'),
('HORROR');


-- tabella prodotti vuota al momento
-- verranno inseriti i dati in seguito dall'interfaccia dedicata

-- tabella dettagli ordini vuota al momento
-- verranno inseriti i dati in seguito dall'interfaccia dedicata