public class Introduction {
    double rand;


    // declaring variable/attribute type outside the method won't work
    //unless you get a parameter and pass the value of the parameter variable
    //to the attribute

    //using void main method/function : recommended
  public static void main(String[] args) {
       double rand = Math.random();
       System.out.println("" + rand);
   }


    // using constructor
    /*
    public Introduction(double rando) {
        this.rand = rando;
        System.out.println("" + this.rand);
    }
     */




}