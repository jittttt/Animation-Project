import java.awt.Graphics;
import javax.swing.JComponent;

public class SelectionSortComponent extends JComponent {

	private SelectionSorter sorter;

	public SelectionSortComponent() {
		int[] values = ArrayUtil.randomIntArray(35, 350);
		sorter = new SelectionSorter(values, this);
	}

	// 35
	// 350
	public void paintComponent(Graphics g) {
		sorter.draw(g);
	}

	public void startAnimation() {
		class AnimationRunnable implements Runnable {
			public void run() {
				try {
					sorter.sort();
				} catch (InterruptedException exception) {

				}
			}
		}

		Runnable r = new AnimationRunnable();
		Thread t = new Thread(r);
		t.start();
	}
}