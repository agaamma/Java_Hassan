public class EcezzioneVocali {
    public static void main(String[] args) throws Exception {
        String myString = "kpatsw";
        String vowels = "aieouAIEOU";
        boolean containsVowels = false;

        try{
            for (char c: myString.toCharArray()){
                if(vowels.contains(String.valueOf(c)))
               throw new Exception("error");
           Object brake;
            }//end of for
        } //end of try
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }


    }//end of main
}//end of class
