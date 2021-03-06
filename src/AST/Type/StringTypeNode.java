package AST.Type;

import AST.ASTVisitor;
import Util.position;

public class StringTypeNode extends TypeNode{
    public StringTypeNode(position pos) {
        super(pos);
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
