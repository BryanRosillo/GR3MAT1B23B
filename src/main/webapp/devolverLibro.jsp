<%@ page import="libreria.GestorLibros" %>
<%GestorLibros g = new GestorLibros(); %>
<html>
<body>
<h1 style="text-align: center;">DEVOLVER LIBRO</h1>
<fieldset>
    <fieldset>
        <p><%= "Libros prestados: <br><br>"+g.imprimirLibrosNoDisponibles()%></p>
    </fieldset>

    <div>
            <h2>Formulario de devolucion</h2>
            <form action="DevolverServlet" method="POST">
                <label for="Nombre">Nombre:</label>
                <input type="text" id="nombre" name="nombre" required><br><br>

                <label for="ID del libro">ID del libro:</label>
                <input type="number" id="ID" name="ID" required><br><br>

                <button type="submit">Devolver</button>
            </form>
        </div>


</fieldset>
</body>
</html>