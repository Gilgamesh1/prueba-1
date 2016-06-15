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
		<div class="row-flui">
			<ol class="breadcrumb">
				<li><a href="<c:url value="/b.html"/>">Mantenimiento</a></li>
				<li class="active">Caracterizaci&oacute;n</li>
			</ol>
		</div>
		<fieldset>
			<legend>Caracterizaci&oacute;n</legend>
			<div class="row-fluid">
				<label for="" class="label-control"></label>
				<div class="col-md-2"><input type="text" class="control-form"></div>
				<label for="" class="label-control"></label>
				<div class="col-md-2"><input type="text" class="control-form"></div>
				<div class="col-md-2"><a href="" class="btn btn-default">Agregar</a></div>
			</div>
		</fieldset>
		<div class="row-fluid">
			<table class="table">
				<thead>
					<tr>
						<th class="text-center">#</th>
						<th class="text-center">Par&aacute;metro</th>
						<th class="text-center">Valor</th>
						<th class="text-center">Actualizar</th>
						<th class="text-center">Eliminar</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>1</td>
						<td>2</td>
						<td>3</td>
						<td>4</td>
						<td>5</td>
					</tr>
				</tbody>
			</table>
		</div>
		<div class="row-fluid">
			<div class="col-md-12"><center><a href="#" class="btn btn-default">Guardar</a></center></div>
		</div>
	</div>
</body>