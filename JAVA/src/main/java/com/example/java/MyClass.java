package com.example.java;

import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int zero=0,one=0,two=0,three=0,four=0,five=0,six=0,seven=0,eight=0,nine=0;
            System.out.println("請輸入一串整數:");
            String in = scanner.nextLine();
            for (int i = 0; i < in.length(); i++) {
                switch (Integer.parseInt(String.valueOf(in.charAt(i)))) {
                    case 0 :
                        zero++;
                        break;
                    case 1:
                        one++;
                        break;
                    case 2:
                        two++;
                        break;
                    case 3:
                        three++;
                        break;
                    case 4:
                        four++;
                        break;
                    case 5:
                        five++;
                        break;
                    case 6:
                        six++;
                        break;
                    case 7:
                        seven++;
                        break;
                    case 8:
                        eight++;
                        break;
                    case 9:
                        nine++;
                        break;
                }
            }
            System.out.println("數字出現次數:\n0:"+zero+"次\n"+"1:"+one+"次\n"+"2:"+two+"次\n"+"3:"+three+"次\n"+"4:"+four+"次\n"+"5:"+five+"次\n"+"6:"+six+"次\n"+"7:"+seven+"次\n"+"8:"+eight+"次\n"+"9:"+nine+"次\n");

        }
    }
}
