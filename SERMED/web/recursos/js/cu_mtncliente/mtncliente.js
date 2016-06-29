$(document).ready(function () {
    $("#alerta").hide();
    var $table = $('#table');
    $(function () {
        var data = [{'nroTabla': 0, 'direccion': 'Item 0', 'ciudad': '$1', 'pos': 0}
            , {'nroTabla': 1, 'direccion': 'Item 1', 'ciudad': '$2'}, {'nroTabla': 2, 'direccion': 'Item 2', 'ciudad': '$3'}
            , {'nroTabla': 3, 'direccion': 'Item 3', 'ciudad': '$4'}, {'nroTabla': 4, 'direccion': 'Item 4', 'ciudad': '$5'}
            , {'nroTabla': 5, 'direccion': 'Item 5', 'ciudad': '$6'}, {'nroTabla': 6, 'direccion': 'Item 6', 'ciudad': '$7'}
            , {'nroTabla': 7, 'direccion': 'Item 7', 'ciudad': '$8'}, {'nroTabla': 8, 'direccion': 'Item 8', 'ciudad': '$9'}
            , {'nroTabla': 9, 'direccion': 'Item 9', 'ciudad': '$10'}, {'nroTabla': 10, 'direccion': 'Item 10', 'ciudad': '$11'}
            , {'nroTabla': 11, 'direccion': 'Item 11', 'ciudad': '$12'}, {'nroTabla': 12, 'direccion': 'Item 12', 'ciudad': '$13'}
            , {'nroTabla': 13, 'direccion': 'Item 13', 'ciudad': '$14'}, {'nroTabla': 14, 'direccion': 'Item 14', 'ciudad': '$15'}
            , {'nroTabla': 15, 'direccion': 'Item 15', 'ciudad': '$16'}, {'nroTabla': 16, 'direccion': 'Item 16', 'ciudad': '$17'}
            , {'nroTabla': 17, 'direccion': 'Item 17', 'ciudad': '$18'}, {'nroTabla': 18, 'direccion': 'Item 18', 'ciudad': '$19'}
            , {'nroTabla': 19, 'direccion': 'Item 19', 'ciudad': '$20'}, {'nroTabla': 20, 'direccion': 'Item 20', 'ciudad': '$21'}
            , {'nroTabla': 21, 'direccion': 'Item 21', 'ciudad': '$22'}, {'nroTabla': 22, 'direccion': 'Item 22', 'ciudad': '$23'}
            , {'nroTabla': 23, 'direccion': 'Item 23', 'ciudad': '$24'}, {'nroTabla': 24, 'direccion': 'Item 24', 'ciudad': '$25'}
            , {'nroTabla': 25, 'direccion': 'Item 25', 'ciudad': '$26'}, {'nroTabla': 26, 'direccion': 'Item 26', 'ciudad': '$27'}
            , {'nroTabla': 27, 'direccion': 'Item 27', 'ciudad': '$28'}, {'nroTabla': 28, 'direccion': 'Item 28', 'ciudad': '$29'}
            , {'nroTabla': 29, 'direccion': 'Item 29', 'ciudad': '$30'}, {'nroTabla': 30, 'direccion': 'Item 30', 'ciudad': '$31'}
            , {'nroTabla': 31, 'direccion': 'Item 31', 'ciudad': '$32'}, {'nroTabla': 32, 'direccion': 'Item 32', 'ciudad': '$33'}
            , {'nroTabla': 33, 'direccion': 'Item 33', 'ciudad': '$34'}, {'nroTabla': 34, 'direccion': 'Item 34', 'ciudad': '$35'}
            , {'nroTabla': 35, 'direccion': 'Item 35', 'ciudad': '$36'}, {'nroTabla': 36, 'direccion': 'Item 36', 'ciudad': '$37'}
            , {'nroTabla': 37, 'direccion': 'Item 37', 'ciudad': '$38'}, {'nroTabla': 38, 'direccion': 'Item 38', 'ciudad': '$39'}
            , {'nroTabla': 39, 'direccion': 'Item 39', 'ciudad': '$40'}, {'nroTabla': 40, 'direccion': 'Item 40', 'ciudad': '$41'}
            , {'nroTabla': 41, 'direccion': 'Item 41', 'ciudad': '$42'}, {'nroTabla': 42, 'direccion': 'Item 42', 'ciudad': '$43'}
            , {'nroTabla': 43, 'direccion': 'Item 43', 'ciudad': '$44'}, {'nroTabla': 44, 'direccion': 'Item 44', 'ciudad': '$45'}
            , {'nroTabla': 45, 'direccion': 'Item 45', 'ciudad': '$46'}, {'nroTabla': 46, 'direccion': 'Item 46', 'ciudad': '$47'}
            , {'nroTabla': 47, 'direccion': 'Item 47', 'ciudad': '$48'}, {'nroTabla': 48, 'direccion': 'Item 48', 'ciudad': '$49'}
            , {'nroTabla': 49, 'direccion': 'Item 49', 'ciudad': '$50'}, {'nroTabla': 50, 'direccion': 'Item 50', 'ciudad': '$51'}
            , {'nroTabla': 51, 'direccion': 'Item 51', 'ciudad': '$52'}, {'nroTabla': 52, 'direccion': 'Item 52', 'ciudad': '$53'}
            , {'nroTabla': 53, 'direccion': 'Item 53', 'ciudad': '$54'}, {'nroTabla': 54, 'direccion': 'Item 54', 'ciudad': '$55'}
            , {'nroTabla': 55, 'direccion': 'Item 55', 'ciudad': '$56'}, {'nroTabla': 56, 'direccion': 'Item 56', 'ciudad': '$57'}
            , {'nroTabla': 57, 'direccion': 'Item 57', 'ciudad': '$58'}, {'nroTabla': 58, 'direccion': 'Item 58', 'ciudad': '$59'}
            , {'nroTabla': 59, 'direccion': 'Item 59', 'ciudad': '$60'}, {'nroTabla': 60, 'direccion': 'Item 60', 'ciudad': '$61'}
            , {'nroTabla': 61, 'direccion': 'Item 61', 'ciudad': '$62'}, {'nroTabla': 62, 'direccion': 'Item 62', 'ciudad': '$63'}
            , {'nroTabla': 63, 'direccion': 'Item 63', 'ciudad': '$64'}, {'nroTabla': 64, 'direccion': 'Item 64', 'ciudad': '$65'}
            , {'nroTabla': 65, 'direccion': 'Item 65', 'ciudad': '$66'}, {'nroTabla': 66, 'direccion': 'Item 66', 'ciudad': '$67'}
            , {'nroTabla': 67, 'direccion': 'Item 67', 'ciudad': '$68'}, {'nroTabla': 68, 'direccion': 'Item 68', 'ciudad': '$69'}
            , {'nroTabla': 69, 'direccion': 'Item 69', 'ciudad': '$70'}, {'nroTabla': 70, 'direccion': 'Item 70', 'ciudad': '$71'}
            , {'nroTabla': 71, 'direccion': 'Item 71', 'ciudad': '$72'}, {'nroTabla': 72, 'direccion': 'Item 72', 'ciudad': '$73'}
            , {'nroTabla': 73, 'direccion': 'Item 73', 'ciudad': '$74'}, {'nroTabla': 74, 'direccion': 'Item 74', 'ciudad': '$75'}
            , {'nroTabla': 75, 'direccion': 'Item 75', 'ciudad': '$76'}, {'nroTabla': 76, 'direccion': 'Item 76', 'ciudad': '$77'}
            , {'nroTabla': 77, 'direccion': 'Item 77', 'ciudad': '$78'}, {'nroTabla': 78, 'direccion': 'Item 78', 'ciudad': '$79'}
            , {'nroTabla': 79, 'direccion': 'Item 79', 'ciudad': '$80'}, {'nroTabla': 80, 'direccion': 'Item 80', 'ciudad': '$81'}
            , {'nroTabla': 81, 'direccion': 'Item 81', 'ciudad': '$82'}, {'nroTabla': 82, 'direccion': 'Item 82', 'ciudad': '$83'}
            , {'nroTabla': 83, 'direccion': 'Item 83', 'ciudad': '$84'}, {'nroTabla': 84, 'direccion': 'Item 84', 'ciudad': '$85'}
            , {'nroTabla': 85, 'direccion': 'Item 85', 'ciudad': '$86'}, {'nroTabla': 86, 'direccion': 'Item 86', 'ciudad': '$87'}
            , {'nroTabla': 87, 'direccion': 'Item 87', 'ciudad': '$88'}, {'nroTabla': 88, 'direccion': 'Item 88', 'ciudad': '$89'}
            , {'nroTabla': 89, 'direccion': 'Item 89', 'ciudad': '$90'}, {'nroTabla': 90, 'direccion': 'Item 90', 'ciudad': '$91'}
            , {'nroTabla': 91, 'direccion': 'Item 91', 'ciudad': '$92'}, {'nroTabla': 92, 'direccion': 'Item 92', 'ciudad': '$93'}
            , {'nroTabla': 93, 'direccion': 'Item 93', 'ciudad': '$94'}, {'nroTabla': 94, 'direccion': 'Item 94', 'ciudad': '$95'}
            , {'nroTabla': 95, 'direccion': 'Item 95', 'ciudad': '$96'}, {'nroTabla': 96, 'direccion': 'Item 96', 'ciudad': '$97'}
            , {'nroTabla': 97, 'direccion': 'Item 97', 'ciudad': '$98'}, {'nroTabla': 98, 'direccion': 'Item 98', 'ciudad': '$99'}
            , {'nroTabla': 99, 'direccion': 'Item 99', 'ciudad': '$100'}, {'nroTabla': 100, 'direccion': 'Item 100', 'ciudad': '$101'}
            , {'nroTabla': 101, 'direccion': 'Item 101', 'ciudad': '$102'}, {'nroTabla': 102, 'direccion': 'Item 102', 'ciudad': '$103'}
            , {'nroTabla': 103, 'direccion': 'Item 103', 'ciudad': '$104'}, {'nroTabla': 104, 'direccion': 'Item 104', 'ciudad': '$105'}
            , {'nroTabla': 105, 'direccion': 'Item 105', 'ciudad': '$106'}, {'nroTabla': 106, 'direccion': 'Item 106', 'ciudad': '$107'}
            , {'nroTabla': 107, 'direccion': 'Item 107', 'ciudad': '$108'}, {'nroTabla': 108, 'direccion': 'Item 108', 'ciudad': '$109'}
            , {'nroTabla': 109, 'direccion': 'Item 109', 'ciudad': '$110'}, {'nroTabla': 110, 'direccion': 'Item 110', 'ciudad': '$111'}
            , {'nroTabla': 111, 'direccion': 'Item 111', 'ciudad': '$112'}, {'nroTabla': 112, 'direccion': 'Item 112', 'ciudad': '$113'}
            , {'nroTabla': 113, 'direccion': 'Item 113', 'ciudad': '$114'}, {'nroTabla': 114, 'direccion': 'Item 114', 'ciudad': '$115'}
            , {'nroTabla': 115, 'direccion': 'Item 115', 'ciudad': '$116'}, {'nroTabla': 116, 'direccion': 'Item 116', 'ciudad': '$117'}
            , {'nroTabla': 117, 'direccion': 'Item 117', 'ciudad': '$118'}, {'nroTabla': 118, 'direccion': 'Item 118', 'ciudad': '$119'}
            , {'nroTabla': 119, 'direccion': 'Item 119', 'ciudad': '$120'}, {'nroTabla': 120, 'direccion': 'Item 120', 'ciudad': '$121'}
            , {'nroTabla': 121, 'direccion': 'Item 121', 'ciudad': '$122'}, {'nroTabla': 122, 'direccion': 'Item 122', 'ciudad': '$123'}
            , {'nroTabla': 123, 'direccion': 'Item 123', 'ciudad': '$124'}, {'nroTabla': 124, 'direccion': 'Item 124', 'ciudad': '$125'}
            , {'nroTabla': 125, 'direccion': 'Item 125', 'ciudad': '$126'}, {'nroTabla': 126, 'direccion': 'Item 126', 'ciudad': '$127'}
            , {'nroTabla': 127, 'direccion': 'Item 127', 'ciudad': '$128'}, {'nroTabla': 128, 'direccion': 'Item 128', 'ciudad': '$129'}
            , {'nroTabla': 129, 'direccion': 'Item 129', 'ciudad': '$130'}, {'nroTabla': 130, 'direccion': 'Item 130', 'ciudad': '$131'}
            , {'nroTabla': 131, 'direccion': 'Item 131', 'ciudad': '$132'}, {'nroTabla': 132, 'direccion': 'Item 132', 'ciudad': '$133'}
            , {'nroTabla': 133, 'direccion': 'Item 133', 'ciudad': '$134'}, {'nroTabla': 134, 'direccion': 'Item 134', 'ciudad': '$135'}
            , {'nroTabla': 135, 'direccion': 'Item 135', 'ciudad': '$136'}, {'nroTabla': 136, 'direccion': 'Item 136', 'ciudad': '$137'}
            , {'nroTabla': 137, 'direccion': 'Item 137', 'ciudad': '$138'}, {'nroTabla': 138, 'direccion': 'Item 138', 'ciudad': '$139'}
            , {'nroTabla': 139, 'direccion': 'Item 139', 'ciudad': '$140'}, {'nroTabla': 140, 'direccion': 'Item 140', 'ciudad': '$141'}
            , {'nroTabla': 141, 'direccion': 'Item 141', 'ciudad': '$142'}, {'nroTabla': 142, 'direccion': 'Item 142', 'ciudad': '$143'}
            , {'nroTabla': 143, 'direccion': 'Item 143', 'ciudad': '$144'}, {'nroTabla': 144, 'direccion': 'Item 144', 'ciudad': '$145'}
            , {'nroTabla': 145, 'direccion': 'Item 145', 'ciudad': '$146'}, {'nroTabla': 146, 'direccion': 'Item 146', 'ciudad': '$147'}
            , {'nroTabla': 147, 'direccion': 'Item 147', 'ciudad': '$148'}, {'nroTabla': 148, 'direccion': 'Item 148', 'ciudad': '$149'}
            , {'nroTabla': 149, 'direccion': 'Item 149', 'ciudad': '$150'}, {'nroTabla': 150, 'direccion': 'Item 150', 'ciudad': '$151'}
            , {'nroTabla': 151, 'direccion': 'Item 151', 'ciudad': '$152'}, {'nroTabla': 152, 'direccion': 'Item 152', 'ciudad': '$153'}
            , {'nroTabla': 153, 'direccion': 'Item 153', 'ciudad': '$154'}, {'nroTabla': 154, 'direccion': 'Item 154', 'ciudad': '$155'}
            , {'nroTabla': 155, 'direccion': 'Item 155', 'ciudad': '$156'}, {'nroTabla': 156, 'direccion': 'Item 156', 'ciudad': '$157'}
            , {'nroTabla': 157, 'direccion': 'Item 157', 'ciudad': '$158'}, {'nroTabla': 158, 'direccion': 'Item 158', 'ciudad': '$159'}
            , {'nroTabla': 159, 'direccion': 'Item 159', 'ciudad': '$160'}, {'nroTabla': 160, 'direccion': 'Item 160', 'ciudad': '$161'}
            , {'nroTabla': 161, 'direccion': 'Item 161', 'ciudad': '$162'}, {'nroTabla': 162, 'direccion': 'Item 162', 'ciudad': '$163'}
            , {'nroTabla': 163, 'direccion': 'Item 163', 'ciudad': '$164'}, {'nroTabla': 164, 'direccion': 'Item 164', 'ciudad': '$165'}
            , {'nroTabla': 165, 'direccion': 'Item 165', 'ciudad': '$166'}, {'nroTabla': 166, 'direccion': 'Item 166', 'ciudad': '$167'}
            , {'nroTabla': 167, 'direccion': 'Item 167', 'ciudad': '$168'}, {'nroTabla': 168, 'direccion': 'Item 168', 'ciudad': '$169'}
            , {'nroTabla': 169, 'direccion': 'Item 169', 'ciudad': '$170'}, {'nroTabla': 170, 'direccion': 'Item 170', 'ciudad': '$171'}
            , {'nroTabla': 171, 'direccion': 'Item 171', 'ciudad': '$172'}, {'nroTabla': 172, 'direccion': 'Item 172', 'ciudad': '$173'}
            , {'nroTabla': 173, 'direccion': 'Item 173', 'ciudad': '$174'}, {'nroTabla': 174, 'direccion': 'Item 174', 'ciudad': '$175'}
            , {'nroTabla': 175, 'direccion': 'Item 175', 'ciudad': '$176'}, {'nroTabla': 176, 'direccion': 'Item 176', 'ciudad': '$177'}
            , {'nroTabla': 177, 'direccion': 'Item 177', 'ciudad': '$178'}, {'nroTabla': 178, 'direccion': 'Item 178', 'ciudad': '$179'}
            , {'nroTabla': 179, 'direccion': 'Item 179', 'ciudad': '$180'}, {'nroTabla': 180, 'direccion': 'Item 180', 'ciudad': '$181'}
            , {'nroTabla': 181, 'direccion': 'Item 181', 'ciudad': '$182'}, {'nroTabla': 182, 'direccion': 'Item 182', 'ciudad': '$183'}
            , {'nroTabla': 183, 'direccion': 'Item 183', 'ciudad': '$184'}, {'nroTabla': 184, 'direccion': 'Item 184', 'ciudad': '$185'}
            , {'nroTabla': 185, 'direccion': 'Item 185', 'ciudad': '$186'}, {'nroTabla': 186, 'direccion': 'Item 186', 'ciudad': '$187'}
            , {'nroTabla': 187, 'direccion': 'Item 187', 'ciudad': '$188'}, {'nroTabla': 188, 'direccion': 'Item 188', 'ciudad': '$189'}
            , {'nroTabla': 189, 'direccion': 'Item 189', 'ciudad': '$190'}, {'nroTabla': 190, 'direccion': 'Item 190', 'ciudad': '$191'}
            , {'nroTabla': 191, 'direccion': 'Item 191', 'ciudad': '$192'}, {'nroTabla': 192, 'direccion': 'Item 192', 'ciudad': '$193'}
            , {'nroTabla': 193, 'direccion': 'Item 193', 'ciudad': '$194'}, {'nroTabla': 194, 'direccion': 'Item 194', 'ciudad': '$195'}
            , {'nroTabla': 195, 'direccion': 'Item 195', 'ciudad': '$196'}, {'nroTabla': 196, 'direccion': 'Item 196', 'ciudad': '$197'}
            , {'nroTabla': 197, 'direccion': 'Item 197', 'ciudad': '$198'}, {'nroTabla': 198, 'direccion': 'Item 198', 'ciudad': '$199'}
            , {'nroTabla': 199, 'direccion': 'Item 199', 'ciudad': '$200'}];
        $table.bootstrapTable({
            columns: [
                {
                    field: 'nroTabla',
                    align: 'center'
                }, {
                    field: 'direccion',
                    align: 'center'
                }, {
                    field: 'ciudad',
                    align: 'center'
                }, {
                    field: 'operate',
                    align: 'center',
                    events: operateEvents,
                    formatter: operateFormatter
                }
            ],
//            data: data,
            pagination: true
        });
        var table1 = $("#table1");
//        table1.bootstrapTable({
//            height: getHeight(),
//            columns: [
//                [
//                    {
//                        field: 'state',
//                        checkbox: true,
//                        rowspan: 2,
//                        align: 'center',
//                        valign: 'middle'
//                    }, {
//                        title: 'Item ID',
//                        field: 'id',
//                        rowspan: 2,
//                        align: 'center',
//                        valign: 'middle',
//                        sortable: true,
//                        footerFormatter: totalTextFormatter
//                    }, {
//                        title: 'Item Details',
//                        colspan: 3,
//                        align: 'center',
//                        valign: 'middle'
//                    }
//                ], [
//                    {
//                        field: 'name',
//                        title: 'Nombre',
//                        align: 'center',
//                        sortable:true,
//                        editable:true,
//                        footerFormatter: totalNameFormatter
//                    },{
//                        field:'price',
//                        title: 'Item Price',
//                        sortable:true,
//                        align: 'center',
//                        editable: {
//                            type: 'text',
//                            title: 'Item Price',
//                            validate: function (value) {
//                                value = $.trim(value);
//                                if (!value) {
//                                    return 'This field is required';
//                                }
//                                if (!/^\$/.test(value)) {
//                                    return 'This field needs to start width $.'
//                                }
//                                var data = $table.bootstrapTable('getData'),
//                                    index = $(this).parents('tr').data('index');
//                                console.log(data[index]);
//                                return '';
//                            }
//                        },
//                        footerFormatter: totalPriceFormatter
//                    },{
//                        field:'operate',
//                        title: 'Item Operate',
//                        align: 'center',
//                        events: operateEvents,
//                        formatter: operateFormatter
//                    }
//                ]
//            ],
//            data: data,
//            pagination: true
//        });.nroTabla

        $.each(data, function (key, val) {
            console.log("key :" + key + " val :" + val);
            $.each(val, function (key, val) {
                console.log("key :" + key + " val :" + val);
            });
        });


////////////////////////////////////////////////////////////////////////////////
//      Validacion
        //$('#form').validator();
//        $("#form").bootstrapValidator({
//            /*framework: 'bootstrap',
//             icon: {
//             valid: 'glyphicon glyphicon-ok',
//             invalid: 'glyphicon glyphicon-remove',
//             validating: 'glyphicon glyphicon-refresh'
//             },*/
//            message: 'This value is not valid',
//            fields: {
//                t1: {
//                    message: 'The username is not valid',
//                    validators: {
//                        notEmpty: {
//                            message: 'Este campo es requerido'
//                        },
//                        stringLength: {
//                            min: 3,
//                            max: 6
//                        }
//                    }
//                }
//            }
//        });
        /*$("#t1").on("keyup",function(){
         console.log("aprete un boton " +$(this).val()) ;
         });*/
    });
    function operateFormatter(value, row, index) {
        console.log("value: " + value + " row: " + JSON.stringify(row) + " index: " + index);//'+row[pos]+''+row[pos]+'
        return [
            '<a class="like" href="javascript:void(0)" onclick="cargarDireccion(' + row.pos + ')" title="Actualizar">',
            '<i class="glyphicon glyphicon-pencil"></i>',
            '</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;',
            '<a class="remove" href="javascript:void(0)" onclick="eliminarDireccion(' + row.pos + ')" title="Eliminar">',
            '<i class="glyphicon glyphicon-remove"></i>',
            '</a>'
        ].join('');
    }

    window.operateEvents = {
        'click .like': function (e, value, row, index) {
            alert('You click like action, row: ' + JSON.stringify(row));
        },
        'click .remove': function (e, value, row, index) {
            $table.bootstrapTable('remove', {
                field: 'id',
                values: [row.id]
            });
        }
    };


    function totalNameFormatter(data) {
        return data.length;
    }

    function totalTextFormatter(data) {
        return 'Total';
    }

    function totalPriceFormatter(data) {
        var total = 0;
        $.each(data, function (i, row) {
            total += +(row.price.substring(1));
        });
        return '$' + total;
    }

    function getHeight() {
        return $(window).height() - $('h1').outerHeight(true);
    }
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
                "<a href='" + $("#context").val() + "/MtnCliente/cargarUnCliente.html?id=" + val['id']
                + "' class='btn btn-default' role='button'>Actualizar</a></td></tr>";
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
    $("#upaginacion").remove();
    var ul = $('<ul/>', {'id': 'upaginacion', 'class': 'pagination'});
    $("#npaginacion").append(ul);
    $("#upaginacion").append(li);
}

function guardarDireccion() {
    var datos = {direccion: $("#t9").val(), ciudad: $("#t10").val(), pos: $("#t11").val()};
    var url = $("#context").val();
    if ($("#t11").val() === '0') {
        url += "/MtnCliente/agregarDireccion.html";
    } else {
        url += "/MtnCliente/actualizarDireccion.html";
    }
    console.log(JSON.stringify(datos));
    console.log(url);
    var flag9 = isEmpty($("#t9")), flag10 = isEmpty($("#t10"));
    if (!flag9 && !flag10) {
        $.ajax({
            type: "POST",
            contentType: "application/json",
            data: JSON.stringify(datos),
            url: url,
            dataType: 'json',
            timeout: 100000,
            success: function (data) {
                tablaDireccion(data);
                /*var tabla = $("#table");
                 tabla.bootstrapTable('load', data);
                 $("#t9").val("");
                 $("#t10").val("");
                 $("#t11").val(0);*/
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
    var newdata = new Array();
    var pos = 0;
    console.log("data :" + data);
    console.log("data stringify :" + JSON.stringify(data));
    for (i = 0; i < data.length; i++) {
        console.log(data[i].mostrar);
        if (data[i].mostrar === true) {
            newdata[pos] = data[i];
            pos++;
        }
    }
    console.log("newdata :" + newdata);
    console.log("newdata stringify :" + JSON.stringify(newdata));
    var tabla = $("#table");
    tabla.bootstrapTable('load', newdata);
    /*var filas = "";
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
     $("#contenido").append(filas);*/
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
    if( validacion()){
        $("#alerta").show();
    }else{
        $("#alerta").hide();
        var form = $("#form");
        form.attr("action", url);
        form.submit();
    }
}

function validacion() {
    var flag = false;
    if (isEmpty($("#t1")))
        flag = true;
    if (isSelected($("#t3")))
        flag = true;
    if (isEmpty($("#t4")))
        flag = true;
    if (isNumero($("#t4")))
        flag = true;
    if (isEmpty($("#t6")))
        flag = true;
    if (isEmail($("#t6")))
        flag = true;
    return flag
}


    /*if (error == "") {
        var ul = $('<ul/>', {'id': 'msj-ul'});
        error += "<li>Los datos son correctos</li>";
        $("#msj").append(ul);
        $('#msj-ul').append(error);
        $("#msj").removeClass().addClass("row-fluid bg-success");
    }*/