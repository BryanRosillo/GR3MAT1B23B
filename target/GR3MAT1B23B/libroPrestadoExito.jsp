<%@ page import="libreria.GestorLibros" %>
<%GestorLibros g = new GestorLibros(); %>
<html>
<body>
<h1 style="text-align: center;">EXITO EN EL PRESTAMO</h1>
<h2>El libro indicado se ha prestado con exito.</h2>
    <h3>RECIBO</h3>
    <%int id = Integer.parseInt(request.getAttribute("id").toString());%>
    <p><%= g.retornarReciboPrestamo(g.buscarLibro(id),request.getAttribute("usuario").toString()) %></p>
</body>
</html>