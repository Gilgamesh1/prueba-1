$(document).ready(function () {
    var $table = $('#table');
    $(function () {
        var data = [{'id': 0, 'name': 'Item 0', 'price': '$1'}
            , {'id': 1, 'name': 'Item 1', 'price': '$2'}, {'id': 2, 'name': 'Item 2', 'price': '3'}
            , {'id': 3, 'name': 'Item 3', 'price': '$4'}, {'id': 4, 'name': 'Item 4', 'price': '5'}
            , {'id': 5, 'name': 'Item 5', 'price': '$6'}, {'id': 6, 'name': 'Item 6', 'price': '7'} 
            , {'id': 7, 'name': 'Item 7', 'price': '$8'}, {'id': 8, 'name': 'Item 8', 'price': '9'}
            , {'id': 9, 'name': 'Item 9', 'price': '$10'}, {'id': 10, 'name': 'Item 10', 'price': '$11'}
            , {'id': 11, 'name': 'Item 11', 'price': '$12'}, {'id': 12, 'name': 'Item 12', 'price': 'po'}
            , {'id': 13, 'name': 'Item 13', 'price': '$14'}, {'id': 14, 'name': 'Item 14', 'price': ''}
            , {'id': 15, 'name': 'Item 15', 'price': '$16'}, {'id': 16, 'name': 'Item 16', 'price': 'j'}
            , {'id': 17, 'name': 'Item 17', 'price': '$18'}, {'id': 18, 'name': 'Item 18', 'price': '$19'}
            , {'id': 19, 'name': 'Item 19', 'price': '$20'}, {'id': 20, 'name': 'Item 20', 'price': '$21'}
            , {'id': 21, 'name': 'Item 21', 'price': '$22'}, {'id': 22, 'name': 'Item 22', 'price': '$23'}
            , {'id': 23, 'name': 'Item 23', 'price': '$24'}, {'id': 24, 'name': 'Item 24', 'price': '$25'}
            , {'id': 25, 'name': 'Item 25', 'price': '$26'}, {'id': 26, 'name': 'Item 26', 'price': '$27'}
            , {'id': 27, 'name': 'Item 27', 'price': '$28'}, {'id': 28, 'name': 'Item 28', 'price': '$29'}
            , {'id': 29, 'name': 'Item 29', 'price': '$30'}, {'id': 30, 'name': 'Item 30', 'price': '$31'}
            , {'id': 31, 'name': 'Item 31', 'price': '$32'}, {'id': 32, 'name': 'Item 32', 'price': '$33'}
            , {'id': 33, 'name': 'Item 33', 'price': '$34'}, {'id': 34, 'name': 'Item 34', 'price': '$35'}
            , {'id': 35, 'name': 'Item 35', 'price': '$36'}, {'id': 36, 'name': 'Item 36', 'price': '$37'}
            , {'id': 37, 'name': 'Item 37', 'price': '$38'}, {'id': 38, 'name': 'Item 38', 'price': '$39'}
            , {'id': 39, 'name': 'Item 39', 'price': '$40'}, {'id': 40, 'name': 'Item 40', 'price': '$41'}
            , {'id': 41, 'name': 'Item 41', 'price': '$42'}, {'id': 42, 'name': 'Item 42', 'price': '$43'}
            , {'id': 43, 'name': 'Item 43', 'price': '$44'}, {'id': 44, 'name': 'Item 44', 'price': '$45'}
            , {'id': 45, 'name': 'Item 45', 'price': '$46'}, {'id': 46, 'name': 'Item 46', 'price': '$47'}
            , {'id': 47, 'name': 'Item 47', 'price': '$48'}, {'id': 48, 'name': 'Item 48', 'price': '$49'}
            , {'id': 49, 'name': 'Item 49', 'price': '$50'}, {'id': 50, 'name': 'Item 50', 'price': '$51'}
            , {'id': 51, 'name': 'Item 51', 'price': '$52'}, {'id': 52, 'name': 'Item 52', 'price': '$53'}
            , {'id': 53, 'name': 'Item 53', 'price': '$54'}, {'id': 54, 'name': 'Item 54', 'price': '$55'}
            , {'id': 55, 'name': 'Item 55', 'price': '$56'}, {'id': 56, 'name': 'Item 56', 'price': '$57'}
            , {'id': 57, 'name': 'Item 57', 'price': '$58'}, {'id': 58, 'name': 'Item 58', 'price': '$59'}
            , {'id': 59, 'name': 'Item 59', 'price': '$60'}, {'id': 60, 'name': 'Item 60', 'price': '$61'}
            , {'id': 61, 'name': 'Item 61', 'price': '$62'}, {'id': 62, 'name': 'Item 62', 'price': '$63'}
            , {'id': 63, 'name': 'Item 63', 'price': '$64'}, {'id': 64, 'name': 'Item 64', 'price': '$65'}
            , {'id': 65, 'name': 'Item 65', 'price': '$66'}, {'id': 66, 'name': 'Item 66', 'price': '$67'}
            , {'id': 67, 'name': 'Item 67', 'price': '$68'}, {'id': 68, 'name': 'Item 68', 'price': '$69'}
            , {'id': 69, 'name': 'Item 69', 'price': '$70'}, {'id': 70, 'name': 'Item 70', 'price': '$71'}
            , {'id': 71, 'name': 'Item 71', 'price': '$72'}, {'id': 72, 'name': 'Item 72', 'price': '$73'}
            , {'id': 73, 'name': 'Item 73', 'price': '$74'}, {'id': 74, 'name': 'Item 74', 'price': '$75'}
            , {'id': 75, 'name': 'Item 75', 'price': '$76'}, {'id': 76, 'name': 'Item 76', 'price': '$77'}
            , {'id': 77, 'name': 'Item 77', 'price': '$78'}, {'id': 78, 'name': 'Item 78', 'price': '$79'}
            , {'id': 79, 'name': 'Item 79', 'price': '$80'}, {'id': 80, 'name': 'Item 80', 'price': '$81'}
            , {'id': 81, 'name': 'Item 81', 'price': '$82'}, {'id': 82, 'name': 'Item 82', 'price': '$83'}
            , {'id': 83, 'name': 'Item 83', 'price': '$84'}, {'id': 84, 'name': 'Item 84', 'price': '$85'}
            , {'id': 85, 'name': 'Item 85', 'price': '$86'}, {'id': 86, 'name': 'Item 86', 'price': '$87'}
            , {'id': 87, 'name': 'Item 87', 'price': '$88'}, {'id': 88, 'name': 'Item 88', 'price': '$89'}
            , {'id': 89, 'name': 'Item 89', 'price': '$90'}, {'id': 90, 'name': 'Item 90', 'price': '$91'}
            , {'id': 91, 'name': 'Item 91', 'price': '$92'}, {'id': 92, 'name': 'Item 92', 'price': '$93'}
            , {'id': 93, 'name': 'Item 93', 'price': '$94'}, {'id': 94, 'name': 'Item 94', 'price': '$95'}
            , {'id': 95, 'name': 'Item 95', 'price': '$96'}, {'id': 96, 'name': 'Item 96', 'price': '$97'}
            , {'id': 97, 'name': 'Item 97', 'price': '$98'}, {'id': 98, 'name': 'Item 98', 'price': '$99'}
            , {'id': 99, 'name': 'Item 99', 'price': '$100'}, {'id': 100, 'name': 'Item 100', 'price': '$101'}
            , {'id': 101, 'name': 'Item 101', 'price': '$102'}, {'id': 102, 'name': 'Item 102', 'price': '$103'}
            , {'id': 103, 'name': 'Item 103', 'price': '$104'}, {'id': 104, 'name': 'Item 104', 'price': '$105'}
            , {'id': 105, 'name': 'Item 105', 'price': '$106'}, {'id': 106, 'name': 'Item 106', 'price': '$107'}
            , {'id': 107, 'name': 'Item 107', 'price': '$108'}, {'id': 108, 'name': 'Item 108', 'price': '$109'}
            , {'id': 109, 'name': 'Item 109', 'price': '$110'}, {'id': 110, 'name': 'Item 110', 'price': '$111'}
            , {'id': 111, 'name': 'Item 111', 'price': '$112'}, {'id': 112, 'name': 'Item 112', 'price': '$113'}
            , {'id': 113, 'name': 'Item 113', 'price': '$114'}, {'id': 114, 'name': 'Item 114', 'price': '$115'}
            , {'id': 115, 'name': 'Item 115', 'price': '$116'}, {'id': 116, 'name': 'Item 116', 'price': '$117'}
            , {'id': 117, 'name': 'Item 117', 'price': '$118'}, {'id': 118, 'name': 'Item 118', 'price': '$119'}
            , {'id': 119, 'name': 'Item 119', 'price': '$120'}, {'id': 120, 'name': 'Item 120', 'price': '$121'}
            , {'id': 121, 'name': 'Item 121', 'price': '$122'}, {'id': 122, 'name': 'Item 122', 'price': '$123'}
            , {'id': 123, 'name': 'Item 123', 'price': '$124'}, {'id': 124, 'name': 'Item 124', 'price': '$125'}
            , {'id': 125, 'name': 'Item 125', 'price': '$126'}, {'id': 126, 'name': 'Item 126', 'price': '$127'}
            , {'id': 127, 'name': 'Item 127', 'price': '$128'}, {'id': 128, 'name': 'Item 128', 'price': '$129'}
            , {'id': 129, 'name': 'Item 129', 'price': '$130'}, {'id': 130, 'name': 'Item 130', 'price': '$131'}
            , {'id': 131, 'name': 'Item 131', 'price': '$132'}, {'id': 132, 'name': 'Item 132', 'price': '$133'}
            , {'id': 133, 'name': 'Item 133', 'price': '$134'}, {'id': 134, 'name': 'Item 134', 'price': '$135'}
            , {'id': 135, 'name': 'Item 135', 'price': '$136'}, {'id': 136, 'name': 'Item 136', 'price': '$137'}
            , {'id': 137, 'name': 'Item 137', 'price': '$138'}, {'id': 138, 'name': 'Item 138', 'price': '$139'}
            , {'id': 139, 'name': 'Item 139', 'price': '$140'}, {'id': 140, 'name': 'Item 140', 'price': '$141'}
            , {'id': 141, 'name': 'Item 141', 'price': '$142'}, {'id': 142, 'name': 'Item 142', 'price': '$143'}
            , {'id': 143, 'name': 'Item 143', 'price': '$144'}, {'id': 144, 'name': 'Item 144', 'price': '$145'}
            , {'id': 145, 'name': 'Item 145', 'price': '$146'}, {'id': 146, 'name': 'Item 146', 'price': '$147'}
            , {'id': 147, 'name': 'Item 147', 'price': '$148'}, {'id': 148, 'name': 'Item 148', 'price': '$149'}
            , {'id': 149, 'name': 'Item 149', 'price': '$150'}, {'id': 150, 'name': 'Item 150', 'price': '$151'}
            , {'id': 151, 'name': 'Item 151', 'price': '$152'}, {'id': 152, 'name': 'Item 152', 'price': '$153'}
            , {'id': 153, 'name': 'Item 153', 'price': '$154'}, {'id': 154, 'name': 'Item 154', 'price': '$155'}
            , {'id': 155, 'name': 'Item 155', 'price': '$156'}, {'id': 156, 'name': 'Item 156', 'price': '$157'}
            , {'id': 157, 'name': 'Item 157', 'price': '$158'}, {'id': 158, 'name': 'Item 158', 'price': '$159'}
            , {'id': 159, 'name': 'Item 159', 'price': '$160'}, {'id': 160, 'name': 'Item 160', 'price': '$161'}
            , {'id': 161, 'name': 'Item 161', 'price': '$162'}, {'id': 162, 'name': 'Item 162', 'price': '$163'}
            , {'id': 163, 'name': 'Item 163', 'price': '$164'}, {'id': 164, 'name': 'Item 164', 'price': '$165'}
            , {'id': 165, 'name': 'Item 165', 'price': '$166'}, {'id': 166, 'name': 'Item 166', 'price': '$167'}
            , {'id': 167, 'name': 'Item 167', 'price': '$168'}, {'id': 168, 'name': 'Item 168', 'price': '$169'}
            , {'id': 169, 'name': 'Item 169', 'price': '$170'}, {'id': 170, 'name': 'Item 170', 'price': '$171'}
            , {'id': 171, 'name': 'Item 171', 'price': '$172'}, {'id': 172, 'name': 'Item 172', 'price': '$173'}
            , {'id': 173, 'name': 'Item 173', 'price': '$174'}, {'id': 174, 'name': 'Item 174', 'price': '$175'}
            , {'id': 175, 'name': 'Item 175', 'price': '$176'}, {'id': 176, 'name': 'Item 176', 'price': '$177'}
            , {'id': 177, 'name': 'Item 177', 'price': '$178'}, {'id': 178, 'name': 'Item 178', 'price': '$179'}
            , {'id': 179, 'name': 'Item 179', 'price': '$180'}, {'id': 180, 'name': 'Item 180', 'price': '$181'}
            , {'id': 181, 'name': 'Item 181', 'price': '$182'}, {'id': 182, 'name': 'Item 182', 'price': '$183'}
            , {'id': 183, 'name': 'Item 183', 'price': '$184'}, {'id': 184, 'name': 'Item 184', 'price': '$185'}
            , {'id': 185, 'name': 'Item 185', 'price': '$186'}, {'id': 186, 'name': 'Item 186', 'price': '$187'}
            , {'id': 187, 'name': 'Item 187', 'price': '$188'}, {'id': 188, 'name': 'Item 188', 'price': '$189'}
            , {'id': 189, 'name': 'Item 189', 'price': '$190'}, {'id': 190, 'name': 'Item 190', 'price': '$191'}
            , {'id': 191, 'name': 'Item 191', 'price': '$192'}, {'id': 192, 'name': 'Item 192', 'price': '$193'}
            , {'id': 193, 'name': 'Item 193', 'price': '$194'}, {'id': 194, 'name': 'Item 194', 'price': '$195'}
            , {'id': 195, 'name': 'Item 195', 'price': '$196'}, {'id': 196, 'name': 'Item 196', 'price': '$197'}
            , {'id': 197, 'name': 'Item 197', 'price': '$198'}, {'id': 198, 'name': 'Item 198', 'price': '$199'}
            , {'id': 199, 'name': 'Item 199', 'price': '$200'}];
        $table.bootstrapTable({
//            height: getHeight(),
            columns: [
                [
                    {
                        field: 'state',
                        checkbox: true,
                        rowspan: 2,
                        align: 'center',
                        valign: 'middle'
                    }, {
                        title: 'Item ID',
                        field: 'id',
                        rowspan: 2,
                        align: 'center',
                        valign: 'middle',
                        sortable: true,
                        footerFormatter: totalTextFormatter
                    }, {
                        title: 'Item Details',
                        colspan: 3,
                        align: 'center',
                        valign: 'middle'
                    }
                ], [
                    {
                        field: 'name',
                        title: 'Nombre',
                        align: 'center',
                        sortable:true,
                        editable:true,
                        footerFormatter: totalNameFormatter
                    },{
                        field:'price',
                        title: 'Item Price',
                        sortable:true,
                        align: 'center',
                        editable: {
                            type: 'text',
                            title: 'Item Price',
                            validate: function (value) {
                                value = $.trim(value);
                                if (!value) {
                                    return 'This field is required';
                                }
                                if (!/^\$/.test(value)) {
                                    return 'This field needs to start width $.'
                                }
                                var data = $table.bootstrapTable('getData'),
                                    index = $(this).parents('tr').data('index');
                                console.log(data[index]);
                                return '';
                            }
                        },
                        footerFormatter: totalPriceFormatter
                    },{
                        field:'operate',
                        title: 'Item Operate',
                        align: 'center',
                        events: operateEvents,
                        formatter: operateFormatter
                    }
                ]
            ],
            data: data,
            pagination: true
        });
//        $table.bootstrapTable({
//            data: data,
//            checkbox:true,
//            checkboxHeader:true,
//            checkboxEnabled:true,
//            pagination:true
//        });
//        ----------------------------------------------------------------------
//        Funciona bien
//var defaultColumns = [{
//                field: 'id',
//                title: 'Item ID'
//            }, {
//                field: 'name',
//                title: 'Item Name'
//            }, {
//                field: 'price',
//                title: 'Item Price'
//            }],
//            selectsColumns = [{
//                field: 'state'
//            }, {
//                field: 'id',
//                title: 'Item ID'
//            }, {
//                field: 'name',
//                title: 'Item Name'
//            }, {
//                field: 'price',
//                title: 'Item Price'
//            }],
//            columns = [],
//            tableOptions = {},
//            columnOptions = {};
//            
//            tableOptions= {"cache":true,"showHeader":true,"smartDisplay":true,"trimOnSearch":true,"checkboxHeader":true,
//                "sortable":true,"silentSort":true},
//            columnOptions= {"checkbox":true,"checkboxEnabled":true,"visible":true,"switchable":true,"clickToSelect":true,
//                "searchable":true,"searchFormatter":true,"cardVisible":true},
//            columns=[];
//        if (columnOptions.checkbox) {
//            columns = selectsColumns.slice(0);
//            columns[0].checkbox = true;
//        } else if (columnOptions.radio) {
//            columns = selectsColumns.slice(0);
//            columns[0].radio = true;
//        } else {
//            columns = defaultColumns.slice(0);
//        }  
//        columns= [{"radio":true,"checkbox":false,"checkboxEnabled":true,"sortable":false,"visible":true,"switchable":true,
//                "clickToSelect":true,"searchable":true,"searchFormatter":true,"cardVisible":true,"field":"state"},{"radio":false,"checkbox":false,"checkboxEnabled":true,"sortable":false,"visible":true,"switchable":true,"clickToSelect":true,"searchable":true,"searchFormatter":true,"cardVisible":true,"field":"id","title":"Item ID"},{"radio":false,"checkbox":false,"checkboxEnabled":true,"sortable":false,"visible":true,"switchable":true,"clickToSelect":true,"searchable":true,"searchFormatter":true,"cardVisible":true,"field":"name","title":"Item Name"},{"radio":false,"checkbox":false,"checkboxEnabled":true,"sortable":false,"visible":true,"switchable":true,"clickToSelect":true,"searchable":true,"searchFormatter":true,"cardVisible":true,"field":"price","title":"Item Price"}];
//        var defaultTableOptions= {"striped":false,"cache":false,"pagination":false,"onlyInfoPagination":false,
//            "search":false,"searchOnEnterKey":false,"strictSearch":false,"showHeader":false,"showFooter":false,
//            "showColumns":false,"showPaginationSwitch":false,"showRefresh":false,"showToggle":false,"smartDisplay":false,
//            "escape":false,"cardView":false,"detailView":false,"trimOnSearch":false,"clickToSelect":false,"singleSelect":false,
//            "checkboxHeader":false,"sortable":false,"silentSort":false,"maintainSelected":false};
//        $table.bootstrapTable('destroy').bootstrapTable($.extend({
//            data: data,
//            columns: columns
//        }, defaultTableOptions, tableOptions));
//    --------------------------------------------------------------------------
    });
    function operateFormatter(value, row, index) {
        return [
            '<a class="like" href="javascript:void(0)" title="Like">',
            '<i class="glyphicon glyphicon-heart"></i>',
            '</a>  ',
            '<a class="remove" href="javascript:void(0)" title="Remove">',
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
    var error = validacion();
    if (error == "") {
        var ul = $('<ul/>', {'id': 'msj-ul'});
        error += "<li>Los datos son correctos</li>";
        $("#msj").append(ul);
        $('#msj-ul').append(error);
        $("#msj").removeClass().addClass("row-fluid bg-success");
    }
    var form = $("#form");
    form.attr("action", url);
    form.submit();
}

function validacion() {
    var error = "";
    if ($("#t1").val().length == 0 || $("#t1").val().length > 50) {
        error += "<li>Debe de un ingresar un nombre y no debe de exceder de 50 caracteres</li>";
        $("#c1").removeClass().addClass("form-group has-error");
    } else {
        $("#c1").removeClass().addClass("form-group");
    }
    if ($("#t3").val() == "0") {
        error += "<li>Debe de seleccionar un Tipo de Documento</li>";
        $("#c2").removeClass().addClass("form-inline has-error");
        $("#c3").removeClass().addClass("form-inline has-error");
    } else if ($("#t3").val() == "DNI" && $("#t4").val().length != 8) {
        error += "<li>El numero de documento es incorrecto</li>";
        $("#c2").removeClass().addClass("form-inline");
        $("#c3").removeClass().addClass("form-inline has-error");
    } else if ($("#t3").val() == "RUC" && $("#t4").val().length != 11) {
        error += "<li>El numero de documento es incorrecto</li>";
        $("#c2").removeClass().addClass("form-inline");
        $("#c3").removeClass().addClass("form-inline has-error");
    } else {
        $("#c2").removeClass().addClass("form-inline");
        $("#c3").removeClass().addClass("form-inline");
    }
    if ($("#t5").val().length == 0 || $("#t5").val().length > 50) {
        error += "<li>Debe de un ingresar un representante legal y no debe de exceder de 50 caracteres</li>";
        $("#c4").removeClass().addClass("form-group has-error");
    } else {
        $("#c4").removeClass().addClass("form-group");
    }
    if (valEmail($("#t6").val())) {
        $("#c5").removeClass().addClass("form-group");
    } else {
        error += "<li>Debe de un ingresar un Email correcto</li>";
        $("#c5").removeClass().addClass("form-group has-error");
    }
    $('#msj-ul').remove();
    if (error != "") {
        var ul = $('<ul/>', {'id': 'msj-ul'});
        $("#msj").append(ul);
        $('#msj-ul').append(error);
        $("#msj").removeClass().addClass("row-fluid bg-danger");
    }
    return error;
//    console.log($("#myModalLabel").val());
//    $("#myModalLabel").val("Errores");
//    $('body').addClass("modal-open");
//    $("#myModal").removeClass().addClass("modal fade in");
//    $("#myModal").css({"display": "block", "padding-right": "17px"});
    $("#myModal").on('shown.bs.modal', function (e) {
        var element = $(e.relatedTarget);
        var type = element.data('alert');
    });
}