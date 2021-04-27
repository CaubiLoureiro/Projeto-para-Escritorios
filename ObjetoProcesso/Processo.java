package ObjetoProcesso;

public class Processo {
    private String reu;
    private String autor;
    private String numeroProcesso;
    private String advogadoAutor;
    private String advogadoReu;
    private int faseProcesso;
    private boolean atulizou;

    public Processo(String reu, String autor, String numeroProcesso, String advogadoAutor, String advogadoReu){
        this.reu = reu;
        this.autor = autor;
        this.numeroProcesso = numeroProcesso;
        this.advogadoAutor = advogadoAutor;
        this.advogadoReu = advogadoReu;

    }

    public String getReu() {
        return reu;
    }

    public void setReu(String reu) {
        this.reu = reu;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getNumeroProcesso() {
        return numeroProcesso;
    }

    public void setNumeroProcesso(String numeroProcesso) {
        this.numeroProcesso = numeroProcesso;
    }

    public String getAdvogadoAutor() {
        return advogadoAutor;
    }

    public void setAdvogadoAutor(String advogadoAutor) {
        this.advogadoAutor = advogadoAutor;
    }

    public String getAdvogadoReu() {
        return advogadoReu;
    }

    public void setAdvogadoReu(String advogadoReu) {
        this.advogadoReu = advogadoReu;
    }

    public int getFaseProcesso() {
        return faseProcesso;
    }

    public void setFaseProcesso(int faseProcesso) {
        this.faseProcesso = faseProcesso;
    }

    public boolean getAtulizou() {
        return atulizou;
    }

    public void setAtulizou(boolean atulizou) {
        this.atulizou = atulizou;
    }
}
