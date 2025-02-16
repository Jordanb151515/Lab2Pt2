
import javax.swing.JOptionPane;

/**
 * ProChall15 class does the following: calculates the amount of commission for purchasing a certain number of stocks and displays the total amount paid.
 * 
 * @author Jordan Byrne
 * @version v1.0
 * @since 2/26/25
 */

public class ProChall15
{
    public static void main (String[] args){
        int numShares;
        double pricePerShare, totalCostShares, commission, total;
        final double COMM_RATE = 0.02;
        String tempString;

        ////get input for number of shares and cost per share using Dialog boxes
        tempString = JOptionPane.showInputDialog("Enter number of shares purchased: ");
        numShares = Integer.parseInt(tempString);
        tempString = JOptionPane.showInputDialog("Enter the price per share: ");
        pricePerShare = Double.parseDouble(tempString);

        ////computations
        totalCostShares = numShares * pricePerShare;
        commission = totalCostShares * COMM_RATE;
        total = totalCostShares + commission;

        ////display output
        JOptionPane.showMessageDialog(null, String.format("Total cost of shares are: $%,.2f",totalCostShares) +
            String.format("\nCommission cost is: $%,.2f",commission) +
            String.format("\nTotal Cost is: $%,.2f",total));

        System.exit(0);
    }
}