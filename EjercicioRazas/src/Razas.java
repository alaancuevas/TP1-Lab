import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Razas {

    List<String> listaRaza = new ArrayList<>();

    public Razas() {
    }

    public void iniciarPrograma() {
        var teclado = new Scanner(System.in);

        System.out.print("\n-----------------------------------------------------------------\n" +
                "\t\tPrograma para registrar razas\n" +
                "\tIngresa 'terminar' para cerrar la lista de razas.\n" +
                "-----------------------------------------------------------------\n\n");

        this.crearLista();
        this.imprimirLista();

        System.out.print("\n------------------------------------\n" +
                "Quieres eliminar alguna raza? Si/No.\n" +
                "------------------------------------\n");

        String eliminar = teclado.nextLine();

        if (eliminar.equalsIgnoreCase("si"))
            this.modificarLista();
        else if (eliminar.equalsIgnoreCase("no"))
            System.out.println("Terminando codigo...");
    }

    private void crearLista() {
        var teclado = new Scanner(System.in);
        String raza = "";
        do {
            System.out.print("Ingresa raza: ");
            raza = teclado.nextLine();

            if (!raza.equals("") && !raza.equalsIgnoreCase("terminar")) {
                this.listaRaza.add(raza);
                System.out.println("Ingreso realizado correctamente.\n");
            } else {
                System.out.println("Ingreso no valida.\n");
            }
        } while (!raza.equalsIgnoreCase("terminar"));
    }

    private void imprimirLista(){
        Iterator<String> iterator = this.listaRaza.iterator();
        System.out.println("\n------------------------------------\n" +
                "\tImprimiendo lista...\n" +
                "------------------------------------\n");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    private void modificarLista() {
        Iterator<String> iterator = this.listaRaza.iterator();
        var teclado = new Scanner(System.in);

        System.out.print("Ingresa raza a eliminar: ");
        String eliminar = teclado.nextLine();

        System.out.println("\n-------------------------------------\n" +
                "\tHistorial de Busqueda\n" +
                "-------------------------------------\n");
        while (iterator.hasNext()) {
            if (iterator.next().equalsIgnoreCase(eliminar)) {
                iterator.remove();
                System.out.println("Encontrado, eliminando..");
            }else{
                System.out.println("No se encontro la raza en la lista.");
            }
        }
        this.imprimirLista();
    }
}
