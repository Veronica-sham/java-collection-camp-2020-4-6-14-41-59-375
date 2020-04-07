package com.thoughtworks.collection;

import java.util.List;
import java.util.stream.Collectors;

public class Filter {

    List<Integer>  array;

    public Filter(List<Integer> array) {
     this.array = array;
    }

    public List<Integer> filterEven() {
        List<Integer> storeArray;
        storeArray = this.array;
        List<Integer> evenArr = null;
        evenArr = storeArray.stream().filter(element -> element%2 == 0).collect(Collectors.toList());
        return evenArr;
       // throw new NotImplementedException();

    }

    public List<Integer> filterMultipleOfThree() {
        List<Integer> storeArray;
        storeArray = this.array;
        List<Integer> canDivByThreeArr = null;
        canDivByThreeArr = storeArray.stream().filter(element -> element%3 == 0).collect(Collectors.toList());
        return canDivByThreeArr;
       // throw new NotImplementedException();
    }

    public List<Integer> getCommonElements(List<Integer> firstList, List<Integer> secondList) {
        List<Integer> commonElements = null;
        commonElements = firstList.stream().filter(element -> secondList.contains(element)).collect(Collectors.toList());
        return commonElements;
        //throw new NotImplementedException();
    }

    public List<Integer> getDifferentElements() {
        List<Integer> storeArray;
        storeArray = this.array;
        List<Integer> notCommonElements = null;
        notCommonElements = storeArray.stream().distinct().collect(Collectors.toList());
        return notCommonElements;
        //throw new NotImplementedException();
    }


}