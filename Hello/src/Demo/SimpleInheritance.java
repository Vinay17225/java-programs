package Demo;

	 class Super {
		 int roll,marks;
		String name;
		 void input() {
			
			System.out.println("Enter roll name & marks:");
			}
	 }
		
	class Sub extends Super{
			void disp()
			{
				
				 roll = 123; 
				String name="Vinay";
				 marks=80;
				
				System.out.println(roll+" "+name+ " "+marks);
			}
		}
			
	 class SimpleInheritance{
		public static void main (String []args) {
			Sub obj=new Sub();
			obj.disp(); 
			obj.input();
			Super obj1=new Sub();
			obj1.input();
			
		}
		}
	



