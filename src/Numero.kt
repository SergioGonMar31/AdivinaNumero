import utiles.Depurar

class Numero(val numeroSecreto: Int = (1..100).random(), var completado: Boolean = false, var intentos: Int=0) {

    fun comenzar() {
        do {
            intentos++
            var intento = Depurar.leerInt("Introduce un número entre 1 y 100: ")
            if (intento < 1 || intento > 100) {
                println("Debe introducir un número entre 1 y 100.")
            } else {
                completado = resultado(intento)
            }
        } while (!completado)
    }


    fun resultado(numero: Int): Boolean {
        if (numero > numeroSecreto) {
            println("El número "+numero+" es mayor que el número secreto")
        return false
        } else if (numero < numeroSecreto) {
            println("El número "+numero+" es menor que el número secreto")
        return false
        } else {
            println("ENHORABUENA. El número secreto era: "+numeroSecreto)
            println("Te ha tomado "+intentos+" intentos")
            return true
        }
    }
}