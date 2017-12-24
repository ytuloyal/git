/**
 * 
 */
package com.lab;
import java.util.*;

/**
 * @author sadikalgul
 *
 */
public class Lab1 extends GregorianCalendar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 Salary sal = new Salary("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);
	 Employee emp = new Salary("John Adams", "Boston, MA", 2, 2400.00);
	 sal.mailCheck();
	 emp.mailCheck();
		
	 int num = 1;	
     HashSet<Integer> hset = new HashSet<Integer>();
     hset.add(1);
     hset.add(2);
     hset.add(3);
     System.out.println(hset.size());
     while(hset.contains(num))
     {
    	 num++;
    			 
     }
     System.out.println(num);
     Iterator<Integer> iter = hset.iterator();
     while (iter.hasNext())
     {
    	 System.out.println("value" + iter.next());
    	
     }
     
     printData();
     Vector<Test> vTest = new Vector<Test>();
     vTest.add(new Test(4));
     vTest.add(new Test(5));
     vTest.add(new Test(8));
     System.out.println(vTest.size());
     Iterator<Test> iter2 = vTest.iterator();
     while (iter2.hasNext())
     {
    	 System.out.println("value" + iter2.next().value_1);
    	
     }
     
     Lab1 lb1 = new Lab1();
     try {
		lb1.finalize();
	} catch (Throwable e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
     
		
	}
	
	public static void printData()
	{
		 System.out.println("value");
	}

}
