class Test{
	int a=10;
	int b=20;
	static int c=30;
    public static void main(String[] args){
		Test t1=new Test();
		 Test t2=new Test();
		 t2.c=300;
		 System.out.println(t1.a);
		 System.out.println(t2.b);
		 
		 System.out.println(Test.c);
		 System.out.println(t1.a+t1.b+t1.c);
		 System.out.println(t2.a+t2.b+t2.c);
   }
}	
		 
		 
		
	
	   