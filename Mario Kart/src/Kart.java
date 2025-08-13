public class Kart {
    String Nome;
    Piloto piloto;
    Motor motor;

    public Kart(){
        motor = new Motor();
    }

    //metodo pular
    void pular(){
        System.out.println("O piloto pulou!");
    }

    //metodo soltar turbo
    void soltarTurbo(){
        System.out.println("O piloto usou o turbo!");
    }

    //fazer drift
    void fazerDrift(){
        System.out.println("O piloto fez drift");
    }
}
