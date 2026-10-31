import atomictest.eq
fun main() {
    calculateBMI(160.0, 68.0) eq "Normal weight"
    calculateBMI(100.0, 68.0) eq "Underweight"
    calculateBMI(200.0, 68.0) eq "Overweight"
    calculateBMI(250.0, 68.0) eq "foo!"
}
fun calculateBMI(lbs: Double,height: Double ): String {
    val bmi = lbs / (height * height) * 703.07
    return if (bmi < 18.5) "Underweight"
    else if (bmi < 25) "Normal weight"
    else "Overweight"
}
/*
usage:
kotlinc atomictest/AtomicTest.kt bmi_test.kt 
kotlin Bmi_testKt
output:

Normal weight
Underweight
Overweight
Overweight
[Error]: Overweight != foo!
 */