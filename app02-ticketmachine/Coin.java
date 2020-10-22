
/**
 * Coins saying what coins can be inserted and the value of these coins
 *
 * @author (Kian Rozblat)
 * @version (20/10/2020)
 */
public enum Coin
{
    P10 (10),
    P20 (20),
    P100 (100),
    P200 (200);
    
    private final int Price;
    
    private Coin(int Price)
    {
        this.Price = Price;
    }
    
    public int getPrice()
    {
        return Price;
    }
}
