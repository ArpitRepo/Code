package org.example;

import java.util.ArrayList;
import java.util.List;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
public class MergeTwoLists {

    /*This is related to a Linked List
    i/p:- 1->2->4  1->3->4
    O/p:- 1->1->2->3->4->4
     */

// Java Program to Concatenate Two List
// using addAll() method
    //THIS WILL WORK IF THE lists are sorted

        public static List<Integer> mergeLists(List<Integer> list1, List<Integer> list2) {
            List<Integer> mergedList = new ArrayList<>();
            int i = 0, j = 0;

            // Merge the lists while both lists have elements
            while (i < list1.size() && j < list2.size()) {
                int num1 = list1.get(i);
                int num2 = list2.get(j);

                if (num1 < num2) {
                    mergedList.add(num1);
                    i++;
                } else {
                    mergedList.add(num2);
                    j++;
                }
            }

            // Add remaining elements from list1
            while (i < list1.size()) {
                mergedList.add(list1.get(i));
                i++;
            }

            // Add remaining elements from list2
            while (j < list2.size()) {
                mergedList.add(list2.get(j));
                j++;
            }

            return mergedList;
        }

        public static void main(String[] args) {
            List<Integer> list1 = Arrays.asList(1, 3, 5, 7, 9);
            List<Integer> list2 = Arrays.asList(4, 1, 6, 8, 11);

            List<Integer> mergedList = mergeLists(list1, list2);
            System.out.println("Merged list: " + mergedList);
        }
    }
