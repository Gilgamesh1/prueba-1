<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
        <a class="navbar-brand" href="#">Brand</a>
        <ul class="nav navbar-nav">
            <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Archivo<span class="caret"></span></a>
                <ul class="dropdown-menu">
                    <li><a href="<c:url value="cargarLogin.html"/>">Administrar Login</a></li>
                    <li><a href="#">Administrar Clientes</a></li>
                </ul>
            </li>
        </ul>
    </div>
  </div><!-- /.container-fluid -->
</nav>