public class Pilha {

    private No refNoEntradaPilha;

    public Pilha() {
        this.refNoEntradaPilha = null;
    }

    public No pop() {
        if (!this.isEmpty()) {
            No noPoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getRefNo();
            return noPoped;
        }
        return null;
    }

    public void push(No novoNo) {
        No refAuxiliar = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setRefNo(refAuxiliar);
    }

    public No top() {
        return refNoEntradaPilha;
    }

    public boolean isEmpty() {

        if (refNoEntradaPilha == null) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String stringRetorno = "------------\n";
        stringRetorno += " Pilha\n";
        stringRetorno += "------------\n";

        No noAuxiar = refNoEntradaPilha;

        while (true) {
            if (noAuxiar != null) {
                stringRetorno += "[No{dado=" + noAuxiar.getDado() + "]}\n";
                noAuxiar = noAuxiar.getRefNo();
            } else {
                break;
            }
        }
        stringRetorno += "============\n";
        return stringRetorno;
    }

}
