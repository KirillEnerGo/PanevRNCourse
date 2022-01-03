fun main() {
	val programmer1 = Programmer("Kirill" , 350000)
//	programmer1.readArticle("article1")
//	programmer1.name
//	programmer1.salary
	programmer1.addProject("project1")
	programmer1.addProject("project2")
//	programmer1.printAllProjects()

	val programmer2 = Programmer("Oleg", 200000)
	programmer2.addProject("project 3")
	programmer2.addProject("project 4")
	val manager1 = Manager("Olga", 100000)
	manager1.addProject("project 6")

	val employees = listOf<EmployeeInheritance>(programmer1, programmer2, manager1)

	for (employee in employees)
		employee.addProject("General project")
	for (employee in employees)
		employee.printAllProjects()
}

open class EmployeeInheritance(
	// конструктор класса
	// поля класса
	val name: String,
	val salary: Int
)
{
	private val projects: MutableList<String> = mutableListOf<String>()

	fun addProject(projectName: String){
		projects.add(projectName)
		println("Employee: ${name} begin work at $projectName")
	}

	fun printAllProjects(){
		println("Projects employee $name: ${projects.joinToString()}")
/*		for (project in projects)
			println(project)*/
	}
}

class Programmer(name: String, salary: Int): EmployeeInheritance(name, salary)
{
	fun readArticle(articleName: String)
	{
		println("Programmer: ${name} read article about $articleName")
	}
}

class Manager(name: String, salary: Int): EmployeeInheritance(name, salary)
{
	private val projects: MutableList<String> = mutableListOf<String>()
	fun callToClientInh(clientName: String)
	{
		println("Manager: ${name} call to client $clientName")
	}
}