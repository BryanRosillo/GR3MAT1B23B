package libreria;

import java.util.ArrayList;

public class Historial {
    private ArrayList<String> transacciones;

    public Historial(){
        this.transacciones = new ArrayList<String>();
    }

    public void registrarTransaccion(String transaccion){
        this.transacciones.add(transaccion);
    }
}
