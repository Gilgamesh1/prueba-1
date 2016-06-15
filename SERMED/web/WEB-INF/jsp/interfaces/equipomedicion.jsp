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
				<legend>Datos del Equipo de Medici&oacute;n</legend>
				<div class="form-group">
					<label for="" class="label-control col-md-1">Descripci&oacute;n</label>
					<div class="col-md-3"><input type="text" class="form-control"></div>
				</div>
				<div class="form-group">
					<label for="" class="label-control col-md-1">Incertidumbre Maxima:</label>
					<div class="col-md-2"><input type="text" class="form-control"/></div>
					<label for="" class="label-control col-md-1">Error Maximo</label>
					<div class="col-md-2"><input type="text" class="form-control"/></div>
					<label for="" class="label-control col-md-1">Resolucion EBP</label>
					<div class="col-md-2"><input type="text" class="form-control"/></div>
				</div>
			</fieldset>
			<fieldset>
				<legend>Patron</legend>
				<div class="form group">
					<label for="" class="label-control col-md-1">Simbolo:</label>
					<div class="col-md-2"><select name="" id="" class="form-control">
							<option value=">">Mayor que</option>
							<option value=">=">Mayor o igual que</option>
							<option value="<">Menor que</option>
							<option value="<=">Menor o igual que</option>
							<option value="=">Igual que</option>
							<option value="[]">Entre</option>
						</select>
					</div>
					<label for="" class="label-control col-md-1">Valor:</label>
					<div class="col-md-2"><input type="text" class="form-control" type="text"/></div>
					<div class="col-md-1"><a href="" class="btn btn-default">Agregar</a></div>
				</div>
				<div class="row-fluid">
					<table class="table">
						<thead>
							<tr>
								<th class="text-center">#</th>
								<th class="text-center">Simbolo</th>
								<th class="text-center">Valor</th>
								<th class="text-center">Actualizar</th>
								<th class="text-center">Eliminar</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td>1</td>
								<td>1</td>
								<td>1</td>
								<td>1</td>
								<td>1</td>
							</tr>
						</tbody>
					</table>
				</div>
			</fieldset>
			<fieldset>
				<legend>Tolerancia</legend>
				<div class="form group">
					<label for="" class="label-control col-md-1">Simbolo:</label>
					<div class="col-md-2"><select name="" id="" class="form-control">
							<option value=">">Mayor que</option>
							<option value=">=">Mayor o igual que</option>
							<option value="<">Menor que</option>
							<option value="<=">Menor o igual que</option>
							<option value="=">Igual que</option>
							<option value="[]">Entre</option>
						</select>
					</div>
					<label for="" class="label-control col-md-1">Valor:</label>
					<div class="col-md-2"><input type="text" class="form-control" type="text"/></div>
					<div class="col-md-1"><a href="" class="btn btn-default">Agregar</a></div>
				</div>
				<div class="row-fluid">
					<table class="table">
						<thead>
							<tr>
								<th class="text-center">#</th>
								<th class="text-center">Simbolo</th>
								<th class="text-center">Valor</th>
								<th class="text-center">Actualizar</th>
								<th class="text-center">Eliminar</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td>1</td>
								<td>1</td>
								<td>1</td>
								<td>1</td>
								<td>1</td>
							</tr>
						</tbody>
					</table>
				</div>
			</fieldset>
			<div class="row-fluid">
				<div class="col-md-12"><center><a href="#" class="btn btn-default">Guardar</a></center></div>
			</div>
		</form>
	</div>
</body>