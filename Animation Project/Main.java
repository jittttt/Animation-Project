import java.awt.BorderLayout;
import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		final int FRAME_WIDTH = 300;
		final int FRAME_HEIGHT = 400;

		final SelectionSortComponent component = new SelectionSortComponent();

		component.startAnimation();
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(component, BorderLayout.CENTER);
		frame.setVisible(true);
	}
}
