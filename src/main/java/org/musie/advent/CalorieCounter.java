package org.musie.advent;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class CalorieCounter {

    public static void main(String[] args) {
        String inventory = "elfsinventory.txt";

        // Task 1
        Map<Integer, List<Integer>> foodItemPerElf = readInventory(inventory);
        Result result = findElfWithMaxCalories(foodItemPerElf);
        printMaxCalories(result);

        // Task 2
        List<Integer> topThreeElves = findTopNElvesWithMostCalories(foodItemPerElf, 3);
        int totalCaloriesOfTopThree = topThreeElves.stream()
                .mapToInt(elfNumber -> foodItemPerElf.get(elfNumber)
                        .stream()
                        .mapToInt(Integer::intValue)
                        .sum())
                .sum();
        System.out.println("Total Calories carried by the top three Elves: " + totalCaloriesOfTopThree);

    }

    private static Map<Integer, List<Integer>> readInventory(String filePath) {
        Map<Integer, List<Integer>> foodItemPerElf = new HashMap<>();
        List<Integer> items = new ArrayList<>();
        int currentElf = 1;

        try (var reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.trim().isEmpty()) {
                    if (!items.isEmpty()) {
                        foodItemPerElf.put(currentElf, items);
                        items = new ArrayList<>();
                        currentElf++;
                    }
                } else {
                    int value = Integer.parseInt(line);
                    items.add(value);
                }
            }
            if (!items.isEmpty()) {
                foodItemPerElf.put(currentElf, items);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return foodItemPerElf;
    }

    private static Result findElfWithMaxCalories(Map<Integer, List<Integer>> foodItemPerElf) {
        int maxSum = Integer.MIN_VALUE;
        int elfWithMaxCalories = -1;

        for (int elf : foodItemPerElf.keySet()) {
            List<Integer> items = foodItemPerElf.get(elf);
            int sum = items.stream()
                    .mapToInt(Integer::intValue)
                    .sum();

            if (sum > maxSum) {
                maxSum = sum;
                elfWithMaxCalories = elf;
            }
        }

        return new Result(elfWithMaxCalories, maxSum);
    }

    private static List<Integer> findTopNElvesWithMostCalories(Map<Integer, List<Integer>> foodItemPerElf, int topN) {
        return foodItemPerElf.keySet().stream()
                .sorted(Comparator.comparingInt(elf -> -foodItemPerElf.get(elf)
                        .stream()
                        .mapToInt(Integer::intValue)
                        .sum()))
                .limit(topN)
                .collect(Collectors.toList());
    }

    private static void printMaxCalories(Result result) {
        if (result.getElfWithMaxCalories() != -1) {
            System.out.println("Elf with maximum calories was: Elf " + result.getElfWithMaxCalories());
            System.out.println("Maximum Sum of calories was: " + result.getMaxSum());
        }
    }
}

