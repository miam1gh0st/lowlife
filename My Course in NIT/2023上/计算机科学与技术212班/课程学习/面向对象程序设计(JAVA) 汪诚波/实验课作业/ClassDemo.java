package Demo;

public class ClassDemo {
	//�����Ǹ���ĳ�Ա����������
	String name;              //����
	String phoneNum;        //��ϵ�绰
	String email;             //E-mail
	String address;           //��ͥסַ
	//���ø���Ĺ��췽��Ϊ���Ա������ֵ
	public ClassDemo(String name, String phoneNum, String email, String address) {
		this.name = name;
		this.phoneNum = phoneNum;
		this.email = email;
		this.address = address;
	}
	//�������ķ���
	public void printMessage(){
		System.out.println("����:"+name);
		System.out.println("��ϵ�绰:"+phoneNum);
		System.out.println("���������ַ:"+email);
		System.out.println("Ŀǰ��ס��ַ:"+address);
	}
	public static void main(String[] args){
		//�ùؼ���new���������ʵ��������Ϊ��Ա������ֵ
		ClassDemo cd =new ClassDemo("������","19857856566","1992584620@nit.zju.edu.cn","�㽭ʡ������۴����ѧ��·1�����������ѧԺ");
		//���÷���
		cd.printMessage();
	}
}
	
	
