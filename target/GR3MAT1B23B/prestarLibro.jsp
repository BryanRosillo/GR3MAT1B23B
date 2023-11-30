<%@ page import="libreria.GestorLibros" %>
<%GestorLibros g = new GestorLibros(); %>
<html>
<body>
<h1 style="text-align: center;">PRESTAR LIBRO</h1>
<fieldset>
    <fieldset>
        <p><%= "Libros disponibles: <br><br>"+g.imprimirLibrosDisponibles()%></p>
    </fieldset>

    <div>
            <h2>Formulario de Prestamo</h2>
            <form action="PrestarServlet" method="POST">
                <label for="Nombre">Nombre:</label>
                <input type="text" id="nombre" name="nombre" required><br><br>

                <label for="ID del libro">ID del libro:</label>
                <input type="number" id="ID" name="ID" required><br><br>

                <button type="submit">Prestar</button>
            </form>
        </div>


</fieldset>
</body>
</html>