
public class Pessoa {

    private Pessoa(String nome, String ultimoNome, String cpf) {
         //To change body of generated methods, choose Tools | Templates.
    }

    
    public static class PessoaBuilder{
        private String nome;
        private String ultimoNome;
        private String cpf;
        
        public PessoaBuilder(String nome){
            this.nome = nome;
        }
        
        public PessoaBuilder nome(String nome){
            this.nome = nome;
            return this;
        }
        
        public PessoaBuilder ultimoNome(String ultimoNome){
            this.ultimoNome = ultimoNome;
            return this;
        }
        
        public PessoaBuilder cpf(String cpf){
            this.cpf = cpf;
            return this;
        }
        
        public Pessoa criarPessoa(){
            return new Pessoa(nome, ultimoNome, cpf);
        }
        
        /**
         * @return the nome
         */
        public String getNome() {
            return nome;
        }

        /**
         * @param nome the nome to set
         */
        public void setNome(String nome) {
            this.nome = nome;
        }

        /**
         * @return the ultimoNome
         */
        public String getUltimoNome() {
            return ultimoNome;
        }

        /**
         * @param ultimoNome the ultimoNome to set
         */
        public void setUltimoNome(String ultimoNome) {
            this.ultimoNome = ultimoNome;
        }

        /**
         * @return the cpf
         */
        public String getCpf() {
            return cpf;
        }

        /**
         * @param cpf the cpf to set
         */
        public void setCpf(String cpf) {
            this.cpf = cpf;
        }
        
    }
    
}