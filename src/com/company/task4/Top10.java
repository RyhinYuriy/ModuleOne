package com.company.task4;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;
import sun.awt.SunHints;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

import static javafx.scene.input.KeyCode.V;

public class Top10 {
    public static void main(String[] args) throws FileNotFoundException {
        Map<String, Integer> paswordsNumber = new HashMap<>();
        ValueComparator valComparator = new ValueComparator(paswordsNumber);
        TreeMap<String, Integer> sorted_map = new TreeMap(valComparator);
        String s = "";
        Scanner in = new Scanner(new File("D:\\Java A level\\Project\\ModuleFirst\\src\\com\\company\\task4\\paswords.txt"));
        while (in.hasNext())
            s += in.nextLine() + "\r\n";

        String[] a = s.split("\\s");
        //System.out.println(Arrays.toString(a));
        String[] pas = new String[a.length / 2];
        int j = 0;
        for (int i = 1; i < a.length; i++) {
            pas[j] = a[i];
            j++;
            i = i + 2;
        }
       // System.out.println(Arrays.toString(pas));

        for (int i = 0; i < pas.length; i++) {
            Integer frequency = paswordsNumber.get(pas[i]);
            paswordsNumber.put(pas[i], frequency == null ? 1 : frequency + 1);
        }
        paswordsNumber.remove(null);
       // System.out.println(paswordsNumber);

        sorted_map.putAll(paswordsNumber);

        System.out.println("Самые популярные пароли:");
        int count = 0;
        for (String key : sorted_map.keySet()) {
            count++;
            System.out.println(count + " пароль/количество повторов: " + key + "/" + sorted_map.get(key));
            if (count == 10) {
                return;
            }
        }
    }
}

class ValueComparator implements Comparator {

    Map base;

    public ValueComparator(Map base) {
        this.base = base;
    }

    public int compare(Object a, Object b) {

        if ((Integer) base.get(a) < (Integer) base.get(b)) {
            return 1;
        } else if ((Integer) base.get(a) == (Integer) base.get(b)) {
            return 0;
        } else {
            return -1;
        }
    }
}



