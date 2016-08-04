package cap14;

public class UsaPessoa {
    public static void main(String[] args) {
        Pessoa joao = new Pessoa("João","11.264.588");
        Pessoa maria = new Pessoa("Maria","11.264.588");

        
        if(joao.equals(maria)){
            System.out.println("São equivalentes.");
        }else{
            System.out.println("São diferentes.");
        }

        System.out.println("Maria: " + maria.hashCode());
        System.out.println("Joao: " + joao.hashCode());

    }
}
