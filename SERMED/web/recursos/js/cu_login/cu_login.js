$(document).ready(function () {
    $("#vTexto").fadeOut();
    $('[data-toggle="tooltip"]').tooltip();
});

$(function () {
    $("#dp1").datepicker({format: 'mm-dd-yy', value: '12/12/2012'});
    $("#dp2").datepicker();
    var dFecha = new Date();
    var sFecha = dFecha.getDate() + "-" + dFecha.getMonth() + "-" + dFecha.getFullYear();
    console.log(sFecha);
    $("#dp3").attr('data-date', sFecha);
    $("#t5").attr('value', sFecha);
    $("#dp3").datepicker();
});

function actualizarLoggin() {
    var num = $("#t4").val();
    if (valNumeros(num)) {
        console.log("es un numero");
        $("[data-toggle='tooltip1']").tooltip('hide');
    } else {
        console.log("no es un numero");
        $("[data-toggle='tooltip1']").tooltip('show');
    }

//    var v = $("#form");
//    v.attr("action", "actualizarLogin.html");
//    v.val("Y");
//    v.submit();
//    v.attr("action", "insertarLogin.html");
//    v.val("Y");
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