import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
/**
 * Write a description of class OverlordFrame here.
 * 
 * @author Jay Rixie 
 * @version 4/14/16
 */
public class OverlordFrame extends JFrame
{
    /** ButtonPanel buttonPanel     panel with all action based buttons */
    private ButtonPanel buttonPanel;
    private InventoryPanel invPanel;
    private PlayerStatsPanel statPanel;
    private MonsterPanel monstPanel;
    /**
     * Default constructor for objects of class OverlordFrame
     */
    public OverlordFrame()
    {
        buttonPanel = new ButtonPanel();
        invPanel = new InventoryPanel();
        statPanel = new PlayerStatsPanel(invPanel);
        monstPanel = new MonsterPanel();
        
        
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        
        gbc.ipadx = 100;
        gbc.ipady = 100;
        
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridheight = 2;
        gbc.weightx = 0.3;
        gbc.weighty = 1;
        gbc.fill = GridBagConstraints.BOTH;
        add(invPanel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridheight = 1;
        gbc.weightx = 0.4;
        gbc.weighty = 0.5;
        add(monstPanel, gbc);

        gbc.gridx = 2;
        gbc.weightx = 0.1;
        add(statPanel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        gbc.weightx = 0.7;
        gbc.weighty = 0.5;
        gbc.fill = GridBagConstraints.BOTH;
        add(buttonPanel, gbc);
    
       
         this.setSize(1440, 810);
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.setVisible(true);
    }

    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public void sampleMethod(int y)
    {
    }
    
    public static void main(String[] args)
    {
        //Creates DrawingEditor
        OverlordFrame frame = new OverlordFrame();
    }

}