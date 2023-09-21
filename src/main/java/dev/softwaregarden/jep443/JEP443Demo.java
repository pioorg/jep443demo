package dev.softwaregarden.jep443;


/*
 You may also try to run this using
 java --enable-preview --source 21 JEP443Demo.java
 */
public class JEP443Demo
{
    public static void main(String[] args) {
        String s = "abc";
        try {
            int i = Integer.parseInt(s);
            System.out.println("Parsed " + i);
        } catch (NumberFormatException _) {
            System.out.println("Bad number: " + s);
        }
    }
}
