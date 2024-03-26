
public class ArrayNumeri {
    public static void main(String[] args) throws Exception {

        try {
            int[] myNumbers = {11, 56, 6, 45};
            for (int num : myNumbers) {
                if (num < 0)
                    throw new Exception("error");
                System.out.println(num);
            }
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }

    }//end of main
}//end of class
