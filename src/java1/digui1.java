   
	 /**     
     * @discription 在此输入一句话描述此文件的作用
     * @author 软工1503班 霍星宇          
     * @created 2017年9月23日 下午6:29:56    
     * tags     
     * see_to_target     
     */
    
package java1;
import java.util.Scanner;

/**        
     * Title: digui1.java    
     * Description: 描述
     * @author 软工1503班 1508010325 白永兴       
     * @created 2017年9月23日 下午6:29:56    
     */

public class digui1 {

	/**     
	     * @discription 输入一个大于0的整数，按照n,2n,4n的顺序递增当大于5000时按照一定的顺序输出
	     * 例如
	     * 1237
	     * 2474
	     * 4948
	     * 9896
	     * 9896
	     * 4948
	     * 2474
	     * 1237
	     * @author 软工1503班 1508010325 白永兴        
	     * @created 2017年9月23日 下午6:29:56     
	     * @param args     
	     */


	public static void bai(int a)
	{
	 if(a/2<5000 & a >0)    //递归终止条件
	   {
		System.out.println(a);   //将符合条件的数按照顺序输出
		bai(2*a);
		System.out.println(a);   //将符合条件的数按照逆序输出
	   }
	}
   public static void main(String[] args)
   {
   // TODO Auto-generated method stub
   Scanner in =new Scanner(System.in);
   System.out.println("请输入一个大于0并且小于5000的整数：");  // 提示输入的整数必须大于0且小于5000
   int n = in.nextInt();
   bai(n);
   }
}
