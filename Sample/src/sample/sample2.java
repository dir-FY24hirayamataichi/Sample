package sample;

import java.util.ArrayList;
import java.util.List;

public class sample2 {
    public static void main(String args[]) {
        
        List<String> list = new ArrayList<String>();
        
        // 取得
        for(int i=0; i<5; i++) {
            int d = (int)(Math.random() * 1000);
            list.add(Integer.toString(d));
        }
        for(String x: list) {
            System.out.print(x + " ");
        }
        System.out.println(" ");
        System.out.println(" ");
        
        System.out.println("■各場所名の長さを表示：");
        list.stream()
              .map(place -> place + " の長さ: " + place.length())
              .forEach(place -> System.out.println(place));
    
        System.out.println(" ");
        System.out.println("■ソート：");
        list.stream()
              .sorted()
              .forEach(place -> System.out.print(place + " "));
        
        // sortedを使ってソート
        System.out.println(" ");
        System.out.println("■ソート：");
        list.stream()
              .sorted()
              .forEach(place -> System.out.print(place + " "));
    }
}
