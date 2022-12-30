interface MyFunInter{
	default void show(){
		System.out.println("Displaying show method of interface");
	}
	static void print(){
		System.out.println("Displaying print method of interface");
	}
	void display(String str[]);
}
class MainMyFuncInter{
	public static void main(String... args){
		String [] str={"Biscuits","Soap","Shampoo","Washing powder","Chocolates"};
		MyFunInter mi = (a)->{
			for(String varname:a){
				System.out.print(varname+"\t");
			}
		};//Lamda expression
		mi.display(str);
		mi.show();
		MyFunInter.print();
	}
}