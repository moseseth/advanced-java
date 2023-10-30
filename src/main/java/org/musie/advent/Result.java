package org.musie.advent;

public class Result {
    private final int elfWithMaxCalories;
    private final int maxSum;

    public Result(int elfWithMaxCalories, int maxSum) {
        this.elfWithMaxCalories = elfWithMaxCalories;
        this.maxSum = maxSum;
    }

    public int getElfWithMaxCalories() {
        return elfWithMaxCalories;
    }

    public int getMaxSum() {
        return maxSum;
    }
}
