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
                    <li class="active">Mediciones</li>
                </ol>
            </div>
            <form action="" class="form">
                <fieldset>
                    <legend>Titulo</legend>
                    <div class="form-group">
                        <label for="" class="control-label col-md-1">Descripci&oacute;n:</label>
                        <div class="col-md-2"><input type="text" class="form-control"/></div>
                        <label for="" class="control-label col-md-2">Unidad de Medida:</label>
                        <div class="col-md-2"><input type="text" class="form-control"/></div>
                        <div class="col-md-2"><a href="#" class="btn btn-default">Agregar Descripci&oacute;n</a></div>
                    </div>
                </fieldset>
            </form>
            <div class="row-fluid">
                <table class="table">
                    <thead>
                        <tr>
                            <th class="text-center">#</th>
                            <th class="text-center">Descripci&oacute;n</th>
                            <th class="text-center">Unidad de Medida</th>
                            <th class="text-center">Actualizar</th>
                            <th class="text-center">Eliminiar</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td>s</td>
                            <td>s</td>
                            <td>s</td>
                            <td>s</td>
                            <td>s</td>
                        </tr>
                    </tbody>
                </table>
            </div>
            <div class="row-fluid col-md-12">
                <center><button class="btn btn-default">Guardar</button></center>
            </div>	
        </div>
    </body>
</html>