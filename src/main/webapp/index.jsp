<%@ page import="libreria.GestorLibros" %>
<html>
<body>
<h1 style="text-align: center;">BIBLIOTECA</h1>
<fieldset>
<form method="POST" action="prestarLibro.jsp">
    <input type="submit" value="Prestrar libro" style="font-size: 20px; color:white; background: #DC143C;">
</form>

<form method="POST" action="devolverLibro.jsp">
    <input type="submit" value="Devolver libro" style="font-size: 20px; color:white; background: #A52A2A;">
</form>
</fieldset>
</body>
</html>
