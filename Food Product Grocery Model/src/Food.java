
public class Food extends Product
{
   int carbs;
   public Food (String desc, double cost, int cars) {
      super(desc, cost);
      carbs = cars;
   }
   
   public void setCarbs(int grams) {
      carbs = grams;
   }
   
   public int getCarbs() {
      return carbs;
   }
   
   public boolean isLowCarb() {
      return (carbs <= 10);
   }
   @Override
   public String getDescription() {
      return (super.getDescription() + "  carbs=" + carbs);
   }
}
