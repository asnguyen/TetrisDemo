/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytetris;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author AnthonyNguyen
 */
public class MyTetris extends JFrame
{
    private JLabel statusbar;
    
    public MyTetris()
    {
        initUI();
    }
    
    private void initUI()
    {
        statusbar = new JLabel(" 0");
        add(statusbar, BorderLayout.SOUTH);
        
        Board board = new Board(this);
        add(board);
        board.start();
        
        setTitle("Tetris");
        setSize(200,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    
    public JLabel getStatusBar()
    {
        return statusbar;
    }
    
    public static void main(String[] args) 
    {
        EventQueue.invokeLater(() -> {
            MyTetris game = new MyTetris();
            game.setVisible(true);
        });
    }
    
}
