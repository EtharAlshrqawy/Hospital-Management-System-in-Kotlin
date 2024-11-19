fun main() {
}
interface ObjectInterface{
    open fun genrated()
}
open class Person (
    private var name: String,
    private var address: String,
    private var phoneNumber: Long,
    private var age: Int
): ObjectInterface {
    override fun genrated(){
        print("welcome! $name")
    }
    fun personDetails() {
        println("Name is $name")
        println("Age: $age")
        println("Address: $address")
        println("Phone Number: $phoneNumber")
    }


}

class Patient(
    name: String,
    address: String,
    phoneNumber: Long,
    age: Int,
    private var medicalHistory: Boolean = false,
    private var allergies: Boolean = false,
    private var medications: String = "",
    private var bloodType: String = "",
) : Person(name, address, phoneNumber, age) {

    companion object {
        private var counter = 0
    }

    init {
        counter++
    }

    fun PatientDetails() {
        personDetails()
        println("Medical History: $medicalHistory")
        println("Allergies: $allergies")
        println("Medications: $medications")
        println("Blood Type: $bloodType")
    }

    fun PatientsNumb() {
        println("The total number of Patients is: $counter")
    }
}

open class Employee(
    private var id: String,
    name: String,
    address: String,
    phoneNumber: Long,
    age: Int,
    private var yearsOfExp: Int,
    private var salary: Long,
    private var department: String
) : Person(name, address, phoneNumber, age) {

    companion object {
        private var counter = 0
    }

    init {
        counter++
    }
        // Methods
        fun riseSalary(rise: Double) {
            this@Employee.salary += (salary * rise).toLong()
        }

        fun giveBonus(bonus: Double): Double {
            println("Bonus added: $bonus")
            println("Total Financial dues: ${bonus + salary}")
            return bonus + salary
        }
    }

    class Nurse(
        id: String,
        name: String,
        address: String,
        phoneNumber: Long,
        age: Int,
        yearsOfExp: Int,
        salary: Long,
        department: String,
        private var shift: String = "",
        private var floor: Int = 0
    ) : Employee(id, name, address, phoneNumber, age, yearsOfExp, salary, department) {

        companion object {
            private var counter = 0
        }
    }
