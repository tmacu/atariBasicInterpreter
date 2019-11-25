public abstract class Value extends Expression {
   public abstract Double getValue();
   public abstract String getString();
   @Override
   public Value evaluate() {
     return null;
   }
}
