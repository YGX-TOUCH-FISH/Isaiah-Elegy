package AST.Type;

import AST.ASTVisitor;
import Util.position;

public class VoidTypeNode extends TypeNode{
    public VoidTypeNode(position pos) {
        super(pos);
    }
    @Override
    public void accept(ASTVisitor visitor) {visitor.visit(this);}
}
