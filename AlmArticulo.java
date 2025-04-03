import java.util.ArrayList;

class AlmArticulo {
    private ArrayList<Articulo> almacen;

    public AlmArticulo() {
        almacen = new ArrayList<>();
    }

    public void almacena(Articulo articulo) {
        almacen.add(articulo);
    }

    public void listarArticulos() {
        for (Articulo a : almacen) {
            System.out.println(a);
        }
    }
}
