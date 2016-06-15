var expNumeros = /^([0-9])*$/;
var expDecimales = /^([0-9])*\.([0-9])*$/;
var expLetras = /^([a-zA-Z])*$/;
var expEmail = /^[a-zA-Z0-9_\.\-]+@[a-zA-Z0-9\-]+\.[a-zA-Z0-9\-\.]+$/;
var path = "/SERMED";

$(document).ready(function () {
});

function valNumeros(num) {
    var flag1, flag2;
    if (expNumeros.test(num)) {
        flag1 = true;
    } else {
        flag1 = false;
    }
    if (expDecimales.test(num)) {
        flag2 = true;
    } else {
        flag2 = false;
    }
    if (!flag1 & !flag2) {
        return false;
    } else {
        return true;
    }
}

function valEnteros(num) {
    if (expNumeros.test(num)) {
        return true;
    } else {
        return false;
    }
}

function valDecimales(num) {
    if (expDecimales.test(num)) {
        return true;
    } else {
        return false;
    }
}

function valLetras(texto) {
    if (expLetras.test(texto)) {
        return true;
    } else {
        return false;
    }
}

function valEmail(texto) {
    if (expEmail.test(texto)) {
        return true;
    } else {
        return false;
    }
}