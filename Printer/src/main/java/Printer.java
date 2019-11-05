public class Printer {
    private int paperOnStock = 100;
    private int tonerVolume = 100;

    public Printer(int paperOnStock, int tonerVolume) {
        this.paperOnStock = paperOnStock;
        this.tonerVolume = tonerVolume;
    }

    public int getPaperOnStock() {
        return this.paperOnStock;
    }

    public int getTonerVolume() {
        return this.tonerVolume;
    }

    public String printingPaper(int printedPages, int printedCopies) {
        if (this.paperOnStock >= (printedCopies + printedPages) || this.tonerVolume >= (printedCopies + printedPages)) {
            this.paperOnStock -= (printedCopies * printedPages);
            this.tonerVolume -= (printedCopies * printedPages);
        }
        return "There isn't enough paper for printing.";
    }
}
