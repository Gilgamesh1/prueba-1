<%-- 
    Document   : listarCliente
    Created on : 30/05/2016, 06:10:07 PM
    Author     : Raúl
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de Clientes</title>
        <script language="javascript" type="text/javascript" src="<c:url value="/recursos/jquery/jquery-1.11.2.min.js"/>"></script>
        <script language="javascript" type="text/javascript" src="<c:url value="/recursos/bootstrap/js/bootstrap.js"/>"></script>
        <script language="javascript" type="text/javascript" src="<c:url value="/recursos/js/cu_mtncliente/mtncliente.js"/>"></script>
        <link href="<c:url value="/recursos/bootstrap/css/bootstrap.css"/>" rel="stylesheet">
        <link href="<c:url value="/recursos/bootstrap/css/bootstrap-theme.css"/>" rel="stylesheet">
        <style type="text/css">
            .bg-success{
                padding: 15px;
            }
            .bg-danger{
                padding: 15px;
            }
        </style>
    </head>
    <body>
        <div class="container-fluid">
            <div class="row-fluid">
                <div class="navbar navbar-default">
                    <div class="container-fluid">
                        <div class="navbar-header">
                            <a href="#" class="navbar-brand">SD</a>
                            <ul class="nav navbar-nav">
                                <li class="dropdown">
                                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Clientes<span class="caret"></span></a>
                                    <ul class="dropdown-menu">
                                        <li><a href="<c:url value="cargarLogin.html"></c:url>">Mostrar Clientes</a></li>
                                        <li><a href="#">Crear Nuevo Cliente</a></li>
                                    </ul>
                                </li>
                                <li><a href="#">Home</a></li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
            <div id="msj" class="row-fluid">
                <p id="msj-sucess" class="text-justify bg-success"><b>hola mundo</b></p>
            </div>     
            <div class="row-fluid">
                <div class="span12">
                    <div class="page-header"><h3>Buscar</h3></div>
                </div>
            </div>
            <div class="row-fluid">
                <form:form id="form" class="form-horizontal" action="buscar.html" modelAttribute="cliente" method="POST">
                    <label for="t1" class="col-md-1 control-label">Nombre</label>
                    <div class="col-md-2">
                        <form:input id="t1" path="nombre" type="text" class="form-control"/>
                    </div>
                    <label for="t2" class="col-md-1 control-label">Nro. Documento</label>
                    <div class="col-md-2">
                        <form:input id="t2" path="nroDocumento" type="number" class="form-control"/>
                    </div>
                    <div class="col-md-1">
                        <button type="submit" class="btn btn-default" >Buscar</button>
                    </div>
                </form:form>
            </div>
            <div class="row-fluid">
                <div class="col-md-12">
                    <center><a href="<c:url value="/MtnCliente/cargar.html"/>" class="btn btn-primary" role="button">Crear un Nuevo Cliente</a></center>
                </div>
            </div>
            <div class="row-fluid">
                <div class="col-md-12">
                    <div class="page-header"><h3>Lista de Clientes</h3></div>
                </div>
            </div>
            <div class="row-fluid">
                <table class="table table-bordered">
                    <thead>
                        <tr>
                            <th>#</th>
                            <th>Nombre</th>
                            <th>Documento</th>
                            <th>Repre. Legal</th>
                            <th>Tel&eacute;fono</th>
                            <th>Celular</th>
                            <th>Actualizar</th>
                        </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${lstClientes}" var="elem">
                        <tr>
                            <td><c:out value="${elem.nroTabla}"/></td>
                            <td><c:out value="${elem.nombre}"/></td>
                            <td><c:out value="${elem.valDocumento}"/></td>
                            <td><c:out value="${elem.representante}"/></td>
                            <td><c:out value="${elem.telefono}"/></td>
                            <td><c:out value="${elem.celular}"/></td>
                            <td><a href="<c:url value="cargarUnCliente.html">
                                       <c:param name="id" value="${elem.id}"></c:param>
                                   </c:url>" class="btn btn-default" role="button">Actualizar</a>
                            </td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
            <div class="row-fluid">
                <center><nav>
                    <ul class="pagination pagination-sm">
                        <c:if test="${page.mostrarInicio}">
                        <li>
                            <a href="<c:out value="${page.grupoInicio}"/>" aria-label="Previous">
                                <span aria-hidden="true">&laquo;</span>
                            </a>
                        </li>
                        </c:if>
                        <c:if test="${page.seleccionada!=0}">
                            <c:forEach begin="${page.inicio}" end="${page.fin}" var="i">
                                <c:choose>
                                    <c:when test="${i==page.seleccionada}">
                                        <li class="active"><a href="#"><c:out value="${i}"/></a></li>
                                    </c:when>
                                    <c:otherwise>
                                        <li><a href="#"><c:out value="${i}"/></a></li>
                                    </c:otherwise>
                                </c:choose>
                            </c:forEach>
                        </c:if>
                        <c:if test="${page.mostrarFin}">
                        <li>
                            <a href="<c:out value="${page.grupoFin}"/>" aria-label="Next">
                                <span aria-hidden="true">&raquo;</span>
                            </a>
                        </li>
                        </c:if>
                    </ul>
                    </nav></center>
            </div>
        </div>
    </body>
</html>
