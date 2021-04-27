package ObjetoProcesso;

public class PessoaJuridica extends Processo{

    private String cnpj;

    public PessoaJuridica(String reu, String autor, String numeroProcesso, String advogadoAutor, String advogadoReu, String cnpj){
        super(reu, autor, numeroProcesso, advogadoAutor, advogadoReu);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String getReu() {
        return super.getReu();
    }

    @Override
    public void setReu(String reu) {
        super.setReu(reu);
    }

    @Override
    public String getAutor() {
        return super.getAutor();
    }
    @Override
    public void setAutor(String autor) {
        super.setAutor(autor);
    }

    @Override
    public String getNumeroProcesso() {
        return super.getNumeroProcesso();
    }

    @Override
    public void setNumeroProcesso(String numeroProcesso) {
        super.setNumeroProcesso(numeroProcesso);
    }

    @Override
    public String getAdvogadoAutor() {
        return super.getAdvogadoAutor();
    }

    @Override
    public void setAdvogadoAutor(String advogadoAutor) {
        super.setAdvogadoAutor(advogadoAutor);
    }

    @Override
    public String getAdvogadoReu() {
        return super.getAdvogadoReu();
    }

    @Override
    public void setAdvogadoReu(String advogadoReu) {
        super.setAdvogadoReu(advogadoReu);
    }

    @Override
    public int getFaseProcesso() {
        return super.getFaseProcesso();
    }

    @Override
    public void setFaseProcesso(int faseProcesso) {
        super.setFaseProcesso(faseProcesso);
    }

    @Override
    public boolean getAtulizou() {
        return super.getAtulizou();
    }

    @Override
    public void setAtulizou(boolean atulizou) {
        super.setAtulizou(atulizou);
    }






}
