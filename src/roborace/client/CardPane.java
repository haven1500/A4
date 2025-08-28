package roborace.client;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import roborace.common.GameDialogs;

public class CardPane extends JPanel implements MouseListener {
	
    private final Image noCard;
    private final Image[] selectImages;
    private CardList cards;
    private CardList selectedCards;
    private boolean selecting;
    private final SelectDoneButton okButton;
    private final JFrame parent;

    @SuppressWarnings("LeakingThisInConstructor")
    public CardPane(SelectDoneButton okButton, JFrame parent) {
        this.okButton = okButton;
        this.parent = parent;
        okButton.setOwner(this);
        super.setPreferredSize(new Dimension(644,120));
        ImageAndAnimationFactory aminFac = ImageAndAnimationFactory.getInstance();
        noCard = aminFac.getNoCardImage();
        selectImages = aminFac.getSelectImages();
        cards = new CardList();
        selectedCards = new CardList();
        selecting = false;
        super.addMouseListener(this);
    }

    public CardList selectCards(CardList list) {
        return null;
    }

    public void stopSelection() {
    }

    @Override
    public void paintComponent(Graphics g) {		
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }	
}