package Task19;

public class Poem {
    Author creator;
    private int numOfStrophes;

    public void setNumOfStrophes(int  numOfStrophes){
        this.numOfStrophes = numOfStrophes;
    }
    public int getNumOfStrophes(){
        return numOfStrophes;
    }

    public Poem (Author creator, int numOfStrophes){
        this.creator = creator;
        this.numOfStrophes = numOfStrophes;
    }
    public static Poem longestPoem(Poem[] poems){
        int strophes = 0;
        Poem longest = null;
        for (Poem poem : poems){
            if (poem.numOfStrophes > strophes){
                strophes = poem.numOfStrophes;
                longest = poem;
            }
        }
        return longest;
    }
}
