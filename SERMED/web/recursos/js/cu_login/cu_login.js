function actualizarLoggin(){
    var v=$("#form");
    v.attr("action","actualizarLogin.html");
    v.val("Y");
    v.submit();
    v.attr("action","insertarLogin.html");
    v.val("Y");
}

function eliminarLoggin(){
    var v=$("#form");
    v.attr("action","eliminiarLogin.html");
    v.submit();
    v.attr("action","insertarLogin.html");
}
