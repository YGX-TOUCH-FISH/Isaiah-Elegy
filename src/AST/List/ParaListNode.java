package AST.List;

import AST.ASTNode;
import AST.ASTVisitor;
import AST.Type.TypeNode;
import LLVMIR.Oprand.VirtualReg;
import LLVMIR.Type.BaseType;
import Util.Type;
import Util.position;

import java.util.ArrayList;

public class ParaListNode extends ASTNode {
    public ArrayList<TypeNode> para = new ArrayList<>();
    public ArrayList<Type> types = new ArrayList<>();
    public ArrayList<VirtualReg> paraRegs = new ArrayList<>();
//    public ArrayList<BaseType> baseTypes = new ArrayList<>();
    public ArrayList<String> ids = new ArrayList<>();
    public ParaListNode(position pos) {
        super(pos);
    }
    @Override
    public void accept(ASTVisitor visitor) {visitor.visit(this);}
}
