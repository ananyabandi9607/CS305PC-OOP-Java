package Student;
interface Operation{
	abstract void registration(Student std);
	abstract void logIn(String id,String password);
	abstract void exit();
}
