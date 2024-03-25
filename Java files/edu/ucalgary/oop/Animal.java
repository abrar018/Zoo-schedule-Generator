package edu.ucalgary.oop;
//Members: Ahmed Iqbal, Musa Jawad, Abrar Rehan, Rhishik Roy
//Code version: 11.0.17
public class Animal{
    public String name;
    public int numanimal;
    public int tobefed;
    public int[] feedtimes;
    public int feedtime;
    public int onefeed;
    public int prepfeed;

    public int[] feedtimehour;
    public int cleantime;
    private FeedingTask feed;
    private CleaningTask clean;


    public Animal(String name){
        this.name=name;
        this.feed = new FeedingTask(name);
        this.clean = new CleaningTask(name);
        this.numanimal =feed.getNumberAnimal();
        this.tobefed = feed.getNumberAnimal();
        this.feedtimes = feed.getFeedTime();
        this.prepfeed=feedtimes[0];
        this.onefeed=feedtimes[1];
        int hour =feedtimes[2];
        this.feedtimehour = new int[] {hour, hour+1, hour+2};
        this.cleantime = clean.getCleanTime();

    }
    public void decTobefed(int num) {
        //Decreases the number of animals to be fed by 1.
        this.tobefed = this.tobefed - num;
    }

    public int getTobefed() {
        return tobefed;
    }

    public int getCleantime() {
        return cleantime;
    }

    public int getNumAnimal() {
        return numanimal;
    }

    public int[] animalCBF(int min){
        //Provides the number of animals that can be fed in a particular time and also the time remaining after feeding the animals.
        min=min-prepfeed;


        int numanimalCBF=min/onefeed;
        return new int[]{numanimalCBF, min % onefeed};
    }

    public int animalTime(int animals){
        //Provides the time to feed a particular number of animals.
        return prepfeed+ animals*onefeed;
    }

    public int[] getFeedTimeHour() {
        return feedtimehour;
    }
    public String getName() {
        return name;
    }
}
