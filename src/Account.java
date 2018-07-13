 class Account1{ 
	 protected int getLocalCode(String value, boolean isValidated) 
	 {
		 return 1;
	 }
}
 
 public class Account extends Account1
 {
	 @Override 
	 private  int getLocalCode(String value, boolean isValidated)
	 {
		 return 1;
	 }
 }