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
        <script language="javascript" type="text/javascript" src="<c:url value="/recursos/js/global.js"/>"></script>
        <link href="<c:url value="/recursos/bootstrap/css/bootstrap.css"/>" rel="stylesheet">
        <link href="<c:url value="/recursos/bootstrap/css/bootstrap-theme.css"/>" rel="stylesheet">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
            <form class="form-horizontal">
                <legend>Datos del Cliente</legend>
                <div class="form-group">
                    <label for="t1" class="form-label col-md-1">DNI o RUC:</label>
                    <div class="col-md-2"><input id="t1" type="text" class="form-control"/></div>
                    <label for="t2" class="form-label col-md-2">Nombre del Cliente:</label>
                    <div class="col-md-3"><input id="t2" type="text" class="form-control"></div>
                    <div class="col-md-2"><a href="#" class="btn btn-default" role="button">Crear un nuevo Cliente</a></div>
                </div>
                <div class="form-group">
                    <label for="t3" class="form-label col-md-1">Direcci&oacute;n:</label>
                    <div class="col-md-4"><select id="t3" class="form-control">
                        <option>Direccion 1</option>
                        <option>Direccion 2</option>
                        <option>Direccion 3</option>
                    </select></div>
                </div>
                <legend>Datos del Equipo</legend>
                <div class="form-group">
                    <label for="t" class="form-label col-md-1">Codigo:</label>
                    <div class="col-md-2"><input id="t" type="text" class="form-control"></input></div>
                    <label for="t" class="form-label col-md-1">Descripci&oacute;n:</label>
                    <div class="col-md-2"><input id="t" type="text" class="form-control"></input></div>
                    <label class="form-label col-md-1">N° Serie:</label>
                    <div class="col-md-2"><input class="form-control"></input></div>
                </div>
                <div class="form-group">
                    <label for="t" class="form-label col-md-1">Marca:</label>
                    <div class="col-md-2"><input id="t" type="text" class="form-control"></input></div>
                    <label for="t" class="form-label col-md-1">Modelo:</label>
                    <div class="col-md-2"><input id="t" type="text" class="form-control"></input></div>
                    <label for="t" class="form-label col-md-1">Actividad:</label>
                    <div class="col-md-2"><select id="t3" class="form-control">
                        <option>Direccion 1</option>
                        <option>Direccion 2</option>
                        <option>Direccion 3</option>
                    </select></div>
                </div>
            </form>
            <div class="row-fluid">
                <legend>Caracteristicas</legend>
                <div class="form-group">
                    <label for="t" class="form-label col-md-1">Campo:</label>
                    <div class="col-md-2"><input id="t" type="text" class="form-control"></input></div>
                    <label for="t" class="form-label col-md-1">Valor:</label>
                    <div class="col-md-2"><input id="t" type="text" class="form-control"></input></div>
                    <div class="col-md-2"><a href="#" class="btn btn-default">Agregar Caracter&iacute;stica</a></input></div>
                </div>
            </div>
            <div class="row-fluid">
                <div class="col-md-12">&nbsp;</div>
            </div>
            <div class="row-fluid">
                <table class="table">
                    <thead>
                        <tr>
                            <th class="text-center">#</th>
                            <th class="text-center">Campo</th>
                            <th class="text-center">Valor</th>
                            <th class="text-center">Actualizar</th>
                            <th class="text-center">Eliminar</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td>1</td>
                            <td>CAMPO</td>
                            <td>Valor</td>
                            <td>Actualizar</td>
                            <td>Eliminar</td>
                        </tr>
                        <tr>
                            <td>1</td>
                            <td>CAMPO</td>
                            <td>Valor</td>
                            <td>Actualizar</td>
                            <td>Eliminar</td>
                        </tr>
                    </tbody>
                </table>
            </div>
            <div class="row-fluid">
                <center>
                    <ul class="pagination">
                        <li>
                          <a href="#" aria-label="Previous">
                            <span aria-hidden="true">&laquo;</span>
                          </a>
                        </li>
                        <li><a href="#">1</a></li>
                        <li><a href="#">2</a></li>
                        <li><a href="#">3</a></li>
                        <li><a href="#">4</a></li>
                        <li><a href="#">5</a></li>
                        <li>
                          <a href="#" aria-label="Next">
                            <span aria-hidden="true">&raquo;</span>
                          </a>
                        </li>
                    </ul>
                </center>
            </div>
            <div class="row-fluid">
                <div class="col-md-12">
                    <center><a href="#" class="btn btn-default">Guardar</a></center>
                </div>
            </div>
        </div>
    </body>
</html>