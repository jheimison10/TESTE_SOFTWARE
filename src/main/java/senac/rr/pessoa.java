package senac.rr;

public class pessoa {
    public String nome;
    public int idade;
    private String cpf;

    public String getnome(){
        System.out.println( "passa pela funçao");
        return this.nome;
    }  
        
         public void setNome(String nome){
            System.out.println("passa pela funçao");
            this.nome = nome;
        }

        public Integer getIdade(){
            return this.idade;
        }
    
        public void setIdade(int idade){
            System.out.println("passa pela funçao");
            this.idade = idade;
        }
    

        public String getCpf(String cpf){
        System.out.println( "passa pela funçao");
        return this.cpf;
        }

        public void setCpf(String cpf){
            System.out.println("passa pela funçao");
            this.cpf = cpf;
        }    
}
