// constuctor
    class Product{
	 int Product_id;
	 String Product_Name;
	 Product(int  id, String Name){
	  this.Product_id = id;
	  this.Product_Name = Name;
	  }
	  public static void main(String[] args){
	     Product p1=new Product(101,"Iphone 5s");
		 Product p2=new Product(102,"google pixel 4A");
		 System.out.println(p1.Product_Name);
		 System.out.println(p2.Product_Name);
		 }
		 }
	  
	 