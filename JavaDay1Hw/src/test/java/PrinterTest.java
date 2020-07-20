import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    private Printer printer;

    @Before
    public void before(){ this.printer = new Printer(100, 1000);}

    @Test
    public void hasPaper(){ assertEquals(100, printer.getRemainingSheets());}

    @Test
    public void canPrint(){
        printer.print(5,10);
        assertEquals(50, printer.getRemainingSheets());}

    @Test
    public void cantPrintIfPaperInsufficient(){
        printer.print(100, 10);
        assertEquals(100, printer.getRemainingSheets());
    }
    @Test
    public void tonerIsReducedByPages(){
        printer.print(13, 4);
        assertEquals(948, printer.getToner());
    }
}
