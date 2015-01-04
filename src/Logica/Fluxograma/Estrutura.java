package Logica.Fluxograma;

import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

/**
 *
 * @author MauroRoberto
 */
public class Estrutura extends BorderPane {

    private TextField txtConteudo;

    public String[] conteudo() {
        String conteudo = txtConteudo.getText().trim();
        for (String classe : getStyleClass()) {
            switch (classe) {
                case "terminador": {
                    return new String[]{conteudo};
                }
                case "processo": {
                    conteudo = conteudo.replace(" ", "");
                    if (conteudo.matches("[a-zA-Z]\\w*(,[a-zA-Z]\\w*)*:(inteiro|real|caractere)")) {

                    } else if (conteudo.matches("[a-zA-Z]\\w*((\\+|-|\\*|/)?=)(\\d+|'(\\w|\\s)+')")) {

                    }
                }
            }
        }
        return null;
    }
}
