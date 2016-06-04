<%-- 
    Document   : index
    Created on : 19/05/2016, 11:55:49 AM
    Author     : Raúl
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script language="javascript" type="text/javascript" src="<c:url value="/recursos/jquery/jquery-1.11.2.min.js"/>"></script>
        <script language="javascript" type="text/javascript" src="<c:url value="/recursos/bootstrap/js/bootstrap.js"/>"></script>
        <script language="javascript" type="text/javascript" src="<c:url value="/recursos/js/global.js"/>"></script>
    </head>
    <body>
        <a href="/SEDMED/WEB-INF/jsp/cu_login/inicio.jsp"><div>TODO write content</div></a>
        <a href="<c:url value="jsp/cu_login/inicio.jsp"/>"><div>TODO write content</div></a>
        ----------------------------------------------------------
        <a href="WEB-INF/jsp/cu_login/inicio.jsp">inicio.jsp</a>
        <a href="newjsp.jsp">newjsp</a>
        </br><a href="<c:url value="cargarLogin.html"></c:url>">login</a>
        </br><a href="<c:url value="cargarMtnCliente.html"></c:url>">cliente</a>
        </br><a href="<c:url value="/MtnCliente/cargarLista.html"></c:url>">listar clientes</a>
    </body>
</html>
