import java.util.Scanner;

class GestSimAlm {
    private AlmArticulo almacen;
    private Scanner sc;

    public GestSimAlm() {
        almacen = new AlmArticulo();
        sc = new Scanner(System.in);
    }

    public void entradaAutomatizada() {
        almacen.almacena(new Articulo("A1", "Producto 1"));
        almacen.almacena(new Articulo("A2", "Producto 2"));
        almacen.almacena(new Articulo("A3", "Producto 3"));
        almacen.almacena(new Articulo("A4", "Producto 4"));
    }

    public void listar() {
        almacen.listarArticulos();
    }

    public void alta() {
        System.out.print("Ingrese código: ");
        String codigo = sc.next();
        System.out.print("Ingrese descripción: ");
        String descripcion = sc.next();
        Articulo nuevo = new Articulo(codigo, descripcion);
        almacen.almacena(nuevo);
    }
}
