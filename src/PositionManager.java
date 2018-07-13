
public class PositionManager {
   private int horizontalPosition = 0;
   private int verticalPosition = 0;
   public PositionManager initialize() {
      horizontalPosition = verticalPosition = 1;
      return this;
   }
   public PositionManager andMoveRight(int horizontalDisplacement) {
      horizontalPosition += horizontalDisplacement;
      return this;
   }
   public PositionManager andMoveUp(int verticalDisplacement) {
      verticalPosition += verticalDisplacement;
      return this;
   }
   public PositionManager andPrintPosition() {
      switch (horizontalPosition % 2) {
      case 0:
         System.out.print("zoneA;");
         break;
      case 1:
         System.out.print("zoneB;");
         break;
      }
      switch (verticalPosition % 2) {
      case 0:
         System.out.print("zoneC;");
         break;
      case 1:
         System.out.print("zoneD;");
         break;
      }
      return this;
   }
   
   public static void main(String[] args) {
	    System.out.println("main 1");
	  }
	  public static void main() {
	    System.out.println("main 2");
	  }
	   
 
} 
