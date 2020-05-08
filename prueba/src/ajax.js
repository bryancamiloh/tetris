function crearTetramino() {

    $.ajax({

        url : "http://142.44.246.66:8080/apitetramino/o/crear",
        type: "GET",
        contentType: "application/json",
        success: function(data) {
            console.log(data);
            obtenerUbicacion(data); //Obtiene ubicacion inicial.
            actualizarTablero(data);
        },
        error: function(error) {
            console.log(`Ha ocurrido un error: ${error.status}, ${error.statusText}`);
        }

    });

}

function desplazarAbajo() {

    $.ajax({

        url : "http://142.44.246.66:8080/apitetramino/o/abajo",
        type: "GET",
        contentType: "application/json",
        success: function(data) {
            obtenerUbicacion(data);
            actualizarTablero(data);
        },
        error: function(error) {
            console.log(`Ha ocurrido un error: ${error.status}, ${error.statusText}`);
        }

    });

}

function desplazarDerecha() {

    $.ajax({

        url : "http://142.44.246.66:8080/apitetramino/o/derecha",
        type: "GET",
        contentType: "application/json",
        success: function(data) {
            obtenerUbicacion(data);
            actualizarTablero(data);
        },
        error: function(error) {
            console.log(`Ha ocurrido un error: ${error.status}, ${error.statusText}`);
        }

    });

}

function desplazarIzquierda() {

    $.ajax({

        url : "http://142.44.246.66:8080/apitetramino/o/izquierda",
        type: "GET",
        contentType: "application/json",
        success: function(data) {
            obtenerUbicacion(data);
            actualizarTablero(data);
        },
        error: function(error) {
            console.log(`Ha ocurrido un error: ${error.status}, ${error.statusText}`);
        }

    });

}