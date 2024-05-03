public class BetterProduct extends Product{

    public BetterProduct(int id, String name, int quantity) {
        super(id, name, quantity);
    }

    @Override
    public int buy(int buyerQuantity) throws RuntimeException{
        try
        {
            if(buyerQuantity <= 0 || buyerQuantity != getQuantity())
            {
                throw new RuntimeException("Invalid quantity chosen");
            }
            else
            {
                setQuantity(getQuantity() - buyerQuantity);
                return getId();
            }
        }
        catch (RuntimeException e)
        {
            e.getMessage();
        }
        return -1;
    }
}
