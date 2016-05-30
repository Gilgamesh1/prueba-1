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
                <div class="row-fluid">
                    <div class="page-header"><h3>Administrar Clientes</h3></div>
                </div>
                <div class="row-fluid">
                <form:form id="form" class="form-horizontal" action="insertarMtnCliente.html" modelAttribute="cliente" method="POST">
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
                        <label for="t5" class="col-md-1">Tel&eacute;fono:</label>
                        <div class="col-md-2"><form:input id="t5" path="telefono" type="number" class="form-control"/></div>
                        <label for="t6" class="col-md-1">Celular:</label>
                        <div class="col-md-2"><form:input id="t6" path="celular" type="number" class="form-control"/></div>
                    </div>
                    <div class="form-group">
                        <div class="col-md-6">
                            <button type="button" class="btn btn-default center-block" onclick="guardar()">Guardar</button>
                        </div>
                    </div>
                </form:form>
            </div>
            <div class="row-fluid">
                <div class="span12">
                    <div class="page-header"><h3>Buscar</h3></div>
                </div>
            </div>
            <div class="row-fluid">
                <label for="t7" class="col-md-1 control-label">Nombre</label>
                <div class="col-md-2">
                    <input id="t7" type="text" class="form-control"/>
                </div>
                <label for="t8" class="col-md-1 control-label">Nro. Documento</label>
                <div class="col-md-2">
                    <input id="t8" type="number" class="form-control"/>
                </div>
                <div class="col-md-1">
                    <button type="button" class="btn btn-default" onclick="buscarClientes()">Buscar</button>
                </div>
            </div>
            <br/>
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
                <nav>
                    <ul class="pagination pagination-sm">
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
                </nav>
            </div>
        </div>
    </body>
</html>
