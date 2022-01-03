import java.lang.Exception
import java.lang.NumberFormatException

fun main() {
	val aString = "10"
	val b = 0
	try {
		val a = aString.toInt()
		val result = a / b
		println(result)
	}catch (e: ArithmeticException){
		println("Произошла арифметическая ошибка : ${e.toString()}")
	}catch (e: NumberFormatException){
		println("Произошла ошибка формата: ${e.toString()}")
	}catch (e: Exception){
		println("Произошла ошибка: ${e.toString()}")
	}


	var login = "login"
	var pass = "password"
	var confirmPass = "pass"
//	signIn(login, pass, confirmPass)
	try {
		signIn(login, pass, confirmPass)
	}catch (e: Exception){
		println(e.message)
	}
}

fun signIn(login: String, password: String, confirmPassword: String){
	if (login.length > 20)
		throw Exception("Логин слишком длинный")

	if (password.length < 10)
		throw Exception("Пароль слишком короткий")

	if (password != confirmPassword)
		throw Exception("Пароль и подтверждение не совпадают")
}