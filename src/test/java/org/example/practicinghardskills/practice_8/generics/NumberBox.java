package org.example.practicinghardskills.practice_8.generics;

import java.util.List;

public class NumberBox <T extends Number> {
    private List<T> nums;

    public NumberBox(List<T> nums){
        this.nums = nums;
    }

    public double sum(){
        double sum = 0;
        for (T element:nums){
            sum+=element.doubleValue();
        }
        return sum;
    }
}
