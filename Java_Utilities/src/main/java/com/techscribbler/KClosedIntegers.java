package com.techscribbler;
ß
import java.util.*;

public class KClosedIntegers {

    public List<Integer> findClosestElements(int[] sortedArr, int k, int x) {
        List<DistanceComparator> distanceComparatorList = new ArrayList<>();
        int i=0;

        for(int index=0;index<sortedArr.length;index++){
            distanceComparatorList.add(new DistanceComparator(index,Math.abs(x-sortedArr[index]),sortedArr[index]));
        }
        Collections.sort(distanceComparatorList);
        List<Integer> res=new ArrayList<>();
        for(i=0;i<distanceComparatorList.size() && k>0 ;i++, k--){
                res.add(distanceComparatorList.get(i).value);
        }
        Collections.sort(res);

        return res;
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
