package bg.tu_varna.sit;

public class RowsStr {
    private String number;

    public RowsStr(String number) {
        this.number = number;
    }

    public String getNumbers() {
        return number;
    }

    public void setNumbers(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return number +
                " | ";
    }
}
