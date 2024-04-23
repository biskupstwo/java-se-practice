package exercises.Encapsulation;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private final boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = tonerLevel > -1 && tonerLevel <= 100 ? tonerLevel : -1;
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount){
        int result;
        int result1 = tonerAmount > 0 && tonerAmount <= 100 ? tonerAmount : -1;
        int result2 = this.tonerLevel + tonerAmount > 100 ? -1 : this.tonerLevel + tonerAmount;

        if (result1 != -1 || result2 != -1){
            this.tonerLevel = result2;
            result = this.tonerLevel;
        }else{
            result = -1;
        }

        return result;
    }

    public int printPages(int pages){
        int pagesToPrint = pages;

        if (this.duplex) System.out.println("Printing in duplex mode");

        pagesToPrint = duplex ? pagesToPrint/2 : pagesToPrint;
        this.pagesPrinted += pagesToPrint;

        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}