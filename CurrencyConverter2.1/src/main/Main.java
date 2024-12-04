package main;

import java.awt.EventQueue;

public class Main {
	public static void main(String[] args) {
	    EventQueue.invokeLater(() -> {
	        try {
	            CurrencyConverterFrame frame = new CurrencyConverterFrame();
	            frame.setVisible(true);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    });
	}
}
   
/*public class Main {
    public static void main(String[] args) {
        CurrencyConverterFrame frame = new CurrencyConverterFrame();
        frame.setVisible(true);
    }
}*/