// interitance
 class Parent{
  public void m1(){
        System.out.println("parent class- m1 Method");
		}
		class child extends Parent{
		 public void m2(){
		  System.out.println("child class -m2 Method");
		  }
		  }
		  public static void main(String[] args){
			  Parent p = new Parent();
			  p.m1();
             // p.m2(); -> compile time error
			  
			//child c = new child();
             // c.m1();	
              Parent p1 = new child();
              p1.m1();			  
		     }
			 }
		 