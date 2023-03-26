package Demo;

public class ClassDemo {
	//以下是该类的成员变量的声明
	String name;              //姓名
	String phoneNum;        //联系电话
	String email;             //E-mail
	String address;           //家庭住址
	//利用该类的构造方法为其成员变量赋值
	public ClassDemo(String name, String phoneNum, String email, String address) {
		this.name = name;
		this.phoneNum = phoneNum;
		this.email = email;
		this.address = address;
	}
	//定义该类的方法
	public void printMessage(){
		System.out.println("姓名:"+name);
		System.out.println("联系电话:"+phoneNum);
		System.out.println("电子邮箱地址:"+email);
		System.out.println("目前居住地址:"+address);
	}
	public static void main(String[] args){
		//用关键字new创建该类的实例化对象，为成员变量赋值
		ClassDemo cd =new ClassDemo("张明俊","19857856566","1992584620@nit.zju.edu.cn","浙江省宁波市鄞州区学府路1号浙大宁波理工学院");
		//调用方法
		cd.printMessage();
	}
}
	
	
