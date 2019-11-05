public class Runner {
    public static void main(String[] args) {
        Printer myPrinter = new Printer(100, 100);
        System.out.println(String.format("At the beginning the printer has %d sheets of paper and the toner's volume is %d.", myPrinter.getPaperOnStock(), myPrinter.getTonerVolume()));
        myPrinter.printingPaper(5, 2);
        System.out.println(String.format("After printing out 5 pages and 2 copies of each the printer has %d sheets of paper and the toner's volume is %d.", myPrinter.getPaperOnStock(), myPrinter.getTonerVolume()));
    }
}
