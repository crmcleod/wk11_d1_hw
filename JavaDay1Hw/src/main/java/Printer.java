public class Printer {
    private int remainingSheets;
    private int toner;

    public Printer(int remainingSheets, int toner){
        this.remainingSheets = remainingSheets;
        this.toner = toner;
    }

    public int getRemainingSheets(){
        return this.remainingSheets;
    }

    public int getToner(){
        return this.toner;
    }

    public void print(int pages, int copies){
        if ((pages * copies) < remainingSheets) {
        this.remainingSheets = remainingSheets - (pages * copies);
        this.toner = toner - (pages * copies);}
        else {
        }
    }
}
