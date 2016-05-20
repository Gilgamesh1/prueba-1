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
        <link href="<c:url value="/recursos/js/bootstrap/css/bootstrap.css"/>" rel="stylesheet">
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
                <div class="col-md-1"><label>Identificador</label></div><div class="col-md-11"><input type="text"/></div>
                <div class="col-md-1"><label for="">Texto</label></div><div class="col-md-11"><input type="text"></div>
            </div>
            <div class="row-fluid">
                <div class="col-md-1"><label>Numero</label></div><div class="col-md-11"><input type="text"/></div>
                <div class="col-md-1"><label for="">Decimal</label></div><div class="col-md-11"><input type="text"></div>
            </div>
            <!--div class="row-fluid">
                <nav class="navbar navbar-default navbar-fixed-botton">
                    <div class="container">
                        ...
                    </div>
                </nav>
            </div-->
        </div>

        <table>
            <tr>Pagina de Login</tr>
            <!--tr>
                <td></td><td><forminput path="identificador"/></td>
            </tr>
            <tr>
                <td><label>Texto</label></td><td><forminput path="entero"/></td>
            </tr>
            <tr>
                <td><label>Numero</label></td><td><forminput path="entero"/></td>
            </tr>
            <tr>
                <td><label>Decimal</label></td><td><forminput path="decimal"/></td>
            </tr-->
        </table>
    </body>
</html>
