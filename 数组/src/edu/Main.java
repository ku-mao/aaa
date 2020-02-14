package edu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("请输入数组");
        Scanner s = new Scanner(System.in);
        String str = s.next();
        int length = Integer.parseInt(str);
        int nums[] = new int[length];
        for(int i = 0 ; i < length ; i++){
              nums[i] = s.nextInt();
        }
        System.out.println("请输入目标值：");
        Scanner s1 = new Scanner(System.in);
        int val = s1.nextInt();
        Remove remove = new Remove();
        remove.removeElement1(nums,val);
        remove.removeElement2(nums,val);

    }

}
