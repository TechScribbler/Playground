package com.techscribbler;

import java.util.*;

public class KClosedIntegers {

    public static void main(String[] args) {
        KClosedIntegers kClosedIntegers=new KClosedIntegers();
        kClosedIntegers.findClosestElements(new int[]{1,2,3,4,5}, 4,-1);
    }

    public List<Integer> findClosestElements(int[] sortedArr, int k, int x) {

        int i=0;
        List<DistanceComparator> distanceComparatorList=new ArrayList<>();
        extracted(sortedArr, x,distanceComparatorList);
        List<Integer> res=new ArrayList<>();
        extracted(k, distanceComparatorList, res);
        return res;
    }

    private static void extracted(int k, List<DistanceComparator> distanceComparatorList, List<Integer> res) {
        int i;
        for(i=0; i< distanceComparatorList.size() && k >0 ; i++, k--){
                res.add(distanceComparatorList.get(i).value);
        }
        Collections.sort(res);
    }

    private static void extracted(int[] sortedArr, int x ,List<DistanceComparator> distanceComparatorList) {

        for(int index = 0; index< sortedArr.length; index++){
            distanceComparatorList.add(new DistanceComparator(index,Math.abs(x - sortedArr[index]), sortedArr[index]));
        }
        Collections.sort(distanceComparatorList);
    }
}
class DistanceComparator implements Comparable<DistanceComparator>{
    int index;
    int distance;
    int value;

    public void setDistance(int distance){
        this.distance=distance;
    }
    public void setIndex(int index){
        this.index=index;
    }
    public void setValue(int value){
        this.value=value;
    }
    public DistanceComparator get() {
        return this;
    }
    public DistanceComparator (int index, int distance, int value){
        setDistance(distance);
        setIndex(index);
        setValue(value);

    }

    @Override
    public int compareTo(DistanceComparator o) {
        return this.distance -o.distance ;
    }


}
