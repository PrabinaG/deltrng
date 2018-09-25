class Welcome
{
 public void accept()
 {
  System.out.println("Welcome to ITPL");
 }
  public void display()
   {
    System.out.print("Welcome to Whitefield");
    System.out.println("\n Welcome to Nexwave");
   }
    static public void main(String args[])
     {
       System.out.println("\nWelcome to Bangalore");
        Welcome w= new Welcome();
        w.accept();
        w.display();
        World d=new World();
        d.heyWorld();
      }
}
        
   
