package solipath;

public class FizzBuzz{

	public String execute(int input) {
        String returnString = "";
        if(isDivibleBy3(input)){
            returnString += "Fizz";
        }
        if(isDivisibleBy5(input)){
            returnString += "Buzz";
        }
        if(returnString.equals("")){
            returnString = Integer.toString(input);
        }
        return returnString;
	}

    private boolean isDivisibleBy5(int input) {
        return input % 5 == 0;
    }

    private boolean isDivibleBy3(int input) {
        return input % 3 == 0;
    }
    
}