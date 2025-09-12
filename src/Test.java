public class Test {

    public int questionsCount;
    public String complexity;
    public String subject;
    public int[] classes;


    void setValues(int questionsCount, String complexity, String subject, int[] classes) {
        this.questionsCount = questionsCount;
        this.complexity = complexity;
        this.subject = subject;
        this.classes = classes;
    }

    String getValues() {
        String info = "sual sayi: " + questionsCount + "\ncetinlik: " + complexity + "\nfenn: " + subject + "\nsinifler: ";
        String sinifler = "" + "\n";
        for (int i = 0; i < classes.length; i++) {
            sinifler += classes[i] + "\n";
        }return info + sinifler;
    }

}


