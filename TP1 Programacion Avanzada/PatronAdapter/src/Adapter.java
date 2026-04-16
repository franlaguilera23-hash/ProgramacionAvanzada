// Interfaz esperada por el cliente
interface Target {
    void request();
}

// Clase existente con interfaz incompatible
class Adaptee {
    public void specificRequest() {
        System.out.println("Llamada al sistema antiguo (Legacy)");
    }
}

// El Adaptador
public class Adapter implements Target {
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}