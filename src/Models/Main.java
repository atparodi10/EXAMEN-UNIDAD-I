package Models;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> DatosEstudiantes = new ArrayList<>();
        Estudiante estudiante = new Estudiante();
        Carrera carrera = new Carrera();

        String nombres, codigos, nombre_carreras;
        float promedio;
        int duracion, aprobados = 0, reprobados = 0;


        Scanner op = new Scanner(System.in);

        int opcion;

        do{
            System.out.println("Ingrese una opción\n\n1. Agregar Estudiante\n2. Ver Lista\n3.Salir");
            System.out.println("Seleccione una opción: ");

            opcion = op.nextInt();
            op.nextLine();

            switch(opcion)
            {
                case 1:
                    System.out.println("----AGREGAR ESTUDIANTE----");
                    System.out.println("Cantidad de aprobados: "+ aprobados + "Cantidad de reprobados: "+ reprobados);
                    System.out.println("Ingrese el nombre del estudiante: ");
                    nombres = op.nextLine();
                    estudiante.setNombre(nombres);
                    System.out.println("Ingrese el codigo del estudiante: ");
                    codigos = op.nextLine();
                    estudiante.setCodigo(codigos);
                    System.out.println("Ingrese el promedio del estudiante: ");
                    promedio = op.nextFloat();
                    op.nextLine();

                    while(promedio < 0 || promedio >100)
                {
                    System.out.println("ERROR. Ingrese un promedio valido.");
                    System.out.println("Ingrese el promedio del estudiante: ");
                    promedio = op.nextFloat();
                    op.nextLine();
                }
                    estudiante.setPromedio(promedio);
                    if(estudiante.aprobar(promedio))
                    {
                        aprobados++;
                        System.out.println("APROBADO");
                    }
                    else
                    {
                        reprobados++;
                        System.out.println("REPROBADO");
                    }

                    System.out.println("Ingrese el nombre de la carrera: ");
                    nombre_carreras = op.nextLine();
                    carrera.setNombre(nombre_carreras);
                    System.out.println("Ingrese la duracion de la carrera: ");
                    duracion = op.nextInt();
                    carrera.setDuracion(duracion);
                    estudiante.setCarrera(carrera);
                    break;

                case 2:
                    System.out.println("----LISTA DE ESTUDIANTES----");
                    for(int i = 0; i <= DatosEstudiantes.size(); i++)
                    {
                        System.out.println((i+1) + ".\n");
                    }
                    break;

                case 3:
                    System.out.println("Saliendo del programa...");

                default:
                    System.out.println("Opción incorrecta. Intente Nuevamente.");

            }


        }while(opcion != 3);

        op.close();

    }
}
