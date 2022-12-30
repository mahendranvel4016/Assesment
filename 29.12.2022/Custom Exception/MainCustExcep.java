class StudentExcep extends Exception{//StudentExcep class is custom exception
	static String[] name ={"Girija","Javeed","Naveen","Madahvan","Anbu","Santhosh"}; 
	static int studid[] = {202022,202027,202023,202025,202029,202028};
	static float marks[] = {89.78f,78.96f,82.34f,67.76f,73.45f,83.45f};
	static int attendance[] = {67,78,87,56,57,85};
	StudentExcep(String str){
		super(str);
	}
}
class MainCustExcep{
	public static void main(String... args){
		for(int i=0;i<StudentExcep.name.length;i++){
			try{
				if(StudentExcep.attendance[i]<60){
						throw new StudentExcep(StudentExcep.name[i]+" has attendance less than 60%");
				}
				System.out.println("Name : "+StudentExcep.name[i]+"\t"+" ID : "+StudentExcep.studid[i]+"\t"+" Marks : "+StudentExcep.marks[i]+" Attendance : "+"\t"+StudentExcep.attendance[i]);
			}catch(StudentExcep se){
				System.out.println(se.getMessage());
			}
		}
	}
}