function listarUsuarios() {
    fetch('http://localhost:8080/api/usuario/')
        .then(response => response.text())
        .then(data => document.getElementById('resultado').innerHTML = data);
}

function listarProductos() {
    fetch('http://localhost:8080/api/producto/')
        .then(response => response.text())
        .then(data => document.getElementById('resultado').innerHTML = data);
}

function listarProductosConUsuario(usuarioId=1) {
    fetch('http://localhost:8080/api/producto/usuario/'+usuarioId)
        .then(response => response.text())
        .then(data => document.getElementById('resultado').innerHTML = data);
}