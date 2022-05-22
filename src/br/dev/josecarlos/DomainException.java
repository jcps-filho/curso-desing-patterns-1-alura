package br.dev.josecarlos;

public class DomainException extends RuntimeException {

	private static final long serialVersionUID = -6396650034946544231L;

	public DomainException(String message) {
		super(message);
	}
}
