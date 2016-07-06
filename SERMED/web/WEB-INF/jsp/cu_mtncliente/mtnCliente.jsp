<%-- 
    Document   : mtnCliente
    Created on : 27/05/2016, 12:18:44 PM
    Author     : Raúl
--%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<script language="javascript" type="text/javascript" src="<c:url value="/recursos/js/cu_mtncliente/mtncliente.js"/>"></script>
            <div id="alerta" name="alerta" class="alert alert-danger" role="alert">
                <span class="glyphicon glyphicon-exclamation-sign" aria-hidden="true"></span>
                <span class="sr-only">Error:</span>
                Existen errores en el formulario, por favor revise.
            </div>
            <f:form id="form" class="form-horizontal" action="#" modelAttribute="cliente" method="POST" data-toggle="validator">
                <fieldset>
                    <legend>Administrar Clientes</legend>
                    <div class="form-group has-feedback">
                        <label for="t1" class="control-label col-md-2">Nombre:</label>
                        <div class="col-md-5">
                            <f:input id="t1" name="t1" path="nombre" type="text" class="form-control"/>
                            <span class="glyphicon form-control-feedback" aria-hidden="true"></span>
                            <span class="help-block"></span><f:hidden id="t2" path="id"/>
                        </div>
                    </div>
                    <div class="form-group has-feedback">
                        <label for="t3" class="control-label col-md-2">Tipo de Documento:</label>
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
                            <span class="glyphicon form-control-feedback" aria-hidden="true"></span>
                            <span class="help-block"></span>
                        </div>
                        <label for="t4" class="control-label col-md-1">Nro. Documento:</label>
                        <div class="col-md-2">
                            <f:input id="t4" path="nroDocumento" type="number" class="form-control"/>
                            <span class="glyphicon form-control-feedback" aria-hidden="true"></span>
                            <span class="help-block"></span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="t5" class="control-label col-md-2">Representante Legal:</label>
                        <div class="col-md-5"><f:input id="t5" path="representante" type="text" class="form-control"/></div>                        
                    </div>
                    <div class="form-group has-feedback">
                        <label for="t6" class="control-label col-md-2">Correo Electr&oacute;nico:</label>
                        <div class="col-md-5">
                            <f:input id="t6" path="email" type="text" class="form-control"/>
                            <span class="glyphicon form-control-feedback" aria-hidden="true"></span>
                            <span class="help-block"></span>
                        </div>                        
                    </div>
                    <div class="form-group">
                        <label for="t7" class="control-label col-md-2">Tel&eacute;fono:</label>
                        <div class="col-md-2"><f:input id="t7" path="telefono" type="number" class="form-control"/></div>
                        <label for="t8" class="control-label col-md-1">Celular:</label>
                        <div class="col-md-2"><f:input id="t8" path="celular" type="number" class="form-control has-error"/></div>
                    </div>
                    </fieldset>
                <fieldset>
                    <legend>Administrar Direcci&oacute;n</legend>
                    <div class="form-group has-feedback">
                        <label for="t9" class="control-label col-md-1">Direcci&oacute;n:</label>
                        <div class="col-md-2">
                            <f:input id="t9" path="dir" type="text" class="form-control"/>
                            <span class="glyphicon form-control-feedback" aria-hidden="true"></span>
                            <span class="help-block"></span>
                        </div>
                        <label for="t10" class="control-label col-md-1">Ubicaci&oacute;n:</label>
                        <div class="col-md-2">
                            <f:input id="t10" path="ubi" type="text" class="form-control"/>
                            <span class="glyphicon form-control-feedback" aria-hidden="true"></span>
                            <span class="help-block"></span><f:hidden id="t11" path="pos"/>
                        </div>
                        <div class="col-md-2">
                            <a href="#" onclick="guardarDireccion()" class="btn btn-default" role="button">Guardar Dirección</a>
                        </div>
                    </div>
                </fieldset>
            </f:form>                   
            <div class="row-fluid">
                <table id="table" class="table table-bordered">
                    <thead>
                        <tr>
                            <th data-field="nroTabla">#</th>
                            <th data-field="direccion">Direcci&oacute;n</th>
                            <th data-field="ciudad">Ciudad</th>
                            <th data-field="3">Acciones</th>
                        </th>
                    </thead>
                    <tbody id="contenido">
                        <c:forEach items="${lstDirecciones}" var="elem">
                            <c:if test="${elem.mostrar}">
                                <tr>
                                    <td style="text-align: center;"><c:out value="${elem.nroTabla}"/></td>
                                    <td style="text-align: center;"><c:out value="${elem.direccion}"/></td>
                                    <td style="text-align: center;"><c:out value="${elem.ciudad}"/></td>
                                    <td style="text-align: center;">
                                        <a class="like" href="javascript:void(0)" onclick="cargarDireccion(<c:out value="${elem.pos}"/>)" title="Actualizar">
                                        <i class="glyphicon glyphicon-pencil"></i>
                                        </a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                        <a class="remove" href="javascript:void(0)" onclick="eliminarDireccion(<c:out value="${elem.pos}"/>)" title="Eliminar">
                                        <i class="glyphicon glyphicon-remove"></i>
                                        </a>
                                    </td>
                                </tr>
                            </c:if>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
            <div class="row-fluid">
                <table id="table1" class="table table-hover">
                
                </table>
            </div>
            <div class="row-fluid">
                <div class="col-md-12">
                    <button type="button" class="btn btn-default center-block" onclick="guardarCliente()">Guardar</button>
                </div>
            </div>
        </div>