package com.xuguang;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class EctopicWords {

    public static void main(String[] args) {


    }

    // 字母异位词分组
    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hash = new HashMap<>();
        for (String str : strs) {
            char[] s_arr = str.toCharArray();
            Arrays.sort(s_arr);
            String key = String.valueOf(s_arr);
            if (hash.containsKey(key)) {
                hash.get(key).add(str);
            } else {
                List<String> temp = new ArrayList<String>();
                temp.add(str);
                hash.put(key, temp);
            }
        }
        return new ArrayList<List<String>>(hash.values());
    }
}
