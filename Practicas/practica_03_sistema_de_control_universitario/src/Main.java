import academia.Departamento;
import alumnos.EstDoctorado;
import alumnos.EstGrado;
import core.Universidad;
import java.time.LocalDate;
import personal.Doctor;
import personal.PAS;
import personal.PDI;

public class Main {
    public static void main(String[] args) {
        Universidad miUniversidad = new Universidad("Universidad Autónoma", "Ciudad de México", 1995, 0, 0, 0);

        Departamento deptoSistemas = new Departamento("Sistemas Computacionales", "ISC01", "Edificio B", 5);
        miUniversidad.registrarDepartamento(deptoSistemas);

        PAS personalAdmin = new PAS("Carlos Gómez", "Av. Central 45", LocalDate.of(1988, 4, 12), "Auxiliar", 12000.0, LocalDate.of(2015, 9, 1), "Recursos Humanos", 2, "Matutino");
        
        PDI profrAsael = new PDI("Asael Mendoza", "Calle 10 No. 4", LocalDate.of(1980, 7, 25), "Profesor TC", 28000.0, LocalDate.of(2010, 2, 16), "Titular A", "Computación", 40);
        Doctor tituloDoctor = new Doctor("Inteligencia Artificial", "UNAM", 2018);
        profrAsael.setDoctor(tituloDoctor); 

        miUniversidad.contratarTrabajador(personalAdmin);
        miUniversidad.contratarTrabajador(profrAsael);
        deptoSistemas.asignarProfesor(profrAsael);

        EstGrado alumnoGrado = new EstGrado("Sofía Ruiz", "Benito Juárez 89", LocalDate.of(2003, 11, 5), "20216001", 8.8, LocalDate.of(2021, 8, 10), "Tesis", 310, true);
        
        EstDoctorado alumnoDoc = new EstDoctorado("Pedro Marín", "Insurgentes Sur 300", LocalDate.of(1994, 1, 30), "20247005", 9.5, LocalDate.of(2024, 2, 1), "Doctorado en Ciencia de Datos", "Optimización de Algoritmos", "Dr. Asael Mendoza");

        miUniversidad.registrarEstudiante(alumnoGrado);
        miUniversidad.registrarEstudiante(alumnoDoc);

        System.out.println("\n========= EJECUTANDO MÉTODOS PROPIOS =========");
        
        System.out.println("¿Profr. Asael es Adulto Mayor?: " + profrAsael.esAdultoMayor());
        System.out.println("Edad de Carlos: " + personalAdmin.obtenerEdad() + " años");
        System.out.println("Antigüedad de Carlos: " + personalAdmin.calcularAntiguedad() + " años");
         personalAdmin.solicitarVacaciones();

        profrAsael.investigar("Redes Neuronales Convolucionales");
        profrAsael.impartirClase();

        personalAdmin.administrarRecursos(java.util.Arrays.asList(personalAdmin, profrAsael));
        personalAdmin.generarReporte();

        alumnoGrado.inscribirMateria("Estructuras de Datos");
        System.out.println("Beca de Sofía (Grado): $" + alumnoGrado.calcularBeca());
        System.out.println("Beca de Pedro (Doc): $" + alumnoDoc.calcularBeca());

        alumnoGrado.realizarProyecto();
        alumnoGrado.solicitarTitulacion();

        alumnoDoc.realizarTesis();
        alumnoDoc.publicarArticulo();

        System.out.println("¿Título de Doctor válido?: " + tituloDoctor.validarTitulo());
        tituloDoctor.registrarTitulo();

        deptoSistemas.listarPersonal();

        System.out.println("\n========= INFORMACIÓN GENERAL DE CONTROL =========");
        System.out.println(miUniversidad);
        System.out.println(deptoSistemas);
        System.out.println(profrAsael);
        System.out.println(alumnoGrado);
    }
}