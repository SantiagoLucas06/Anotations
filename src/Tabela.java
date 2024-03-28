import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Tabela {
    String nome();
}

@Tabela(nome = "minha_tabela")
class MinhaClasse {
}