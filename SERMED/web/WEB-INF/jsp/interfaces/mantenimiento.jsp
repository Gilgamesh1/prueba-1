<%-- 
    Document   : inicio
    Created on : 13/06/2016, 03:46:55 PM
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
        <script language="javascript" type="text/javascript" src="<c:url value="/recursos/bootstrap-datepicker/js/bootstrap-datepicker.min.js"/>"></script>
        <script language="javascript" type="text/javascript" src="<c:url value="/recursos/bootstrap-datepicker/js/bootstrap-datepicker.es.min.js"/>"></script>
        <script language="javascript" type="text/javascript" src="<c:url value="/recursos/js/global.js"/>"></script>
        <link href="<c:url value="/recursos/bootstrap/css/bootstrap.css"/>" rel="stylesheet">
        <link href="<c:url value="/recursos/bootstrap/css/bootstrap-theme.css"/>" rel="stylesheet">
        <link href="<c:url value="/recursos/bootstrap-datepicker/css/bootstrap-datepicker3.min.css"/>" rel="stylesheet">
        <title>JSP Page</title>
        <script type="text/javascript">
            $(document).ready(function () {
                $('#fecha input').datepicker({language: "es"});
            });
        </script>
    </head>
    <body>
        <div class="container">
            <div class="row-fluid">
                <ol class="breadcrumb">
                    <li class="active">Mantenimiento</li>
                </ol>
            </div>
            <div class="row-fluid">
                <form action="" class="form-horizontal">
                    <fieldset>
                        <legend>Datos del Equipo</legend>
                        <div class="form-group">
                            <label for="t1" class="control-label col-md-2">Codigo:</label>
                            <div class="col-md-2"><input id="t1" type="text" class="form-control"></input></div>
                            <label for="t2" class="control-label col-md-1">Fecha de Ingreso:</label>
                            <div id="fecha" class="input-group col-md-2">
                                <input id="t2" type="text" class="form-control"></input>
                                <span class="input-group-addon">
                                    <span class="glyphicon glyphicon-calendar"></span>
                                </span>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="" class="control-label col-md-2">Temperatura:</label>
                            <div class="col-md-2"><input type="text" class="form-control"/></div>
                            <label for="" class="control-label col-md-1">Humedad:</label>
                            <div class="col-md-2"><input type="text" class="form-control"/></div>
                            <label for="" class="control-label col-md-1">Presion:</label>
                            <div class="col-md-2"><input type="text" class="form-control"/></div>
                        </div>
                        <div class="form-group">
                            <label for="" class="control-label col-md-2">Anotaciones de Ingreso:</label>
                            <div class="col-md-5"><textarea name="" id="" cols="100" rows="5" class="form-control"></textarea></div>
                        </div>
                        <div class="form-group">
                            <label for="" class="control-label col-md-2">Trabajo Realizado:</label>
                            <div class="col-md-5"><textarea name="" id="" cols="100" rows="5" class="form-control"></textarea></div>
                        </div>
                        <div class="form-group">
                            <label for="" class="control-label col-md-2">Diagnostico:</label>
                            <div class="col-md-5"><textarea name="" id="" cols="100" rows="5" class="form-control"></textarea></div>
                        </div>
                        <div class="form-group">
                            <label for="" class="control-label col-md-2">Observaciones:</label>
                            <div class="col-md-5"><textarea name="" id="" cols="100" rows="5" class="form-control"></textarea></div>
                        </div>
                        <div class="col-md-12">
                            <center><button type="submit" class="btn btn-default">Guardar</input></center>
                        </div>
                    </fieldset>
                </form>
            </div>
        </div>
    </body>
</html>