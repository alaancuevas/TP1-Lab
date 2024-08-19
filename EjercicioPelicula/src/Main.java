import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        List<Pelicula> ListadePeli = new ArrayList();
        boolean bandera = true;
        
        while (bandera) {
            System.out.println("ingrese director");
            String director = leer.nextLine();
            System.out.println("ingrese titulo");
            String titulo = leer.nextLine();
            System.out.println("ingrese duracion en horas");
            double duracion = leer.nextDouble();
            leer.nextLine();
            Pelicula p1 = new Pelicula(director, titulo, duracion);

            ListadePeli.add(p1);

            System.out.println("quiere guardar otra pelicula?");
            System.out.println("ingrese s o n");
            String respuesta = leer.nextLine();

            while (!respuesta.equalsIgnoreCase("n") && !respuesta.equalsIgnoreCase("s")) {

                System.out.println(" *** ERROR *** ingrese una letra correcta");
                respuesta = leer.nextLine();
            }

            if (respuesta.equalsIgnoreCase("N")) {
                bandera = false;
            }

        }
        //A: MUESTRA LOS TITULOS DE PELICULA
        System.out.println("La lista de pelicula es ");
        for (Pelicula p2 : ListadePeli) {
            System.out.println(p2.getTitulo());
        }
        System.out.println("-----------------------------------------------");
        //B. MUESTRA LA DURACION DE LA PELICULA
        System.out.println("la lista de peliculas de mas de una hora es ");
        for (Pelicula object : ListadePeli) {
            if (object.getDuracion() > 1) {
                System.out.println(object.getTitulo());
            }
        }
        System.out.println("-----------------------------------------------");
        //C.  PELICULAS ORDENADAS DE MAYOR A MENOR
        System.out.println("peliculas ordenadas mayor a menor");
        Collections.sort(ListadePeli,Pelicula.DeMayoraMenor);

        for (Pelicula p2 : ListadePeli) {
            System.out.println(p2.getTitulo()+" ["+p2.getDuracion()+"]");
        }
        System.out.println("-----------------------------------------------");
        // D. ORDENADAS DE MENOR A MAYOR.
        System.out.println("peliculas ordenadas menor a mayor");
        Collections.sort(ListadePeli,Pelicula.DeMenoraMayor);

        for (Pelicula p2 : ListadePeli) {
            System.out.println(p2.getTitulo()+" ["+p2.getDuracion()+"]");
        }
        System.out.println("-----------------------------------------------");
        // E. ORDENAR ALFABETICAMENTE POR TITULO
        System.out.println("peliculas ordenadas alfabeticamente");
        Collections.sort(ListadePeli,Pelicula.OrdenarAlfabeticamente);

        for (Pelicula p2 : ListadePeli) {
            System.out.println(p2.getTitulo());
        }
        System.out.println("-----------------------------------------------");
        // F. ORDENAR ALFABETICAMENTE POR DIRECTOR
        System.out.println("peliculas ordenadas por director");
        Collections.sort(ListadePeli,Pelicula.OrdenarAlfabeticamenteDirector);

        for (Pelicula p2 : ListadePeli) {
            System.out.println(p2.getTitulo()+" ["+p2.getDirector()+"]");
        }
    }
}

    

