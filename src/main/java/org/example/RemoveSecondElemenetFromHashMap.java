package org.example;
import java.util.HashMap;
import java.util.Map;
public class RemoveSecondElemenetFromHashMap {

    public static void main(String[] args) {
        // Create a HashMap
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(1, 100);
        hashMap.put(2, 400);
        hashMap.put(3, 600);
        hashMap.put(4, 400);
        hashMap.put(5, 500);

        // Find the maximum and second maximum values
        int max = 0;
        int secondMax = 0;

        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            int value = entry.getValue();
            if (value > max) {
                secondMax = max;
                max = value;
            }
            else if (value > secondMax && value != max) {
                secondMax = value;
            }
        }

        // Remove the element corresponding to the second maximum value
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue() == secondMax) {
                hashMap.remove(entry.getKey());
                break; // Exit loop after removing the element
            }
        }

        // Print the updated HashMap
        System.out.println("Updated HashMap after removing second highest element:");
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
