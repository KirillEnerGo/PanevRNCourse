fun main() {
	val employee1 = Employee("Kirill", 170000)
	val employee2 = Employee("Olga", 100000)

	employee1.callToClient("Vasilyi")
	employee1.addProject("Project Z")
	employee1.addProject("Project Z part 2")
	employee1.addProject("Project Final revision")
	employee1.printAllProjects()
	println("-----------------------***********************-----------------------")
	employee2.callToClient("Oleg")
	employee2.addProject("Project Y")
	employee2.printAllProjects()
}

class Employee(
	// конструктор класса
	// поля класса
	val name: String,
	val salary: Int = 100000

)
{
	// тело класса
	private val projects: MutableList<String> = mutableListOf<String>()
	fun callToClient(clientName: String)
	{
		println("Employee: ${name} with salary ${this.salary} call to client $clientName")
	}

	fun addProject(projectName: String){
		projects.add(projectName)
		println("Employee: ${name} begin work at $projectName")
	}

	fun printAllProjects(){
		println("List of projects ${this.name}:")
		for (project in projects)
			println(project)
	}
}