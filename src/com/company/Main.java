package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < strings.size(); i++){
            if (strings.get(i).contains("р") && strings.get(i).contains("л")){
                list.add(strings.get(i));
            }
            if (strings.get(i).contains("р")){
                continue;
            }
            if (strings.get(i).contains("л") && !strings.get(i).contains("р")){
                list.add(strings.get(i));
                list.add(strings.get(i));
            }
            else {
                list.add(strings.get(i));
            }
        }
        return list;
    }
}
