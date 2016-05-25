function actualizarLoggin(){
    var v=$("#form");
    v.attr("action","actualizarLogin.html");
    v.val("Y");
    v.submit();
    console.log("me apretaron "+v);
    alert("me apretaron "+v);
    v.attr("action","insertarLogin1.html");
    v.val("Y");
}

