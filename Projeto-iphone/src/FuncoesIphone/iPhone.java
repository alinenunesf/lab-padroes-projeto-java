package FuncoesIphone;

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    public static void main(String[] args) {
       
    	iPhone meuIPhone = new iPhone();
    
     //Reprodutor musical
        meuIPhone.selecionarMusica("A little piece of heaven - Avenged Sevenfold");
        meuIPhone.tocarMusica();
        meuIPhone.pausarMusica();
    
     //Aparelho telefonico
        meuIPhone.ligar("3214-6589");
        meuIPhone.atender();
        meuIPhone.iniciarCorreioVoz();
    
     //Navegador internet
        meuIPhone.exibirPagina("web.dio.me");
        meuIPhone.adicionarNovaAba();
        meuIPhone.atualizarPagina();
    }
    
    //Reprodutor musical 
    public void tocarMusica (){
        System.out.println("Tocando música");
     }  
     public void pausarMusica(){
        System.out.println("Música pausada");
     }
     public void selecionarMusica(String musica){
        System.out.println("Selecionando música: " + musica);
     }

     //Aparelho telefonico
     public void ligar (String numero){
        System.out.println("Ligando para " + numero);
     }
     public void atender(){
        System.out.println("Atendendo chamada");
     }
     public void iniciarCorreioVoz(){
        System.out.println("Iniciando correio de voz");
     }

     //Navegaro internet
     public void exibirPagina(String url){
        System.out.println("Exibindo página: " + url);
    }
    public void adicionarNovaAba(){
        System.out.println("Adicionando nova aba");
    }
    public void atualizarPagina(){
        System.out.println("Atualizando página");
    }
}
