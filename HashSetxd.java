import java.util.HashSet;
public class HashSetxd{
    public static void main(String[] args){
        HashSet<String> arcoiris = new HashSet<>();

            arcoiris.add("Rojo");
            arcoiris.add("Amarillo");
            arcoiris.add("Rosa");
            arcoiris.add("Verde");
            arcoiris.add("Morado");
            arcoiris.add("Naranja");
            arcoiris.add("Azùl");

            System.out.println("atravesando el arcoiris");
            for (String i : arcoiris){
                System.out.println(i);
            }

            System.out.println("\n-------Usando metodo Contains-------");
            System.out.println("arcoiris.contains(\"Amarillo\"): \t" + arcoiris.contains("Amarillo"));
            System.out.println("arcoiris.contains(\"Blanco\"): \t" + arcoiris.contains("Blanco"));
            System.out.println("arcoiris.contains(\"Lavanda\"): \t" + arcoiris.contains("Lavanda"));
            System.out.println("arcoiris.contains(\"Rojo\"): \t" + arcoiris.contains("Rojo"));
            //borramos el Rojo 
            arcoiris.remove("Rojo");

            System.out.println("arcoiris.contains(\"Rojo\"): \t" + arcoiris.contains("Rojo"));

            System.out.println("\nAfter removing Rojo: " + arcoiris);
    }
}
