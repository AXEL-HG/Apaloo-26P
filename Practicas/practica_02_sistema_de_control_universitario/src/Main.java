import academia.Departamento;
import alumnos.EstDoctorado;
import alumnos.EstGrado;
import core.Universidad;
import java.time.LocalDate;
import personal.Doctor;
import personal.PAS;
import personal.PDI;
import Practicas.practica_04_herencia_e_intefaces.src.Cuentas.derivadas.CuentaCorriente;
import Practicas.practica_04_herencia_e_intefaces.src.Cuentas.derivadas.CuentaAhorro;

public class Main {
    public static void main(String[] args) {
        Universidad miUniversidad = new Universidad("Universidad Autónoma", "Ciudad de México", 1995, 10, 10, 10);

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


        System.out.println("\n========= PROBANDO CONEXIÓN DE CUENTAS BANCARIAS =========");

        // 1. Vinculamos una CuentaCorriente al Profesor Asael (Trabajador)
        CuentaCorriente cuentaAsael = new CuentaCorriente(15000.0, "CC-UAM-001", 0.02);
        profrAsael.setCuentaCorriente(cuentaAsael);
        
        System.out.println("Cuenta Corriente vinculada al profesor " + profrAsael.getNombre() + ":");
        System.out.println("  -> No. Cuenta: " + profrAsael.getCuentaCorriente().getNumeroCuenta());
        
        // Ejecutamos el cobro de comisión
        profrAsael.getCuentaCorriente().cobrarComision();
        System.out.println("  -> Saldo después de cobrar comisión: $" + profrAsael.getCuentaCorriente().getNumeroCuenta());


        // 2. Vinculamos una CuentaAhorro a la Alumna Sofía (Estudiante)
        CuentaAhorro cuentaSofia = new CuentaAhorro(2500.0, "CA-UAM-999", 50000.0);
        alumnoGrado.setCuentaAhorro(cuentaSofia);

        System.out.println("\nCuenta de Ahorro vinculada a la estudiante " + alumnoGrado.getNombre() + ":");
        System.out.println("  -> No. Cuenta: " + alumnoGrado.getCuentaAhorro().getNumeroCuenta());
        
        // Ejecutamos el cálculo de intereses
        double intereses = alumnoGrado.getCuentaAhorro().calcularIntereses();
        System.out.println("  -> Intereses calculados sobre saldo: $" + intereses);


        System.out.println("\n========= INFORMACIÓN GENERAL DE CONTROL =========");
        System.out.println(miUniversidad);
        System.out.println(deptoSistemas);
        System.out.println(profrAsael); 
        System.out.println(alumnoGrado);
    }
}