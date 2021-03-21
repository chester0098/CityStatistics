package entities;

public class Floors {
    int oneStory = 0;
    int twoStory = 0;
    int threeStory = 0;
    int fourStory = 0;
    int fiveStory = 0;

    public void setOneStory(int oneStory) {
        this.oneStory = oneStory;
    }

    public int getOneStory() {
        return oneStory;
    }

    public void setTwoStory(int twoStory) {
        this.twoStory = twoStory;
    }

    public int getTwoStory() {
        return twoStory;
    }

    public void setThreeStory(int threeStory) {
        this.threeStory = threeStory;
    }

    public int getThreeStory() {
        return threeStory;
    }

    public void setFourStory(int fourStory) {
        this.fourStory = fourStory;
    }

    public int getFourStory() {
        return fourStory;
    }

    public void setFiveStory(int fiveStory) {
        this.fiveStory = fiveStory;
    }

    public int getFiveStory() {
        return fiveStory;
    }

    @Override
    public String toString() {
        return "1-х: " + oneStory
                + ", 2-х: " + twoStory
                + ", 3-х: " + threeStory
                + ", 4-х: " + fourStory
                + ", 5-х: " + fiveStory;
    }
}
