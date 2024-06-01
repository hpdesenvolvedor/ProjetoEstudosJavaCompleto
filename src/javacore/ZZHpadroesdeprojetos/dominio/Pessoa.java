package javacore.ZZHpadroesdeprojetos.dominio;

public class Pessoa {
    private String firstName;
    private String lastName;
    private String userName;
    private String email;

    private Pessoa(String firstName, String lastName, String userName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.email = email;

    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static class PessoaPrincipal{
        private String firstName;
        private String lastName;
        private String userName;
        private String email;

        public PessoaPrincipal firstName(String firstName){
            this.firstName = firstName;
            return this;
        }
        public PessoaPrincipal lastName(String lastName){
            this.lastName = lastName;
            return this;
        }
        public PessoaPrincipal userName(String userName){
            this.userName = userName;
            return this;
        }
        public PessoaPrincipal email(String email){
            this.email = email;
            return this;
        }
        public Pessoa build(){
            return new Pessoa(firstName, lastName, userName, email);
        }
    }
}
