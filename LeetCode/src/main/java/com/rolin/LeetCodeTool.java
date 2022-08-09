package com.rolin;

import java.util.*;

public class LeetCodeTool {

    public static int[] singleArr(String s){
        List<Integer> list = new ArrayList<>();
        s = s.substring(1,s.length()-1);
        String[] split = s.split(",");
        for (String s1:split) {
            list.add(Integer.parseInt(s1));
        }
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i]=list.get(i);
        }
        return arr;
    }

    public static List<List<String>> listString(String s){
        s = s.substring(1,s.length()-1);
        int len;
        List<List<String>> list = new ArrayList<>();
        List<String> list1 = new ArrayList<>();
        while (true){
            boolean judge = false;
            len=s.indexOf(']');
            String s1 = s.substring(s.indexOf('[')+1,len);
            if(len+2<s.length()){
                s = s.substring(len+2);
            }else {
                judge=true;
            }
            String[] split = s1.split(",");
            for (int i = 0; i < split.length; i++) {
                split[i]=split[i].substring(1,split[i].length()-1);
            }
            list1.addAll(Arrays.asList(split));
            list.add(list1);
            list1=new ArrayList<>();
            if(judge){
                break;
            }
        }
        return list;
    }

    //创建二维数组对象的方法
    public static int[][] doubleArr(String s){
        s = s.substring(1,s.length()-1);
        int len;
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        while (true){
            boolean judge = false;
            len=s.indexOf(']');
            String s1 = s.substring(s.indexOf('[')+1,len);
            if(len+2<s.length()){
                s = s.substring(len+2);
            }else {
                judge=true;
            }
            String[] split = s1.split(",");
            for (String value : split) {
                list1.add(Integer.parseInt(value));
            }
            list.add(list1);
            list1=new ArrayList<>();
            if(judge){
                break;
            }
        }
        int[][] ints = new int[list.size()][list.get(0).size()];
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                ints[i][j]=list.get(i).get(j);
            }
        }
        return ints;
    }

    //创建二维char数组对象的方法
    public static char[][] doubleCharArr(String s){
        s = s.substring(1,s.length()-1);
        int len;
        List<List<Character>> list = new ArrayList<>();
        List<Character> list1 = new ArrayList<>();
        while (true){
            boolean judge = false;
            len=s.indexOf(']');
            String s1 = s.substring(s.indexOf('[')+1,len);
            if(len+2<s.length()){
                s = s.substring(len+2);
            }else {
                judge=true;
            }
            String[] split = s1.split(",");
            for (String value : split) {
                list1.add(value.charAt(1));
            }
            list.add(list1);
            list1=new ArrayList<>();
            if(judge){
                break;
            }
        }
        char[][] ints = new char[list.size()][list.get(0).size()];
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                ints[i][j]=list.get(i).get(j);
            }
        }
        return ints;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
