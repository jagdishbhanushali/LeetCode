/**
 * Created by jagdish on 11/24/2016.
 * https://leetcode.com/problems/add-binary/
 */
public class AddBinaryString {
    public static void main(String args[]){
        String str1="10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101"
                ,str2="110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011";
        //String str1="11",str2="1";
        String resultString;
        /*Long binary1=Long.parseLong(str1,2);
        Long binary2=Long.parseLong(str2,2);
        System.out.println(binary1);
        System.out.println(binary2);
        Long binTotal=binary1+binary2;
        System.out.println(Long.toBinaryString(binTotal));
        System.out.println(Long.toBinaryString(Long.parseLong(str1,2)+Long.parseLong(str2,2)));*/
        int length1,length2;
        length1=str1.length();
        length2=str2.length();
        if (length1>length2){
            str2=extendSign(str2,length2,length1);
            length2=length1;
        }
        if(length2>length1) {
            str1 = extendSign(str1, length1, length2);
            length1=length2;
        }
        System.out.println(str1);
        System.out.println(str2);
        char[] str3=new char[length1];

        int temp,carry=0;
        for(int i=length1-1;i>=0;i--){
            temp=Character.getNumericValue(str1.charAt(i))+Character.getNumericValue(str2.charAt(i))+carry;
            if(temp>=2){
                carry=1;
                temp=temp-2;
            }else{
                carry=0;
            }
            str3[i]=Character.forDigit(temp,10);
        }
        if (carry != 0) {
            resultString="1"+String.copyValueOf(str3);
        }else
        {
            resultString=String.copyValueOf(str3);
        }
        System.out.println(resultString);
    }

    public static String extendSign(String str,int strLength,int targetLength){
        String extendedString="";
        //char firstCharOfBinaryStr=str.charAt(0);    --If binary is signed
        char firstCharOfBinaryStr='0';
        for(int i=0;i<targetLength-strLength;i++){
            extendedString=extendedString+firstCharOfBinaryStr;
        }
        return extendedString+str;
    }
}
