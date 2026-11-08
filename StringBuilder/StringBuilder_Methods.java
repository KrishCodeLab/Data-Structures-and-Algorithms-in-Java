package StringBuilder;

import java.util.*;

public class StringBuilder_Methods {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder(100);
    // String Builder Methods
    System.out.println(sb);

    // append() : Add content at end of string,int,float,dobule,boolean,char
    sb.append("Krishna Govardhane !!! ");
    sb.append("Software Engineer at Google");
    System.out.println(sb);

    // insert() : Add content at a specific index
    sb.insert(0, "Python and Java Developer ");
    System.out.println(sb);

    // delete() : Delete characters within a range
    // sb.delete(start, end)
    sb.delete(0, 15);
    System.out.println(sb);

    // deletechar() : Delete specific char of specified index
    sb.deleteCharAt(30);
    System.out.println(sb);

    // replace() : Replace a particular range of char
    sb.replace(0, 11, "JavaDeveloper");
    System.out.println(sb);

    // reverse() : Reverse the complete string
    sb.reverse();
    System.out.println(sb);

    // charAt() : Returns char of specified index
    System.out.println(sb.charAt(6));

    // setCharAt() : Set char at specified index
    sb.setCharAt(0, 'K');
    System.out.println(sb);

    // length() : Returns length of string
    System.out.println("Length of stringBuilder is : " + sb.length());

    // capacity() : Returns capacity of stringBuilder if defined
    System.out.println(sb.capacity());
    System.out.println(sb);
    sc.close();
  }
}
