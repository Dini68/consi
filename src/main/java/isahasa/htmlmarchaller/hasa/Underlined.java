package isahasa.htmlmarchaller.hasa;

import isahasa.htmlmarchaller.TextSource;
import isahasa.htmlmarchaller.hasa.TextDecorator;

public class Underlined extends TextDecorator {

    public Underlined(TextSource textSource) {
        super(textSource);
    }

    @Override
    public String getPlainText() {
        return "<u>" + getTextSource().getPlainText() + "</u>";
    }
}
