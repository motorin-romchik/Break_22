public class Main {
    public static void main (String args[])
        throws java.io.IOException {
        boolean t = true;
        first: {
            second:{
                third:{
                    System.out.println("ПРедшествует оператору break");
                    if(t)
                        break second;//выход из второго
                    System.out.println("Error");
                }
                System.out.println("Error");
            }
            System.out.println("После блока second");
        }
    }
}
