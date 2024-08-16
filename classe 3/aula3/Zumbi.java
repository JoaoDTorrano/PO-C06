public class Zumbi {
    String Tipo;
    int Vida;
    int Vigor;
    int Dano;

    public String Habilidades(){
        if(Tipo.equalsIgnoreCase("corredor")){
            return("Correm rapido e conseguem escalar estruturas mas são fracos");
        }
        else if(Tipo.equalsIgnoreCase("tanke")){
           return("Tem armadura e conseguem quebrar estruturas mas são lentos");
        }
        else if(Tipo.equalsIgnoreCase("normal")){
           return("Nada de especial mas costumam andar em bandos");
        }
        else{
            System.out.println("Não tenho conhecimento desse tipo");
        }
        return "";
    }
}
