<%-- 
    Document   : mtnCliente
    Created on : 27/05/2016, 12:18:44 PM
    Author     : Raúl
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script language="javascript" type="text/javascript" src="<c:url value="/recursos/jquery/jquery-1.11.2.min.js"/>"></script>
        <script language="javascript" type="text/javascript" src="<c:url value="/recursos/bootstrap/js/bootstrap.js"/>"></script>
        <script language="javascript" type="text/javascript" src="<c:url value="/recursos/js/global.js"/>"></script>
        <link href="<c:url value="/recursos/bootstrap/css/bootstrap.css"/>" rel="stylesheet">
        <link href="<c:url value="/recursos/bootstrap/css/bootstrap-theme.css"/>" rel="stylesheet">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
            <div class="row-fluid">
                <ol class="breadcrumb">
                    <li><a href="<c:url value="/y.html"/>">Mantenimiento y Calibraci&oacute;n</a></li>
                    <li><a href="<c:url value="/z.html"/>">Mediciones</a></li>
                    <li class="active">Datos de Medici&oacute;n</li>
                </ol>
            </div>
            <form action="" class="form-horizontal">
                <fieldset>
                    <legend>aqui va una descripcion</legend>
                    <div class="form-group">
                        <label for="" class="control-label col-md-1">Medida Control:</label>
                        <div class="col-md-2"><input type="number" class="form-control"/></div>
                        <label for="" class="control-label col-md-1">Medida 1:</label>
                        <div class="col-md-2"><input type="number" class="form-control"/></div>
                        <label for="" class="control-label col-md-1">Medida 2:</label>
                        <div class="col-md-2"><input type="number" class="form-control"/></div>
                        <label for="" class="control-label col-md-1">Medida 3:</label>
                        <div class="col-md-2"><input type="number" class="form-control"/></div>
                    </div>
                    <div class="form-group">
                        <label for="" class="control-label col-md-3">&nbsp;</label>
                        <label for="" class="control-label col-md-1">Medida 4:</label>
                        <div class="col-md-2"><input type="number" class="form-control"/></div>
                        <label for="" class="control-label col-md-1">Medida 5:</label>
                        <div class="col-md-2"><input type="number" class="form-control"/></div>
                        <label for="" class="control-label col-md-1">Medida 6:</label>
                        <div class="col-md-2"><input type="number" class="form-control"/></div>
                    </div>
                    <div class="row-fluid col-md-12"><center><a href="#" class="btn btn-default">Agregar Medida</a></center></div>
                </fieldset>
                <div class="col-md-12">
                    <table class="table">
                        <thead>
                            <tr>
                                <th class="text-center">#</th>
                                <th class="text-center">Medida de Control</th>
                                <th class="text-center">Medida 1</th>
                                <th class="text-center">Medida 2</th>
                                <th class="text-center">Medida 3</th>
                                <th class="text-center">Medida 4</th>
                                <th class="text-center">Medida 5</th>
                                <th class="text-center">Medida 6</th>
                                <th class="text-center">Promedio</th>
                                <th class="text-center">Error</th>
                                <th class="text-center">S</th>
                                <th class="text-center">Actualizar</th>
                                <th class="text-center">Eliminar</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td></td>
                            </tr>
                        </tbody>
                    </table>
                </div>
                <div class="row-fluid col-md-12">
                    <center><button type="submit" class="btn btn-default">Guardar</button></center>
                </div>
            </form>
        </div>
    </body>
</html>