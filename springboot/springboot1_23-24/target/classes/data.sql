INSERT INTO usuario (id, name, email) VALUES
(1, 'Usuario 1', 'usuario1@email.com'),
(2, 'Usuario 2', 'usuario2@email.com');

INSERT INTO producto (id, name, price, usuario_id) VALUES
(1, 'Producto 1', 100.00, 1),
(2, 'Producto 2', 200.00, 1),
(3, 'Producto 3', 300.00, 2);

INSERT INTO usuario (id, name, email) VALUES
(3, 'Usuario 3', 'usuario3@email.com'),
(4, 'Usuario 4', 'usuario4@email.com'),
(5, 'Usuario 5', 'usuario5@email.com');

INSERT INTO producto (id, name, price, usuario_id) VALUES
(4, 'Producto 4', 400.00, 3),
(5, 'Producto 5', 500.00, 3),
(6, 'Producto 6', 600.00, 4),
(7, 'Producto 7', 700.00, 4),
(8, 'Producto 8', 800.00, 5);
```
