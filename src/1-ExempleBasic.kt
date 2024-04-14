fun main() {

    // Engeguem el bloc de notes
    val pb = ProcessBuilder("notepad.exe")
    var p: Process = pb.start()

    // Esperem a que es tanqui el bloc de notes abans de continuar
    p.waitFor()

    //Missatge final
    println("Programa finalitzat.")

}