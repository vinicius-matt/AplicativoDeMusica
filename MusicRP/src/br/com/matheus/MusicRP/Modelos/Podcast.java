package br.com.matheus.MusicRP.Modelos;

public class Podcast extends Audio{
    private String Apresentador;
    private String Descricao;
    private String Convidado;

    public String getApresentador() {
        return Apresentador;
    }

    public void setApresentador(String apresentador) {
        Apresentador = apresentador;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    public String getConvidado() {
        return Convidado;
    }

    public void setConvidado(String convidado) {
        Convidado = convidado;
    }

    @Override
    public int getClassificacao() {
        if(this.getTotalCuritdas() >= 1000 ){
            System.out.println("Excelente,Esta entre os melhores do momento");
            return 10;
        }else if (this.getTotalCuritdas() >= 500){
            System.out.println("Muito bem avaliado,Assistir mais tarde");
            return 8;
        } else if (this.getTotalCuritdas() >= 150) {
            System.out.println("Podcast Mal avaliado");
            return 4;
        }
        return 0;
    }
}
