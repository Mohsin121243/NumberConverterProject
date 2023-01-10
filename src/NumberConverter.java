public class NumberConverter {
    int[] digits;
    int base;

    int number;

    public NumberConverter(int number, int base) {
        String numberAsString = Integer.toString(number);
        this.number = number;
        digits = new int[numberAsString.length()];
        for (int i = 0; i < numberAsString.length(); i++) {
            String single = numberAsString.substring(i,i+1);
            int d = Integer.parseInt(single);
            digits[i] = d;
        }
        this.base = base;
    }

    public String displayOriginalNumber() {
        String o = "";
        for (int i = 0; i < digits.length; i++) {
            o = o + digits[i];
        }
        o = o + "\n";
        return o;
    }

    public int[] getDigits() {
        return digits;
    }

    public int convertToDecimal() {
        if(base == 8){
        int theBase = 0, pow = 0;
        int[] a = new int[Integer.toString(number).length()];

        for (int i = 0; i < Integer.toString(number).length(); i++) {
            a[i] = Integer.toString(number).charAt(i) - '0'; //Convert into int array
        }

        for (int i = a.length - 1 ; i >= 0 ; i--) {
            theBase += a[i] * Math.pow(8,pow); //Generalised formula for conversion
            pow++;
        }
            return theBase;
        }
        return 0;
    }

    public int[] convertToBinary() {
     return null;
    }
    public int[] convertToOctal()
    {
        return null;
}}
/*    if (base == 8) {
            int tempNumber = number;
            String stringTempNumber = Integer.toString(tempNumber);
            int x = 0;
            int resultLength;
            int result = 0;
            while(x!=stringTempNumber.length()-1){
             resultLength = Integer.parseInt(stringTempNumber.substring(stringTempNumber.length()-(x-1),stringTempNumber.length()-x));
            result = result + resultLength*(int)(Math.pow(8, (stringTempNumber.length()-x)));
            x++;
            }
            int[] finalValue = new int[(Integer.toString(result).length())];
            int z = 0;
            while(z != Integer.toString(tempNumber).length() ){
                String otherString = (Integer.toString(result)).substring(x,x+1);
                finalValue[z] = Integer.parseInt(otherString);

            }
            return finalValue; */