package Sistema_con_conexiones.sistema_universitario;
import Sistema_con_conexiones.sistema_universitario.src.core.Universidad;
import Sistema_con_conexiones.sistema_universitario.src.alumnos.Estudiante;
import Sistema_con_conexiones.sistema_universitario.src.alumnos.EstGrado;
import Sistema_con_conexiones.sistema_universitario.src.personal.PDI;
import Sistema_con_conexiones.Banco.CuentaAhorro;
import Sistema_con_conexiones.Banco.CuentaCorriente;
import java.time.Clock;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("=========================================================");
        System.out.println("   INICIANDO SISTEMA UNIVERSITARIO Y BANCARIO V3.0");
        System.out.println("=========================================================\n");

        Universidad uamIztapalapa = new Universidad("UAM Iztapalapa", "CDMX", 1974, 50);

        Estudiante goku = new Estudiante("KAME-9000", 5.5, LocalDate.now(Clock.systemUTC()), "Son Goku", "Montaña Paoz", LocalDate.of(1984, 11, 20));
        
        EstGrado axdeti = new EstGrado("CS-2026", 9.8, LocalDate.of(2025, 1, 1), "Erizo AXDETI", "Servidores Fedora Linux", LocalDate.of(2023, 5, 10), "Ciencias de la Computación", 150, false);

        PDI drSimi = new PDI("Dr. Simi", "Farmacias Similares", LocalDate.of(1997, 10, 1), 50000.0, "Profesor Investigador", LocalDate.of(2010, 5, 1), "Titular C", "Farmacología y Baile de Botargas", 40);
        
        PDI mikeMentzer = new PDI("Mike Mentzer", "Gold's Gym", LocalDate.of(1951, 11, 15), 80000.0, "Entrenador en Jefe", LocalDate.of(2020, 2, 1), "Asociado", "Entrenamiento Alta Intensidad (Heavy Duty)", 15);

        CuentaAhorro ahorroGoku = new CuentaAhorro(500.0, "AH-DBZ-001", 10000.0); 
        
        CuentaCorriente cuentaSimi = new CuentaCorriente(150000.0, "CC-SIMI-100");

        goku.setCuentaBancaria(ahorroGoku);
        drSimi.setCuentaBancaria(cuentaSimi);

        System.out.println("--- REGISTRO ACADÉMICO ---");
        uamIztapalapa.registrarEstudiante(goku);
        uamIztapalapa.registrarEstudiante(axdeti);
        uamIztapalapa.contratarTrabajador(drSimi);
        uamIztapalapa.contratarTrabajador(mikeMentzer);

        System.out.println("\n--- ORDENAMIENTO DE DATOS ---");
        uamIztapalapa.ordenarEstudiantesPorNombre();

        System.out.println("\n--- SIMULACIÓN DE MÉTODOS ---");
        
        goku.inscribirMateria("Combate Cuerpo a Cuerpo I");
        System.out.println("Beca asignada a Goku: $" + goku.calcularBeca());
        
        axdeti.solicitarTitulacion();

        System.out.println("\n--- MOVIMIENTOS BANCARIOS ---");
        System.out.println("Saldo inicial Dr. Simi: $" + drSimi.getCuentaBancaria().consultarSaldo());
        drSimi.getCuentaBancaria().retirar(5000.0);
        drSimi.getCuentaBancaria().cobrarComision(); 
        
        goku.getCuentaBancaria().depositar(9000.0); 
        goku.getCuentaBancaria().calcularInteres(); 

        System.out.println("\n--- ESTADO FINAL DE LOS OBJETOS EN MEMORIA ---");
        System.out.println(goku.toString());
        System.out.println(axdeti.toString());
        System.out.println(drSimi.toString());
        System.out.println(mikeMentzer.toString());

        System.out.println("\n--- PRUEBA DE BÚSQUEDA RECURSIVA ---");
        
        int posGoku = uamIztapalapa.buscarEstudiante("Son Goku");
        System.out.println("Goku se encuentra en la posición: " + posGoku + " de la lista de estudiantes.");
        
        int posSimi = uamIztapalapa.buscarTrabajador("Dr. Simi");
        System.out.println("El Dr. Simi se encuentra en la posición: " + posSimi + " de la lista de trabajadores.");

        int posFantasma = uamIztapalapa.buscarEstudiante("Alumno Que No Existe");
        System.out.println("Buscando alumno fantasma... Resultado: " + posFantasma + " (No encontrado)");
        
    }
}