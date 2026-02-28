public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex){
        this.pagesPrinted = 0;
        this.tonerLevel = (tonerLevel >= 0 && tonerLevel <= 100 ? tonerLevel : -1);
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount){

        if (tonerAmount < 0 || tonerAmount > 100){
            return -1;
        }

        if (tonerLevel+tonerAmount > 100 || tonerLevel+tonerAmount < 0){
            return -1;
        }

        tonerLevel += tonerAmount;

        return tonerLevel;
    }

    public int printPages(int pages){
        if (pages < 0){
            return -1;
        }
        if (duplex){
            pages = (int) Math.ceil(pages / 2.0);
            System.out.println("It's a duplex printer");
        }
        pagesPrinted += pages;
        return pages;

    }
}
