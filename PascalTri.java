publoc class Pascal {
  public static void main(String[] args) {
      System.out.println("How many rows is your pascal triangle?");
      int rows = console.nextInt();
      pascal(rows);
  }

  public static void pascal(int maxRows) {
		//prints the pacal traingle
		int r;
    int num;
		for (int i = 0; i <= maxRows; i++) {
	        	num = 1;
      	    r = i + 1;
   	     for (int col = 0; col <= i; col++) {
   	     	   if (col > 0) {
      	   	   num = num * (r - col) / col;    
         	   }
  	    System.out.print(num + " ");
   	     }
    System.out.println(); 
    }
  }
}
