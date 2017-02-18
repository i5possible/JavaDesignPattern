package interpreter;

import java.util.Arrays;
import java.util.stream.Collectors;

public interface Musical {
    static Musical valueOf(String string) {
        if (Arrays.stream(Note.values()).map(Enum::name).collect(Collectors.toList()).contains(string)) {
            return Note.valueOf(string);
        }
        if (Arrays.stream(Scale.values()).map(Enum::name).collect(Collectors.toList()).contains(string)) {
            return Scale.valueOf(string);
        }
        if (Arrays.stream(Speed.values()).map(Enum::name).collect(Collectors.toList()).contains(string)) {
            return Speed.valueOf(string);
        }
        throw new IllegalArgumentException();
    }

    String play(Double value);
}
