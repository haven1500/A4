package roborace.client;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

public class BoardCanvas extends Canvas implements Runnable {
	
    private final AnimatedBoard board;
    private boolean running;
    private Thread thread;

    public BoardCanvas(AnimatedBoard board) {
        this.board = board;
        Dimension dim = board.getDisplaySize();
        super.setSize(dim.width,dim.height);
    }

    public void start() {
        thread = new Thread(this);
        running = true;
        board.start();
        thread.start();
    }

    public void stop() {
        running = false;
        try{
            thread.join();
        } catch(InterruptedException e) {}
    }

    @Override
    public void run() {
    }	
}