package Models;
// Gunther
public class Estudiante {
    private final String codigo;
    private final String nombre;
    private final float promedio;
    private final Carrera carrera;

    public Estudiante(String codigo, String nombre, float promedio, Carrera carrera) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.promedio = promedio;
        this.carrera = carrera;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public float getPromedio() {

        return promedio;
    }

    public Carrera getCarrera() {

        return carrera;
    }

    public boolean aprobar() {
        return promedio >= 70;
    }

    @Override
    public String toString() {
        return "Código: " + codigo +
                "\nNombre: " + nombre +
                "\nCarrera: " + carrera.getNombre() +
                "\nPromedio: " + promedio +
                "\nEstado: " + (aprobar() ? "Aprobado" : "Reprobado");
    }
}