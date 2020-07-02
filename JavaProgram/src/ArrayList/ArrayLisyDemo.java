package ArrayList;

	import java.util.ArrayList;

	public class ArrayLisyDemo {

		public static void main(String[] args) {
			
			// declare array list
			
		ArrayList list=new ArrayList();   // We can store any type of elements
//			ArrayList <String>list=new ArrayList <String>();
			
			// Adding value into arraylist
			list.add("bag");
			list.add("rack");
			list.add("rock");
			list.add("rocket");
			list.add('e');
		    list.add(12111) ;
			
			//size of array list
			System.out.println(list.size());
			System.out.println("before removing the elements"+list);
			
			//remove an element
			System.out.println(list.remove(3));
			System.out.println(list.size());
			System.out.println("After removing the elements"+list);
			
			//inserting the new elements into the array list
			list.add(3,"rats");
			System.out.println(list.size());
			System.out.println("After inserting the elements"+list);
			
			System.out.println();
			
			// read value from array list
		/*	for(String s:list)
			{
				System.out.println(s);
			}
			*/
			
			for(Object s:list)      //object type variable can hold and type of value
			{
				System.out.println(s);
			}
			
			
		}

	}


