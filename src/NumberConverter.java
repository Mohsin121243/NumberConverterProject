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

    public int[] convertToDecimal() {
        if (base == 8) {
            int x = 0;
            int tempNum = number;
            int[] output;
            while (tempNum != 0) {
                tempNum = (tempNum / 8) - (tempNum % 8);
                x = x + 1;

            }
            output = new int[x];
            int y = 0;
            while (tempNum != 0) {
                int z = tempNum % 8;
                tempNum = (tempNum / 8) - (z);
                output[x - y] = z;
                y++;
            }
            return output;
        }
        if (base == 2) {
            int x = 0;
            int tempNum = number;
            int[] output;
            while (tempNum != 0) {
                tempNum = (tempNum / 2) - (tempNum % 2);
                x = x + 1;

            }
            output = new int[x];
            int y = 0;
            while (tempNum != 0) {
                int z = tempNum % 2;
                tempNum = (tempNum / 2) - (z);
                output[x - y] = z;
                y++;
            }
            return output;

        }
        else return null;
    }

    public int[] convertToBinary() {
        int[] testArray = new int[5];
        if (base == 10) {
            int x = 0;
            int tempNum = number;
            int[] output;
            while (tempNum != 0) {
                tempNum = (tempNum / 2) - (tempNum % 2);
                x = x + 1;

            }
            output = new int[x];
            int y = 0;
            while (tempNum != 0) {
                int z = tempNum % 2;
                tempNum = (tempNum / 2) - (z);
                output[x - y] = z;
                y++;
            }
            return output;
        }
        else return testArray;
    }
    public int[] convertToOctal()
    {
        int[] testArray = new int[5];
        if (base == 10) {
            int x = 0;
            int tempNum = number;
            int[] output;
            while (tempNum != 0) {
                tempNum = (tempNum / 8) - (tempNum % 8);
                x = x + 1;

            }
            output = new int[x];
            int y = 0;
            while (tempNum != 0) {
                int z = tempNum % 8;
                tempNum = (tempNum / 8) - (z);
                output[x - y] = z;
                y++;
            }
            return output;
        }
        else return testArray;
}}
