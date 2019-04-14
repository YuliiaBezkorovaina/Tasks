package task1.model;

public class Model {
    private String firstWord = null;
    private String secondWord = null;

    /**
     *
     * @return - getting first word of sentence. This is "Hello"
     */
    public String getFirstWord() {
        return firstWord;
    }

    /**
     *
     * @param firstWord - setting first word of sentence. This is "Hello"
     */
    public void setFirstWord(String firstWord) {
        this.firstWord = firstWord;
    }

    /**
     *
     * @return - getting second word of sentence. This is "world!"
     */
    public String getSecondWord() {
        return secondWord;
    }

    /**
     *
     * @param secondWord - setting second word of sentence. This is "world!"
     */
    public void setSecondWord(String secondWord) {
        this.secondWord = secondWord;
    }
}
