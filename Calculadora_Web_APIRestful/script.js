const BASE_URL = "http://localhost:8080/Calculadora_APIRestful/api/operaciones/";

function realizarOperacion(operacion, parametros) {
    return fetch(`${BASE_URL}${operacion}?${parametros}`)
        .then(response => {
            if (!response.ok) {
                throw new Error('Respuesta de la API no fue exitosa');
            }
            return response.text(); 
        })
        .then(data => {
            console.log('Respuesta de la API:', data); 
            return data;
        })
        .catch(error => {
            console.error('Error al realizar la operación:', error);
            return 'Hubo un error al realizar la operación';
        });
}

function actualizarResultado(resultado) {
    const resultadoElement = document.getElementById("resultado");
    resultadoElement.innerText = resultado;
}

function suma() {
    const num1 = document.getElementById("num1").value;
    const num2 = document.getElementById("num2").value;
    if (num1 && num2) {
        realizarOperacion("suma", `num1=${num1}&num2=${num2}`)
            .then(resultado => actualizarResultado(`Resultado: ${resultado}`));
    } else {
        alert("Por favor, ingresa ambos números.");
    }
}

function resta() {
    const num1 = document.getElementById("num1").value;
    const num2 = document.getElementById("num2").value;
    if (num1 && num2) {
        realizarOperacion("resta", `num1=${num1}&num2=${num2}`)
            .then(resultado => actualizarResultado(`Resultado: ${resultado}`));
    } else {
        alert("Por favor, ingresa ambos números.");
    }
}

function multiplicacion() {
    const num1 = document.getElementById("num1").value;
    const num2 = document.getElementById("num2").value;
    if (num1 && num2) {
        realizarOperacion("multiplicacion", `num1=${num1}&num2=${num2}`)
            .then(resultado => actualizarResultado(`Resultado: ${resultado}`));
    } else {
        alert("Por favor, ingresa ambos números.");
    }
}

function division() {
    const num1 = document.getElementById("num1").value;
    const num2 = document.getElementById("num2").value;
    if (num1 && num2) {
        realizarOperacion("division", `num1=${num1}&num2=${num2}`)
            .then(resultado => actualizarResultado(`Resultado: ${resultado}`));
    } else {
        alert("Por favor, ingresa ambos números.");
    }
}

function factorial() {
    const num1 = document.getElementById("num1").value;
    if (num1) {
        realizarOperacion("factorial", `base=${num1}`)
            .then(resultado => actualizarResultado(`Resultado: ${resultado}`));
    } else {
        alert("Por favor, ingresa un número.");
    }
}

function potencia() {
    const num1 = document.getElementById("num1").value;
    const num2 = document.getElementById("num2").value;
    if (num1 && num2) {
        realizarOperacion("potencia", `num1=${num1}&num2=${num2}`)
            .then(resultado => actualizarResultado(`Resultado: ${resultado}`));
    } else {
        alert("Por favor, ingresa ambos números.");
    }
}

function modulo() {
    const num1 = document.getElementById("num1").value;
    const num2 = document.getElementById("num2").value;
    if (num1 && num2) {
        realizarOperacion("modulo", `num1=${num1}&num2=${num2}`)
            .then(resultado => actualizarResultado(`Resultado: ${resultado}`));
    } else {
        alert("Por favor, ingresa ambos números.");
    }
}

function raizCuadrada() {
    const num1 = document.getElementById("num1").value;
    if (num1) {
        realizarOperacion("raizCuadrada", `raiz=${num1}`)
            .then(resultado => actualizarResultado(`Resultado: ${resultado}`));
    } else {
        alert("Por favor, ingresa un número.");
    }
}

function logaritmo() {
    const num1 = document.getElementById("num1").value;
    if (num1) {
        realizarOperacion("logaritmo", `log=${num1}`)
            .then(resultado => actualizarResultado(`Resultado: ${resultado}`));
    } else {
        alert("Por favor, ingresa un número.");
    }
}

function seno() {
    const num1 = document.getElementById("num1").value;
    if (num1) {
        realizarOperacion("sin", `seno=${num1}`)
            .then(resultado => actualizarResultado(`Resultado: ${resultado}`));
    } else {
        alert("Por favor, ingresa un número.");
    }
}

function coseno() {
    const num1 = document.getElementById("num1").value;
    if (num1) {
        realizarOperacion("cos", `cos=${num1}`)
            .then(resultado => actualizarResultado(`Resultado: ${resultado}`));
    } else {
        alert("Por favor, ingresa un número.");
    }
}

function tangente() {
    const num1 = document.getElementById("num1").value;
    if (num1) {
        realizarOperacion("tan", `tan=${num1}`)
            .then(resultado => actualizarResultado(`Resultado: ${resultado}`));
    } else {
        alert("Por favor, ingresa un número.");
    }
}

function exponente() {
    const num1 = document.getElementById("num1").value;
    if (num1) {
        realizarOperacion("e", `e=${num1}`)
            .then(resultado => actualizarResultado(`Resultado: ${resultado}`));
    } else {
        alert("Por favor, ingresa un número.");
    }
}

function senh() {
    const num1 = document.getElementById("num1").value;
    if (num1) {
        realizarOperacion("sinh", `senh=${num1}`)
            .then(resultado => actualizarResultado(`Resultado: ${resultado}`));
    } else {
        alert("Por favor, ingresa un número.");
    }
}

function cosh() {
    const num1 = document.getElementById("num1").value;
    if (num1) {
        realizarOperacion("cosh", `cosh=${num1}`)
            .then(resultado => actualizarResultado(`Resultado: ${resultado}`));
    } else {
        alert("Por favor, ingresa un número.");
    }
}

function tanh() {
    const num1 = document.getElementById("num1").value;
    if (num1) {
        realizarOperacion("tanh", `tanh=${num1}`)
            .then(resultado => actualizarResultado(`Resultado: ${resultado}`));
    } else {
        alert("Por favor, ingresa un número.");
    }
}
