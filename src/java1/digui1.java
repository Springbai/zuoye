   
	 /**     
     * @discription �ڴ�����һ�仰�������ļ�������
     * @author ��1503�� ������          
     * @created 2017��9��23�� ����6:29:56    
     * tags     
     * see_to_target     
     */
    
package java1;
import java.util.Scanner;

/**        
     * Title: digui1.java    
     * Description: ����
     * @author ��1503�� 1508010325 ������       
     * @created 2017��9��23�� ����6:29:56    
     */

public class digui1 {

	/**     
	     * @discription ����һ������0������������n,2n,4n��˳�����������5000ʱ����һ����˳�����
	     * ����
	     * 1237
	     * 2474
	     * 4948
	     * 9896
	     * 9896
	     * 4948
	     * 2474
	     * 1237
	     * @author ��1503�� 1508010325 ������        
	     * @created 2017��9��23�� ����6:29:56     
	     * @param args     
	     */


	public static void bai(int a)
	{
	 if(a/2<5000 & a >0)    //�ݹ���ֹ����
	   {
		System.out.println(a);   //������������������˳�����
		bai(2*a);
		System.out.println(a);   //�������������������������
	   }
	}
   public static void main(String[] args)
   {
   // TODO Auto-generated method stub
   Scanner in =new Scanner(System.in);
   System.out.println("������һ������0����С��5000��������");  // ��ʾ����������������0��С��5000
   int n = in.nextInt();
   bai(n);
   }
}
