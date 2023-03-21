class CuentaBancaria {

    private var titular : String = ""
    private var saldo : Double = 0.0

    constructor(titular: String, saldo: Double) {
        this.titular = titular
        this.saldo = saldo
    }

    constructor(){
        this.titular = ""
        this.saldo = 0.0
    }

    constructor(titular: String){
        this.titular = titular
    }

    fun depositar(deposito:Double){
        /*agregar la cantidad espcificada al sado*/

        this.saldo += deposito

    }

    fun retirar (retiro:Double):Boolean{
        /*este métido quita dinero del saldo comprobando que hay dinero si no hay tiene que salir un mensaje*/

        var respuetaRetiro = false

        if (this.saldo >= 0.0){
            val retiro1 = retiro
            this.saldo = this.saldo - retiro1
            respuetaRetiro = true
        }else
            respuetaRetiro = false

        return respuetaRetiro


    }

    fun getOptenerSaldo():Double{
        /*obitiene el saldo*/
        return this.saldo

    }

    fun getSaldo():Double{
        return this.saldo
    }

    fun setSaldo(saldo:Double){
        this.saldo = saldo
    }

    override fun toString(): String {
        return "CuentaBancaria(titular='$titular', saldo=$saldo)"
    }


}