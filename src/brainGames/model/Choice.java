package brainGames.model;

public enum Choice {

    EVEN("1"),
    CALC("2"),
    GCD("3"),
    PROGRESSION("4"),
    EXIT("0");

    public String value;

    Choice(String value) {
        this.value = value;
    }


    public static Choice getValue(String e) {
        for (Choice q : Choice.values()) {
            if (q.value.equals(e)) {
                return q;
            }
        }
        return null;
    }
}
