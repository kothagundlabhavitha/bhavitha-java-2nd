package Pizza;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Client {
	public static void main(String[] args) {
		HashMap<Integer,PizzaClass> pizza=new HashMap();
		int piid=1234-2345;
		while(true) {
			System.out.println("******Pizza Management Application*********");
			System.out.println("1.Add Pizza");
			System.out.println("2.Update Pizza");
			System.out.println("3.Get Pizza");
			System.out.println("4.Remove Pizza");
			System.out.println("5.GetAll pizzas");
			Scanner sc=new Scanner(System.in);
			int option=sc.nextInt();
			switch(option){
			case 1:
				System.out.println("*****Add pizza******");
				System.out.println("Enter Pizza name");
				String pname=sc.next();
				System.out.println("Enter pizza delivery addresss");
				String padd=sc.next();
				System.out.println("Enter type of the pizza");
				String ptype=sc.next();
				PizzaClass pc=new PizzaClass(piid, pname,padd,ptype);
				pizza.put(++piid,pc);
				System.out.println("pizza added successfully:"+piid);
				break;
			case 2:
				System.out.println("****Update Pizza******");
				System.out.println("Enter pizza id");
				int pid=sc.nextInt();
				System.out.println("Enter Pizza Name");
				String pnames=sc.next();
				System.out.println("Enter pizza delivery address");
				String paddress=sc.next();
				System.out.println("Enter type of pizza");
				String ptypes=sc.next();
				PizzaClass pc1=new PizzaClass(pid,pnames,paddress,ptypes);
				System.out.println("Pizza updated Sucessfully:"+pid);
				break;
			case 3:
				System.out.println("*****Get Added Pizza****");
				System.out.println("Enter Pizza ID");
				int pid1=sc.nextInt();
				PizzaClass pc2=pizza.get(pid1);
				System.out.println(pc2);
				break;
			case 4:
				System.out.println("****delted pizza******");
				System.out.println("Enter Pizza ID");
				int pid2=sc.nextInt();
				pizza.remove(pid2);
				System.out.println("pizza deleted successfully"+pid2);
				break;
			case 5:
				System.out.println("****GetAll Added Pizzas");
				Set<Entry<Integer,PizzaClass>> result=pizza.entrySet();
				Iterator<Entry<Integer,PizzaClass>> itr=result.iterator();
				while(itr.hasNext()) {
					Entry<Integer,PizzaClass> finalResult=itr.next();
					System.out.println(finalResult.getKey()+" "+finalResult.getValue());
				}
				break;
			default:
				System.out.println("OOPS..............Enter a valid option");
					
				}
			}
			}
			
		}
	


