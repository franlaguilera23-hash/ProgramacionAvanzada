
public class Main {
    public static void main(String[] args) {
        // El sistema antiguo que no queremos tocar
        Adaptee sistemaViejo = new Adaptee();

        // El adaptador que hace de puente
        Target adaptador = new Adapter(sistemaViejo);

        // El cliente cree que está usando una interfaz moderna
        adaptador.request();
    }
}