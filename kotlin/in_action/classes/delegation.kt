interface Printer {
    fun print()
}
class RealPrinter : Printer {
    override fun print() {
        println("Printing from RealPrinter")
    }
}
class PrinterImpl(realPrinter: Printer) : Printer by realPrinter
fun main() {
    val printer = PrinterImpl(RealPrinter())
    printer.print()
}