package com.abhishek;

public class SonarTest {

    public static int globalVar; // code smell: unused public variable

    public void duplicateMethod() {
        int x = 1;
        int y = 2;
        int z = x + y; // fine
    }

    public void duplicateMethodCopy() {
        int x = 1;
        int y = 2;
        int z = x + y; // duplication
    }

    public void securityIssue() {
        String password = "123456"; // hard-coded secret
    }

    public void bugExample() {
        int a = 0;
        int b = 1 / a; // bug: division by zero
    }

    public void unusedMethod() { } // code smell: empty method
}

