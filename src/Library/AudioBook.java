package Library;

public class AudioBook extends LibraryItem {
    private int durationInSec;

    public int getDurationInSec() {
        return durationInSec;
    }

    public void setDurationInSec(int durationInSec) {
        this.durationInSec = durationInSec;
    }
}
