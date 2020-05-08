const filas = 20;
const columnas = 10;

const tiempoDesplazamiento = 500;


//Objeto JSON que contiene las coordenadas de las fichas que conforman la figura.

//Define las coordenadas iniciales de cada pieza que conforma la figura.

let contador = 0;

let tablero = [[], []];
let tableroTmp = [[], []];

//Guarda temporalmente las posicion de cada pieza retornada por el API.
let coordenadas = null;

//Crea la zona de desplazamiento de la figura.
crearMatriz();

//Crea la figura con la posicion inicial.
crearTetramino();

const intervalo = setInterval(ejecutar, tiempoDesplazamiento);

let evento = document.addEventListener("keydown", ejecutar);


function ejecutar() {

	validarLimites();
	manejarEventos(event);

}

//Crea la matriz que representa el area de desplazamiento.

function crearMatriz() {

	const areaJuego = document.querySelector("#areaJuego");
	const celdas = document.querySelectorAll(".celda");
	let cont = 0;

	 for(let i = 0; i < filas; i++) {
	  
		tablero[i] = new Array(columnas);
	  
      	for(let j = 0; j < columnas; j++) {
	      
			tablero[i][j] = "_";
			
			//let celda = document.createElement("div");
			//celda.setAttribute("class", "celda inactiva");
			celdas[cont].setAttribute("id", i+""+j);
			//celda.innerHTML = tablero[i][j];
			//areaJuego.appendChild(celda);
	      	cont++;
      	}
	  
  	}

  	tableroTmp = tablero;

}

//Según la tecla presionada por el usuario se desplaza a determinada dirección.

function manejarEventos(ev = undefined) {

	let evento = ev;
	let tecla = (evento) ? evento.key : " ";

	console.log(tecla);

	
	/*Utiliza la ubicacion obtenida anteriormente para limpiar las celdas por donde se había dezplazado la figura, antes de realizar
	el desplazamiento.*/
	limpiar();

	
	//Verifica la tecla presionada para realizar el desplazamiento en esa dirección y obtener nuevas coordenadas de la ubicacion de la figura.
	switch(tecla) {

		case "ArrowDown":

				desplazarAbajo();

			break;
		case "ArrowRight":

				desplazarDerecha();

			break;
		case "ArrowLeft":

				desplazarIzquierda();

			break;
		case  " ":

			desplazarAbajo();

			break;
	}

}

//Valida cuando las piezas inferiores de la figura hayan tocado el límite inferiror del area de juego para detener la ejecución.
function validarLimites(ubicacionFila) {

	if(ubicacionFila == 19) {
		crearTetramino();
	}

}

//Funcion que permite obtener la ubicación de las piezas de la figura retornada por la API.
function obtenerUbicacion(ubicacion) {

	coordenadas = ubicacion; //Coordenas de cada pieza de la figura retornadas por la API.

}

//Función que permite limpiar la posicion de las piezas de de la figura en el tablero antes de desplazarse.
function limpiar() {

	tableroTmp[coordenadas.x1][coordenadas.y1] = "_";
	tableroTmp[coordenadas.x2][coordenadas.y2] = "_";
	tableroTmp[coordenadas.x3][coordenadas.y3] = "_";
	tableroTmp[coordenadas.x4][coordenadas.y4] = "_";

	borrar();

}

//Funcion que actualiza el tablero con la nueva ubicacion - después de desplazar la figura.
function actualizarTablero(ubicacion) {

	tableroTmp[ubicacion.x1][ubicacion.y1] = "X";
	tableroTmp[ubicacion.x2][ubicacion.y2] = "X";
	tableroTmp[ubicacion.x3][ubicacion.y3] = "X";
	tableroTmp[ubicacion.x4][ubicacion.y4] = "X";

	console.log(tableroTmp);

	pintarTablero(ubicacion);

	validarLimites(ubicacion.x3);

}


function borrar() {

	$("#"+coordenadas.x1+""+coordenadas.y1).removeClass("activa");
	$("#"+coordenadas.x2+""+coordenadas.y2).removeClass("activa");
	$("#"+coordenadas.x3+""+coordenadas.y3).removeClass("activa");
	$("#"+coordenadas.x4+""+coordenadas.y4).removeClass("activa");

	$("#"+coordenadas.x1+""+coordenadas.y1).addClass("inactiva");
	$("#"+coordenadas.x2+""+coordenadas.y2).addClass("inactiva");
	$("#"+coordenadas.x3+""+coordenadas.y3).addClass("inactiva");
	$("#"+coordenadas.x4+""+coordenadas.y4).addClass("inactiva");

}

function pintarTablero(ubicacion) {

	$("#"+ubicacion.x1+""+ubicacion.y1).removeClass("inactiva");
	$("#"+ubicacion.x2+""+ubicacion.y2).removeClass("inactiva");
	$("#"+ubicacion.x3+""+ubicacion.y3).removeClass("inactiva");
	$("#"+ubicacion.x4+""+ubicacion.y4).removeClass("inactiva");

	$("#"+ubicacion.x1+""+ubicacion.y1).addClass("activa");
	$("#"+ubicacion.x2+""+ubicacion.y2).addClass("activa");
	$("#"+ubicacion.x3+""+ubicacion.y3).addClass("activa");
	$("#"+ubicacion.x4+""+ubicacion.y4).addClass("activa");

}
