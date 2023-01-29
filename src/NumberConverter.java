public class NumberConverter {
    int[] digits;
    int base;
    boolean checker;

    int number;

    public NumberConverter(int number, int base) {
        String numberAsString = Integer.toString(number);
        this.number = number;
        this.base = base;
        digits = new int[numberAsString.length()];
        for (int i = 0; i < numberAsString.length(); i++) {
            String single = numberAsString.substring(i,i+1);
            int d = Integer.parseInt(single);
            digits[i] = d;
            }

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

    public int[] convertToDecimal() {
        int theBase = 0 ;
        if(base == 8){
        int pow = 0;
        int[] a = new int[Integer.toString(number).length()];

        for (int i = 0; i < Integer.toString(number).length(); i++) {
            a[i] = Integer.toString(number).charAt(i) - '0'; //Convert into int array
        }

        for (int i = a.length - 1 ; i >= 0 ; i--) {
            theBase += a[i] * Math.pow(8,pow); //Generalised formula for conversion
            pow++;
        }

        }
        if(base == 2){
            if(checker == false){
                return null;
            }
            int pow = 0;
            int[] a = new int[Integer.toString(number).length()];

            for (int i = 0; i < Integer.toString(number).length(); i++) {
                a[i] = Integer.toString(number).charAt(i) - '0'; //Convert into int array
            }

            for (int i = a.length - 1 ; i >= 0 ; i--) {
                theBase += a[i] * Math.pow(2,pow); //Generalised formula for conversion
                pow++;
            }

        }
        int[] finalArray = new int[Integer.toString(theBase).length()];
        int temp = theBase;
        int i = finalArray.length - 1;
        while ( temp!= 0) {
            finalArray[i] = temp %10;
            temp /= 10;
            i--;
        }
        return finalArray;

    }

    public int[] convertToBinary() {
        int i = 0;
        int decimal = 0;
        int binary = 0;
        if (base == 8) {
            while (number != 0) {
                decimal += (number % 10) * Math.pow(8, i);
                ++i;
                number /= 10;
            }

            i = 1;

            while (decimal != 0) {
                binary += (decimal % 2) * i;
                decimal /= 2;
                i *= 10;
            }


        }
        if (base == 10) {
            decimal = number;
            i = 1;
            while (decimal != 0) {
                binary += (decimal % 2) * i;
                decimal /= 2;
                i *= 10;
            }


        }
        int[] finalArray = new int[Integer.toString(binary).length()];
        int temp = binary;
        int counter = finalArray.length - 1;
        while (temp != 0) {
            finalArray[counter] = temp % 10;
            temp /= 10;
            counter--;

        }
        return finalArray;
    }
    public int[] convertToOctal()
    {
        int i = 0;
        int decimal = 0;
        int octal = 0;
        if (base == 2) {
            while (number != 0) {
                decimal += (number % 10) * Math.pow(8, i);
                ++i;
                number /= 10;
            }

            i = 1;

            while (decimal != 0) {
                octal += (decimal % 8) * i;
                decimal /= 8;
                i *= 10;
            }


        }
        if (base == 10) {
            decimal = number;
            i = 1;
            while (decimal != 0) {
                octal += (decimal % 8) * i;
                decimal /= 8;
                i *= 10;
            }


        }
        int[] finalArray = new int[Integer.toString(octal).length()];
        int temp = octal;
        int counter = finalArray.length - 1;
        while (temp != 0) {
            finalArray[counter] = temp % 10;
            temp /= 10;
            counter--;

        }
        return finalArray;
}}

