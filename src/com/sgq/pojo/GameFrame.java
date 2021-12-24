package com.sgq.pojo;

import com.sgq.util.MusicPlayer;
import javazoom.jl.decoder.JavaLayerException;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.io.FileNotFoundException;

/**
 * Author : sgq
 * Date : 2020/11/24 19:58
 */
public class GameFrame extends JFrame {
    public GameFrame(){
        setSize(288,512);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Copyright©2020 ByShugq@foxmail.com");
//        setResizable(false);


        try{
            setIconImage(ImageIO.read(this.getClass().getResource("/img/boy.png")));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws FileNotFoundException, JavaLayerException {
        JFrame gameFrame =  new GameFrame();
        GamePanel gamePanel = new GamePanel();
        gameFrame.add(gamePanel);
        gameFrame.setVisible(true);
        MusicPlayer.play();
    }
}
