import java.util.concurrent.TimeUnit

fun main() {

    // Engeguem el bloc de notes
    val pb = ProcessBuilder("notepad.exe")
    var p1: Process = pb.start()

    // Cambiem la comanda per engegar la calculadora
    pb.command("calc.exe")
    var p2:Process = pb.start()

    // Esperem a que es tanqui el notepad abans de continuar
    // (amb la calculadora no funciona bé en Windows
    p1.waitFor()
    //p2.waitFor()

    //Missatge final
    println("Programa finalitzat.")

}