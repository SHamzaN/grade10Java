package AP_1.NumberSystems;

import java.util.ArrayList;
import java.util.Arrays;

public class MathLab05st
{
    public static void main (String args[])
    {
        System.out.println("MathLab05 - Number Conversion Program\n\n");
// The next 2 lines are used in all versions.
        System.out.println("ABCD1234 Base-16 converts to " +
                BaseConverter.fromHexToBin("ABCD1234") + " in Base-2.\n");
        System.out.println("E12B47F5 Base-16 converts to " +
               BaseConverter.fromHexToBin("E12B47F5") + " in Base-2.\n");
// The next 2 lines are used in the 90-point versions and above.
 System.out.println("1011111011101111 Base-2 converts to " +
        BaseConverter.fromBinToDec("1011111011101111") + " in Base-10.\n");
 System.out.println("11100100100110110 Base-2 converts to " +
        BaseConverter.fromBinToDec("11100100100110110") + " in Base-10.\n");
// The next line is used in the 95-point versions and above.
 System.out.println("1011111011101111 Base-2 converts to " +
        BaseConverter.fromBinToHex("1011111011101111") + " in Base-16.\n");
// The next line is used in the 100-point versions and above.
 System.out.println("11100100100110110 Base-2 converts to " +
        BaseConverter.fromBinToHex("11100100100110110") + " in Base-16.\n");
// The next 3 lines are used in the 105 and 110-point versions.`
 System.out.println("1000 Base-10 converts to " +
        BaseConverter.fromDecToAny(1000,5) + " in Base-5.\n");
 System.out.println("1000 Base-10 converts to " +
        BaseConverter.fromDecToAny(1000,8) + " in Base-8.\n");
System.out.println("200 Base-10 converts to " +
        BaseConverter.fromDecToAny(200,2) + " in Base-2.\n");
// This last line is only used in the 110 point version.
 System.out.println("48879 Base-10 converts to " +
        BaseConverter.fromDecToAny(48879,16) + " in Base-16.\n");
     }
}
class BaseConverter
{
       public static String fromHexToBin(String hexNum)
    {
         String binNum = "";

        for(int i = 0; i < hexNum.length(); i++)
        {
            if(hexNum.charAt(i) == '0')
            {
                binNum += "0000";
            }

            else if(hexNum.charAt(i) == '1')
            {
                binNum += "0001";
            }

            else if(hexNum.charAt(i) == '2')
            {
                binNum += "0010";
            }
            else if(hexNum.charAt(i) == '3')
            {
                binNum += "0011";
            }
            else if(hexNum.charAt(i) == '4')
            {
                binNum += "0100";
            }
            else if(hexNum.charAt(i) == '5')
            {
                binNum += "0101";
            }
            else if(hexNum.charAt(i) == '6')
            {
                binNum += "0110";
            }
            else if(hexNum.charAt(i) == '7')
            {
                binNum += "0111";
            }
            else if(hexNum.charAt(i) == '8')
            {
                binNum += "1000";
            }
            else if(hexNum.charAt(i) == '9')
            {
                binNum += "1001";
            }
            else if(hexNum.charAt(i) == 'A')
            {
                binNum += "1010";
            }
            else if(hexNum.charAt(i) == 'B')
            {
                binNum += "1011";
            }
            else if(hexNum.charAt(i) == 'C')
            {
                binNum += "1100";
            }
            else if(hexNum.charAt(i) == 'D')
            {
                binNum += "1101";
            }
            else if(hexNum.charAt(i) == 'E')
            {
                binNum += "1110";
            }
            else if(hexNum.charAt(i) == 'F')
            {
                binNum += "1111";
            }
        }

        return binNum;
    }
    public static int fromBinToDec(String binNum)
    {
        int decNum = 0;
        int exponent = 0;

        for(int i = binNum.length()-1; i >= 0; i--)
        {
            if(binNum.charAt(i) == '1')
            {
                decNum += Math.pow(2,exponent);
            }
            exponent++;
        }   
        return decNum;
    }

