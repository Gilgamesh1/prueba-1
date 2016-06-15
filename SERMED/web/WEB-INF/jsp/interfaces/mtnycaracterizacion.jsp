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
            <form action="" class="form-horizontal">
                <fieldset>
                    <legend></legend>
                    <div class="form-group">
                        <label for="" class="label-control col-md-1">C&oacute;digo:</label>
                        <div class="col-md-2"><input type="text" class="form-control"></div>
                        <label for="" class="label-control col-md-1">Fecha de Ingreso:</label>
                        <div class="col-md-2"><input type="date" class="form-control"></div>
                    </div>
                    <div class="form-group">
                        <label for="" class="label-control col-md-1">Anotaciones:</label>
                        <div class="col-md-2"><textarea name="" id="" cols="100" rows="5" class="form-control"></textarea></div>
                    </div>
                    <div class="form-group">
                        <label for="" class="label-control col-md-1">Trabajo Realizado:</label>
                        <div class="col-md-2"><textarea name="" id="" cols="100" rows="5" class="form-control"></textarea></div>
                    </div>
                    <div class="form-group">
                        <label for="" class="label-control col-md-1">Diagnostico Tecnico:</label>
                        <div class="col-md-2"><textarea name="" id="" cols="100" rows="5" class="form-control"></textarea></div>
                    </div>
                    <div class="form-group">
                        <label for="" class="label-control col-md-1">Observaciones:</label>
                        <div class="col-md-2"><textarea name="" id="" cols="100" rows="5" class="form-control"></textarea></div>
                    </div>
                    <div class="row-fluid col-md-12">
                        <center><button class="btn btn-default">Guardar</button></center>
                    </div>
                </fieldset>
            </form>
        </div>
    </body>