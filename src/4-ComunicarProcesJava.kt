import java.io.InputStream
import java.util.*


fun main() {

    try {
        // Executar el meu procés
        val pb = ProcessBuilder("java", "-jar", "C:\\Borrar\\M9_UF2_Demo_Multiproces.jar")
        var p1: Process = pb.start()

        val input: InputStream = p1.inputStream
        val sc: Scanner = Scanner(input)
        while (sc.hasNext()) {
            System.out.println(sc.nextLine())
        }

        // Esperem a que es tanqui
        p1.waitFor()

        //Missatge final
        println("Programa finalitzat.")
    } catch (e: Exception) {
        println("Error: " + e.message)
    }

}