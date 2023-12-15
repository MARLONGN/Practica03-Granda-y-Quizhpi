package Test;

import java.util.Scanner;

import Controlador.BibliotecaControlador;
import Controlador.LibroControlador;
import Controlador.PrestamoControlador;
import Controlador.UsuarioControlador;
import Dao.BibliotecaDao;
import Dao.LibroDao;
import Dao.PrestamoDao;
import Dao.UsuarioDao;
import Idao.IBibliotecaDao;
import Idao.ILibroDao;
import Idao.IPrestamoDao;
import Idao.IUsuarioDao;
import Vista.BibliotecaVista;
import Vista.LibroVista;
import Vista.PrestamoVista;
import Vista.UsuarioVista;

public class Menu {

    public static void main(String[] args) {
        
        
    	Scanner scanner = new Scanner(System.in);
       
        int opcionPrincipal;

        do {
        	
            System.out.println("Menú Principal:");
            System.out.println("1) Biblioteca");
            System.out.println("2) Usuario");
            System.out.println("3) Libro");
            System.out.println("4) Préstamo");
            System.out.println("0) Salir");

            System.out.print("Seleccione una opción: ");
            opcionPrincipal = scanner.nextInt();

            switch (opcionPrincipal) {
                case 1:
                    menuBiblioteca();
                    break;
                case 2:
                    menuUsuario();
                    break;
                case 3:
                    menuLibro();
                    break;
                case 4:
                    menuPrestamo();
                    break;
                case 0:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elija una opción correcta.");
            }

        } while (opcionPrincipal != 0);
    }

    private static void menuBiblioteca() {
        int opcionBiblioteca;
        IBibliotecaDao bibliotecaDao= new BibliotecaDao();
        BibliotecaVista bibliotecaVista = new BibliotecaVista();
        
        BibliotecaControlador bibliotecaControlador = new BibliotecaControlador(bibliotecaDao, bibliotecaVista);

        do {
            System.out.println("\nMenú Biblioteca:");
            System.out.println("1) Crear");
            System.out.println("2) Actualizar");
            System.out.println("3) Eliminar");
            System.out.println("4) Mostrar");
            System.out.println("0) Volver al Menú Principal");

            System.out.print("Seleccione una opción: ");
            opcionBiblioteca = new Scanner(System.in).nextInt();

            switch (opcionBiblioteca) {
                case 1:
                    System.out.println("Opción 1 - Crear Biblioteca");
                    bibliotecaControlador.crearBiblioteca();           
                    break;
                case 2:
                    System.out.println("Opción 2 - Actualizar Biblioteca");
                    bibliotecaControlador.actualizarBiblioteca();
                    break;
                case 3:
                    System.out.println("Opción 3 - Eliminar Biblioteca");
                    bibliotecaControlador.eliminarBiblioteca();
                    break;
                case 4:
                    System.out.println("Opción 4 - Buscar Bibliotecas");
                    bibliotecaControlador.buscarBiblioteca();
                    break;
                case 0:
                    System.out.println("Volviendo al Menú Principal");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elija una opción correcta.");
            }

        } while (opcionBiblioteca != 0);
    }

    // Métodos similares para los otros menús (Usuario, Libro, Préstamo)
    private static void menuUsuario() {
    	int opcionUsuario;
        IUsuarioDao usuarioDao = new UsuarioDao();
        UsuarioVista usuarioVista = new UsuarioVista();
        
        UsuarioControlador usuarioControlador = new UsuarioControlador(usuarioDao, usuarioVista);
        
    	do {
    	System.out.println("\nMenú Usuario:");
        System.out.println("1) Crear");
        System.out.println("2) Actualizar");
        System.out.println("3) Eliminar");
        System.out.println("4) Mostrar");
        System.out.println("0) Volver al Menú Principal");

        System.out.print("Seleccione una opción: ");
        opcionUsuario = new Scanner(System.in).nextInt();

        switch (opcionUsuario) {
            case 1:
                System.out.println("Opción 1 - Crear Usuario");
                usuarioControlador.crearUsuario();
                break;
            case 2:
                System.out.println("Opción 2 - Actualizar Usuario");
                usuarioControlador.actualizarUsuario();
                break;
            case 3:
                System.out.println("Opción 3 - Eliminar Usuario");
                usuarioControlador.eliminarUsuario();
                break;
            case 4:
                System.out.println("Opción 4 - Buscar Usuarios");
                usuarioControlador.buscarUsuarioPorId();
                break;
            case 0:
                System.out.println("Volviendo al Menú Principal");
                break;
            default:
                System.out.println("Opción no válida. Por favor, elija una opción correcta.");
        }

    } while (opcionUsuario != 0);
    	}
    

    private static void menuLibro() {
    	int opcionLibro;

        ILibroDao libroDao= new LibroDao();
        LibroVista libroVista = new LibroVista();

        LibroControlador libroControlador = new LibroControlador(libroDao, libroVista);
    	do {
    	System.out.println("\nMenú Libro:");
        System.out.println("1) Crear");
        System.out.println("2) Actualizar");
        System.out.println("3) Eliminar");
        System.out.println("4) Mostrar");
        System.out.println("0) Volver al Menú Principal");

        System.out.print("Seleccione una opción: ");
        opcionLibro = new Scanner(System.in).nextInt();

        switch (opcionLibro) {
            case 1:
                System.out.println("Opción 1 - Crear Libro");
                libroControlador.crearLibro();
                break;
            case 2:
                System.out.println("Opción 2 - Actualizar Libro");
                libroControlador.actualizarLibro();
                break;
            case 3:
                System.out.println("Opción 3 - Eliminar libro");
                libroControlador.eliminarLibro();
                break;
            case 4:
                System.out.println("Opción 4 - Buscar Libros");
                libroControlador.buscarLibroPorTitulo();
                break;
            case 0:
                System.out.println("Volviendo al Menú Principal");
                break;
            default:
                System.out.println("Opción no válida. Por favor, elija una opción correcta.");
        }

    } while (opcionLibro != 0);}
        
    

    private static void menuPrestamo() {
    	int opcionPrestamo;
    	ILibroDao libroDao= new LibroDao();
        LibroVista libroVista = new LibroVista();
        IUsuarioDao usuarioDao = new UsuarioDao();
        UsuarioVista usuarioVista = new UsuarioVista();
        IPrestamoDao prestamoDao = new PrestamoDao();
        PrestamoVista prestamoVista = new PrestamoVista();
        
        
        LibroControlador libroControlador = new LibroControlador(libroDao, libroVista);
        UsuarioControlador usuarioControlador = new UsuarioControlador(usuarioDao, usuarioVista);
        PrestamoControlador prestamoControlador = new PrestamoControlador(libroDao, libroVista, usuarioDao, usuarioVista, prestamoDao, prestamoVista);
        
    	do {
    	System.out.println("\nMenú Prestamo:");
        System.out.println("1) Crear");
        System.out.println("2) Actualizar");
        System.out.println("0) Volver al Menú Principal");

        System.out.print("Seleccione una opción: ");
        opcionPrestamo = new Scanner(System.in).nextInt();

        switch (opcionPrestamo) {
            case 1:
                System.out.println("Opción 1 - Crear Prestamo");
                prestamoControlador.crearPrestamo();
                break;
            case 2:
                System.out.println("Opción 2 - Actualizar Prestamo");
                prestamoControlador.actualizarPrestamo();
                break;
            case 0:
                System.out.println("Volviendo al Menú Principal");
                break;
            default:
                System.out.println("Opción no válida. Por favor, elija una opción correcta.");
        }

    } while (opcionPrestamo != 0);}}