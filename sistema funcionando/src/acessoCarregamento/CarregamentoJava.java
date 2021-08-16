package acessoCarregamento;

/**
 *
 * @author Igor
 */
public class CarregamentoJava {

    private static TelaLogin tela;
  
    public static void main(String[] args) {
        // TODO code application logic here
        Carregamento tela = new Carregamento();
        tela.setVisible(true);
               
        try{
            for(int x=0; x<=100;x++)
            {
                Thread.sleep(30);
                //barra.valor.setText(Integer.toString(x)+"%");
                Carregamento.barCarregamento.setValue(x);
               // barra.valor.setText(Integer.toString(x)+" %");
                
            if(x==100){
            TelaLogin telaa = new TelaLogin();
            telaa.setVisible(true);
            tela.setVisible(false);
            
        }
            }
        } catch(InterruptedException e){
            
        }
    }
}
    

    

