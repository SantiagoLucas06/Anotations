@Tabela(nome = "Clientes")
    public class Clientes {
        public static void main(String[] args) {
            Class<?> classe = Clientes.class;
            Tabela anotacao = classe.getAnnotation(Tabela.class);

            if (anotacao != null) {
                String nomeTabela = anotacao.nome();
                System.out.println("Nome da tabela: " + nomeTabela);
            } else {
                System.out.println("Classe não anotada com @Tabela.");
            }
        }
    }