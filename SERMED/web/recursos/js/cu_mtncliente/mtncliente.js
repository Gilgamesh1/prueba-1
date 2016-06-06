$(document).ready(function () {
    $("#msj-sucess").fadeOut();
    $("#msj-info").removeClass("bg-info");
    $("#msj-info").addClass("bg-warning");
    console.log($("#msj-sucess").text());
    $("#msj-sucess").text("jajajajaja");
    console.log($("#msj-sucess").text());
    $("#msj-sucess").fadeIn();
});

function anterior(nro) {

}

function pagina(nro) {
    var datos = {nombre: $("#t1").val(), documento: $("#t2").val(), nro: nro};
    console.log(datos);
    console.log(JSON.stringify(datos));
    var url = $("#context").val() + "/MtnCliente/pagina.html";
    console.log(url);
    $.ajax({
        type: "POST",
        contentType: "application/json",
        data: JSON.stringify(datos),
        url: url,
        dataType: 'json',
        timeout: 100000,
        success: function (data) {
            console.log("SUCCESS: ", data);
            console.log("longitud: ", data.length);
            console.log(JSON.stringify(data));
            var filas="";
            for (i = 0; i < data.length; i++) {
                var val = data[i];
                console.log(JSON.stringify(val));
                console.log(val['id'] + ", " + val['nombre'] + ", " + val['valDocumento'] + ", " + val['nroTabla']);
                filas+="<tr><td>"+val['nroTabla']+"</td><td>"+val['nombre']+
                        "</td><td>"+val['dir']+"</td><td>"+val['ubi']+"</td><td>"+val['valDocumento']+
                "</td><td>"+val['representante']+"</td><td>"+val['telefono']+"</td><td>"+val['celular']+"</td><td>"+
                "<a href='cargarUnCliente.html?id='"+val['id']+" class='btn btn-default' role='button'>Actualizar</a></td></tr>";
            }
            
//            document.getElementById("demo").innerHTML = cabecera();
            $("#contenido").remove();
            var tbody=$('<tbody/>',{'id':'contenido'});
            var tabla = '<table class="table table-bordered" border="0">';
            tabla += '<tr><td>Celda 1</td><td>Celda 2</td><td> Celda 3</td></tr>';
            tabla += '</table>';
//            $("#tabla").append("<tbody><tr><td>1</td><td>2</td><td>3</td><td>4</td><td>5</td><td>6</td><td>7</td><td>8</td><td>9</td></tr></tbody>");
//            var tbody=document.createElement("tbody");
            $("#tabla").append(tbody);
            $("#contenido").append(filas);

            var txt = "";
            var person = {fname: "John", lname: "Doe", age: 25};
            var x;
            for (x in person) {
                txt += person[x] + " ";
            }
            document.getElementById("demo").innerHTML = tabla;

        },
        error: function (e) {
            console.log("ERROR: ", e);
        },
        done: function (e) {
            console.log("DONE");
        }
    });
}

function siguiente(nro) {

}

function cabecera() {
    var cabecera = "<table class=\"\ table table-bordered \"\><thead><tr><th>#</th><th>\n\
Nombre</th><th>Direcci&oacute;n</th><th>Ciudad</th><th>DNI - RUC</th><th>Repre. Legal</th><th>\n\
Tel&eacute;fono</th><th>Celular</th><th>Actualizar</th></tr></thead></table>";
    console.log(cabecera);
}