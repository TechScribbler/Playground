package com.techscribbler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class MedianOfSortIntegerArrays {
    public static void main(String[] args) {
        MedianOfSortIntegerArrays medianOfSortIntegerArrays=new MedianOfSortIntegerArrays();
        System.out.println(medianOfSortIntegerArrays.findMedianSortedArrays(new int[]{1,2},new int[]{3,4}));
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int res[]=new int[nums1.length+nums2.length];
        for(int i=0;i< nums1.length;i++){
            res[i]=nums1[i];
        }
        for(int j=0;j<nums2.length;j++){
            res[j+nums1.length]=nums2[j];
        }
        Arrays.sort(res);
        int mid=res.length/2;
        if(res.length%2==0){
            System.out.println(res[mid-1] +" "+res[mid]+" "+(res[mid-1]+res[mid])/2 );
            double val= (res[mid-1]+res[mid])/2.0;
            return val;
        }else{
            return  res[mid];
        }

    }
}
