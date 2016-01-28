import java.util.Arrays;
import java.util.List;

public class StringManipulation {
    private String string;
    List vowels= Arrays.asList('a','e','i','o','u');

    public StringManipulation(String string) {
        this.string = string;
    }

    public String manipulateWithMommy() {
        int vowelCount = getVowelCount();
        if(vowelCount >= 0.3*string.length()){
            return insertMommy();
        }else{
            return string;
        }
    }

    private String insertMommy() {
        String resultString = "";
        boolean vowelFlag=false;
        for(int i=0;i<string.length();i++){
            if(vowels.contains(string.charAt(i))){
                vowelFlag=true;
            }else{
                if(vowelFlag){
                    resultString+="mommy";
                    vowelFlag=false;
                }
                resultString += string.charAt(i);
            }
        }
        if(vowelFlag)
            resultString+="mommy";
        return resultString;
    }

    private int getVowelCount() {
        int vowelCount = 0;
        for(int i=0; i<string.length();i++){
            if(vowels.contains(string.charAt(i))){
                vowelCount++;
            }
        }
        return vowelCount;
    }
}
