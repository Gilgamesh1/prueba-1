<%-- 
    Document   : main
    Created on : 29/06/2016, 06:20:26 PM
    Author     : Raúl
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
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
        <script language="javascript" type="text/javascript" src="<c:url value="/recursos/bootstrap-table/js/bootstrap-table.js"/>"></script>
        <script language="javascript" type="text/javascript" src="<c:url value="/recursos/bootstrap-table/locale/bootstrap-table-es-SP.js"/>"></script>
        <script language="javascript" type="text/javascript" src="<c:url value="/recursos/js/global.js"/>"></script>
        <link href="<c:url value="/recursos/bootstrap/css/bootstrap.css"/>" rel="stylesheet">
        <link href="<c:url value="/recursos/bootstrap/css/bootstrap-theme.css"/>" rel="stylesheet">
        <link href="<c:url value="/recursos/bootstrap-table/css/bootstrap-table.css"/>" rel="stylesheet">
        <title><tiles:insertAttribute name="title" ignore="true" /></title>
    </head>
    <body>
        <input id="context" type="hidden" value="${pageContext.request.contextPath}"></input>
        <div class="container-fluid">
            <div class="row-fluid">
                <tiles:insertAttribute name="menu"/>
            </div>
            <tiles:insertAttribute name="body" />
            <div class="row-fluid">
                <tiles:insertAttribute name="footer"/>
            </div>
        </div>
        <!--<table border="1" cellpadding="2" cellspacing="2" align="center">
            <tr>
                <td height="30" colspan="2"><tilesinsertAttribute name="header" />
                </td>
            </tr>
            <tr>
                <td height="250"><tilesinsertAttribute name="menu" /></td>
                <td width="350"><tilesinsertAttribute name="body" /></td>
            </tr>
            <tr>
                <td height="30" colspan="2"><tilesinsertAttribute name="footer" />
                </td>
            </tr>
        </table>-->
    </body>
</html>
