package org.example;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class JTableExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JTable Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create table model
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Name");
        model.addColumn("Age");
        model.addColumn("Country");

        // Add some data to the table
        model.addRow(new Object[]{"John", 25, "USA"});
        model.addRow(new Object[]{"Alice", 30, "UK"});
        model.addRow(new Object[]{"Bob", 35, "Canada"});

        // Create JTable with the model
        JTable table = new JTable(model);

        // Create JScrollPane and add the table to it
        JScrollPane scrollPane = new JScrollPane(table);

        // Add scroll pane to the frame
        frame.add(scrollPane);

        // Set frame size and make it visible
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}
