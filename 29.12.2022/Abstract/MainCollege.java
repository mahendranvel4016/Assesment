abstract class College{
	int collId;
	String collName;
	College(String collName,int collId){
		this.collId = collId;
		this.collName = collName;
	}
	public abstract void department();
	public void display(){
		System.out.println("College Name : "+collName);
		System.out.println("College Id   : "+collId);
	}
}
class Anudip extends College{
	int noofstud;
	String department;
	Anudip(String collName,int collId,int noofstud,String department){
		super(collName,collId);
		this.noofstud = noofstud;
		this.department = department;
	}
	public void department(){
		System.out.println("Department : "+department);
		System.out.println("Number of students : "+noofstud);
	}
}
class MainCollege{
	public static void main(String... args){
		College col;
		col = new Anudip("Anudip",243567,60,"IT");
		col.display();
		col.department();
	}
}