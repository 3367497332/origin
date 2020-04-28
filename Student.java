public class Student{

	private Integer sid;
	private String name;

	public void setSid(Integer sid){
		this.sid = sid;
	}

	public void setName(String name){
		this.name = name;
	}

	public Integer getSid(){
		return sid;
	}

	public String getName(){
		return "student [name = "+this.name+"]";
	}
}
