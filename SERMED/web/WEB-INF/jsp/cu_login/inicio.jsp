<%-- 
    Document   : inicio
    Created on : 19/05/2016, 11:09:18 AM
    Author     : Raúl
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pagina de Login</title>
        <script language="javascript" type="text/javascript" src="<c:url value="/recursos/js/jquery/jquery-1.11.2.min.js"/>"></script>
        <script language="javascript" type="text/javascript" src="<c:url value="/recursos/js/jquery/jquery-ui-1.11.2/jquery-ui.js"/>"></script>
        <script language="javascript" type="text/javascript" src="<c:url value="/recursos/js/bootstrap/js/bootstrap.js"/>"></script>
        <script language="javascript" type="text/javascript" src="<c:url value="/recursos/js/cu_login/cu_login.js"/>"></script>
        <link href="<c:url value="/recursos/js/bootstrap/css/bootstrap.css"/>" rel="stylesheet">
        <link href="<c:url value="/recursos/js/bootstrap/css/bootstrap-theme.css"/>" rel="stylesheet">
    </head>
    <body>
        <div class="container-fluid">
            <div class="row-fluid">
                <div class="navbar navbar-default">
                    <div class="container-fluid">
                        <div class="navbar-header">
                            <a href="#" class="navbar-brand">Ejemplo</a>
                            <ul class="nav navbar-nav">
                                <li class="dropdown">
                                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Archivo<span class="caret"></span></a>
                                    <ul class="dropdown-menu">
                                        <li><a href="#">Nuevo</a></li>
                                        <li><a href="#">Abrir</a></li>
                                    </ul>
                                </li>
                                <li><a href="#">Home</a></li>
                                <li class="active"><a href="#">Contact</a></li>
                                <li><a href="#">Blog</a></li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
            <div class="row-fluid">
                <form:form id="form" class="form-horizontal" modelAttribute="loginDTO" action="insertarLogin.html" method="GET">
                    <div class="form-group">
                        <label for="t1" class="col-md-1">Identificador</label>
                        <div class="col-md-5"><form:input id="t1" path="identificador" type="text" class="form-control"/></div>
                    </div>
                    <div class="form-group">                        
                        <label for="t2" class="col-md-1">Texto</label>
                        <div class="col-md-5"><form:input id="t2" path="texto" type="text" class="form-control"/></div>
                    </div>
                    <div class="form-group">
                        <label for="t3" class="col-md-1">N&uacute;mero</label>
                        <div class="col-md-5"><form:input id="t3" path="entero" type="number" class="form-control"/></div>
                    </div>
                    <div class="form-group">
                        <label for="t4" class="col-md-1">Decimal</label>
                        <div class="col-md-5"><form:input id="t4" path="decimal" type="text" class="form-control"/></div>
                    </div>
                    <div class="form-group">
                        <label for="t5" class="col-md-1">Fecha</label>
                        <div class="col-md-5"><form:input id="t5" path="fecha" type="datetime" class="form-control"/></div>
                    </div>
                    <div class="form-group">
                        <label for="t6" class="col-md-1">Hora</label>
                        <div class="col-md-5"><form:input id="t6" path="tiempo" type="text" class="form-control"/></div>
                    </div>
                    <div class="form-group">
                        <label for="t7" class="col-md-1">Fecha y Hora</label>
                        <div class="col-md-5"><form:input id="t7" path="timeStamp" type="text" class="form-control"/></div>
                    </div>
                    <button type="submit" class="btn btn-default">Guardar</button>
                    <button type="button" class="btn btn-default" onclick="actualizarLoggin();">Actualizar</button>
                </form:form>
            </div>
            <!--div class="row-fluid">
                <nav class="navbar navbar-default navbar-fixed-bottom">
                    <div class="container">
                        ...
                    </div>
                </nav>
            </div-->
        </div>
    </body>
</html>
