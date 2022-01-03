fun main() {
	val robot1 = Robot(1)
	robot1.callToClientInh("Kirill")

	val manager1 = ManagerI("Olga", 100000)
	manager1.callToClientInh("Kirill")

	val programmist1 = ProgrammerI("Kirill", 250000)

	val clientWorkers = listOf<ClientWorker>(robot1, manager1)

	for (clientWorker in clientWorkers)
		clientWorker.callToClientInh("Kirill")
}

interface ClientWorker{
	fun callToClientInh(clientName: String)
	fun emailClient(clientName: String)
}

class Robot(val id: Int): ClientWorker{
	override fun callToClientInh(clientName: String)
	{
		println("Robot: ${id} call to client $clientName")
	}

	override fun emailClient(clientName: String) {
		println("Robot: ${id} send email to client $clientName")
	}
}

abstract class EmployeeInter(
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

class ProgrammerI(name: String, salary: Int): EmployeeInter(name, salary), ClientWorker
{
	fun readArticle(articleName: String)
	{
		println("Programmer: ${name} read article about $articleName")
	}

	override fun addProject(projectName: String){
		projectsPolymorphizm.add(projectName)
		println("Programmist: ${name} begin work at $projectName")
	}

	override fun callToClientInh(clientName: String) {
		println("Programmist: ${name} call to client $clientName")
	}

	override fun emailClient(clientName: String) {
		println("Programmist: ${name} send email to client $clientName")
	}
}

class ManagerI(name: String, salary: Int): EmployeeInter(name, salary), ClientWorker
{
	private val projects: MutableList<String> = mutableListOf<String>()
	override fun callToClientInh(clientName: String)
	{
		println("Manager: ${name} call to client $clientName")
	}

	override fun emailClient(clientName: String) {
		println("Manager: ${name} send email to client $clientName")
	}

	override fun addProject(projectName: String){
		projectsPolymorphizm.add(projectName)
		println("Manager: ${name} transfer work at $projectName to programmist")
	}
}