package bg.tu_varna.sit;

public class RowsInt {
    private int number;

    public RowsInt(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return number +
                " | ";
    }
}
