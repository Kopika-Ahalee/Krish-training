package com.krishtraining.mavensimple;

import java.util.Scanner;

public class App {
    public static void main( String[] args )
    {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers:");
		String input = sc.nextLine();
		String[] numSet = input.split(" ");
		
		int[] count = new int[numSet.length];
        for(int i=0; i< count.length ;i++)     
        {
            count[i]= Integer.parseInt(numSet[i]);
        }
        
        
        
        System.out.println(findNumber(count));
    }
    
	public static int findNumber(int[] nums) {
		int n = nums.length;
		int sum = ((n+1)*(n+2))/2;
		for(int i = 0; i<n;i++)
			sum-=nums[i];
			return sum;
	}
}
