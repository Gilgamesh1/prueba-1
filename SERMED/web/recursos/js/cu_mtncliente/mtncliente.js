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
            cargarTabla(data);
        },
        error: function (e) {
            console.log("ERROR: ", e);
        },
        done: function (e) {
            console.log("DONE");
        }
    });
    url = $("#context").val() + "/MtnCliente/seleccionGrupoAnterior.html";
    console.log(url);
    $.ajax({
        type: "POST",
        contentType: "application/json",
        data: JSON.stringify(datos),
        url: url,
        dataType: 'json',
        timeout: 100000,
        success: function (data) {
            cargarPaginacion(data);
        },
        error: function (e) {
            console.log("ERROR: ", e);
        },
        done: function (e) {
            console.log("DONE");
        }
    });
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
            cargarTabla(data);
        },
        error: function (e) {
            console.log("ERROR: ", e);
        },
        done: function (e) {
            console.log("DONE");
        }
    });
    url = $("#context").val() + "/MtnCliente/seleccionPagina.html";
    console.log(url);
    $.ajax({
        type: "POST",
        contentType: "application/json",
        data: JSON.stringify(datos),
        url: url,
        dataType: 'json',
        timeout: 100000,
        success: function (data) {
            cargarPaginacion(data);
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
            cargarTabla(data);
        },
        error: function (e) {
            console.log("ERROR: ", e);
        },
        done: function (e) {
            console.log("DONE");
        }
    });
    url = $("#context").val() + "/MtnCliente/seleccionGrupoSiguiente.html";
    console.log(url);
    $.ajax({
        type: "POST",
        contentType: "application/json",
        data: JSON.stringify(datos),
        url: url,
        dataType: 'json',
        timeout: 100000,
        success: function (data) {
            cargarPaginacion(data);
        },
        error: function (e) {
            console.log("ERROR: ", e);
        },
        done: function (e) {
            console.log("DONE");
        }
    });
}

function cargarTabla(data) {
//            console.log("SUCCESS: ", data);
//            console.log("longitud: ", data.length);
//            console.log(JSON.stringify(data));
    var filas = "";
    for (i = 0; i < data.length; i++) {
        var val = data[i];
//                console.log(JSON.stringify(val));
//                console.log(val['id'] + ", " + val['nombre'] + ", " + val['valDocumento'] + ", " + val['nroTabla']);
        filas += "<tr><td>" + val['nroTabla'] + "</td><td>" + val['nombre'] +
                "</td><td>" + val['dir'] + "</td><td>" + val['ubi'] + "</td><td>" + val['valDocumento'] +
                "</td><td>" + val['representante'] + "</td><td>" + val['telefono'] + "</td><td>" + val['celular'] + "</td><td>" +
                "<a href='/MtnCliente/cargarUnCliente.html?id='" + val['id']
                + " class='btn btn-default' role='button'>Actualizar</a></td></tr>";
    }
    $("#contenido").remove();
    var tbody = $('<tbody/>', {'id': 'contenido'});
    $("#tabla").append(tbody);
    $("#contenido").append(filas);
}

function cargarPaginacion(data) {
//            console.log("SUCCESS /MtnCliente/seleccionPagina: ", data);
//            console.log("longitud /MtnCliente/seleccionPagina: ", data.length);
//            console.log(JSON.stringify(data));
    var li = "";
    if (data['mostrarInicio'] == true) {
        li += "<li><a href='#' onclick='anterior(" + data['grupoInicio'] + ");' aria-label='Previous'>";
        li += "<span aria-hidden='true'>&laquo;</span></a></li>";
    }
    for (i = data['inicio']; i <= data['fin']; i++) {
        if (data['seleccionada'] == i) {
            li += "<li class='active'><a href='#'>" + i + "</a></li>";
        } else {
            li += "<li><a href='#' onclick='pagina(" + i + ")'>" + i + "</a></li>";
        }
    }
    if (data['mostrarFin'] == true) {
        li += "<li><a href='#' onclick='anterior(" + data['grupoFin'] + ");' aria-label='Previous'>";
        li += "<span aria-hidden='true'>&raquo;</span></a></li>";
    }
//            console.log("valor de li: ",li);
    $("#upaginacion").remove();
    var ul = $('<ul/>', {'id': 'upaginacion', 'class': 'pagination'});
    $("#npaginacion").append(ul);
    $("#upaginacion").append(li);
}

