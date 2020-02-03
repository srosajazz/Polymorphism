public class QuestaoME extends QuestaoSimples {
    private String altenativa1;
    private String altenativa2;
    private String altenativa3;
    private String altenativa4;

    public QuestaoME(String e, String r, String a1, String a2, String a3, String a4) {
        super(e, r);
        this.altenativa1 = a1;
        this.altenativa2 = a2;
        this.altenativa3 = a3;
        this.altenativa4 = a4;
    }

    public String aplicarQuestao() {
        return "P:" + super.enunciado + "\n" + "   a)  " + altenativa1 + "\n" + "   b)  " + altenativa2 + "\n"
                + "   c)  " + altenativa3 + "\n" + "   d)  " + altenativa4;
    }
}
