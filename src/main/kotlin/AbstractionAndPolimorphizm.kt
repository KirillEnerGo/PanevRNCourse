fun main() {
	val programmer1 = ProgrammerP("Kirill", 120000)
	programmer1.addProject("project1")

	val manager1 = ManagerP("Olga", 100000)
	manager1.addProject("project2")
	programmer1.printAllProjects()
	val employees = listOf<EmployeePolymorphizm>(programmer1, manager1)
	for (employee in employees)
		employee.addProject("general project")
}

abstract class EmployeePolymorphizm(
	// конструктор класса
	// поля класса
	val name: String,
	val salary: Int
)
{
	protected val projectsPolymorphizm: MutableList<String> = mutableListOf<String>()

	abstract fun addProject(projectName: String)

	fun printAllProjects(){
		println("Projects employee $name: ${projectsPolymorphizm.joinToString()}")
/*		for (project in projects)
			println(project)*/
	}
}

class ProgrammerP(name: String, salary: Int): EmployeePolymorphizm(name, salary)
{
	fun readArticle(articleName: String)
	{
		println("Programmer: ${name} read article about $articleName")
	}

	override fun addProject(projectName: String){
		projectsPolymorphizm.add(projectName)
		println("Programmist: ${name} begin work at $projectName")
	}
}

class ManagerP(name: String, salary: Int): EmployeePolymorphizm(name, salary)
{
	private val projects: MutableList<String> = mutableListOf<String>()
	fun callToClientInh(clientName: String)
	{
		println("Manager: ${name} call to client $clientName")
	}

	override fun addProject(projectName: String){
		projectsPolymorphizm.add(projectName)
		println("Manager: ${name} transfer work at $projectName to programmist")
	}
}