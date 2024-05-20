package tictactoe.models;

public class Pair<T, T1> {
    private final T Key;
    private final T1 Value;

    public Pair(T Key, T1 Value) {
        this.Key = Key;
        this.Value = Value;
    }

    public T getKey() {
        return Key;
    }

    public T1 getValue() {
        return Value;
    }

}
