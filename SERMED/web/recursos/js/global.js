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

function isEmpty(id) {
    var valor = id.val();
    id.parent().removeClass("has-success has-error");
    id.next().removeClass("glyphicon-ok glyphicon-remove");
    if (valor == null || valor.length == 0 || /^\s+$/.test(valor)) {
        id.parent().addClass("has-error");
        id.next().addClass("glyphicon-remove");
        id.next().next().text("No Puede estar vacio");
        return true;
    } else {
        id.parent().addClass("has-success");
        id.next().addClass("glyphicon-ok");
        id.next().next().text("");
        return false;
    }
}

function isSelected(id) {
    var indice = id.prop('selectedIndex');
    id.parent().removeClass("has-success has-error");
    id.next("span.glyphicon").removeClass("glyphicon-ok glyphicon-remove");
    if (indice == null || indice == 0) {
        id.parent().addClass("has-error");
        id.next().addClass("glyphicon-remove");
        id.next().next().text("Seleccione un valor un Tipo de Documento");
        return true;
    } else {
        id.parent().addClass("has-success");
        id.next().addClass("glyphicon-ok");
        id.next().next().text("");
        return false;
    }
}

function isEmail(id) {
    var valor = id.val();
    id.parent().removeClass("has-success has-error");
    id.next("span.glyphicon").removeClass("glyphicon-ok glyphicon-remove");
    if (!(/^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/.test(valor))) {
        id.parent().addClass("has-error");
        id.next().addClass("glyphicon-remove");
        id.next().next().text("No Puede estar vacio");
        return true;
    } else {
        id.parent().addClass("has-success");
        id.next().addClass("glyphicon-ok");
        id.next().next().text("");
        return false;
    }
}
function isNumero(id) {
    var valor = id.val();
    id.parent().removeClass("has-success has-error");
    id.next("span.glyphicon").removeClass("glyphicon-ok glyphicon-remove");
    if (valor == null || valor.length == 0 || /^\s+$/.test(valor)||isNaN(valor)) {
        id.parent().addClass("has-error");
        id.next().addClass("glyphicon-remove");
        id.next().next().text("Debe de ingresar un numero");
        return true;
    } else {
        id.parent().addClass("has-success");
        id.next().addClass("glyphicon-ok");
        id.next().next().text("");
        return false;
    }
}


