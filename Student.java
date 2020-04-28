public class Student{

	private String name;

	public void getName(String name){
		this.name = name;
	}

	public String getName(){
		return "student [name = "+this.name+"]";
	}
}
