import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PrinterTest {
    Printer myPrinter;

    @Before
    public void before() {
        myPrinter = new Printer(100, 110);
    }

    @Test
    public void getPaperOnStock() {
        assertEquals(100, myPrinter.getPaperOnStock());
    }

    @Test
    public void getTonerVolume() {
        assertEquals(110, myPrinter.getTonerVolume());
    }

    @Test
    public void printingPaper__enoughPaperAndToner() {
        myPrinter.printingPaper(10, 9);
        assertEquals(10, myPrinter.getPaperOnStock());
        assertEquals(20, myPrinter.getTonerVolume());
    }

    @Test
    public void printingPaper__notEnoughPaperOrToner() {
        assertEquals("There isn't enough paper for printing.", myPrinter.printingPaper(10, 11));
    }
}
