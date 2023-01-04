class Ass28{
  public static void main(String[] args){
   int i=90001,reverse=0;
   while(i!=0){
    int remainder=i%10;
	reverse=reverse*10+remainder;
	i=i/10;
	}
	System.out.println("The given number is reverse:"+reverse);
	}
	}
	