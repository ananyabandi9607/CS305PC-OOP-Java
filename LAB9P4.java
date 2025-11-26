import java.awt.*;
import javax.swing.*;
import javax.swing.tree.*;

class LAB9P3 extends JFrame {

    LAB9P3() {
        super("JTree Demo");

        // Create root node
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Fruits");

        // Add child nodes
        root.add(new DefaultMutableTreeNode("Apple"));
        root.add(new DefaultMutableTreeNode("Banana"));
        root.add(new DefaultMutableTreeNode("Mango"));
        root.add(new DefaultMutableTreeNode("Orange"));

        // Create JTree
        JTree jtr = new JTree(root);

        // Add JTree inside scroll pane (recommended)
        add(new JScrollPane(jtr));

        setSize(500, 500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String... args) {
        new LAB9P3();
    }
}

