/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rutinasxml;

import controlador.RutinasController;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import modelo.Ejercicio;
import modelo.Especialista;
import modelo.GrupoDeportivo;
import modelo.ParteCuerpo;
import modelo.Registro;
import modelo.Rutina;
import modelo.RutinaId;
import modelo.TipoEjercicio;

/**
 *
 * @author migue
 */
public class RutinasMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        RutinasMain run = new RutinasMain();

        RutinasController rutinasController = new RutinasController();
        Scanner input = new Scanner(System.in);
        int opcion = 0;
        String menu = "Menu \n"
                + "1.Agregar tipo ejercicio\n"
                + "2.Agregar Especialista\n"
                + "3.Agregar ejercicio\n"
                + "4.Buscar por id\n"
                + "5.Eliminar por id\n"
                + "6.Listar\n"
                + "7.Salir\n"
                + "Ingrese una opcion:\n";
        do {
            System.out.println(menu);
            opcion = input.nextInt();
            run.gestion(opcion, run, rutinasController, input);
        } while (opcion != 7);

    }

    public void gestion(int opcion, RutinasMain main, RutinasController controller, Scanner scanner) {
        switch (opcion) {
            case 1:
                controller.guardarTipoEjercicio(main.agregarTipoEjercicio());
                System.out.println("Tipo Ejercicio Agregado satisfactoriamente!!!");
                break;
            case 2:
                controller.guardarEspecialista(main.agregarEspecialista());
                System.out.println("Especialista Agregado satisfactoriamente!!!");
                break;
            case 3:
                System.out.println("Ingrese el id del especialista");
                int idEspecialista = scanner.nextInt();
                controller.guardarEjercicio(main.agregarEjercicio(controller, idEspecialista));
                System.out.println("Ejercicio Agregado satisfactoriamente!!!");
                break;
            case 4:
                String menuBuscar = "Menu Buscar\n"
                        + "1.Buscar Especialista\n"
                        + "2.Buscar GrupoDeportivo\n"
                        + "3.Buscar Parte Cuerpo\n"
                        + "4.Buscar Registro\n"
                        + "5.Buscar TipoEjercicio\n"
                        + "6.Atras\n"
                        + "Ingrese una opción:";
                int opc = 0;
                do {
                    System.out.println(menuBuscar);
                    opc = scanner.nextInt();
                    main.buscar(opc, main, controller, scanner);
                } while (opc != 6);
                break;
            case 5:
                String menuEliminar = "Menu Eliminiar\n"
                        + "1.Eliminar GrupoDeportivo\n"
                        + "2.Atras\n"
                        + "Ingrese una opción:";
                int opcEliminar = 0;
                do {
                    System.out.println(menuEliminar);
                    opcEliminar = scanner.nextInt();
                    main.eliminar(opcEliminar, main, controller, scanner);
                } while (opcEliminar != 2);
                break;
            case 6:
                String menuListar = "Menu Listar\n"
                        + "1.Listar Ejercicios\n"
                        + "2.Listar Especialistas\n"
                        + "3.Listar GruposDeportivos\n"
                        + "4.Listar Partes Cuerpo\n"
                        + "5.Listar Registros\n"
                        + "6.Listar Rutinas\n"
                        + "7.Listar Tipos Ejercicio\n"
                        + "8.Atras\n"
                        + "Ingrese una opción:";
                int opcListar = 0;
                do {
                    System.out.println(menuListar);
                    opcListar = scanner.nextInt();
                    main.listar(opcListar, main, controller, scanner);
                } while (opcListar != 8);
                break;
            case 7:
                System.exit(0);
                break;
            default:
                System.out.println("Ingrese una opción valida");
        }
    }

    public void buscar(int opcion, RutinasMain main, RutinasController controller, Scanner scanner) {
        int idBuscar = 0;
        switch (opcion) {
            case 1:
                System.out.println("Ingrese el id del especialista");
                idBuscar = scanner.nextInt();
                Especialista especialista = controller.obtenerEspecilalista(idBuscar);
                if (especialista != null) {
                    System.out.println(especialista);
                } else {
                    System.out.println("El especialista no fue encontrado");
                }
                break;
            case 2:
                System.out.println("Ingrese el id del grupo deportivo");
                idBuscar = scanner.nextInt();
                GrupoDeportivo grupoDeportivo = controller.obtenerGrupoDeportivo(idBuscar);
                if(grupoDeportivo != null){
                    System.out.println(grupoDeportivo);
                }else{
                    System.out.println("El grupo deportivo no fue encontrado");
                }
                break;
            case 3:
                System.out.println("Ingrese el id de parte cuerpo");
                idBuscar = scanner.nextInt();
                ParteCuerpo parteCuerpo = controller.obtenerParteCuerpo(idBuscar);
                if(parteCuerpo != null){
                    System.out.println(parteCuerpo);
                }else{
                    System.out.println("Parte cuerpo no fue encontrado");
                }
                
                break;
            case 4:
                System.out.println("Ingrese el id del registro");
                idBuscar = scanner.nextInt();
                Registro registro = controller.obtenerRegistro(idBuscar);
                if(registro != null){
                    System.out.println(registro);
                }else{
                    System.out.println("El registro no fue encontrado");
                }
                
                break;
            case 5:
                System.out.println("Ingrese el id del tipo de ejercicio");
                idBuscar = scanner.nextInt();
                TipoEjercicio tipoEjercicio = controller.obtenerTipoEjercicio((short) idBuscar);
                if (tipoEjercicio != null){
                    System.out.println(tipoEjercicio);
                }else{
                    System.out.println("El tipo de ejercicio no fue encontrado");
                }
                break;
            default:

        }

    }

    public void eliminar(int opcion, RutinasMain main, RutinasController controller, Scanner scanner) {
        switch (opcion) {
            case 1:
                try {
                    System.out.println("Ingrese el id del grupo deportivo a eliminar");
                    Integer idGrupoDeportivo = scanner.nextInt();
                    GrupoDeportivo grupoDeportivo = controller.obtenerGrupoDeportivo(idGrupoDeportivo);
                    controller.eliminarGrupoDeportivo(grupoDeportivo);
                    System.out.println("Registro de grupo deportivo eliminado satisfactoriamente");
                } catch (Exception e) {
                    System.out.println("Hubo un error causado por: " + e.getMessage() + "\n");
                }

                break;
            default:

        }

    }

    public void listar(int opcion, RutinasMain main, RutinasController controller, Scanner scanner) {
        switch (opcion) {
            case 1:
                // System.out.println(controller.obtenerEjercicios().toString());
                System.out.println(imprimir(controller.obtenerEjercicios()));
                break;
            case 2:
                System.out.println(imprimir(controller.obtenerEspecialistas()));
                break;
            case 3:
                System.out.println(imprimir(controller.obtenerGrupoDeportivos()));
                break;
            case 4:
                System.out.println(imprimir(controller.obtenerParteCuerpo()));
                break;
            case 5:
                System.out.println(imprimir(controller.obtenerRegistro()));
                break;
            case 6:
                System.out.println(imprimir(controller.listarRutinas()));
                break;
            case 7:
                System.out.println(imprimir(controller.listarTiposEjercicio()));
                break;
            default:

        }

    }

    public Especialista agregarEspecialista() {
        GrupoDeportivo grupoDeportivo = new GrupoDeportivo(1, 1);
        Registro registro = new Registro(1, new Date());
        Especialista especialista = new Especialista(1, "Miguel", new Date(), "234554", registro);
        grupoDeportivo.setEspecialistaByEspIdEspecialista(especialista);
        grupoDeportivo.setEspecialistaByIdEspecialista(especialista);
        registro.setEspecialista(especialista);
        especialista.getGrupoDeportivosForEspIdEspecialista().add(grupoDeportivo);
        especialista.getGrupoDeportivosForIdEspecialista().add(grupoDeportivo);
        especialista.setRegistro(registro);
        return especialista;
    }

    public Registro agregarRegistro() {
        Registro registro = new Registro(4, new Date());
        return registro;
    }

    public TipoEjercicio agregarTipoEjercicio() {
        TipoEjercicio tipoEjercicio = new TipoEjercicio((short) 2, "descripcion Ejercicio");
        return tipoEjercicio;
    }

    public Ejercicio agregarEjercicio(RutinasController controller, Integer idEspecialista) {
        TipoEjercicio tipoEjercicio = new TipoEjercicio((short) 3, "Desc");
        Ejercicio ejercicio = new Ejercicio(3, tipoEjercicio, "Abdominales", "Ejerccio para tener el abdomen plano");

        try {
            Especialista especialista = controller.obtenerEspecilalista(idEspecialista);
            RutinaId rutinaId = new RutinaId();
            rutinaId.setDia("Lun");
            rutinaId.setIdEjercicio(ejercicio.getIdEjercicio());
            rutinaId.setIdEspecialista(especialista.getIdEspecialista());

            ParteCuerpo parteCuerpo = new ParteCuerpo(1, "Musculos abdomen");
            Rutina rutina = new Rutina(rutinaId, especialista, (short) 5, new Date());
            rutina.setEjercicio(ejercicio);
            ejercicio.getParteCuerpos().add(parteCuerpo);
            ejercicio.getRutinas().add(rutina);
            parteCuerpo.getEjercicios().add(ejercicio);
            parteCuerpo.setParteCuerpo(parteCuerpo);
            parteCuerpo.getParteCuerpos().add(parteCuerpo);
            rutina.setEspecialista(especialista);
            return ejercicio;
        } catch (Exception e) {

        }
        return null;
    }

    public static String imprimir(List list) {
        StringBuffer salida = new StringBuffer();
        for (Object list1 : list) {
            salida.append(list1.toString() + "\n");
        }
        return salida.toString();
    }
}
