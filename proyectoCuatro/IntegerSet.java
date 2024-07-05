public class IntegerSet {
    private boolean[] set;

    // Constructor que inicializa el conjunto vacío
    public IntegerSet() {
        set = new boolean[101]; // índices de 0 a 100
    }

    // Método para realizar la unión con otro conjunto
    public IntegerSet union(IntegerSet other) {
        IntegerSet result = new IntegerSet();
        for (int i = 0; i < set.length; i++) {
            result.set[i] = this.set[i] || other.set[i];
        }
        return result;
    }

    // Método para realizar la intersección con otro conjunto
    public IntegerSet intersection(IntegerSet other) {
        IntegerSet result = new IntegerSet();
        for (int i = 0; i < set.length; i++) {
            result.set[i] = this.set[i] && other.set[i];
        }
        return result;
    }

    // Método para insertar un elemento en el conjunto
    public void insertElement(int k) {
        if (k >= 0 && k <= 100) {
            set[k] = true;
        }
    }

    // Método para eliminar un elemento del conjunto
    public void deleteElement(int m) {
        if (m >= 0 && m <= 100) {
            set[m] = false;
        }
    }

    // Método para representar el conjunto como una cadena
    public String toSetString() {
        StringBuilder sb = new StringBuilder();
        boolean isEmpty = true;
        for (int i = 0; i < set.length; i++) {
            if (set[i]) {
                if (!isEmpty) {
                    sb.append(" ");
                }
                sb.append(i);
                isEmpty = false;
            }
        }
        if (isEmpty) {
            return "-";
        } else {
            return sb.toString();
        }
    }

    // Método para verificar si dos conjuntos son iguales
    public boolean equalTo(IntegerSet other) {
        for (int i = 0; i < set.length; i++) {
            if (this.set[i] != other.set[i]) {
                return false;
            }
        }
        return true;
    }
}

