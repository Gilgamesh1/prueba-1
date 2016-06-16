<%-- 
    Document   : listarCliente
    Created on : 30/05/2016, 06:10:07 PM
    Author     : Raúl
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
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
    </head>
    <body>
        <input id="context" type="hidden" value="${pageContext.request.contextPath}"></input>
        <div class="container">
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
            <f:form id="form" class="form-horizontal" action="${pageContext.request.contextPath}/MtnCliente/buscar.html" modelAttribute="cliente" method="POST">
                <fieldset>
                    <legend>Buscar</legend>
                    <label for="t1" class="col-md-1 control-label">Nombre</label>
                    <div class="col-md-2"><f:input id="t1" path="nombre" type="text" class="form-control"/></div>
                    <label for="t2" class="col-md-2 control-label">Nro. Documento</label>
                    <div class="col-md-2"><f:input id="t2" path="nroDocumento" type="number" class="form-control"/></div>
                    <div class="col-md-1">
                        <button type="submit" class="btn btn-default" >Buscar</button>
                    </div>
                </fieldset>
            </f:form>
            <div class="row-fluid">
                <div class="span12">&nbsp;</div>
            </div>
            <div class="row-fluid">
                <div class="col-md-12">
                    <center><a href="<c:url value="/MtnCliente/cargar.html"/>" class="btn btn-primary" role="button">Crear un Nuevo Cliente</a></center>
                </div>
            </div>
            <div class="row-fluid">
                <fildset>
                    <legend>Lista de Clientes</legend>
                    <table id="tabla" class="table table-hover">
                        <thead>
                            <tr>
                                <th>#</th>
                                <th>Nombre</th>
                                <th>Direcci&oacute;n</th>
                                <th>Ciudad</th>
                                <th>DNI - RUC</th>
                                <th>Repre. Legal</th>
                                <th>Tel&eacute;fono</th>
                                <th>Celular</th>
                                <th>Actualizar</th>
                            </tr>
                        </thead>
                        <tbody id="contenido">
                            <c:forEach items="${lstClientes}" var="elem">
                                <tr>
                                    <td><c:out value="${elem.nroTabla}"/></td>
                                    <td><c:out value="${elem.nombre}"/></td>
                                    <td><c:out value="${elem.dir}"/></td>
                                    <td><c:out value="${elem.ubi}"/></td>
                                    <td><c:out value="${elem.valDocumento}"/></td>
                                    <td><c:out value="${elem.representante}"/></td>
                                    <td><c:out value="${elem.telefono}"/></td>
                                    <td><c:out value="${elem.celular}"/></td>
                                    <td><a href="<c:url value="/MtnCliente/cargarUnCliente.html">
                                               <c:param name="id" value="${elem.id}"></c:param>
                                           </c:url>" class="btn btn-default" role="button">Actualizar</a>
                                    </td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </fildset>
            </div>
            <div class="row-fluid">
                <center>
                    <nav id="npaginacion">
                        <ul id="upaginacion" class="pagination">
                            <c:if test="${page.mostrarInicio}">
                                <li>
                                    <a href="#" onclick="anterior(<c:out value="${page.grupoInicio}"/>);" aria-label="Previous">
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
                                            <li><a href="#" onclick="pagina(<c:out value="${i}"/>)"><c:out value="${i}"/></a></li>
                                            </c:otherwise>
                                        </c:choose>
                                    </c:forEach>
                                </c:if>
                                <c:if test="${page.mostrarFin}">
                                <li>
                                    <a href="#" onclick="siguiente(<c:out value="${page.grupoInicio}"/>);" aria-label="Next">
                                        <span aria-hidden="true">&raquo;</span>
                                    </a>
                                </li>
                            </c:if>
                        </ul>
                    </nav>
                </center>
            </div>
        </div>
    </body>
</html>
