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
<!--a/js/bootstrapvalidator/js/bootstrapValidator.min.js-->
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script language="javascript" type="text/javascript" src="<c:url value="/recursos/jquery/jquery-1.11.2.min.js"/>"></script>
        <script language="javascript" type="text/javascript" src="<c:url value="/recursos/jquery/jquery.validate.min.js"/>"></script>
        <script language="javascript" type="text/javascript" src="<c:url value="/recursos/bootstrap/js/bootstrap.js"/>"></script>
        <script language="javascript" type="text/javascript" src="<c:url value="/recursos/bootstrap/js/validator.js"/>"></script>
        <script language="javascript" type="text/javascript" src="<c:url value="/recursos/js/cu_mtncliente/mtncliente.js"/>"></script>
        <script language="javascript" type="text/javascript" src="<c:url value="/recursos/js/global.js"/>"></script>
        <link href="<c:url value="/recursos/bootstrap/css/bootstrap.css"/>" rel="stylesheet">
        <link href="<c:url value="/recursos/bootstrap/css/bootstrap-theme.css"/>" rel="stylesheet">
        <title>Mantenimiento de Clientes</title>
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
                                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Archivo<span class="caret"></span></a>
                                    <ul class="dropdown-menu">
                                        <li><a href="<c:url value="cargarLogin.html"/>">Administrar Login</a></li>
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
                <ul id="'msj-ul">

                </ul>
            </div>
            <div class="alert alert-danger" role="alert">
                <span class="glyphicon glyphicon-exclamation-sign" aria-hidden="true"></span>
                <span class="sr-only">Error:</span>
                Enter a valid email address
            </div>
            <f:form id="form" class="form-horizontal" action="#" modelAttribute="cliente" method="POST">
                <fieldset>
                    <legend>Administrar Clientes</legend>
                <div id="c1" class="form-group">
                    <label for="t1" class="col-md-2">Nombre:</label>
                    <div class="col-md-5">
                        <f:input id="t1" name="t1" path="nombre" type="text" class="form-control"/><f:hidden id="t2" path="id"/>
                    </div>
                </div>
                <div id="c2" class="form-group">
                    <label for="t3" class="col-md-2">Tipo de Documento:</label>
                    <div class="col-md-2">
                        <select id="t3" name="t3" class="form-control" >
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
                    <!--div id="c3" class="form-inline"-->
                    <label for="t4" class="col-md-1">Nro. Documento:</label>
                    <div class="col-md-2">
                        <f:input id="t4" path="nroDocumento" type="number" class="form-control"/>
                    </div>
                    <!--/div-->
                </div>
                <div id="c4" class="form-group">
                    <label for="t5" class="col-md-2">Representante Legal:</label>
                    <div class="col-md-5"><f:input id="t5" path="representante" type="text" class="form-control"/></div>                        
                </div>
                <div id="c5" class="form-group">
                    <label for="t6" class="col-md-2">Correo Electr&oacute;nico:</label>
                    <div class="col-md-5"><f:input id="t6" path="email" type="text" class="form-control"/></div>                        
                </div>
                <div class="form-group">
                    <label for="t7" class="col-md-2">Tel&eacute;fono:</label>
                    <div class="col-md-2"><f:input id="t7" path="telefono" type="number" class="form-control"/></div>
                    <label for="t8" class="col-md-1">Celular:</label>
                    <div class="col-md-2"><f:input id="t8" path="celular" type="number" class="form-control has-error"/></div>
                </div>
                </fieldset>
                <fieldset>
                    <legend>Administrar Direcci&oacute;n</legend>
                <div class="form-group">
                    <label for="t9" class="col-md-1 control-label">Direcci&oacute;n:</label>
                    <div class="col-md-2"><f:input id="t9" path="dir" type="text" class="form-control"/></div>
                    <label for="t10" class="col-md-1 control-label">Ubicaci&oacute;n</label>
                    <div class="col-md-2"><f:input id="t10" path="ubi" type="text" class="form-control"/><f:hidden id="t11" path="pos"/></div>
                    <div class="col-md-2">
                        <a href="#" onclick="guardarDireccion()" class="btn btn-default" role="button">Guardar Dirección</a>
                    </div>
                </div>
                </fieldset>
            </f:form>                   
            <div class="row-fluid">
                <table id="tabla" class="table">
                    <thead>
                        <tr>
                            <th>#</th>
                            <th>Direcci&oacute;n</th>
                            <th>Ciudad</th>
                            <th>Actualizar</th>
                            <th>Eliminar</th>
                        </th>
                    </thead>
                    <tbody id="contenido">
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
                                        <a href="#" onclick="eliminarDireccion(<c:out value="${elem.pos}"/>)" class="btn btn-danger" role="button">Eliminiar</a>
                                    </td>
                                </tr>
                            </c:if>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
            <div class="row-fluid">
                <div class="col-md-12">
                    <button type="button" class="btn btn-default center-block" onclick="guardarCliente()">Guardar</button>
                </div>
            </div>
        </div>
    </body>
</html>
