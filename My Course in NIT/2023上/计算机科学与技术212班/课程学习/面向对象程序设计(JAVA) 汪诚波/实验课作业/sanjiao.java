package yh;
public class sanjiao {

	public static void main(String[] args) {
		// ��һ��:������ά����
		int[][] arr=new int[10][21];
        // �ڶ���:����������ǵĹ���,�Զ�ά���������ֵ
		    //����һ�����м丳ֵ1
		    arr[0][10]=1;
		    for(int i=1;i< arr.length;i++){
		    	//ÿһ�дӵڶ�������ʼ�������ڶ�������,��Ϊ�����û�����ϵ�ֵ,���ұ�û�����ϵ�ֵ
		    	for(int j=1;j<arr[i].length-1;j++){
		    		//��������е�ֵ���������Ͻǵ�ֵ+���Ͻǵ�ֵ��
		    		arr[i][j]=arr[i-1][j-1]+arr[i-1][j+1];
		    	}
		    }
		//����������������������
		    //�ӵ�һ��һά���鿪ʼ
		    for(int i=0;i< arr.length;i++){
		    	//�����i��һά�����е�ֵ
		    	for(int j=0;j<arr[i].length;j++){
		    		//���ֵ��������ʱ,�������
		    		if(arr[i][j]!=0){
		    			System.out.print(arr[i][j]+"\t");
		    		//���ֵ������,�ÿո����
		    		}else{
		    			System.out.print(" \t");
		    		}
		    	}
		    	System.out.println();
		    }
	}

}
