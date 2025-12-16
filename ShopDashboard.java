import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ShopDashboard extends JFrame {

    // Web-Style Color Palette
    private final Color COLOR_SIDEBAR = Color.decode("#2c3e50"); // Dark Blue
    private final Color COLOR_HEADER = Color.decode("#ecf0f1");  // Light Gray
    private final Color COLOR_BG = Color.decode("#bdc3c7");      // Background Gray
    private final Color COLOR_ACCENT = Color.decode("#3498db");  // Bright Blue
    private final Color COLOR_TEXT_WHITE = Color.WHITE;
    private final Font FONT_TITLE = new Font("Segoe UI", Font.BOLD, 24);
    private final Font FONT_NAV = new Font("Segoe UI", Font.PLAIN, 16);

    private JPanel mainContentPanel;

    public ShopDashboard() {
        setTitle("Modern Web-Style App");
        setSize(1000, 650);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // 1. Create the Sidebar (Navigation)
        JPanel sidebar = createSidebar();
        add(sidebar, BorderLayout.WEST);

        // 2. Create the Main Area (Header + Content)
        JPanel mainArea = new JPanel(new BorderLayout());
        
        // Header
        JPanel header = createHeader();
        mainArea.add(header, BorderLayout.NORTH);

        // Content Area (Scrollable)
        mainContentPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 20, 20));
        mainContentPanel.setBackground(COLOR_BG);
        
        // Add sample "Product Cards" to the content
        loadDashboardPage();

        JScrollPane scrollPane = new JScrollPane(mainContentPanel);
        scrollPane.setBorder(null); // Remove ugly scroll border
        scrollPane.getVerticalScrollBar().setUnitIncrement(16); // Smooth scrolling
        
        mainArea.add(scrollPane, BorderLayout.CENTER);

        add(mainArea, BorderLayout.CENTER);
    }

    // --- Component Builders ---

    private JPanel createSidebar() {
        JPanel sidebar = new JPanel();
        sidebar.setLayout(new BoxLayout(sidebar, BoxLayout.Y_AXIS));
        sidebar.setBackground(COLOR_SIDEBAR);
        sidebar.setPreferredSize(new Dimension(220, 0));
        sidebar.setBorder(new EmptyBorder(20, 0, 0, 0));

        // App Logo/Title
        JLabel appTitle = new JLabel(" TechStore");
        appTitle.setForeground(COLOR_TEXT_WHITE);
        appTitle.setFont(new Font("Segoe UI", Font.BOLD, 28));
        appTitle.setAlignmentX(Component.CENTER_ALIGNMENT);
        sidebar.add(appTitle);
        sidebar.add(Box.createRigidArea(new Dimension(0, 40))); // Spacer

        // Nav Buttons
        sidebar.add(createNavButton("Dashboard", true));
        sidebar.add(createNavButton("Products", false));
        sidebar.add(createNavButton("Orders", false));
        sidebar.add(createNavButton("Customers", false));
        sidebar.add(Box.createVerticalGlue()); // Push settings to bottom
        sidebar.add(createNavButton("Settings", false));
        sidebar.add(Box.createRigidArea(new Dimension(0, 20)));

        return sidebar;
    }

    private JPanel createHeader() {
        JPanel header = new JPanel(new BorderLayout());
        header.setBackground(COLOR_HEADER);
        header.setPreferredSize(new Dimension(0, 60));
        header.setBorder(new EmptyBorder(0, 20, 0, 20));

        JLabel pageTitle = new JLabel("Dashboard Overview");
        pageTitle.setFont(FONT_TITLE);
        pageTitle.setForeground(COLOR_SIDEBAR);

        JButton logoutBtn = new JButton("Logout");
        styleButton(logoutBtn);
        logoutBtn.setBackground(Color.decode("#e74c3c")); // Red

        header.add(pageTitle, BorderLayout.WEST);
        header.add(logoutBtn, BorderLayout.EAST);

        return header;
    }

    // Helper to create Sidebar Buttons that look like Web Links
    private JButton createNavButton(String text, boolean isActive) {
        JButton btn = new JButton(text);
        btn.setFont(FONT_NAV);
        btn.setForeground(COLOR_TEXT_WHITE);
        btn.setBackground(isActive ? COLOR_ACCENT : COLOR_SIDEBAR);
        btn.setBorder(new EmptyBorder(10, 30, 10, 0)); // Padding
        btn.setFocusPainted(false);
        btn.setBorderPainted(false);
        btn.setMaximumSize(new Dimension(220, 50));
        btn.setHorizontalAlignment(SwingConstants.LEFT);
        btn.setCursor(new Cursor(Cursor.HAND_CURSOR));

        // Hover Effect
        btn.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                if (!isActive) btn.setBackground(COLOR_SIDEBAR.brighter());
            }
            public void mouseExited(MouseEvent e) {
                if (!isActive) btn.setBackground(COLOR_SIDEBAR);
            }
        });

        // Click Action (Simple Switch logic)
        btn.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Navigating to: " + text);
        });

        return btn;
    }

    private void styleButton(JButton btn) {
        btn.setForeground(Color.WHITE);
        btn.setFocusPainted(false);
        btn.setBorderPainted(false);
        btn.setFont(new Font("Segoe UI", Font.BOLD, 14));
        btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }

    // --- Content Logic ---

    private void loadDashboardPage() {
        // Create 6 Sample "Cards" to look like a product grid
        mainContentPanel.add(createCard("Laptop Pro", "$1,200", "Stock: 45"));
        mainContentPanel.add(createCard("Smartphone X", "$800", "Stock: 12"));
        mainContentPanel.add(createCard("Headphones", "$150", "Stock: 80"));
        mainContentPanel.add(createCard("Smart Watch", "$250", "Stock: 30"));
        mainContentPanel.add(createCard("4K Monitor", "$400", "Stock: 22"));
        mainContentPanel.add(createCard("Gaming Mouse", "$60", "Stock: 150"));
    }

    // Creates a white "Card" similar to Divs in HTML/CSS
    private JPanel createCard(String title, String price, String subtitle) {
        JPanel card = new JPanel();
        card.setLayout(new BoxLayout(card, BoxLayout.Y_AXIS));
        card.setBackground(Color.WHITE);
        card.setPreferredSize(new Dimension(200, 150));
        card.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(new Color(200,200,200), 1),
            new EmptyBorder(15, 15, 15, 15)
        ));

        JLabel titleLbl = new JLabel(title);
        titleLbl.setFont(new Font("Segoe UI", Font.BOLD, 18));
        titleLbl.setForeground(COLOR_SIDEBAR);

        JLabel priceLbl = new JLabel(price);
        priceLbl.setFont(new Font("Segoe UI", Font.PLAIN, 24));
        priceLbl.setForeground(COLOR_ACCENT);

        JLabel subLbl = new JLabel(subtitle);
        subLbl.setFont(new Font("Segoe UI", Font.ITALIC, 12));
        subLbl.setForeground(Color.GRAY);

        // Add to card
        card.add(titleLbl);
        card.add(Box.createRigidArea(new Dimension(0, 10)));
        card.add(priceLbl);
        card.add(Box.createVerticalGlue()); // Push button to bottom
        card.add(subLbl);

        return card;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new ShopDashboard().setVisible(true);
        });
    }
}