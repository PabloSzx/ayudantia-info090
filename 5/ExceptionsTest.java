import java.util.*;

class ExceptionTest extends Exception{
	Object xd;
    public ExceptionTest(Object xd){
        this.xd = xd;
    }
}


class ExceptionTest2 extends Exception{
    private static final long serialVersionUID = 1L;
	Object xd;
    public ExceptionTest2(Object xd){
        this.xd = xd;
    }
}


public class ExceptionsTest{

    public static void xdxd() throws Exception {
        System.out.println("xdxd");
        throw new ExceptionTest("xdxd");
    }
    public static void main(String[] args) {
        try {
            Scanner keyboard = new Scanner(System.in);

            int a = keyboard.nextInt();

            if (a > 10) {
                throw new ExceptionTest("xd");
            } 

            
            xdxd();

        } catch (ExceptionTest e) {
            try {
                throw new ExceptionTest2("xd2");
            } catch (Exception e2) {
                System.out.println("xd2");
            }
        } 
        catch (Exception e) {
            System.out.println("exception e"); 
        
        }
        finally {
            System.out.println("finally");
        }


        try {
            int a[] = new int[2];
            System.out.println("Access element three :" + a[3]);
         } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown  :" + e);
         } catch (Exception e) {
            System.out.println("Not especificed exception caught!");
         }
         System.out.println("Out of the block");


    }
}