    public static String fromBinToHex(String binNum)
    {
        String hexNum  = "";

        String[] hexArray = new String[binNum.length()/4];

        if(binNum.length() % 4 == 0)
        {
            for (int i = 1; i < binNum.length() + 1; i++)
            {
                hexNum += binNum.charAt(i-1);
                if(i % 4 == 0)
                {
                    hexArray[(i / 4) - 1] = hexNum ;    // i is binary index --> i / 4
                    hexNum  = "";
                }
            }
        }
        else
        {
            // make binName a bit-set as nibble-length or multiple of it
            int inputStringLength = binNum.length();
            if(inputStringLength < 4)
            {
                String inputAddedWithInsignificantZeros = getString(binNum, hexNum, inputStringLength);
                hexArray = new String[inputAddedWithInsignificantZeros.length()/ 4];
                hexArray[(inputAddedWithInsignificantZeros.length() / 4) - 1] = inputAddedWithInsignificantZeros;
            }
            else
            {
                // bitName-length is greater than 4
                String toNibble = "";
                int inputRemainder = binNum.length() % 4;

                String inputAddedWithInsignificantZeros = "";
                if(inputRemainder == 1)
                {
                    inputAddedWithInsignificantZeros = "000" + binNum;
                }
                else if (inputRemainder == 2)
                {
                    inputAddedWithInsignificantZeros ="00" + binNum;
                }
                else if(inputRemainder == 3)
                {
                    inputAddedWithInsignificantZeros = "0" + binNum;
                }

                hexArray = new String[inputAddedWithInsignificantZeros.length() / 4];

                for (int i = 1; i < inputAddedWithInsignificantZeros.length() + 1; i++)
                {
                    toNibble += inputAddedWithInsignificantZeros.charAt(i-1);
                    if(i % 4 == 0)
                    {
                        hexArray[(i / 4) -1] = toNibble;
                        toNibble = "";
                    }
                }
            }

        }
        hexNum = getString(hexNum, hexArray);
        return hexNum ;
    }

    private static String getString(String hexNum, String[] hexArray)
    {
        for (String s : hexArray)
        {
              if (s.equals("0001"))
            {
                hexNum += "1";
            } else if (s.equals("0010"))
            {
                hexNum += "2";
            } else if (s.equals("0011"))
            {
                hexNum += "3";
            } else if (s.equals("0100"))
            {
                hexNum += "4";
            } else if (s.equals("0101"))
            {
                hexNum += "5";
            } else if (s.equals("0110"))
            {
                hexNum += "6";
            } else if (s.equals("0111"))
            {
                hexNum += "7";
            } else if (s.equals("1000"))
            {
                hexNum += "8";
            } else if (s.equals("1001"))
            {
                hexNum += "9";
            } else if (s.equals("1010"))
            {
                hexNum += "A";
            } else if (s.equals("1011"))
            {
                hexNum += "B";
            } else if (s.equals("1100"))
            {
                hexNum += "C";
            } else if (s.equals("1101"))
            {
                hexNum += "D";
            } else if (s.equals("1110"))
            {
                hexNum += "E";
            } else if (s.equals("1111"))
            {
                hexNum += "F";
            }
        }
        return hexNum;
    }

    private static String getString(String binNum, String hexNum, int inputLength)
    {
        switch (inputLength)
        {
            case 1:
                hexNum = "000" + binNum;
                break;
            case 2:
                hexNum = "00" + binNum;
               break;
            case 3:
                hexNum = "0" + binNum;
                break;
        }
        return hexNum;
    }

    public static String fromDecToAny(int decNum, int desiredBase)
    {
        String newNum = "";


       while (decNum !=0)
       {
           int value = decNum % desiredBase;
           decNum /= desiredBase;
           newNum = lowIntValue(value) + newNum;
       }


        return newNum;
    }
    public static String lowIntValue(int convertanyalso16)
    {
        if (convertanyalso16 >=0 && convertanyalso16 < 10)
        {
            return "" + convertanyalso16;
        }
        switch (convertanyalso16)
        {
            case 10:
                return "A";
            case 11:
                return "B";
            case 12:
                return "C";
            case 13:
                return "D";
            case 14:
                return "E";
            case 15:
                return "F";
        }
     return " ";
    }
}