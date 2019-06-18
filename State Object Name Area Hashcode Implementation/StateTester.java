public class StateTester
{

   public static void main(String[] args)
   {
      //test equals
      State oregon = new State("Oregon", 98380);
      State california = new State("California", 163695);
      State other = new State("Oregon", 98380);
      System.out.println(oregon.equals(california));
      System.out.println("Expected: false");
      System.out.println(california.equals(oregon));
      System.out.println("Expected: false");
      System.out.println(oregon.equals(other));
      System.out.println("Expected: true");
      
      //test toString
      System.out.println(oregon);
      System.out.println("Expected: State[name=Oregon,area=98380]");
      System.out.println(california);
      System.out.println("Expected: State[name=California,area=163695]");
      
      //test hashCode
      System.out.println(oregon.hashCode());
      System.out.println("Expected: 458623497");
      System.out.println(california.hashCode());
      System.out.println("Expected: -2020934824");
      
      
      //testing bad parameters for equals
      System.out.println(oregon.equals("State"));
      System.out.println("Expected: false");
      System.out.println(oregon.equals(null));
      System.out.println("Expected: false");
   }

}