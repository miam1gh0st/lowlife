package yh;
public class sanjiao {

	public static void main(String[] args) {
		// 第一步:创建二维数组
		int[][] arr=new int[10][21];
        // 第二步:根据杨辉三角的规律,对二维数组遍历赋值
		    //给第一行最中间赋值1
		    arr[0][10]=1;
		    for(int i=1;i< arr.length;i++){
		    	//每一行从第二个数开始到倒数第二个结束,因为最左边没有左上的值,最右边没有右上的值
		    	for(int j=1;j<arr[i].length-1;j++){
		    		//杨辉三角中的值等于它左上角的值+右上角的值。
		    		arr[i][j]=arr[i-1][j-1]+arr[i-1][j+1];
		    	}
		    }
		//第三步：遍历输出杨辉三角
		    //从第一个一维数组开始
		    for(int i=0;i< arr.length;i++){
		    	//输出第i个一维数组中的值
		    	for(int j=0;j<arr[i].length;j++){
		    		//如果值不等于零时,将它输出
		    		if(arr[i][j]!=0){
		    			System.out.print(arr[i][j]+"\t");
		    		//如果值等于零,用空格代替
		    		}else{
		    			System.out.print(" \t");
		    		}
		    	}
		    	System.out.println();
		    }
	}

}
