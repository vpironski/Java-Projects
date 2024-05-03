public class Product implements Buyable
{
    private int id;
    private String name;
    private int quantity;

    public Product(int id, String name, int quantity)
    {
        setId(id);
        this.name = name;
        setQuantity(quantity);
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        try
        {
            if(id <= 0)
            {
                throw new WrongInfoException("Id must be a positive number (bigger then 0)");
            }
            else
            {
                this.id = id;
            }
        }
        catch (WrongInfoException e)
        {
            e.getMessage();
        }

    }


    public int getQuantity()
    {
        return quantity;
    }

    public void setQuantity(int quantity)
    {
        try
        {
            if(quantity < 0)
            {
                throw new WrongInfoException("Quntity must be above or equal to 0");
            }
            else
            {
                this.quantity = quantity;
            }
        }
        catch (WrongInfoException e)
        {
            e.getMessage();
        }

    }

    @Override
    public int buy(int buyerQuantity)
    {
        if(buyerQuantity <= 0 || buyerQuantity != this.quantity)
        {
            return -1;
        }
        else
        {
          this.quantity -= buyerQuantity;
          return this.id;
        }

    }

    @Override
    public String getName()
    {
        return this.name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
