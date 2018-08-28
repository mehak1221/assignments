class Vehicle
{
  public void start()
  {
    System.out.println("vehicle Start ");
  }
  public void stop()
  {
    System.out.println("vehicle stop ");
  }
}
  class twowheeler extends Vehicle
  {
    public void start()
  {
    System.out.println("two wheeler start");
  }
  public void stop()
  {
    System.out.println("two wheeler Stops ");
  }
  }
  class fourwheeler extends Vehicle
  {
    public void start()
  {
    System.out.println("four wheeler Start ");
  }
  public void stop()
  {
    System.out.println("four wheeler Stop ");
  }
  }

class Main {
  public static void main(String[] args) {
    Vehicle v=new twowheeler();
    v.start();
    v.stop();
    v=new fourwheeler();
    v.start();
    v.stop();
       
  }
}
