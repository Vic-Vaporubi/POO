public class Carro implements Carros{
    private float velocidade;
    private boolean ligado;
    private int marcha;
    public Carro(){
        this.velocidade = 0;
        this.ligado = false;
        this.marcha =0;
    }
    public void status(){
        System.out.println("-----------------");
        System.out.println("Status do sistema do carro");
        System.out.println("Marcha: " + this.marcha);
        System.out.println("Ligado: " + this.ligado);
        System.out.println("Velocidade: " + this.velocidade);
    }
    public boolean getLigado(){
        return this.ligado;
    }
    public void setLigado(boolean l){
        if( this. ligado == l){
            System.out.println("O carro já está no estado colocado:" + getLigado());
        } else{
            this.ligado = l;
        }
    }
    public float getVelocidade(){
        if(getLigado()){
            return this.velocidade;
        } else{
            System.out.println("O carro precisa estar ligado para visualização da velocidade");
            return 0;
        }
    }
    public void setVelocidade(float v){
        if(getLigado()) {
            this.velocidade = v;
        } else{
            System.out.println("Para alterar a velocidade o carro precisa estar ligado");
        }
    }
    public int getMarcha(){
        if(getLigado()){
            return this.marcha;
        } else {
            System.out.println("O carro precisa estar ligado para a visualização da marcha atual");
            return 0;
        }
    }
    public void setMarcha(int m){
        if(getLigado() && getMarcha() != m) {
            this.marcha = m;
        } else if (getLigado() && getMarcha() ==  m) {
            System.out.println("O carro ja esta nessa marcha");
        } else{
            System.out.println("O carro precisa estar ligado para alterar a marcha");
        }
    }
    @Override
    public void ligar() {
        if(getLigado()){
            System.out.println("O carro ja esta ligado");
        } else{
            this.ligado = true;
        }
    }
    @Override
    public void desligar() {
        if(getLigado()){
            this.ligado = false;
        } else{
            System.out.println("O carro ja esta deligado");
        }
    }
    @Override
    public void acelerar() {
        if(getLigado() && getVelocidade()<100){
            setVelocidade(getVelocidade()+ 10);
        } else if(getVelocidade() >= 100 && getLigado()){
            System.out.println("O carro ja esta acelerado demais");
        } else {
            System.out.println("O carro precisa estar ligado");
        }
    }
    @Override
    public void freiar() {
        if(getLigado() && getVelocidade()>0){
            setVelocidade(getVelocidade()- 10);
        } else if(getVelocidade() <= 0 && getLigado()){
            System.out.println("O carro ja parou");
        } else {
            System.out.println("O carro precisa estar ligado");
        }
    }
    @Override
    public void trocarMarcha() {
        if( getLigado() && getMarcha()< 5){
            setMarcha(getMarcha()+ 1);
        } else if(getLigado() && getMarcha()== 5){
            setMarcha(getMarcha()- 4);
        } else{
            System.out.println("O carro precisa estar ligado");
        }
    }
}