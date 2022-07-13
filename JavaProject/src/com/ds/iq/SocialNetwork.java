package com.ds.iq;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class SocialNetwork {

	public static void main(String[] args) {
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        int value = 0;

        try {
            value = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        HashMap<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 2; i <= value + 1; i++) {

            List<Integer> list = new ArrayList<>();

            for (int j = 1; j * i <= value + 1; j++) {
                int tempValue = j * i;

                list.add(tempValue);

                if (i != tempValue) {
                    List<Integer> addedList = map.get(tempValue);

                    if (addedList == null) {
                        addedList = new ArrayList<>();
                    }

                    if (!addedList.contains(i)) {
                        addedList.add(i);
                        map.put(tempValue, addedList);
                    }
                }
            }

            List<Integer> currList = map.get(i);
            if (currList != null)
                currList.addAll(list);
            else
                currList = list;

            map.put(i, currList);
        }

        // Iterate through all elements of map

        Iterator<Entry<Integer, List<Integer>>> iterator = map.entrySet().iterator();

        List<Integer> visitedKeys = new ArrayList<>();

        List<Set<Integer>> listSet = new ArrayList<>();

        while (iterator.hasNext()) {
            Entry<Integer, List<Integer>> entry = iterator.next();
            Integer key = entry.getKey();
            List<Integer> keyValue = entry.getValue();

            if (visitedKeys.contains(key)) {
                continue;
            }

            Set<Integer> setItem = new HashSet<>();
            updateSet(key, keyValue, visitedKeys, map, setItem);

            listSet.add(setItem);
        }

        System.out.println("groups=" + listSet);
        System.out.println("Number of groups=" + listSet.size());
    }

    private static void updateSet(Integer key, List<Integer> keyValue, List<Integer> visitedKeys,
            HashMap<Integer, List<Integer>> map, Set<Integer> setItem) {

        for (Integer item : keyValue) {

            if (visitedKeys.contains(item)) {
                continue;
            }

            if (!item.equals(key)) {
                List<Integer> mapVal = map.get(item);
                if (mapVal != null) {
                    updateSet(item, mapVal, visitedKeys, map, setItem);
                }
            }

            visitedKeys.add(item);

            setItem.add(item);
        }
    }
}
