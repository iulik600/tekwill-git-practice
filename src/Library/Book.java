package Library;

public class Book extends LibraryItem {
    private int pageNr;
    private String coverType;

    public void setPageNr(int pageNr) {
        this.pageNr = pageNr;
    }

    public String getCoverType() {
        return coverType;
    }

    public void setCoverType(String coverType) {
        this.coverType = coverType;
    }

    public int getPageNr() {
        return pageNr;
    }
}