function guardarDireccion() {
    var datos = {direccion: $("#t9").val(), ciudad: $("#t10").val(), pos: $("#t11").val()};
    var url = $("#context").val();
    if ($("#t11").val() == 0) {
        url += "/MtnCliente/agregarDireccion.html";
    } else {
        url += "/MtnCliente/actualizarDireccion.html";
    }
    console.log(JSON.stringify(datos));
    console.log(url);
    if ($("#t9").val() == "" || $("#t10").val() == "") {
        alert("Debe de ingresar la Direcci&oacute;n y la Ubicaci&oacute;n.");
    } else {
        $.ajax({
            type: "POST",
            contentType: "application/json",
            data: JSON.stringify(datos),
            url: url,
            dataType: 'json',
            timeout: 100000,
            success: function (data) {
                tablaDireccion(data);
            },
            error: function (e) {
                console.log("ERROR: ", e);
            },
            done: function (e) {
                console.log("DONE");
            }
        });
    }
}


function cargarDireccion(pos) {
    var datos = {pos: pos};
    var url = $("#context").val() + "/MtnCliente/cargarDireccion.html";
    console.log(JSON.stringify(datos));
    console.log(url);
    $.ajax({
        type: "POST",
        contentType: "application/json",
        data: JSON.stringify(datos),
        url: url,
        dataType: 'json',
        timeout: 100000,
        success: function (data) {
            console.log(data);
            console.log(JSON.stringify(data));
            $("#t9").val(data['direccion']);
            $("#t10").val(data['ciudad']);
            $("#t11").val(data['pos']);
        },
        error: function (e) {
            console.log("ERROR: ", e);
        },
        done: function (e) {
            console.log("DONE");
        }
    });
}

function eliminarDireccion(pos) {
    var datos = {pos: pos};
    var url = $("#context").val() + "/MtnCliente/eliminarDireccion.html";
    $.ajax({
        type: "POST",
        contentType: "application/json",
        data: JSON.stringify(datos),
        url: url,
        dataType: 'json',
        timeout: 100000,
        success: function (data) {
            tablaDireccion(data);
        },
        error: function (e) {
            console.log("ERROR: ", e);
        },
        done: function (e) {
            console.log("DONE");
        }
    });
}

function tablaDireccion(data) {
    var filas = "";
    for (i = 0; i < data.length; i++) {
        var val = data[i];
        if (val['mostrar'] == true) {
            filas += "<tr><td>" + val['nroTabla'] + "</td><td>" + val['direccion'] + "</td><td>" + val['ciudad'] + "</td>" +
                    "<td><a href='#' onclick='cargarDireccion(" + val['pos'] + ")' class='btn btn-primary' role='button'>Actualizar</a></td>" +
                    "<td><a href='#' onclick='eliminarDireccion(" + val['pos'] + ")' class='btn btn-danger' role='button'>Eliminiar</a></td></tr>";
        }
    }
    $("#contenido").remove();
    var tbody = $('<tbody/>', {'id': 'contenido'});
    $("#tabla").append(tbody);
    $("#contenido").append(filas);
    $("#t9").val("");
    $("#t10").val("");
    $("#t11").val(0);
}

function guardarCliente() {
    var url = $("#context").val();
    if ($("#t2").val() == 0) {
        url += "/MtnCliente/agregarCliente.html";
    } else {
        url += "/MtnCliente/modificarCliente.html";
    }
    var form = $("#form");
    form.attr("action", url);
    form.submit();
    form.attr("action", "insertarMtnCliente.html");
}