public class Main {
        public static void main(String[] args) {
            Class<?> classe = MinhaClasse.class;
            if (classe.isAnnotationPresent(Tabela.class)) {
                Tabela tabela = classe.getAnnotation(Tabela.class);
                String nomeDaTabela = tabela.nome();
                System.out.println("Nome da tabela: " + nomeDaTabela);
            } else {
                System.out.println("A anotação Tabela não está presente na classe.");
            }
        }
}
