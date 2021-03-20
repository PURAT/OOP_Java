import javax.swing.*;

public class SimpleApp extends JFrame {

    private JButton buttonClickMe;
    private JButton buttonOk;
    private JMenuItem itemAbout;
    private JMenuItem itemClickMe;
    private JMenuItem itemCopy;
    private JMenuItem itemCut;
    private JMenuItem itemExit;
    private JMenuItem itemOpen;
    private JMenuItem itemPaste;
    private JMenuItem itemRemove;
    private JMenuItem itemSave;
    private JMenuItem itemSaveAs;
    private JMenuItem itemUndo;
    private JMenuBar menuBar;
    private JMenu menuClickMe;
    private JMenu menuEdit;
    private JMenu menuFile;
    private JMenu menuInfo;

    public SimpleApp() {
        initComponents();
    }

    private void initComponents() {
        buttonOk = new JButton();
        buttonClickMe = new JButton();
        menuBar = new JMenuBar();
        menuFile = new JMenu();
        itemOpen = new JMenuItem();
        itemSave = new JMenuItem();
        itemSaveAs = new JMenuItem();
        itemExit = new JMenuItem();
        menuEdit = new JMenu();
        itemUndo = new JMenuItem();
        itemCut = new JMenuItem();
        itemCopy = new JMenuItem();
        itemPaste = new JMenuItem();
        itemRemove = new JMenuItem();
        menuInfo = new JMenu();
        itemAbout = new JMenuItem();
        menuClickMe = new JMenu();
        itemClickMe = new JMenuItem();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        buttonOk.setText("OK");
        buttonOk.addActionListener(event -> buttonOkActionPerformed());

        buttonClickMe.setText("Нажми меня!");
        buttonClickMe.addActionListener(event -> buttonClickMeActionPerformed());

        menuFile.setText("Файл");
        menuFile.setName(""); // NOI18N

        itemOpen.setText("Открыть...");
        menuFile.add(itemOpen);

        itemSave.setText("Сохранить");
        menuFile.add(itemSave);

        itemSaveAs.setText("Сохранить как...");
        menuFile.add(itemSaveAs);

        itemExit.setText("Выйти");
        menuFile.add(itemExit);

        menuBar.add(menuFile);

        menuEdit.setText("Правка");

        itemUndo.setText("Отменить");
        menuEdit.add(itemUndo);

        itemCut.setText("Вырезать");
        menuEdit.add(itemCut);

        itemCopy.setText("Копировать");
        menuEdit.add(itemCopy);

        itemPaste.setText("Вставить");
        menuEdit.add(itemPaste);

        itemRemove.setText("Удалить");
        menuEdit.add(itemRemove);

        menuBar.add(menuEdit);

        menuInfo.setText("Справка");

        itemAbout.setText("О программе");
        menuInfo.add(itemAbout);

        menuBar.add(menuInfo);

        menuClickMe.setText("Нажми меня");

        itemClickMe.setText("Нажми меня!");
        itemClickMe.addActionListener(event -> itemClickMeActionPerformed());
        menuClickMe.add(itemClickMe);

        menuBar.add(menuClickMe);

        setJMenuBar(menuBar);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(106, 106, 106)
                                                .addComponent(buttonClickMe))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(122, 122, 122)
                                                .addComponent(buttonOk, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(109, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(buttonClickMe, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(buttonOk)
                                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }

    private void buttonOkActionPerformed() {
        System.exit(0);
    }

    private void buttonClickMeActionPerformed() {
        JOptionPane.showMessageDialog(SimpleApp.this,"Меня нажали!");
    }

    private void itemClickMeActionPerformed() {
        buttonClickMeActionPerformed();
    }

    public static void main(String[] args) {
        SimpleApp app = new SimpleApp();
        app.setVisible(true);
    }
}