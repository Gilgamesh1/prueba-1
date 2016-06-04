<%-- 
    Document   : mtnCliente
    Created on : 27/05/2016, 12:18:44 PM
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
        <script language="javascript" type="text/javascript" src="<c:url value="/recursos/jquery/jquery-1.11.2.min.js"/>"></script>
        <script language="javascript" type="text/javascript" src="<c:url value="/recursos/bootstrap/js/bootstrap.js"/>"></script>
        <script language="javascript" type="text/javascript" src="<c:url value="/recursos/js/cu_mtncliente/mtncliente.js"/>"></script>
        <script language="javascript" type="text/javascript" src="<c:url value="/recursos/js/global.js"/>"></script>
        <link href="<c:url value="/recursos/bootstrap/css/bootstrap.css"/>" rel="stylesheet">
        <link href="<c:url value="/recursos/bootstrap/css/bootstrap-theme.css"/>" rel="stylesheet">
        <title>Mantenimiento de Clientes</title>
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
                                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Archivo<span class="caret"></span></a>
                                    <ul class="dropdown-menu">
                                        <li><a href="<c:url value="cargarLogin.html"></c:url>">Administrar Login</a></li>
                                            <li><a href="#">Administrar Clientes</a></li>
                                        </ul>
                                    </li>
                                    <li><a href="#">Home</a></li>
                                    <li><a href="#">Contact</a></li>
                                    <li><a href="#">Blog</a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
                <div id="msj" class="row-fluid">
                    <p id="msj-sucess" class="bg-success"><b>hola mundo</b></p>
                </div>
                <div class="row-fluid">
                    <div class="page-header"><h3>Administrar Clientes</h3></div>
                </div>
                <div class="row-fluid">
                <form:form id="form" class="form-horizontal" action="insertar.html" modelAttribute="cliente" method="POST">
                    <div class="form-group">
                        <label for="t1" class="col-md-1">Nombre:</label>
                        <div class="col-md-5">
                            <form:input id="t1" path="nombre" type="text" class="form-control"/><form:hidden id="t9" path="id"/>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="t2" class="col-md-1">Tipo de Documento:</label>
                        <div class="col-md-2 selectContainer">
                            <select id="t2" name="t2" class="form-control" >
                                <c:forEach items="${cmbClientes}" var="elem">
                                    <c:choose>
                                        <c:when test="${elem.seleccionado==true}">
                                            <option value="${elem.id}" selected="true">${elem.val}</option>
                                        </c:when>
                                        <c:otherwise>
                                            <option value="${elem.id}">${elem.val}</option>
                                        </c:otherwise>
                                    </c:choose>
                                </c:forEach>
                            </select>
                        </div>
                        <label for="t3" class="col-md-1">Nro. Documento:</label>
                        <div class="col-md-2">
                            <form:input id="t3" path="nroDocumento" type="number" class="form-control"/>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="t4" class="col-md-1">Representante Legal:</label>
                        <div class="col-md-5"><form:input id="t4" path="representante" type="text" class="form-control"/></div>                        
                    </div>
                    <div class="form-group">
                        <label for="t5" class="col-md-1">Correo Electr&oacute;nico:</label>
                        <div class="col-md-5"><form:input id="t5" path="representante" type="text" class="form-control"/></div>                        
                    </div>
                    <div class="form-group">
                        <label for="t6" class="col-md-1">Tel&eacute;fono:</label>
                        <div class="col-md-2"><form:input id="t6" path="telefono" type="number" class="form-control"/></div>
                        <label for="t7" class="col-md-1">Celular:</label>
                        <div class="col-md-2"><form:input id="t7" path="celular" type="number" class="form-control"/></div>
                    </div>
                    <div class="row-fluid">
                        <div class="page-header"><h4>Administrar Direcci&oacute;n</h4></div>
                    </div>
                    <div class="row-fluid">
                        <label for="t8" class="col-md-1 control-label">Direcci&oacute;n:</label>
                        <div class="col-md-2"><form:input id="t8" path="dir" type="text" class="form-control"/></div>
                        <label for="t10" class="col-md-1 control-label">Ubicaci&oacute;n</label>
                        <div class="col-md-2"><form:input id="t10" path="ubi" type="text" class="form-control"/><form:hidden id="t11" path="pos"/></div>
                        <div class="col-md-2"><button class="btn btn-default" onclick="agregarDireccion();">Agregar</button></div>
                        <div class="col-md-2"><button class="btn btn-default" onclick="json();">json</button></div>
                    </div>
                    <div class="row-fluid">
                        <table class="table">
                            <thead>
                                <tr>
                                    <th>#</th>
                                    <th>Direcci&oacute;n</th>
                                    <th>Ciudad</th>
                                    <th>Actualizar</th>
                                    <th>Eliminar</th>
                                </th>
                            </thead>
                            <tbody>
                                <c:forEach items="${lstDirecciones}" var="elem">
                                    <c:if test="${elem.mostrar}">
                                        <tr>
                                            <td><c:out value="${elem.nroTabla}"/></td>
                                            <td><c:out value="${elem.direccion}"/></td>
                                            <td><c:out value="${elem.ciudad}"/></td>
                                            <td>
                                                <a href="#" onclick="cargarDireccion(<c:out value="${elem.pos}"/>)" class="btn btn-primary" role="button">Actualizar</a>
                                            </td>
                                            <td>
                                                <a href="<c:url value="/MtnCliente/eliminarDireccion.html"><c:param name="id"><c:out value="${elem.pos}"/></c:param></c:url>" class="btn btn-danger" role="button">Eliminiar</a>
                                                <a href="#" onclick="eliminar(<c:out value="${elem.pos}"/>)" class="btn btn-danger" role="button">Eliminiar</a>
                                            </td>
                                        </tr>
                                    </c:if>
                                </c:forEach>
                            </tbody>
                        </table>
                    </div>
                    <div class="form-group">
                        <div class="col-md-6">
                            <button type="button" class="btn btn-default center-block" onclick="guardarCliente()">Guardar</button>
                        </div>
                    </div>
                </form:form>
            </div>
        </div>
        <form action="${pageContext.request.contextPath}/json.html">
        <input type="text" name="b1"/>
        <input type="button"  onclick="json();" value="test"/>
        </form>
		<div id="feedback"></div>
    </body>
</html>
