package JavaBasic.Task_24October2025_if_Else;

import java.util.Scanner;

public class Q24_Determinet_Type_of_Website_Based_on_Domain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the domain name");
        String name = sc.next().toLowerCase();
        boolean containsDotCom = name.contains(".com");
        boolean containsDotOrg = name.contains(".org");
        boolean containsDotEdu = name.contains(".edu");
        boolean containsDotGov = name.contains(".gov");
        boolean containsDotNet = name.contains(".net");
        boolean containsDotInfo = name.contains(".info");

        if (containsDotCom==true) {
            System.out.println("The website type is: Commercial website");
        } else if (containsDotOrg==true) {
            System.out.println("The website type is: Non-profit organization");
        } else if (containsDotEdu==true) {
            System.out.println("The website type is: Educational institution");
        } else if (containsDotGov) {
            System.out.println("The website type is: Government website");
        } else if (containsDotNet) {
            System.out.println("The website type is: Network-related website");
        } else if (containsDotInfo) {
            System.out.println("The website type is: Informational website");
        }else {
            System.out.println("The website type is: Unknown or other types of websites");
    }
    }
}
