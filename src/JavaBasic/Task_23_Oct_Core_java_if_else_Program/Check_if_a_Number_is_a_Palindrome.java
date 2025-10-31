package JavaBasic.Task_23_Oct_Core_java_if_else_Program;

import java.util.Scanner;

public class Check_if_a_Number_is_a_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to check if it is pallindrome or not");
       /* String num = sc.next();*/
        int number = sc.nextInt();
        int rev_number =0;

        /*Method 1 String */
        /*String rev_num = "" ;*/

        /*for (int i =num.length()-1;i>=0;i--)
        {
            rev_num = rev_num+ num.charAt(i);
        }
        System.out.println("reverse of entered string is:  "+rev_num);*/

        /*Method 2 String */
       /* String rev_num = new StringBuilder(num).reverse().toString();
*/
       /* if (num.equals(rev_num))
        {
            System.out.println("entered string is pallindrome");
        } else {
            System.out.println("string is not the pallindrome");
        }*/

        /* Method 3  - 156651 */
int orginial_number =number;
  while (number!=0 )
{
int digit = number%10;
 rev_number = rev_number *10+ digit;
    /*System.out.println(rev_number);*/
 number = number/10;
   /* System.out.println(number);*/
}
        if (orginial_number==rev_number)
        {
            System.out.println("entered number is pallindrome");
        } else {
            System.out.println("number is not the pallindrome");
        }
    }

}
