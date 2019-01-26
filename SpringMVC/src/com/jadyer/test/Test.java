package com.jadyer.test;

import java.util.Arrays;

/**
 * 按照从大到小的顺序排列，通过冒泡排序算法实现
 * @author Carry
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		int[] arr = {12,34,21,89,56,2,75,11,99,32};
		int temp = 0;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				
			}
		}
		
		System.out.println(Arrays.toString(arr)+"****");

	}

}
