package interpreter;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String text = "T 500 O 2 E 0.5 G 0.5 A 3 E 0.5 G 0.5 D 3 E 0.5 " +
                "G 0.5 A 0.5 O 3 C 1 O 2 A 0.5 G 1 C 0.5 E 0.5 D 3";
        String[] strings = text.split(" ");
        List<Symbol> symbols = new ArrayList<>();
        for (int i = 0; i < strings.length / 2; i++) {
            symbols.add(new Symbol(Musical.valueOf(strings[i * 2]), Double.parseDouble(strings[i * 2 + 1])));
        }

        List<String> music = new ArrayList<>();
        symbols.forEach(symbol -> music.add(symbol.play()));

        music.forEach(System.out::println);
    }
}
