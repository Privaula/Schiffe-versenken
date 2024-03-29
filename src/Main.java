
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.BufferUnderflowException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.Clip;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.text.StyleConstants.CharacterConstants;

public class Main extends JFrame{
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable()  {
			
			@Override
			public void run() {
				Main m = new Main();
				m.setVisible(true);
			}
		});
		}
	public static ClassLoader loader;
	public static final int buttonBreite = 190;
	public static final int buttonHöhe = 85;
	public boolean timerRunning = true;
	//Font font = new Font("Public Pixel", Font.PLAIN , 30);
	//Font publicPixel = new Font("fonts\\public_pixel\\fonts\\PublicPixel.ttf", Font.PLAIN, 30);

	public Main()
	{
		
			//JFrame erstellen
			setTitle("Arcade Spiele - Main Menu");
			setSize(1280, 720);
			setLocationRelativeTo(null);
			setDefaultCloseOperation(EXIT_ON_CLOSE);

    		//exitButton
			var exitButton = new JButton();
			exitButton.setVisible(true);
			exitButton.setSize(50,50);
			exitButton.setText("Exit");
			exitButton.setPreferredSize(new Dimension(100, 100));
			exitButton.addActionListener(
				new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						System.exit(0);
				};
	});

			
			var startButton1 = new JButton();
			var startButton2 = new JButton();
			var startButton3 = new JButton();
			var startButton4 = new JButton();
			
			
			
			
			//startButton
			var startButton = new JButton();
			startButton.setVisible(true);
			startButton.setSize(50,50);
			startButton.setText("Start");
			startButton.addActionListener(
					
				new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						System.exit(0);
				};
	});


			//Background
			//JLabel myLabel;
			//java.net.URL backgroundURL = getClass().getResource("pictures\\backgroundNew.png");
			//ImageIcon background = new ImageIcon(backgroundURL);
			//myLabel = new JLabel(background);
			//myLabel.setSize(1280, 720);
			
			//ICON
			//java.net.URL taskbarIconURL = Main.class.getResource("pictures\\taskbarIcon.png");
			//ImageIcon taskbarIcon = new ImageIcon(taskbarIconURL);
			//setIconImage(taskbarIcon.getImage());
		
			//Layout
			Container pane = getContentPane();
			Container paneUp = new Container();
			Container paneCenter = new Container();
			Container paneDown = new Container();
			//GroupLayout gl = new GroupLayout(pane);
			pane.setLayout(new BorderLayout());
			
			
			
			pane.add(paneUp, BorderLayout.NORTH);
			pane.add(paneCenter);
			pane.add(paneDown, BorderLayout.SOUTH);
			
			
			
			paneUp.setLayout(new BorderLayout(10, 10));
			paneUp.setPreferredSize(new Dimension(300, 300));
			paneCenter.setLayout(new FlowLayout(FlowLayout.CENTER));
			paneDown.setLayout(new BorderLayout(10, 10));
			
			
			paneDown.add(exitButton, BorderLayout.WEST);
			paneCenter.add(startButton, BorderLayout.CENTER);

			
			/*gl.setVerticalGroup(gl.createSequentialGroup().addComponent(button));
			gl.setHorizontalGroup(gl.createSequentialGroup().addComponent(button));
			gl.setAutoCreateContainerGaps(true);
			*/
			
		}
    }

