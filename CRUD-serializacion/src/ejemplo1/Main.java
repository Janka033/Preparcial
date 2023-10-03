package ejemplo1;

public class Main {
    public static void main(String[] args) {
        Producto producto = Producto.LAPIZ;
        System.out.println("El nombre del lapiz es " + producto.getNombre() + " y la descripcion es " + producto.getDescripcion());
        Producto producto1 = Producto.CARTUCHERA;
        System.out.println("El nombre del lapiz es " + producto1.getNombre() + " y la descripcion es " + producto1.getDescripcion());
        Producto producto2 = Producto.CUADERNO;
        System.out.println("El nombre del lapiz es " + producto2.getNombre() + " y la descripcion es " + producto2.getDescripcion());
        Producto producto3 = Producto.BORRADOR;
        System.out.println("El nombre del lapiz es " + producto3.getNombre() + " y la descripcion es " + producto3.getDescripcion());
        Producto producto4 = Producto.SACAPUNTA;
        System.out.println("El nombre del lapiz es " + producto4.getNombre() + " y la descripcion es " + producto4.getDescripcion());


    }
}
