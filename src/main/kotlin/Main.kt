fun main(args: Array<String>) {

    var cuenta1 = CuentaBancaria("david", 100000.00)
    var cuenta2 = CuentaBancaria("Jose")
    var cuenta3 = CuentaBancaria()

    var salir : Char = ' '




    do {
        println("qué operación deseas realizar \n " +
                "\t 1. depositar \n" +
                "\t 2. retirar \n" +
                "\t 3. obtener saldo \n")

        var opcion = readln().toInt()

        when(opcion){
            1 -> meterDineroSaldo(cuenta1)
            2 -> sacarDineroSaldo(cuenta1)
            3 -> imprimirSaldo(cuenta1)

         //   3 -> println("su saldo es ${cuenta1.getOptenerSaldo()}")
        }
        println("desea salir abandonar este menu sí= 'Y' y no = 'N'")
        salir = readln().uppercase().get(0)

    }while (salir == 'N')


}

fun meterDineroSaldo(cuenta:CuentaBancaria){

    println("cuánto dinero quiere depositar")
    var deposito =  readln().toDouble()

    cuenta.depositar(deposito)

}

fun sacarDineroSaldo(cuenta:CuentaBancaria){


    println("cuanto dinero desea retirar")
    var retiro = readln().toDouble()
    var respuestaRetiro = cuenta.retirar(retiro)

    if (respuestaRetiro == true){
        println("operación realizada")
    }else{
        println("no tiene saldo suficiente")
    }


}

fun imprimirSaldo(cuenta: CuentaBancaria){

    println("su saldo es ${cuenta.getOptenerSaldo()}")

}

