import java.util.concurrent.TimeUnit

fun main() {

    try {
        // Executar el meu procés
        // IMPORTANT!!! No deixar cap espai extra!!!
        val pb = ProcessBuilder("java", "-jar", "C:\\Borrar\\M9_UF2_Demo_Multiproces.jar")
        pb.inheritIO()
        var p1: Process = pb.start()

        // Esperem a que es tanqui
        p1.waitFor()

        //Missatge final
        println("Programa finalitzat.")
    } catch (e: Exception) {
        println("Error: " + e.message)
    }

}