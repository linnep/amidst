package amidst.clazz.symbolic;

import amidst.documentation.Immutable;

@Immutable
public class SymbolicObject {
	private final SymbolicClass type;
	private final Object object;

	public SymbolicObject(SymbolicClass type, Object object) {
		this.type = type;
		this.object = object;
	}

	public SymbolicClass getType() {
		return type;
	}

	public Object getObject() {
		return object;
	}

	public boolean hasMethod(String symbolicName) {
		return type.hasMethod(symbolicName);
	}

	public boolean hasField(String symbolicName) {
		return type.hasField(symbolicName);
	}

	public Object callMethod(String symbolicName, Object... parameters) {
		return type.callMethod(symbolicName, this, parameters);
	}

	public Object getFieldValue(String symbolicName) {
		return type.getFieldValue(symbolicName, this);
	}
}
