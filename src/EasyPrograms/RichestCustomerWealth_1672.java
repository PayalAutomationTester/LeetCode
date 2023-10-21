package EasyPrograms;

public class RichestCustomerWealth_1672 {

	public static void main(String[] args) {

        int[][] accounts ={{2,8,7},{7,9,1},{1,9,5}};
       
               
        int customer = maximumWealth(accounts);

        
        System.out.println("Richest customer with wealth is " + customer);
          
	}
	
    public static int maximumWealth(int[][] accounts) {
    	
    	 int highwealth=0;
         int wealth=0;
         int customer=0;
          for(int i=0;i<accounts.length;i++){
              wealth=0;
              for(int j=0;j<accounts[i].length;j++){
                    wealth = wealth + accounts[i][j];
                  
              }
              
              if(wealth>highwealth)
                  {
                  
                  highwealth=wealth;
                  customer=i+1;
              }
    }
	
          return customer;

}
}
