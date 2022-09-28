public class FizzBuzz {
    public String playGame(String inputaData) {
        if(inputaData.equals('3')){
            return "Fizz";
        }
        if(inputaData.equals("5")){
            return "Buzz";
        }
        return inputaData;
    }
}
