$(document).ready(function () {
    $("#vTexto").fadeOut();
})

function actualizarLoggin() {
    var v = $("#form");
    v.attr("action", "actualizarLogin.html");
    v.val("Y");
    v.submit();
    v.attr("action", "insertarLogin.html");
    v.val("Y");
}

function eliminarLoggin() {
    var v = $("#form");
    v.attr("action", "eliminiarLogin.html");
    v.submit();
    v.attr("action", "insertarLogin.html");
}

function vTamano() {
    var long = $("#t2").val().length;
    if (long >= 100) {
        var long2 = long - 100;
        $("#vTexto").empty();
        $("#vTexto").append("El texto ingresado supera el l&iacute;mite de 100 caracteres. Se excedio en " + long2);
        $("#vTexto").fadeIn();
    } else {
        $("#vTexto").fadeOut();
    }
}