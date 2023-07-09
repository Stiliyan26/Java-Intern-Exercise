public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = (tonerLevel > 100 || tonerLevel < 0)
                ? -1
                : tonerLevel;

        this.duplex = duplex;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public int addToner(int tonerAmount) {
        int result = tonerLevel + tonerAmount;
        if (result > 100 || result < 0) {
            return -1;
        }
        tonerLevel += tonerAmount;
        return tonerLevel;
    }

    public int printPages(int pages) {
        int jobPages = (duplex)
                ? (pages / 2) + (pages % 2)
                : pages;

        pagesPrinted = jobPages;

        return pagesPrinted;
    }
}
