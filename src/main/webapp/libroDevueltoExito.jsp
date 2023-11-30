<%@ page import="libreria.GestorLibros" %>
<%GestorLibros g = new GestorLibros(); %>
<html>
<body>
<h1 style="text-align: center;">EXITO EN LA DEVOLUCION</h1>
<h2>El libro indicado ha sido devuelto. Muchas gracias.</h2>
<h3>RECIBO</h3>
    <%int id = Integer.parseInt(request.getAttribute("id").toString());%>
    <p><%= g.retornarReciboDevuelto(g.buscarLibro(id),request.getAttribute("usuario").toString()) %></p>


</body>
</html>