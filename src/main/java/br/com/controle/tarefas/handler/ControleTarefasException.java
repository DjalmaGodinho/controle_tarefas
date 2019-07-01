package br.com.controle.tarefas.handler;

public class ControleTarefasException extends Exception {

    private static final long serialVersionUID = 8586933209872018447L;

    /**
     * Contrutor padrão
     */
    public ControleTarefasException() {
    }

    public ControleTarefasException(final Throwable cause) {
        super(cause);
    }

    public ControleTarefasException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public ControleTarefasException(final String message) {
        super(message);
    }

}
