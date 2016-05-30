//ObtenerParametros.jsp?dato1=pagina&dato2=lineadecodigo
function buscarClientes() {
//    var combo = document.getElementById('cmbPia');
//    var index = combo.selectedIndex;
//    var valor = combo.options[index].value;
//    var url = contexto + "/cu_reginseminacion_obtenerresponsable.action?idPia=" + valor;
//    var formulario = document.getElementById('formulario');
//    formulario.action = url;
//    ajaxAnywhere.submitAJAX();
//    formulario.action = contexto + "/cu_reginseminacion_insertar.action";
    var b1 = $("#t7").val();
    var b2 = $("#t8").val();
    var url = "buscarMtnCliente.html?b1=" + b1 + "&b2=" + b2;
    var form = $("#form");
    form.attr("action", url);
    form.submit();
    form.attr("action", "insertarMtnCliente.html");
}

function guardar() {
    var val = $("#t9").val();
    var form = $("#form");
    if (val == 0)
        form.attr("action", "insertarMtnCliente.html");
    else
        form.attr("action", "actualizarMtnCliente.html");
    form.submit();
    form.attr("action", "insertarMtnCliente.html");
}