package LLVMIR.Type;

import LLVMIR.Oprand.ConstNull;
import LLVMIR.Oprand.Oprand;
import Util.error.irError;
import Util.position;

public class ArrayType extends BaseType{
    public BaseType elementType;
    public Integer  dimSize;
    public ArrayType(BaseType _elementType, int _dimSize) {
        elementType = _elementType;
        dimSize     = _dimSize;
    }
    @Override public String toString() {
        return '['+dimSize.toString()+" x "+elementType.toString()+']';
    }
    @Override public Oprand getZeroInit() {
        return new ConstNull();
    }

    @Override
    public boolean isStringType() {
        return false;
    }

    @Override public int getByteWidth() {
        throw new irError("[ERROR] illegal visit : no valid method to access sizeof(ArrayType)", new position(0, 0));
    }
}
