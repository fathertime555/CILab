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
        	if(i == 0 && Character.isUpperCase(myString.charAt(i))) {
        		isPreviousUpper = true;
        	}
        	else if (i == 1 && !Character.isUpperCase(myString.charAt(i))) {
        		isPreviousUpper = false;
        	}
        	else if(Character.isUpperCase(myString.charAt(i))) {
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

