package k.types;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import k.memory.MemoryBank;

import org.antlr.v4.runtime.Token;

public class KFunction extends AbstractType<List<Token>> {

	private MemoryBank memory;

	private Token currentToken;

	private Iterator<Token> iter;
	
	private List<Token> params;

	public KFunction() {
		memory = new MemoryBank();
		// memory.write("_ID", new KNumber(System.identityHashCode(this.hashCode())));
		value = new LinkedList<Token>();
		params = new LinkedList<Token>();
	}
	
	public void addParameter(Token param) {
		this.params.add(param);
	}
	
	public Token getParameter(int i) {
		i--;
		return params.get(i);
	}
	
	public void addToken(Token token) {
		this.value.add(token);
	}

	public MemoryBank memory() {
		return memory;
	}

	public Token currentToken() {
		return currentToken;
	}

	public void currentToken(Token currentToken) {
		this.currentToken = currentToken;
	}

	public boolean hasTokens() {
		if (iter == null) {
			iter = this.value.iterator();
		}
		return iter.hasNext();
	}

	public Token nextToken() {
		if (iter == null) {
			iter = this.value.iterator();
		}
		currentToken = iter.next();
		return currentToken;
	}

	@Override
	public String toString() {
		return toString(0);
	}

	public String toString(int depth) {
		return memory.toString(depth);
	}

	/**
	 * No need to copy(clone) functions as they will never be ran in parallel from
	 * within same namespace
	 */
	@Override
	public KFunction copy() {
		return this;
	}

}
