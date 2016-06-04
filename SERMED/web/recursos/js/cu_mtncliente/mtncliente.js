$(document).ready(function () {
    $("#msj-sucess").fadeOut();
    $("#msj-info").removeClass("bg-info");
    $("#msj-info").addClass("bg-warning");
    console.log($("#msj-sucess").text());
    $("#msj-sucess").text("jajajajaja");
    console.log($("#msj-sucess").text());
    $("#msj-sucess").fadeIn();
});

function buscarClientes() {
    var b1 = $("#t1").val();
    var b2 = $("#t2").val();
    var url = "MtnCliente/buscar.html?b1=" + b1 + "&b2=" + b2;
    var form = $("#form");
    form.attr("action", url);
    form.submit();
    form.attr("action", "MtnCliente/buscar.html");
}
//onclick="buscarClientes()"
function guardarCliente() {
    var val = $("#t9").val();
    var form = $("#form");
    if (val == 0)
        form.attr("action", "insertar.html");
    else
        form.attr("action", "actualizar.html");
    form.submit();
    form.attr("action", "insertarMtnCliente.html");
}

function agregarDireccion() {
    var form = $("#form");
    var url = path;
    if ($("#t11").val() == "x") {
        url +="/MtnCliente/agregarDireccion.html?b1=" + $("#t8").val() + "&b2=" + $("#t10").val();
    } else {
        url +="/MtnCliente/actualizarDireccion.html?b1=" + $("#t8").val() + "&b2=" + $("#t10").val() + "&b3=" + $("#t11").val();
    }
    form.attr("action", url);
//    form.submit();
//    form.attr("action", "insertarMtnCliente.html");
}

function cargarDireccion(pos) {
    var form = $("#form");
    var url = path + "/MtnCliente/cargarDireccion.html?b3=" + pos;
    form.attr("action", url);
    form.submit();
    form.attr("action", "insertarMtnCliente.html");
}

//function actualizarDireccion(pos) {
//    var form = $("#form");
//    var url = path + "/MtnCliente/actualizarDireccion.html?b1=" + $("#t8").val() + "&b2=" + $("#t9").val() + "&b3=" + pos;
//    form.attr("action", url);
//    form.submit();
//    form.attr("action", "insertarMtnCliente.html");
//}

function eliminar(valor){
    var form = $("#form");
    var url = path +"/MtnCliente/eliminarDireccion.html?id=" + valor;
    form.attr("action", url);
    form.submit();
}


function json(){
//    var form = $("#form");//MtnCliente/
//    var url = path +"/buscarMtnCliente/json.html?b1=quiero&b2=sexo";
//    form.attr("action", url);
//    form.submit();
    var data = {id:1,nom:"loquillo"};
    console.log(data);
    console.log(JSON.stringify(data));
    
    var x = {}
    x["query"] = "wqeqwe";
    console.log(x);
    console.log(JSON.stringify(x));
    
    $.ajax({
        type:"POST",
        contentType : "application/json",
        data : JSON.stringify(data),
        url : "http://localhost:8084/SERMED/json1.html",
        dataType : 'json',
        timeout : 100000,
        success : function(data) {
                console.log("SUCCESS: ", data);
                display(data);
        },
        error : function(e) {
                console.log("ERROR: ", e);
                display(e);
        },
        done : function(e) {
                console.log("DONE");
        }
    });
}

	function display(data) {
		var json = "<h4>Ajax Response</h4><pre>"
				+ JSON.stringify(data, null, 4) + "</pre>";
		$('#feedback').html(json);
	}