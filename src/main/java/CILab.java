public class CILab implements CILabInterface {
    private String myString;

    @Override
    public String getString() {
        return myString;
    }

    @Override
    public void setString(String string) {
        myString = string;
    }

    @Override
    public boolean detectCapitalUse() {
    	boolean result = false;
    	boolean isPreviousUpper = false;
        for (int i = 0; i < myString.length(); i++) {
        	if(i == 0 && myString[i].isUpperCase()) {
        		isPreviousUpper = true;
        	}
        	else if (i = 1 && !myString[i].isUpperCase()) {
        		isPreviousUpper = false;
        	}
        	else if(myString[i].isUpperCase()) {
        		if(isPreviousUpper) {
        			result = true;
        		}
        		else {
        			result = false;
        		}
        	}
        	else {
        		if(!isPreviousUpper) {
        			result = true;
        		}
        		else {
        			result = false;
        		}
        	}
        }
        return result;
    }

}

