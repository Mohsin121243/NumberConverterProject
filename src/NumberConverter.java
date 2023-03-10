public class NumberConverter {
    int[] digits;
    int base;
   public static int [] tester;

    int number;
    String stringNumber;

    public NumberConverter(String number, int base) {
        stringNumber = number;
        String numberAsString = number;
        if(base!=16){
        this.number = Integer.parseInt(number);}
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

    public int convertToDecimal() {
        int theNum = 0 ;
        if(base == 8){
        int pow = 0;
        int[] a = new int[Integer.toString(number).length()];

        for (int i = 0; i < Integer.toString(number).length(); i++) {
            a[i] = Integer.toString(number).charAt(i) - '0'; //Convert into int array
        }

        for (int i = a.length - 1 ; i >= 0 ; i--) {
            theNum += a[i] * Math.pow(8,pow); //Generalised formula for conversion
            pow++;
        }

        }
        if(base == 2){
            int pow = 0;
            int[] a = new int[Integer.toString(number).length()];

            for (int i = 0; i < Integer.toString(number).length(); i++) {

                a[i] = Integer.toString(number).charAt(i) - '0';
                if(a[i]==1 || a[i] == 0){
                    a[i] = Integer.toString(number).charAt(i) - '0';
                }
                else{
                    return 0;
                }
            }

            for (int i = a.length - 1 ; i >= 0 ; i--) {
                theNum += a[i] * Math.pow(2,pow); //Generalised formula for conversion
                pow++;
            }

        }
        if(base == 16){
            if(stringNumber == "A"){
                number = 10;
            } else if (stringNumber=="B") {
                number = 11;
            } else if (stringNumber == "C") {
                number = 12;
            } else if (stringNumber=="D") {
                number = 13;

            } else if (stringNumber=="E") {
                number = 14;
            } else if (stringNumber=="F") {
                number = 15;
            }
            else{
                number = Integer.parseInt(stringNumber);
            }
            if(number<=15 && number >= 10){
                return 0;
            }
            theNum = number;
        }
        int[] finalArray = new int[Integer.toString(theNum).length()];
        int temp = theNum;
        int i = finalArray.length - 1;
        while ( temp!= 0) {
            finalArray[i] = temp %10;
            temp /= 10;
            i--;
        }
        tester = finalArray;
        return theNum;

    }

    public int convertToBinary() {
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
        if(base == 16) {
            if(stringNumber == "A"){
                number = 10;
            } else if (stringNumber=="B") {
                number = 11;
            } else if (stringNumber == "C") {
                number = 12;
            } else if (stringNumber=="D") {
                number = 13;

            } else if (stringNumber=="E") {
              number = 14;
            } else if (stringNumber=="F") {
              number = 15;
            }
            else{
                number = Integer.parseInt(stringNumber);
            }
            if(number<=15 && number >= 10){
                return 0;
            }
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
        return binary;
    }
    public int convertToOctal()
    {
        int i = 0;
        int decimal = 0;
        int octal = 0;
        if (base == 2) {
            int theNum = NumberConverter.convertToDecimal(number,base);
            decimal = theNum;
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
        if(base == 16) {
            if(stringNumber == "A"){
                number = 10;
            } else if (stringNumber=="B") {
                number = 11;
            } else if (stringNumber == "C") {
                number = 12;
            } else if (stringNumber=="D") {
                number = 13;

            } else if (stringNumber=="E") {
                number = 14;
            } else if (stringNumber=="F") {
                number = 15;
            }
            else{
                number = Integer.parseInt(stringNumber);
            }
            if(number<=15 && number >= 10){
                return 0;
            }
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
        return octal;
}

        public String convertToHexaDecimal(){
            int theNum = 0 ;
            if(base == 8){
                int base10 = 0;
                for (int i = 0; i < Integer.toString(number).length(); i++) {
                    int digit = Character.getNumericValue(Integer.toString(number).charAt(i));
                    base10 = base10 * 8 + digit;
                }
                theNum = base10;
            }
            if(base == 2){
                int base10 = 0;
                for (int i = 0; i < Integer.toString(number).length(); i++) {
                    int digit = Character.getNumericValue(Integer.toString(number).charAt(i));
                    base10 = base10 * 2 + digit;
                }
                theNum = base10;
            }
        if(base == 10){
            String alternate ;
            if(number == 10){
                stringNumber = "A";
                alternate = stringNumber;
                return alternate;
            } else if (number==11) {
                stringNumber = "B";
                alternate = stringNumber;
                return alternate;
            } else if (number == 12) {
                stringNumber = "C";
                alternate = stringNumber;
                return alternate;
            } else if (number == 13) {
                stringNumber = "D";
                alternate = stringNumber;
                return alternate;

            } else if (number == 14) {
                stringNumber = "E";
                alternate = stringNumber;
                return alternate;
            } else if (number == 15) {
                stringNumber = "F";
                alternate = stringNumber;
                return alternate;

            }
            else{
                String[] digit = new String[digits.length];
                for(int i = 0; i<digits.length; i++){
                    digit[i] = Integer.toString(digits[i]);
                }
                return Integer.toString(number);
            }

        }

            String alternate ;
            if(theNum == 10){
                stringNumber = "A";
                alternate = stringNumber;
                return alternate;
            } else if (theNum==11) {
                stringNumber = "B";
                alternate = stringNumber;
                return alternate;
            } else if (theNum == 12) {
                stringNumber = "C";
                alternate = stringNumber;
                return alternate;
            } else if (theNum == 13) {
                stringNumber = "D";
                alternate = stringNumber;
                return alternate;

            } else if (theNum == 14) {
                stringNumber = "E";
                alternate = stringNumber;
                return alternate;
            } else if (theNum == 15) {
                stringNumber = "F";
                alternate = stringNumber;
                return alternate;

            }
            int[] finalArray = tester;
        String[] strArray = new String[finalArray.length];
            for (int z = 0; z < finalArray.length; z++) {
                strArray[z] = String.valueOf(finalArray[z]);
            }

        return Integer.toString(theNum);

    }


    public static int convertToDecimal(int number, int base) {
        int theNum = 0 ;
        if(base == 8){
            int pow = 0;
            int[] a = new int[Integer.toString(number).length()];

            for (int i = 0; i < Integer.toString(number).length(); i++) {
                a[i] = Integer.toString(number).charAt(i) - '0'; //Convert into int array
            }

            for (int i = a.length - 1 ; i >= 0 ; i--) {
                theNum += a[i] * Math.pow(8,pow); //Generalised formula for conversion
                pow++;
            }

        }
        if(base == 2){
            int pow = 0;
            int[] a = new int[Integer.toString(number).length()];

            for (int i = 0; i < Integer.toString(number).length(); i++) {

                a[i] = Integer.toString(number).charAt(i) - '0';
                if(a[i]==1 || a[i] == 0){
                    a[i] = Integer.toString(number).charAt(i) - '0';
                }
                else{
                    return 0;
                }
            }

            for (int i = a.length - 1 ; i >= 0 ; i--) {
                theNum += a[i] * Math.pow(2,pow); //Generalised formula for conversion
                pow++;
            }

        }

        int[] finalArray = new int[Integer.toString(theNum).length()];
        int temp = theNum;
        int i = finalArray.length - 1;
        while ( temp!= 0) {
            finalArray[i] = temp %10;
            temp /= 10;
            i--;
        }
        tester = finalArray;
        return theNum;

    }

    public String baseConverter(int decimal, int baseNum){
        String[] lowerCase = {"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","+","/"};

        int temp = decimal;
        int count = 0;
        for(int c = 0; temp!=0; c++){
            temp/=baseNum;
            count = c;
        }
        String[] returnArray = new String[count+1];
        int tester = (int)Math.pow(10, returnArray.length-2);

        if(returnArray.length==2 ){
            returnArray[0] = lowerCase[decimal/baseNum];
        }
        else {
            for(int a =0; a<count;a++) {
                int test = decimal;
                while(test>62){
                    test/=baseNum;
                    if(a==0){tester = test;}
                }
                returnArray[a] = lowerCase[test];
                if(a>=1){
                    int demo = decimal % (int)Math.pow(baseNum,a+1);
                    for(int y = 0; demo>baseNum;y++){
                        demo/=baseNum;
                    }
                    returnArray[a] = lowerCase[demo];
                }

            }
        }



        String lastDigit = lowerCase[decimal%baseNum];
        returnArray[returnArray.length-1] = lastDigit;
        String value = "";
        for(int v = 0 ; v< returnArray.length;v++){
            value = value + returnArray[v];
        }
        return value;

    }

    }






