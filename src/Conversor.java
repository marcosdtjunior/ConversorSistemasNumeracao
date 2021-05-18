/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marcos Júnior
 */
public class Conversor 
{
    public static String decimalBinario(int num) 
    {
        String result = "";
        while (num >= 1) 
        {
            int resto = num % 2;
            num /= 2;
            result = resto + result;
        }
        return result;
    }

    public static String decimalHexa(int num) 
    {
        String result = "";
        while (num >= 1) 
        {
            int resto = num % 16;
            if (resto < 10)
                result = resto + result;
            else 
            {
                char hexa = Character.MIN_VALUE;
                switch (resto) 
                {
                    case 10:
                        hexa = 'A';
                        break;
                    case 11:
                        hexa = 'B';
                        break;
                    case 12:
                        hexa = 'C';
                        break;
                    case 13:
                        hexa = 'D';
                        break;
                    case 14:
                        hexa = 'E';
                        break;
                    case 15:
                        hexa = 'F';
                        break;
                }
                result = hexa + result;
            }
            num /= 16;
        }
        return result;
    }

    public static String decimalOctal(int num) 
    {
        String result = "";
        while (num >= 1) 
        {
            int resto = num % 8;
            num /= 8;
            result = resto + result;
        }
        return result;
    }
}
