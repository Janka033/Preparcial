package ejemplo1;
public enum Producto {
    LAPIZ("Lapicito","amarillo") {
        @Override
        public String mostrarUso() {
            return null;
        }
    },CUADERNO("Avengers","Cuadriculado") {
        @Override
        public String mostrarUso() {
            return null;
        }
    }, BORRADOR("Borradorcito","Blanco") {
        @Override
        public String mostrarUso() {
            return null;
        }
    }, SACAPUNTA("Sacapuntita","Plateado") {
        @Override
        public String mostrarUso() {
            return null;
        }
    }, CARTUCHERA("Cartucherita","Herramientas") {
        @Override
        public String mostrarUso() {
            return null;
        }
    };
    private String nombre;
    private String descripcion;

    Producto(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    public String getNombre(){return nombre;}
    public String getDescripcion(){return descripcion;}
    public abstract String mostrarUso();
}

