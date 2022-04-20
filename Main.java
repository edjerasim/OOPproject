package bg.tu_varna.sit;

public class Main {

    public static void main(String[] args) {
	RowsInt rowNum1 = new RowsInt(10);
    RowsInt rowNum2 = new RowsInt(11);
    RowsInt rowNum3 = new RowsInt(30);

    RowsStr rowsStr1=new RowsStr("Hello World");
    RowsStr rowsStr2=new RowsStr("How are you");


        System.out.println( rowNum1.toString() + rowNum2 + rowNum3);
        System.out.println(rowsStr1 + rowNum3.toString()+rowsStr2);


    }
}
