package com.example.java;

import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int zero=0,one=0,two=0,three=0,four=0,five=0,six=0,seven=0,eight=0,nine=0;
            System.out.println("�п�J�@����:");
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
            System.out.println("�Ʀr�X�{����:\n0:"+zero+"��\n"+"1:"+one+"��\n"+"2:"+two+"��\n"+"3:"+three+"��\n"+"4:"+four+"��\n"+"5:"+five+"��\n"+"6:"+six+"��\n"+"7:"+seven+"��\n"+"8:"+eight+"��\n"+"9:"+nine+"��\n");

        }
    }
}
