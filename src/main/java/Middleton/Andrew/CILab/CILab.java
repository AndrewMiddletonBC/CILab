package Middleton.Andrew.CILab;

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
    	boolean firstLetterCapital;
    	if (myString.length() < 1) {
    		return true;
    	}
    	else {
    		firstLetterCapital = Character.isUpperCase(myString.charAt(0));
    	}
        boolean allLettersCapital = firstLetterCapital;
        boolean noOtherLettersCapital = true;
    	for (int i = 1; i < myString.length(); i++) {
    		if (!noOtherLettersCapital && !allLettersCapital) {
    			break;
    		}
    		else if (Character.isUpperCase(myString.charAt(i))) {
    			noOtherLettersCapital = false;
    		}
    		else {
    			allLettersCapital = false;
    		}
    	}
    	return (noOtherLettersCapital || allLettersCapital);
    }

}

