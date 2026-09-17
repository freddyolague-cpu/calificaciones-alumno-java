public class CalificacionesAlumno {

    String nombre;
    double[] calificaciones = new double[5];

    public CalificacionesAlumno(String nombre, double[] calificaciones) {
        this.nombre = nombre;
        this.calificaciones = calificaciones;
    }

    public double calcularPromedio(double[] calificaciones) {
        double suma = 0;

        for (int i = 0; i < calificaciones.length; i++) {
            suma += calificaciones[i];
        }

        return suma / calificaciones.length;
    }

    public char obtenerCalificacion(double promedio) {
        if (promedio <= 50) {
            return 'F';
        } else if (promedio <= 60) {
            return 'E';
        } else if (promedio <= 70) {
            return 'D';
        } else if (promedio <= 80) {
            return 'C';
        } else if (promedio <= 90) {
            return 'B';
        } else {
            return 'A';
        }
    }

    public void imprimirResultados(String nombre, double promedio, char calificacion) {
        System.out.println("Nombre del estudiante: " + nombre);

        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("Calificación " + (i + 1) + ": " + calificaciones[i]);
        }

        System.out.println("Promedio: " + promedio);
        System.out.println("Calificación: " + calificacion);
    }

    public static void main(String[] args) {

        String nombre = "Alfredo";
        double[] calificaciones = {90, 85, 95, 80, 100};

        CalificacionesAlumno alumno =
                new CalificacionesAlumno(nombre, calificaciones);

        double promedio = alumno.calcularPromedio(calificaciones);
        char calificacionFinal = alumno.obtenerCalificacion(promedio);

        alumno.imprimirResultados(nombre, promedio, calificacionFinal);
    }
}
